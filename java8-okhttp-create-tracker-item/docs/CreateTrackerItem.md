
# CreateTrackerItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of a tracker item |  [optional]
**description** | **String** | Description of a tracker item |  [optional]
**storyPoints** | **Integer** | Story points of a tracker item |  [optional]
**startDate** | [**DateTime**](DateTime.md) | Start date of a tracker item |  [optional]
**endDate** | [**DateTime**](DateTime.md) | End date of a tracker item |  [optional]
**estimatedMillis** | **Long** | Estimate time of a tracker item in milliseconds |  [optional]
**priority** | [**SingleOptionChoiceFieldValue**](SingleOptionChoiceFieldValue.md) |  |  [optional]
**releaseMethod** | [**SingleOptionChoiceFieldValue**](SingleOptionChoiceFieldValue.md) |  |  [optional]
**status** | [**SingleOptionChoiceFieldValue**](SingleOptionChoiceFieldValue.md) |  |  [optional]
**platforms** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**categories** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**severities** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**resolutions** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**teams** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**subjects** | [**AbstractChoiceFieldValue**](AbstractChoiceFieldValue.md) |  |  [optional]
**assignees** | [**List&lt;AssigneeFieldValueModel&gt;**](AssigneeFieldValueModel.md) | Assignees of a tracker item |  [optional]
**owners** | [**List&lt;AssigneeFieldValueModel&gt;**](AssigneeFieldValueModel.md) | Assignees of a tracker item |  [optional]
**customFieldValues** | [**List&lt;AbstractFieldValue&gt;**](AbstractFieldValue.md) | Custom fields of a tracker item |  [optional]
**tableValues** | [**List&lt;TrackerItemTableFieldValue&gt;**](TrackerItemTableFieldValue.md) | Table field of a tracker item |  [optional]



