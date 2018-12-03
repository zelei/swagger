package com.intland.swagger.main;

import java.io.IOException;
import java.util.List;

import org.openapitools.client.model.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.intland.swagger.ApiClient;
import com.intland.swagger.ApiException;
import com.intland.swagger.Configuration;
import com.intland.swagger.auth.HttpBasicAuth;
import com.intland.swagger.demo.ProjectApi;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ApiException, IOException {
		
		initApiClient();
		
		List<Project> projects = listAllProjects();
		logger.info("Number of projects: {}", projects.size());

		for (Project project : projects) {
			logger.info("'{}' project", project.getName());
		}

	}

	private static List<Project> listAllProjects() throws ApiException {
		return new ProjectApi().v2ProjectGet();
	}

	private static void initApiClient() {

		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("http://localhost:8080/cb/api");

		HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
		basicAuth.setUsername("<username>");
		basicAuth.setPassword("<password>");

	}

}
