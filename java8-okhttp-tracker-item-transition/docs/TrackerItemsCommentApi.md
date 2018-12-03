# TrackerItemsCommentApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ItemItemIdCommentCommentIdDelete**](TrackerItemsCommentApi.md#v2ItemItemIdCommentCommentIdDelete) | **DELETE** /v2/item/{itemId}/comment/{commentId} | Delete comment of tracker item by id
[**v2ItemItemIdCommentCommentIdGet**](TrackerItemsCommentApi.md#v2ItemItemIdCommentCommentIdGet) | **GET** /v2/item/{itemId}/comment/{commentId} | Get comment of tracker item by id
[**v2ItemItemIdCommentCommentIdPost**](TrackerItemsCommentApi.md#v2ItemItemIdCommentCommentIdPost) | **POST** /v2/item/{itemId}/comment/{commentId} | Reply on a comment of a tracker item
[**v2ItemItemIdCommentCommentIdPut**](TrackerItemsCommentApi.md#v2ItemItemIdCommentCommentIdPut) | **PUT** /v2/item/{itemId}/comment/{commentId} | Edit comment on a tracker item
[**v2ItemItemIdCommentPost**](TrackerItemsCommentApi.md#v2ItemItemIdCommentPost) | **POST** /v2/item/{itemId}/comment | Comment on a tracker item


<a name="v2ItemItemIdCommentCommentIdDelete"></a>
# **v2ItemItemIdCommentCommentIdDelete**
> Comment v2ItemItemIdCommentCommentIdDelete(itemId, commentId)

Delete comment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
try {
    Comment result = apiInstance.v2ItemItemIdCommentCommentIdDelete(itemId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#v2ItemItemIdCommentCommentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdCommentCommentIdGet"></a>
# **v2ItemItemIdCommentCommentIdGet**
> Comment v2ItemItemIdCommentCommentIdGet(itemId, commentId)

Get comment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
try {
    Comment result = apiInstance.v2ItemItemIdCommentCommentIdGet(itemId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#v2ItemItemIdCommentCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2ItemItemIdCommentCommentIdPost"></a>
# **v2ItemItemIdCommentCommentIdPost**
> Comment v2ItemItemIdCommentCommentIdPost(itemId, commentId, comment, commentFormat, attachments)

Reply on a comment of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.v2ItemItemIdCommentCommentIdPost(itemId, commentId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#v2ItemItemIdCommentCommentIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="v2ItemItemIdCommentCommentIdPut"></a>
# **v2ItemItemIdCommentCommentIdPut**
> Comment v2ItemItemIdCommentCommentIdPut(itemId, commentId, comment, commentFormat, attachments)

Edit comment on a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.v2ItemItemIdCommentCommentIdPut(itemId, commentId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#v2ItemItemIdCommentCommentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="v2ItemItemIdCommentPost"></a>
# **v2ItemItemIdCommentPost**
> Comment v2ItemItemIdCommentPost(itemId, comment, commentFormat, attachments)

Comment on a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.v2ItemItemIdCommentPost(itemId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#v2ItemItemIdCommentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **comment** | **String**| Text of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

