# RoleApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2RoleGet**](RoleApi.md#v2RoleGet) | **GET** /v2/role | Get roles
[**v2RoleRoleIdGet**](RoleApi.md#v2RoleRoleIdGet) | **GET** /v2/role/{roleId} | Get role


<a name="v2RoleGet"></a>
# **v2RoleGet**
> List&lt;Role&gt; v2RoleGet()

Get roles

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

RoleApi apiInstance = new RoleApi();
try {
    List<Role> result = apiInstance.v2RoleGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#v2RoleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2RoleRoleIdGet"></a>
# **v2RoleRoleIdGet**
> Role v2RoleRoleIdGet(roleId)

Get role

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | 
try {
    Role result = apiInstance.v2RoleRoleIdGet(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#v2RoleRoleIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**|  |

### Return type

[**Role**](Role.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

