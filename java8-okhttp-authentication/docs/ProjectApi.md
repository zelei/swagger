# ProjectApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ProjectGet**](ProjectApi.md#v2ProjectGet) | **GET** /v2/project | Get projects
[**v2ProjectProjectIdGet**](ProjectApi.md#v2ProjectProjectIdGet) | **GET** /v2/project/{projectId} | Get projects


<a name="v2ProjectGet"></a>
# **v2ProjectGet**
> List&lt;Project&gt; v2ProjectGet()

Get projects

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
try {
    List<Project> result = apiInstance.v2ProjectGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#v2ProjectGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ProjectProjectIdGet"></a>
# **v2ProjectProjectIdGet**
> Project v2ProjectProjectIdGet(projectId)

Get projects

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
try {
    Project result = apiInstance.v2ProjectProjectIdGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#v2ProjectProjectIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |

### Return type

[**Project**](Project.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

