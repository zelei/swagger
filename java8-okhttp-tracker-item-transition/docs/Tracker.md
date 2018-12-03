
# Tracker

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of a tracker |  [optional]
**uri** | **String** | Uri of a tracker |  [optional]
**keyName** | **String** | Keyname of a tracker |  [optional]
**version** | **Integer** | Version of a tracker |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation date of a tracker |  [optional]
**creator** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | Modification date of a tracker |  [optional]
**modifier** | [**UserReference**](UserReference.md) |  |  [optional]
**name** | **String** | Name of a tracker |  [optional]
**description** | **String** | Description of a tracker |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of a tracker |  [optional]
**type** | [**Type**](Type.md) |  |  [optional]


<a name="DescriptionFormatEnum"></a>
## Enum: DescriptionFormatEnum
Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



