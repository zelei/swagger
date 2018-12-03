# TrackerApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ProjectProjectIdTrackerGet**](TrackerApi.md#v2ProjectProjectIdTrackerGet) | **GET** /v2/project/{projectId}/tracker | Get trackers
[**v2TrackerTrackerIdFieldCustomFieldIdGet**](TrackerApi.md#v2TrackerTrackerIdFieldCustomFieldIdGet) | **GET** /v2/tracker/{trackerId}/field/custom/{fieldId} | Get custom field of tracker
[**v2TrackerTrackerIdFieldFieldIdGet**](TrackerApi.md#v2TrackerTrackerIdFieldFieldIdGet) | **GET** /v2/tracker/{trackerId}/field/{fieldId} | Get field of tracker
[**v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet**](TrackerApi.md#v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet) | **GET** /v2/tracker/{trackerId}/field/{fieldId}/option/{optionId} | Get option of a choice field of tracker
[**v2TrackerTrackerIdFieldGet**](TrackerApi.md#v2TrackerTrackerIdFieldGet) | **GET** /v2/tracker/{trackerId}/field | Get fields of tracker
[**v2TrackerTrackerIdGet**](TrackerApi.md#v2TrackerTrackerIdGet) | **GET** /v2/tracker/{trackerId} | Get tracker


<a name="v2ProjectProjectIdTrackerGet"></a>
# **v2ProjectProjectIdTrackerGet**
> List&lt;Tracker&gt; v2ProjectProjectIdTrackerGet(projectId)

Get trackers

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer projectId = 56; // Integer | 
try {
    List<Tracker> result = apiInstance.v2ProjectProjectIdTrackerGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2ProjectProjectIdTrackerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |

### Return type

[**List&lt;Tracker&gt;**](Tracker.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2TrackerTrackerIdFieldCustomFieldIdGet"></a>
# **v2TrackerTrackerIdFieldCustomFieldIdGet**
> AbstractField v2TrackerTrackerIdFieldCustomFieldIdGet(trackerId, fieldId)

Get custom field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
try {
    AbstractField result = apiInstance.v2TrackerTrackerIdFieldCustomFieldIdGet(trackerId, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2TrackerTrackerIdFieldCustomFieldIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |

### Return type

[**AbstractField**](AbstractField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2TrackerTrackerIdFieldFieldIdGet"></a>
# **v2TrackerTrackerIdFieldFieldIdGet**
> AbstractField v2TrackerTrackerIdFieldFieldIdGet(trackerId, fieldId)

Get field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
try {
    AbstractField result = apiInstance.v2TrackerTrackerIdFieldFieldIdGet(trackerId, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2TrackerTrackerIdFieldFieldIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |

### Return type

[**AbstractField**](AbstractField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet"></a>
# **v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet**
> ChoiceOptionReference v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet(trackerId, fieldId, optionId)

Get option of a choice field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
Integer optionId = 56; // Integer | 
try {
    ChoiceOptionReference result = apiInstance.v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet(trackerId, fieldId, optionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2TrackerTrackerIdFieldFieldIdOptionOptionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |
 **optionId** | **Integer**|  |

### Return type

[**ChoiceOptionReference**](ChoiceOptionReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2TrackerTrackerIdFieldGet"></a>
# **v2TrackerTrackerIdFieldGet**
> List&lt;AbstractField&gt; v2TrackerTrackerIdFieldGet(trackerId)

Get fields of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    List<AbstractField> result = apiInstance.v2TrackerTrackerIdFieldGet(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2TrackerTrackerIdFieldGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**List&lt;AbstractField&gt;**](AbstractField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2TrackerTrackerIdGet"></a>
# **v2TrackerTrackerIdGet**
> Tracker v2TrackerTrackerIdGet(trackerId)

Get tracker

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    Tracker result = apiInstance.v2TrackerTrackerIdGet(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#v2TrackerTrackerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**Tracker**](Tracker.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

