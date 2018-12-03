# TrackerItemsCommentsApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2ItemItemIdCommentDelete**](TrackerItemsCommentsApi.md#v2ItemItemIdCommentDelete) | **DELETE** /v2/item/{itemId}/comment | Delete comments of tracker item by id
[**v2ItemItemIdCommentGet**](TrackerItemsCommentsApi.md#v2ItemItemIdCommentGet) | **GET** /v2/item/{itemId}/comment | Get comments of tracker item


<a name="v2ItemItemIdCommentDelete"></a>
# **v2ItemItemIdCommentDelete**
> v2ItemItemIdCommentDelete(itemId)

Delete comments of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentsApi apiInstance = new TrackerItemsCommentsApi();
Integer itemId = 56; // Integer | 
try {
    apiInstance.v2ItemItemIdCommentDelete(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentsApi#v2ItemItemIdCommentDelete");
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

<a name="v2ItemItemIdCommentGet"></a>
# **v2ItemItemIdCommentGet**
> List&lt;Comment&gt; v2ItemItemIdCommentGet(itemId)

Get comments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.TrackerItemsCommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TrackerItemsCommentsApi apiInstance = new TrackerItemsCommentsApi();
Integer itemId = 56; // Integer | Id of a tracker item
try {
    List<Comment> result = apiInstance.v2ItemItemIdCommentGet(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentsApi#v2ItemItemIdCommentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of a tracker item |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

