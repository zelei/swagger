
# TrackerItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID to a object |  [optional]
**uri** | **String** | Uri of a tracker item |  [optional]
**name** | **String** | Name of a referenced object |  [optional]
**type** | **String** | Type of a referenced object |  [optional]
**parent** | [**TrackerItemReferenceFiel**](TrackerItemReferenceFiel.md) |  |  [optional]
**owners** | [**List&lt;AssigneeReferenceField&gt;**](AssigneeReferenceField.md) | Owners of a tracker item |  [optional]
**version** | **Integer** | Version of a tracker item |  [optional]
**description** | **String** | Description of a tracker item |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Form of a tracker item description |  [optional]
**submittedAt** | [**DateTime**](DateTime.md) | Submission date of a tracker item |  [optional]
**submittedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | Modification date of a tracker item |  [optional]
**modifier** | [**UserReference**](UserReference.md) |  |  [optional]
**assignedAt** | [**DateTime**](DateTime.md) | Assigne date of a tracker item |  [optional]
**assignedTo** | [**List&lt;AssigneeReferenceField&gt;**](AssigneeReferenceField.md) | Assignees of a tracker item |  [optional]
**startDate** | [**DateTime**](DateTime.md) | Start date of a tracker item |  [optional]
**endDate** | [**DateTime**](DateTime.md) | End date of a tracker item |  [optional]
**closedAt** | [**DateTime**](DateTime.md) | Close date of a tracker item |  [optional]
**storyPoints** | **Integer** | Story points of a tracker item |  [optional]
**tracker** | [**TrackerReference**](TrackerReference.md) |  |  [optional]
**children** | [**List&lt;TrackerItemReferenceFiel&gt;**](TrackerItemReferenceFiel.md) | Children of a tracker item |  [optional]
**customFields** | [**List&lt;AbstractCustomFieldReference&gt;**](AbstractCustomFieldReference.md) | Custom field of a tracker item |  [optional]
**priority** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**accruedMillis** | **Long** | Accrued work time of a tracker item in milliseconds |  [optional]
**estimatedMillis** | **Long** | Estimated work time of a tracker item in milliseconds |  [optional]
**spentMillis** | **Long** | Spent work time of a tracker item in milliseconds |  [optional]
**status** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**platforms** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**categories** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**subjects** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**resolutions** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**severities** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**releaseMethod** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**teams** | [**AbstractFieldReference**](AbstractFieldReference.md) |  |  [optional]
**ordinal** | **Integer** | Ordinal of a tracker item |  [optional]


<a name="DescriptionFormatEnum"></a>
## Enum: DescriptionFormatEnum
Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



