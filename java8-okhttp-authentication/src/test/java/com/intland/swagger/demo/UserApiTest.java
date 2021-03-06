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
import org.openapitools.client.model.ResourceForbiddenException;
import org.openapitools.client.model.ResourceNotFoundException;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserSearchResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Get user by email address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2UserFindByEmailGetTest() throws ApiException {
        String email = null;
        User response = api.v2UserFindByEmailGet(email);

        // TODO: test validations
    }
    
    /**
     * Get user by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2UserFindByNameGetTest() throws ApiException {
        String name = null;
        User response = api.v2UserFindByNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Get users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2UserGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        Integer groupId = null;
        String queryString = null;
        UserSearchResult response = api.v2UserGet(page, pageSize, groupId, queryString);

        // TODO: test validations
    }
    
    /**
     * Get user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v2UserUserIdGetTest() throws ApiException {
        Integer userId = null;
        User response = api.v2UserUserIdGet(userId);

        // TODO: test validations
    }
    
}
