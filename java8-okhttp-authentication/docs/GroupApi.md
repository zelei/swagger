# GroupApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2UserGroupGet**](GroupApi.md#v2UserGroupGet) | **GET** /v2/user/group | Get user groups
[**v2UserGroupGroupIdGet**](GroupApi.md#v2UserGroupGroupIdGet) | **GET** /v2/user/group/{groupId} | Get user group


<a name="v2UserGroupGet"></a>
# **v2UserGroupGet**
> List&lt;UserGroup&gt; v2UserGroupGet()

Get user groups

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GroupApi apiInstance = new GroupApi();
try {
    List<UserGroup> result = apiInstance.v2UserGroupGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v2UserGroupGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2UserGroupGroupIdGet"></a>
# **v2UserGroupGroupIdGet**
> UserGroup v2UserGroupGroupIdGet(groupId)

Get user group

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | 
try {
    UserGroup result = apiInstance.v2UserGroupGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v2UserGroupGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

