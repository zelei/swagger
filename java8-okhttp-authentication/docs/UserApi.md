# UserApi

All URIs are relative to *http://vostro:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2UserFindByEmailGet**](UserApi.md#v2UserFindByEmailGet) | **GET** /v2/user/findByEmail | Get user by email address
[**v2UserFindByNameGet**](UserApi.md#v2UserFindByNameGet) | **GET** /v2/user/findByName | Get user by name
[**v2UserGet**](UserApi.md#v2UserGet) | **GET** /v2/user | Get users
[**v2UserUserIdGet**](UserApi.md#v2UserUserIdGet) | **GET** /v2/user/{userId} | Get user


<a name="v2UserFindByEmailGet"></a>
# **v2UserFindByEmailGet**
> User v2UserFindByEmailGet(email)

Get user by email address

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
String email = "email_example"; // String | 
try {
    User result = apiInstance.v2UserFindByEmailGet(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v2UserFindByEmailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2UserFindByNameGet"></a>
# **v2UserFindByNameGet**
> User v2UserFindByNameGet(name)

Get user by name

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
String name = "name_example"; // String | 
try {
    User result = apiInstance.v2UserFindByNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v2UserFindByNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2UserGet"></a>
# **v2UserGet**
> UserSearchResult v2UserGet(page, pageSize, groupId, queryString)

Get users

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
Integer page = 1; // Integer | 
Integer pageSize = 25; // Integer | 
Integer groupId = 56; // Integer | 
String queryString = Intland; // String | 
try {
    UserSearchResult result = apiInstance.v2UserGet(page, pageSize, groupId, queryString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v2UserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **groupId** | **Integer**|  | [optional]
 **queryString** | **String**|  | [optional]

### Return type

[**UserSearchResult**](UserSearchResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2UserUserIdGet"></a>
# **v2UserUserIdGet**
> User v2UserUserIdGet(userId)

Get user

### Example
```java
// Import classes:
//import com.intland.swagger.ApiClient;
//import com.intland.swagger.ApiException;
//import com.intland.swagger.Configuration;
//import com.intland.swagger.auth.*;
//import com.intland.swagger.demo.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | 
try {
    User result = apiInstance.v2UserUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v2UserUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

