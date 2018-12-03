package com.intland.swagger.main;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openapitools.client.model.AbstractField;
import org.openapitools.client.model.ChoiceFieldReference;
import org.openapitools.client.model.ChoiceOptionReference;
import org.openapitools.client.model.CreateTrackerItem;
import org.openapitools.client.model.CreateTrackerItem.DescriptionFormatEnum;
import org.openapitools.client.model.OptionChoiceField;
import org.openapitools.client.model.SingleOptionChoiceFieldValue;
import org.openapitools.client.model.Tracker;
import org.openapitools.client.model.TrackerItem;
import org.openapitools.client.model.UpdateTrackerItemField;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserFieldValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.intland.swagger.ApiClient;
import com.intland.swagger.ApiException;
import com.intland.swagger.Configuration;
import com.intland.swagger.auth.HttpBasicAuth;
import com.intland.swagger.demo.TrackerApi;
import com.intland.swagger.demo.TrackerItemApi;
import com.intland.swagger.demo.UserApi;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ApiException, IOException {
		initApiClient();

		try {
			
			Tracker tracker = getTracker(4318);			
			OptionChoiceField statusField = getStatusField(tracker, "Status");
			ChoiceOptionReference newStatus = getOptionOfStatusField(statusField, "New");
			ChoiceOptionReference inProgressStatus = getOptionOfStatusField(statusField, "In Progress");
			ChoiceOptionReference toVerifyStatus = getOptionOfStatusField(statusField, "To Verify");
			ChoiceOptionReference inQAStatus = getOptionOfStatusField(statusField, "InQA");
			ChoiceOptionReference complatedStatus = getOptionOfStatusField(statusField, "Completed");
			
			TrackerItem createdTrackerItem = createTrackerItem(tracker, statusField, newStatus);
			logStatusOfTrackerItem(createdTrackerItem);
			
			TrackerItem updatedTrackerItem = updateStateFieldOfTrackerItem(createdTrackerItem, statusField, inProgressStatus);
			logStatusOfTrackerItem(updatedTrackerItem);
			
			updatedTrackerItem = updateStateFieldOfTrackerItem(createdTrackerItem, statusField, toVerifyStatus);
			logStatusOfTrackerItem(updatedTrackerItem);
			
			updatedTrackerItem = updateStateFieldOfTrackerItem(createdTrackerItem, statusField, inQAStatus);
			logStatusOfTrackerItem(updatedTrackerItem);
			
			updatedTrackerItem = updateStateFieldOfTrackerItem(createdTrackerItem, statusField, complatedStatus);
			logStatusOfTrackerItem(updatedTrackerItem);
			
		} catch (ApiException e) {
			logger.error(e.getResponseBody());
		}
	}

	private static void logStatusOfTrackerItem(TrackerItem trackerItem) {
		logger.info("Tracker Item: {} ({}) - Status: {}", trackerItem.getName(), trackerItem.getId(), ((ChoiceFieldReference) trackerItem.getStatus()).getValues().get(0).getName());
	}

	private static TrackerItem createTrackerItem(Tracker tracker, OptionChoiceField statusField, ChoiceOptionReference newStatus) throws ApiException {
		
		OptionChoiceField priorityField = getStatusField(tracker, "Priority");
		ChoiceOptionReference highPriority = getOptionOfStatusField(priorityField, "High");
		
		User currentUser = new UserApi().v2UserFindByNameGet("bond");
		
		CreateTrackerItem createTrackerItem = new CreateTrackerItem();
		createTrackerItem.setName("My first tracker item");
		createTrackerItem.setDescription("__My description__");
		createTrackerItem.setDescriptionFormat(DescriptionFormatEnum.WIKI);
		createTrackerItem.setStatus(new SingleOptionChoiceFieldValue().fieldId(statusField.getId()).value(newStatus.getId()));
		createTrackerItem.setStoryPoints(42);
		createTrackerItem.setPriority(new SingleOptionChoiceFieldValue().fieldId(priorityField.getId()).value(highPriority.getId()));
		createTrackerItem.setAssignees(Arrays.asList(new UserFieldValue().value(currentUser.getId())));
		
		return createTrackerItem(tracker, createTrackerItem);
	}
	
	private static ChoiceOptionReference getOptionOfStatusField(OptionChoiceField optionChoiceField, String optionName) {
		return optionChoiceField.getOptions().stream()
				.filter(o -> o.getName().equalsIgnoreCase(optionName))
				.findFirst().get();
	}

	@SuppressWarnings("unchecked")
	private static <T extends AbstractField> T getStatusField(Tracker tracker, String statusFieldName) throws ApiException {
		return (T) getTrackerFields(tracker).stream()
				 // .peek(f -> logger.debug("{}", f))
				.filter(f -> f.getName().equalsIgnoreCase(statusFieldName))
				.findFirst().get();
	}
	
	private static List<AbstractField> getTrackerFields(Tracker tracker) throws ApiException {
		return new TrackerApi().v2TrackerTrackerIdFieldGet(tracker.getId());
	}
	
	private static Tracker getTracker(Integer trackerId) throws ApiException {
		return new TrackerApi().v2TrackerTrackerIdGet(trackerId);
	}

	private static TrackerItem createTrackerItem(Tracker tracker, CreateTrackerItem createTrackerItem) throws ApiException {
		return new TrackerItemApi().v2TrackerTrackerIdItemPost(tracker.getId(), createTrackerItem);
	}

	private static TrackerItem updateStateFieldOfTrackerItem(TrackerItem trackerItem, OptionChoiceField statusField, ChoiceOptionReference newState) throws ApiException {
		SingleOptionChoiceFieldValue value = new SingleOptionChoiceFieldValue()
				.fieldId(statusField.getId())
				.value(newState.getId());
		
		return new TrackerItemApi().v2ItemItemIdFieldPut(trackerItem.getId(), new UpdateTrackerItemField().addFieldValuesItem(value));
	}
	
	private static void initApiClient() {

		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("http://localhost:8080/cb/api");

		HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
		basicAuth.setUsername("bond");
		basicAuth.setPassword("007");

	}

}
