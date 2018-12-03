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

/**
 * Reference to a choice option
 */
@ApiModel(description = "Reference to a choice option")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-12-02T20:31:20.747+01:00[Europe/Budapest]")
public class ChoiceOptionReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ChoiceOptionReference id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID to a object
   * @return id
  **/
  @ApiModelProperty(value = "ID to a object")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChoiceOptionReference uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Reference to a object
   * @return uri
  **/
  @ApiModelProperty(value = "Reference to a object")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ChoiceOptionReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of a referenced object
   * @return name
  **/
  @ApiModelProperty(value = "Name of a referenced object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChoiceOptionReference type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of a referenced object
   * @return type
  **/
  @ApiModelProperty(value = "Type of a referenced object")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoiceOptionReference choiceOptionReference = (ChoiceOptionReference) o;
    return Objects.equals(this.id, choiceOptionReference.id) &&
        Objects.equals(this.uri, choiceOptionReference.uri) &&
        Objects.equals(this.name, choiceOptionReference.name) &&
        Objects.equals(this.type, choiceOptionReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceOptionReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

