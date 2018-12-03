# TrackerItemsAttachmentApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ItemItemIdAttachmentAttachmentIdContentGet**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentAttachmentIdContentGet) | **GET** /v2/item/{itemId}/attachment/{attachmentId}/content | Get content of an attachment of tracker item by id
[**v2ItemItemIdAttachmentAttachmentIdDelete**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentAttachmentIdDelete) | **DELETE** /v2/item/{itemId}/attachment/{attachmentId} | Delete attachment of tracker item by id
[**v2ItemItemIdAttachmentAttachmentIdGet**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentAttachmentIdGet) | **GET** /v2/item/{itemId}/attachment/{attachmentId} | Get attachment of tracker item by id
[**v2ItemItemIdAttachmentDelete**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentDelete) | **DELETE** /v2/item/{itemId}/attachment | Delete attachments of tracker item
[**v2ItemItemIdAttachmentGet**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentGet) | **GET** /v2/item/{itemId}/attachment | Get attachments of tracker item
[**v2ItemItemIdAttachmentPost**](TrackerItemsAttachmentApi.md#v2ItemItemIdAttachmentPost) | **POST** /v2/item/{itemId}/attachment | Upload an attachment to a tracker item


<a name="v2ItemItemIdAttachmentAttachmentIdContentGet"></a>
# **v2ItemItemIdAttachmentAttachmentIdContentGet**
> File v2ItemItemIdAttachmentAttachmentIdContentGet(itemId, attachmentId)

Get content of an attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    File result = apiInstance.v2ItemItemIdAttachmentAttachmentIdContentGet(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentAttachmentIdContentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a name="v2ItemItemIdAttachmentAttachmentIdDelete"></a>
# **v2ItemItemIdAttachmentAttachmentIdDelete**
> Attachment v2ItemItemIdAttachmentAttachmentIdDelete(itemId, attachmentId)

Delete attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    Attachment result = apiInstance.v2ItemItemIdAttachmentAttachmentIdDelete(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentAttachmentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdAttachmentAttachmentIdGet"></a>
# **v2ItemItemIdAttachmentAttachmentIdGet**
> Attachment v2ItemItemIdAttachmentAttachmentIdGet(itemId, attachmentId)

Get attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    Attachment result = apiInstance.v2ItemItemIdAttachmentAttachmentIdGet(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentAttachmentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdAttachmentDelete"></a>
# **v2ItemItemIdAttachmentDelete**
> v2ItemItemIdAttachmentDelete(itemId)

Delete attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
try {
    apiInstance.v2ItemItemIdAttachmentDelete(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdAttachmentGet"></a>
# **v2ItemItemIdAttachmentGet**
> List&lt;Attachment&gt; v2ItemItemIdAttachmentGet(itemId)

Get attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
try {
    List<Attachment> result = apiInstance.v2ItemItemIdAttachmentGet(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdAttachmentPost"></a>
# **v2ItemItemIdAttachmentPost**
> List&lt;Attachment&gt; v2ItemItemIdAttachmentPost(itemId, attachments)

Upload an attachment to a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsAttachmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    List<Attachment> result = apiInstance.v2ItemItemIdAttachmentPost(itemId, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#v2ItemItemIdAttachmentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

