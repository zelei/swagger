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
import org.openapitools.client.model.TrackerItemTableRowFieldValueModel;

/**
 * Table field of a tracker item
 */
@ApiModel(description = "Table field of a tracker item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-12-03T14:14:40.543+01:00[Europe/Budapest]")
public class TrackerItemTableFieldValue {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private Integer fieldId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<TrackerItemTableRowFieldValueModel> rows = null;

  public TrackerItemTableFieldValue fieldId(Integer fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Id of a field
   * @return fieldId
  **/
  @ApiModelProperty(value = "Id of a field")
  public Integer getFieldId() {
    return fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public TrackerItemTableFieldValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of a field
   * @return type
  **/
  @ApiModelProperty(value = "Type of a field")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TrackerItemTableFieldValue rows(List<TrackerItemTableRowFieldValueModel> rows) {
    this.rows = rows;
    return this;
  }

  public TrackerItemTableFieldValue addRowsItem(TrackerItemTableRowFieldValueModel rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<TrackerItemTableRowFieldValueModel>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Table rows of a tracker table item
   * @return rows
  **/
  @ApiModelProperty(value = "Table rows of a tracker table item")
  public List<TrackerItemTableRowFieldValueModel> getRows() {
    return rows;
  }

  public void setRows(List<TrackerItemTableRowFieldValueModel> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemTableFieldValue trackerItemTableFieldValue = (TrackerItemTableFieldValue) o;
    return Objects.equals(this.fieldId, trackerItemTableFieldValue.fieldId) &&
        Objects.equals(this.type, trackerItemTableFieldValue.type) &&
        Objects.equals(this.rows, trackerItemTableFieldValue.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, type, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemTableFieldValue {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

