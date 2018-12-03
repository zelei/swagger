# TrackerItemApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ItemGet**](TrackerItemApi.md#v2ItemGet) | **GET** /v2/item | Get tracker items by cbQL query string
[**v2ItemItemIdDelete**](TrackerItemApi.md#v2ItemItemIdDelete) | **DELETE** /v2/item/{itemId} | Delete tracker item
[**v2ItemItemIdFieldPut**](TrackerItemApi.md#v2ItemItemIdFieldPut) | **PUT** /v2/item/{itemId}/field | Update field of tracker item
[**v2ItemItemIdFieldTableTableFieldIdPut**](TrackerItemApi.md#v2ItemItemIdFieldTableTableFieldIdPut) | **PUT** /v2/item/{itemId}/field/table/{tableFieldId} | Update table field of tracker item
[**v2ItemItemIdGet**](TrackerItemApi.md#v2ItemItemIdGet) | **GET** /v2/item/{itemId} | Get basic tracker item
[**v2ItemItemIdPut**](TrackerItemApi.md#v2ItemItemIdPut) | **PUT** /v2/item/{itemId} | Update tracker item
[**v2TrackerTrackerIdItemParentItemIdPost**](TrackerItemApi.md#v2TrackerTrackerIdItemParentItemIdPost) | **POST** /v2/tracker/{trackerId}/item/{parentItemId} | Create a tracker item with parent
[**v2TrackerTrackerIdItemPost**](TrackerItemApi.md#v2TrackerTrackerIdItemPost) | **POST** /v2/tracker/{trackerId}/item | Create a tracker item


<a name="v2ItemGet"></a>
# **v2ItemGet**
> TrackerItemSearchResult v2ItemGet(page, queryString, pageSize)

Get tracker items by cbQL query string

API can be called with a complex cbQL string to find tracker items

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer page = 1; // Integer | 
String queryString = priority='Normal'; // String | 
Integer pageSize = 25; // Integer | 
try {
    TrackerItemSearchResult result = apiInstance.v2ItemGet(page, queryString, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [default to 1]
 **queryString** | **String**|  |
 **pageSize** | **Integer**|  | [optional] [default to 25]

### Return type

[**TrackerItemSearchResult**](TrackerItemSearchResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdDelete"></a>
# **v2ItemItemIdDelete**
> TrackerItem v2ItemItemIdDelete(itemId)

Delete tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    TrackerItem result = apiInstance.v2ItemItemIdDelete(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemItemIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdFieldPut"></a>
# **v2ItemItemIdFieldPut**
> TrackerItem v2ItemItemIdFieldPut(itemId, updateTrackerItemField)

Update field of tracker item

&lt;div class&#x3D;\&quot;wrap-collabsible\&quot;&gt;   &lt;input id&#x3D;\&quot;collapsible-f6141a91-e26c-42b1-bc23-d291a672be99\&quot; class&#x3D;\&quot;toggle\&quot; type&#x3D;\&quot;checkbox\&quot;&gt;   &lt;label for&#x3D;\&quot;collapsible-f6141a91-e26c-42b1-bc23-d291a672be99\&quot; class&#x3D;\&quot;lbl-toggle\&quot;&gt;Examples&lt;/label&gt;   &lt;div class&#x3D;\&quot;collapsible-content\&quot;&gt;     &lt;div class&#x3D;\&quot;content-inner\&quot;&gt; &lt;p&gt;&lt;u&gt;&lt;b&gt;How to update multiple fields of a tracker item&lt;/b&gt;&lt;/u&gt;&lt;/p&gt; &lt;p&gt;Examples of this end point are going to use the Task tracker of Intland Software&amp;#39;s Scrum&lt;/p&gt; &lt;p&gt;Please create a 2 new custom fields in your tracker, one of them should be a integer custom field with 0 min and 10 max value, other one should be a choice field with option1, option2, and option3 choice options and also create a table field with 2 new column in your tracker, one of them should be a integer custom field with 0 min and 10 max value, other one should be a choice field with option1, option2, and option3 choice options&lt;/p&gt; &lt;p&gt;Use the following JSON request&lt;/p&gt; &lt;pre&gt; {   &amp;#34;fieldValues&amp;#34;: [     {       &amp;#34;fieldId&amp;#34;: 10001,       &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;,       &amp;#34;value&amp;#34;: 4     },     {       &amp;#34;fieldId&amp;#34;: 1000,       &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,       &amp;#34;values&amp;#34;: [ 2 ]     }   ],   &amp;#34;tableValues&amp;#34;: [     {       &amp;#34;fieldId&amp;#34;: 1000000,       &amp;#34;type&amp;#34;: &amp;#34;trackerItemTableFieldValue&amp;#34;,       &amp;#34;rows&amp;#34;: [         {           &amp;#34;fieldValues&amp;#34;: [             {               &amp;#34;fieldId&amp;#34;: 1000001,               &amp;#34;value&amp;#34;: 4,               &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;             },             {               &amp;#34;fieldId&amp;#34;: 1000002,               &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,               &amp;#34;values&amp;#34;: [ 1 ]             }           ]         },         {           &amp;#34;fieldValues&amp;#34;: [             {               &amp;#34;fieldId&amp;#34;: 1000001,               &amp;#34;value&amp;#34;: 7,               &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;             },             {               &amp;#34;fieldId&amp;#34;: 1000002,               &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,               &amp;#34;values&amp;#34;: [ 2 ]             }           ]         }       ]     }   ] } &lt;/pre&gt; &lt;/div&gt;   &lt;/div&gt; &lt;/div&gt;

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
UpdateTrackerItemField updateTrackerItemField = new UpdateTrackerItemField(); // UpdateTrackerItemField | 
try {
    TrackerItem result = apiInstance.v2ItemItemIdFieldPut(itemId, updateTrackerItemField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemItemIdFieldPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **updateTrackerItemField** | [**UpdateTrackerItemField**](UpdateTrackerItemField.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v2ItemItemIdFieldTableTableFieldIdPut"></a>
# **v2ItemItemIdFieldTableTableFieldIdPut**
> TrackerItem v2ItemItemIdFieldTableTableFieldIdPut(itemId, tableFieldId, updateTrackerItemTableField)

Update table field of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer tableFieldId = 56; // Integer | 
UpdateTrackerItemTableField updateTrackerItemTableField = new UpdateTrackerItemTableField(); // UpdateTrackerItemTableField | 
try {
    TrackerItem result = apiInstance.v2ItemItemIdFieldTableTableFieldIdPut(itemId, tableFieldId, updateTrackerItemTableField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemItemIdFieldTableTableFieldIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **tableFieldId** | **Integer**|  |
 **updateTrackerItemTableField** | [**UpdateTrackerItemTableField**](UpdateTrackerItemTableField.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v2ItemItemIdGet"></a>
# **v2ItemItemIdGet**
> TrackerItem v2ItemItemIdGet(itemId)

Get basic tracker item

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    TrackerItem result = apiInstance.v2ItemItemIdGet(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemItemIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdPut"></a>
# **v2ItemItemIdPut**
> TrackerItem v2ItemItemIdPut(itemId, updateTrackerItem)

Update tracker item

&lt;div class&#x3D;\&quot;wrap-collabsible\&quot;&gt;   &lt;input id&#x3D;\&quot;collapsible-99fff6a0-581d-469c-be54-11b4224cdc0e\&quot; class&#x3D;\&quot;toggle\&quot; type&#x3D;\&quot;checkbox\&quot;&gt;   &lt;label for&#x3D;\&quot;collapsible-99fff6a0-581d-469c-be54-11b4224cdc0e\&quot; class&#x3D;\&quot;lbl-toggle\&quot;&gt;Examples&lt;/label&gt;   &lt;div class&#x3D;\&quot;collapsible-content\&quot;&gt;     &lt;div class&#x3D;\&quot;content-inner\&quot;&gt; &lt;p&gt;Please check the &amp;#39;Create tracker item&amp;#39; end point for examples&lt;/p&gt;&lt;/div&gt;   &lt;/div&gt; &lt;/div&gt;

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
UpdateTrackerItem updateTrackerItem = new UpdateTrackerItem(); // UpdateTrackerItem | 
try {
    TrackerItem result = apiInstance.v2ItemItemIdPut(itemId, updateTrackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2ItemItemIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **updateTrackerItem** | [**UpdateTrackerItem**](UpdateTrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v2TrackerTrackerIdItemParentItemIdPost"></a>
# **v2TrackerTrackerIdItemParentItemIdPost**
> TrackerItem v2TrackerTrackerIdItemParentItemIdPost(trackerId, parentItemId, createTrackerItem)

Create a tracker item with parent

&lt;div class&#x3D;\&quot;wrap-collabsible\&quot;&gt;   &lt;input id&#x3D;\&quot;collapsible-f684e99b-9aa3-49de-9cd0-0a757237d85d\&quot; class&#x3D;\&quot;toggle\&quot; type&#x3D;\&quot;checkbox\&quot;&gt;   &lt;label for&#x3D;\&quot;collapsible-f684e99b-9aa3-49de-9cd0-0a757237d85d\&quot; class&#x3D;\&quot;lbl-toggle\&quot;&gt;Examples&lt;/label&gt;   &lt;div class&#x3D;\&quot;collapsible-content\&quot;&gt;     &lt;div class&#x3D;\&quot;content-inner\&quot;&gt; &lt;p&gt;Please check the &amp;#39;Create tracker item&amp;#39; end point for examples&lt;/p&gt;&lt;/div&gt;   &lt;/div&gt; &lt;/div&gt;

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer trackerId = 56; // Integer | 
Integer parentItemId = 56; // Integer | 
CreateTrackerItem createTrackerItem = new CreateTrackerItem(); // CreateTrackerItem | 
try {
    TrackerItem result = apiInstance.v2TrackerTrackerIdItemParentItemIdPost(trackerId, parentItemId, createTrackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2TrackerTrackerIdItemParentItemIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **parentItemId** | **Integer**|  |
 **createTrackerItem** | [**CreateTrackerItem**](CreateTrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v2TrackerTrackerIdItemPost"></a>
# **v2TrackerTrackerIdItemPost**
> TrackerItem v2TrackerTrackerIdItemPost(trackerId, createTrackerItem)

Create a tracker item

&lt;div class&#x3D;\&quot;wrap-collabsible\&quot;&gt;   &lt;input id&#x3D;\&quot;collapsible-3fc73f9f-172d-46fc-a6cf-f33d51de0695\&quot; class&#x3D;\&quot;toggle\&quot; type&#x3D;\&quot;checkbox\&quot;&gt;   &lt;label for&#x3D;\&quot;collapsible-3fc73f9f-172d-46fc-a6cf-f33d51de0695\&quot; class&#x3D;\&quot;lbl-toggle\&quot;&gt;Examples&lt;/label&gt;   &lt;div class&#x3D;\&quot;collapsible-content\&quot;&gt;     &lt;div class&#x3D;\&quot;content-inner\&quot;&gt; &lt;p&gt;&lt;u&gt;&lt;b&gt;How to create a tracker item with basic information&lt;/b&gt;&lt;/u&gt;&lt;/p&gt; &lt;p&gt;Examples of this end point are going to use the Task tracker of Intland Software&amp;#39;s Scrum&lt;/p&gt; &lt;p&gt;&lt;u&gt;&lt;b&gt;Create a tracker image with commonly used fields&lt;/b&gt;&lt;/u&gt;&lt;/p&gt; &lt;p&gt;Please use the following JSON request&lt;/p&gt; &lt;pre&gt; {   &amp;#34;name&amp;#34;: &amp;#34;My first tracker item&amp;#34;,   &amp;#34;description&amp;#34;: &amp;#34;I love this API&amp;#34;,   &amp;#34;storyPoints&amp;#34;: 42,   &amp;#34;startDate&amp;#34;: &amp;#34;2018-11-19T15:13:34.223Z&amp;#34;,   &amp;#34;endDate&amp;#34;: &amp;#34;2018-11-19T15:13:34.223Z&amp;#34;,   &amp;#34;estimatedMillis&amp;#34;: 42000,   &amp;#34;status&amp;#34;: {     &amp;#34;fieldId&amp;#34;: 7,     &amp;#34;type&amp;#34;: &amp;#34;singleOptionChoiceFieldValue&amp;#34;,     &amp;#34;value&amp;#34;: 1   },   &amp;#34;priority&amp;#34;: {     &amp;#34;fieldId&amp;#34;: 2,     &amp;#34;type&amp;#34;: &amp;#34;singleOptionChoiceFieldValue&amp;#34;,     &amp;#34;value&amp;#34;: 2   },   &amp;#34;severities&amp;#34;: {     &amp;#34;fieldId&amp;#34;: 14,     &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,     &amp;#34;values&amp;#34;: [3]   },   &amp;#34;assignees&amp;#34;: [     {       &amp;#34;fieldId&amp;#34;: 5,       &amp;#34;type&amp;#34;: &amp;#34;userFieldValue&amp;#34;,       &amp;#34;value&amp;#34;: 1     }   ] } &lt;/pre&gt;  &lt;p&gt;Status / priority field only handles one option, because of that we need to use the &lt;i&gt;singleOptionChoiceFieldValue&lt;/i&gt; as a type of the field, value of the field is one of the ID of the available options, please check the &amp;#39;/v2/tracker/{trackerId}/field&amp;#39; API end point to see all values. In this case we want to set the status to &lt;b&gt;New&lt;/b&gt;, which is ID 1, and set the priority to &lt;b&gt;High&lt;/b&gt;, which is ID 2.&lt;/p&gt; &lt;p&gt;Severities is a multiple option field, it can handle multiple options, because of the we need to use the &lt;i&gt;optionChoiceFieldValue&lt;/i&gt; as a type of the field, values of the field is one or more of the IDs of the available options. In this case we want to set the Severities to &amp;#34;Minor&amp;#34;, which is ID 3&lt;/p&gt; &lt;p&gt;Tracker item can be assigned to multiple users, in this case use only on user with ID 1. Please note that user must be assigned to the project.&lt;/p&gt; &lt;p&gt;&lt;u&gt;&lt;b&gt;Create a tracker image with custom fields&lt;/b&gt;&lt;/u&gt;&lt;/p&gt; &lt;p&gt;Please create a 2 new custom fields in your tracker, one of them should be a integer custom field with 0 min and 10 max value, other one should be a choice field with option1, option2, and option3 choice options&lt;/p&gt; &lt;p&gt;Use the following JSON request to create a tracker item&lt;/p&gt; &lt;pre&gt; {   &amp;#34;name&amp;#34;: &amp;#34;My first tracker item with custom field&amp;#34;,   &amp;#34;description&amp;#34;: &amp;#34;I love this API&amp;#34;,   &amp;#34;customFieldValues&amp;#34;: [     {       &amp;#34;fieldId&amp;#34;: 10001,       &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;,       &amp;#34;value&amp;#34;: 5     },     {       &amp;#34;fieldId&amp;#34;: 1000,       &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,       &amp;#34;values&amp;#34;: [ 1, 3 ]     }   ] } &lt;/pre&gt;  &lt;p&gt;Field ID is depends on your tracker layout, it might be differ from the example above, please check the &amp;#39;/v2/tracker/{trackerId}/field&amp;#39; API end point to get the valid ID.&lt;/p&gt; &lt;p&gt;Because of the &lt;b&gt;10001&lt;/b&gt; field is a integer field, type is set to to &lt;i&gt;integerFieldValue&lt;/i&gt;, value is set to 5. In case you want to trigger a validation message, please set the value 11 or more.&lt;/p&gt; &lt;p&gt;We want to set the option1 and option3 values for &lt;b&gt;1000&lt;/b&gt; choice field, to do that we need to use &lt;i&gt;optionChoiceFieldValue&lt;/i&gt; type, and ID of option1 and option3&lt;/p&gt; &lt;p&gt;&lt;u&gt;&lt;b&gt;Create a tracker image with custom table field&lt;/b&gt;&lt;/u&gt;&lt;/p&gt; &lt;p&gt;Please create a table field with 2 new column in your tracker, one of them should be a integer custom field with 0 min and 10 max value, other one should be a choice field with option1, option2, and option3 choice options&lt;/p&gt; &lt;p&gt;Use the following JSON request to create a tracker item&lt;/p&gt; &lt;pre&gt; {   &amp;#34;name&amp;#34;: &amp;#34;My first tracker item with table field&amp;#34;,   &amp;#34;description&amp;#34;: &amp;#34;I love this API&amp;#34;,   &amp;#34;tableValues&amp;#34;: [     {       &amp;#34;fieldId&amp;#34;: 1000000,       &amp;#34;type&amp;#34;: &amp;#34;trackerItemTableFieldValue&amp;#34;,       &amp;#34;rows&amp;#34;: [         {           &amp;#34;fieldValues&amp;#34;: [             {               &amp;#34;fieldId&amp;#34;: 1000001,               &amp;#34;value&amp;#34;: 5,               &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;             },             {               &amp;#34;fieldId&amp;#34;: 1000002,               &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,               &amp;#34;values&amp;#34;: [ 1, 2 ]             }           ]         },         {           &amp;#34;fieldValues&amp;#34;: [             {               &amp;#34;fieldId&amp;#34;: 1000001,               &amp;#34;value&amp;#34;: 6,               &amp;#34;type&amp;#34;: &amp;#34;integerFieldValue&amp;#34;             },             {               &amp;#34;fieldId&amp;#34;: 1000002,               &amp;#34;type&amp;#34;: &amp;#34;optionChoiceFieldValue&amp;#34;,               &amp;#34;values&amp;#34;: [ 3 ]             }           ]         }       ]     }   ] } &lt;/pre&gt;  &lt;p&gt;Field ID is depends on your tracker layout, it might be differ from the example above, please check the &amp;#39;/v2/tracker/{trackerId}/field&amp;#39; API end point to get the valid ID.&lt;/p&gt; &lt;p&gt;Because of the table can handle multiple rows we need to create a &lt;i&gt;trackerItemTableFieldValue&lt;/i&gt; container with rows. First column is a integer field with &lt;b&gt;1000001&lt;/b&gt;, type is set to to &lt;i&gt;integerFieldValue&lt;/i&gt;, value is set to 5. In case you want to trigger a validation message, please set the value 11 or more. Second column is a choice option column, type is set to &lt;i&gt;optionChoiceFieldValue&lt;/i&gt;, value is set to IDs of option1 and option3. &lt;/p&gt;&lt;/div&gt;   &lt;/div&gt; &lt;/div&gt;

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemApi apiInstance = new TrackerItemApi();
Integer trackerId = 56; // Integer | 
CreateTrackerItem createTrackerItem = new CreateTrackerItem(); // CreateTrackerItem | 
try {
    TrackerItem result = apiInstance.v2TrackerTrackerIdItemPost(trackerId, createTrackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#v2TrackerTrackerIdItemPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **createTrackerItem** | [**CreateTrackerItem**](CreateTrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

