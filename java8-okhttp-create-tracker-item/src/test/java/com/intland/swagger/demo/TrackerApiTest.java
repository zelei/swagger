/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.demo;

import com.intland.swagger.ApiException;
import org.openapitools.client.model.AbstractField;
import org.openapitools.client.model.ChoiceOptionReference;
import org.openapitools.client.model.ResourceForbiddenException;
import org.openapitools.client.model.ResourceNotFoundException;
import org.openapitools.client.model.ResourceUnauthorizedException;
import org.openapitools.client.model.Tracker;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackerApi
 */
@Ignore
public class TrackerApiTest {

    private final TrackerApi api = new TrackerApi();

    
    /**
     * Get trackers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2ProjectProjectIdTrackerGetTest() throws ApiException {
        Integer projectId = null;
        List<Tracker> response = api.v2ProjectProjectIdTrackerGet(projectId);

        // TODO: test validations
    }
    
    /**
     * Get custom field of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2TrackerTrackerIdFieldCustomFieldIdGetTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        AbstractField response = api.v2TrackerTrackerIdFieldCustomFieldIdGet(trackerId, fieldId);

        // TODO: test validations
    }
    
    /**
     * Get field of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2TrackerTrackerIdFieldFieldIdGetTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        AbstractField response = api.v2TrackerTrackerIdFieldFieldIdGet(trackerId, fieldId);

        // TODO: test validations
    }
    
    /**
     * Get option of a choice field of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2TrackerTrackerIdFieldFieldIdOptionOptionIdGetTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        Integer optionId = null;
        ChoiceOptionReference response = api.v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet(trackerId, fieldId, optionId);

        // TODO: test validations
    }
    
    /**
     * Get fields of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2TrackerTrackerIdFieldGetTest() throws ApiException {
        Integer trackerId = null;
        List<AbstractField> response = api.v2TrackerTrackerIdFieldGet(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2TrackerTrackerIdGetTest() throws ApiException {
        Integer trackerId = null;
        Tracker response = api.v2TrackerTrackerIdGet(trackerId);

        // TODO: test validations
    }
    
}
