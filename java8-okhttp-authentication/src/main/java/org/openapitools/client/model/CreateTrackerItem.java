/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.openapitools.client.model.AbstractChoiceFieldValue;
import org.openapitools.client.model.AbstractFieldValue;
import org.openapitools.client.model.AssigneeFieldValueModel;
import org.openapitools.client.model.SingleOptionChoiceFieldValue;
import org.openapitools.client.model.TrackerItemTableFieldValue;

/**
 * CreateTrackerItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-12-02T20:31:20.747+01:00[Europe/Budapest]")
public class CreateTrackerItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STORY_POINTS = "storyPoints";
  @SerializedName(SERIALIZED_NAME_STORY_POINTS)
  private Integer storyPoints;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private DateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private DateTime endDate;

  public static final String SERIALIZED_NAME_ESTIMATED_MILLIS = "estimatedMillis";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_MILLIS)
  private Long estimatedMillis;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private SingleOptionChoiceFieldValue priority = null;

  public static final String SERIALIZED_NAME_RELEASE_METHOD = "releaseMethod";
  @SerializedName(SERIALIZED_NAME_RELEASE_METHOD)
  private SingleOptionChoiceFieldValue releaseMethod = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SingleOptionChoiceFieldValue status = null;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private AbstractChoiceFieldValue platforms = null;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AbstractChoiceFieldValue categories = null;

  public static final String SERIALIZED_NAME_SEVERITIES = "severities";
  @SerializedName(SERIALIZED_NAME_SEVERITIES)
  private AbstractChoiceFieldValue severities = null;

  public static final String SERIALIZED_NAME_RESOLUTIONS = "resolutions";
  @SerializedName(SERIALIZED_NAME_RESOLUTIONS)
  private AbstractChoiceFieldValue resolutions = null;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private AbstractChoiceFieldValue teams = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private AbstractChoiceFieldValue subjects = null;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<AssigneeFieldValueModel> assignees = null;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<AssigneeFieldValueModel> owners = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_VALUES = "customFieldValues";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_VALUES)
  private List<AbstractFieldValue> customFieldValues = null;

  public static final String SERIALIZED_NAME_TABLE_VALUES = "tableValues";
  @SerializedName(SERIALIZED_NAME_TABLE_VALUES)
  private List<TrackerItemTableFieldValue> tableValues = null;

  public CreateTrackerItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of a tracker item
   * @return name
  **/
  @ApiModelProperty(value = "Name of a tracker item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTrackerItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of a tracker item
   * @return description
  **/
  @ApiModelProperty(value = "Description of a tracker item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTrackerItem storyPoints(Integer storyPoints) {
    this.storyPoints = storyPoints;
    return this;
  }

   /**
   * Story points of a tracker item
   * @return storyPoints
  **/
  @ApiModelProperty(value = "Story points of a tracker item")
  public Integer getStoryPoints() {
    return storyPoints;
  }

  public void setStoryPoints(Integer storyPoints) {
    this.storyPoints = storyPoints;
  }

  public CreateTrackerItem startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of a tracker item
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of a tracker item")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public CreateTrackerItem endDate(DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of a tracker item
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of a tracker item")
  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }

  public CreateTrackerItem estimatedMillis(Long estimatedMillis) {
    this.estimatedMillis = estimatedMillis;
    return this;
  }

   /**
   * Estimate time of a tracker item in milliseconds
   * @return estimatedMillis
  **/
  @ApiModelProperty(value = "Estimate time of a tracker item in milliseconds")
  public Long getEstimatedMillis() {
    return estimatedMillis;
  }

  public void setEstimatedMillis(Long estimatedMillis) {
    this.estimatedMillis = estimatedMillis;
  }

  public CreateTrackerItem priority(SingleOptionChoiceFieldValue priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public SingleOptionChoiceFieldValue getPriority() {
    return priority;
  }

  public void setPriority(SingleOptionChoiceFieldValue priority) {
    this.priority = priority;
  }

  public CreateTrackerItem releaseMethod(SingleOptionChoiceFieldValue releaseMethod) {
    this.releaseMethod = releaseMethod;
    return this;
  }

   /**
   * Get releaseMethod
   * @return releaseMethod
  **/
  @ApiModelProperty(value = "")
  public SingleOptionChoiceFieldValue getReleaseMethod() {
    return releaseMethod;
  }

  public void setReleaseMethod(SingleOptionChoiceFieldValue releaseMethod) {
    this.releaseMethod = releaseMethod;
  }

  public CreateTrackerItem status(SingleOptionChoiceFieldValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SingleOptionChoiceFieldValue getStatus() {
    return status;
  }

  public void setStatus(SingleOptionChoiceFieldValue status) {
    this.status = status;
  }

  public CreateTrackerItem platforms(AbstractChoiceFieldValue platforms) {
    this.platforms = platforms;
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getPlatforms() {
    return platforms;
  }

  public void setPlatforms(AbstractChoiceFieldValue platforms) {
    this.platforms = platforms;
  }

  public CreateTrackerItem categories(AbstractChoiceFieldValue categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getCategories() {
    return categories;
  }

  public void setCategories(AbstractChoiceFieldValue categories) {
    this.categories = categories;
  }

  public CreateTrackerItem severities(AbstractChoiceFieldValue severities) {
    this.severities = severities;
    return this;
  }

   /**
   * Get severities
   * @return severities
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getSeverities() {
    return severities;
  }

  public void setSeverities(AbstractChoiceFieldValue severities) {
    this.severities = severities;
  }

  public CreateTrackerItem resolutions(AbstractChoiceFieldValue resolutions) {
    this.resolutions = resolutions;
    return this;
  }

   /**
   * Get resolutions
   * @return resolutions
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getResolutions() {
    return resolutions;
  }

  public void setResolutions(AbstractChoiceFieldValue resolutions) {
    this.resolutions = resolutions;
  }

  public CreateTrackerItem teams(AbstractChoiceFieldValue teams) {
    this.teams = teams;
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getTeams() {
    return teams;
  }

  public void setTeams(AbstractChoiceFieldValue teams) {
    this.teams = teams;
  }

  public CreateTrackerItem subjects(AbstractChoiceFieldValue subjects) {
    this.subjects = subjects;
    return this;
  }

   /**
   * Get subjects
   * @return subjects
  **/
  @ApiModelProperty(value = "")
  public AbstractChoiceFieldValue getSubjects() {
    return subjects;
  }

  public void setSubjects(AbstractChoiceFieldValue subjects) {
    this.subjects = subjects;
  }

  public CreateTrackerItem assignees(List<AssigneeFieldValueModel> assignees) {
    this.assignees = assignees;
    return this;
  }

  public CreateTrackerItem addAssigneesItem(AssigneeFieldValueModel assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<AssigneeFieldValueModel>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Assignees of a tracker item
   * @return assignees
  **/
  @ApiModelProperty(value = "Assignees of a tracker item")
  public List<AssigneeFieldValueModel> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<AssigneeFieldValueModel> assignees) {
    this.assignees = assignees;
  }

  public CreateTrackerItem owners(List<AssigneeFieldValueModel> owners) {
    this.owners = owners;
    return this;
  }

  public CreateTrackerItem addOwnersItem(AssigneeFieldValueModel ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<AssigneeFieldValueModel>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Assignees of a tracker item
   * @return owners
  **/
  @ApiModelProperty(value = "Assignees of a tracker item")
  public List<AssigneeFieldValueModel> getOwners() {
    return owners;
  }

  public void setOwners(List<AssigneeFieldValueModel> owners) {
    this.owners = owners;
  }

  public CreateTrackerItem customFieldValues(List<AbstractFieldValue> customFieldValues) {
    this.customFieldValues = customFieldValues;
    return this;
  }

  public CreateTrackerItem addCustomFieldValuesItem(AbstractFieldValue customFieldValuesItem) {
    if (this.customFieldValues == null) {
      this.customFieldValues = new ArrayList<AbstractFieldValue>();
    }
    this.customFieldValues.add(customFieldValuesItem);
    return this;
  }

   /**
   * Custom fields of a tracker item
   * @return customFieldValues
  **/
  @ApiModelProperty(value = "Custom fields of a tracker item")
  public List<AbstractFieldValue> getCustomFieldValues() {
    return customFieldValues;
  }

  public void setCustomFieldValues(List<AbstractFieldValue> customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public CreateTrackerItem tableValues(List<TrackerItemTableFieldValue> tableValues) {
    this.tableValues = tableValues;
    return this;
  }

  public CreateTrackerItem addTableValuesItem(TrackerItemTableFieldValue tableValuesItem) {
    if (this.tableValues == null) {
      this.tableValues = new ArrayList<TrackerItemTableFieldValue>();
    }
    this.tableValues.add(tableValuesItem);
    return this;
  }

   /**
   * Table field of a tracker item
   * @return tableValues
  **/
  @ApiModelProperty(value = "Table field of a tracker item")
  public List<TrackerItemTableFieldValue> getTableValues() {
    return tableValues;
  }

  public void setTableValues(List<TrackerItemTableFieldValue> tableValues) {
    this.tableValues = tableValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrackerItem createTrackerItem = (CreateTrackerItem) o;
    return Objects.equals(this.name, createTrackerItem.name) &&
        Objects.equals(this.description, createTrackerItem.description) &&
        Objects.equals(this.storyPoints, createTrackerItem.storyPoints) &&
        Objects.equals(this.startDate, createTrackerItem.startDate) &&
        Objects.equals(this.endDate, createTrackerItem.endDate) &&
        Objects.equals(this.estimatedMillis, createTrackerItem.estimatedMillis) &&
        Objects.equals(this.priority, createTrackerItem.priority) &&
        Objects.equals(this.releaseMethod, createTrackerItem.releaseMethod) &&
        Objects.equals(this.status, createTrackerItem.status) &&
        Objects.equals(this.platforms, createTrackerItem.platforms) &&
        Objects.equals(this.categories, createTrackerItem.categories) &&
        Objects.equals(this.severities, createTrackerItem.severities) &&
        Objects.equals(this.resolutions, createTrackerItem.resolutions) &&
        Objects.equals(this.teams, createTrackerItem.teams) &&
        Objects.equals(this.subjects, createTrackerItem.subjects) &&
        Objects.equals(this.assignees, createTrackerItem.assignees) &&
        Objects.equals(this.owners, createTrackerItem.owners) &&
        Objects.equals(this.customFieldValues, createTrackerItem.customFieldValues) &&
        Objects.equals(this.tableValues, createTrackerItem.tableValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, storyPoints, startDate, endDate, estimatedMillis, priority, releaseMethod, status, platforms, categories, severities, resolutions, teams, subjects, assignees, owners, customFieldValues, tableValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrackerItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    storyPoints: ").append(toIndentedString(storyPoints)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    estimatedMillis: ").append(toIndentedString(estimatedMillis)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    releaseMethod: ").append(toIndentedString(releaseMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
    sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
    sb.append("    tableValues: ").append(toIndentedString(tableValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

