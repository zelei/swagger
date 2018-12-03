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
import org.joda.time.DateTime;
import org.openapitools.client.model.UserReference;

/**
 * Basic properties of a codeBeamer project
 */
@ApiModel(description = "Basic properties of a codeBeamer project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-12-03T14:14:40.543+01:00[Europe/Budapest]")
public class Project {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Format of a project&#39;s description
   */
  @JsonAdapter(DescriptionFormatEnum.Adapter.class)
  public enum DescriptionFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    DescriptionFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DescriptionFormatEnum fromValue(String text) {
      for (DescriptionFormatEnum b : DescriptionFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<DescriptionFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DescriptionFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DescriptionFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DescriptionFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_DESCRIPTION_FORMAT = "descriptionFormat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_FORMAT)
  private DescriptionFormatEnum descriptionFormat;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Boolean template;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserReference createdBy = null;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_AT = "lastModifiedAt";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_AT)
  private DateTime lastModifiedAt;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private UserReference lastModifiedBy = null;

  public Project id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of a project
   * @return id
  **/
  @ApiModelProperty(value = "Id of a project")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Project uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Uri of a project
   * @return uri
  **/
  @ApiModelProperty(value = "Uri of a project")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Project version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version of a project
   * @return version
  **/
  @ApiModelProperty(value = "Version of a project")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of a project
   * @return name
  **/
  @ApiModelProperty(value = "Name of a project")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of a project
   * @return keyName
  **/
  @ApiModelProperty(value = "Key name of a project")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of a project
   * @return description
  **/
  @ApiModelProperty(value = "Description of a project")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Format of a project&#39;s description
   * @return descriptionFormat
  **/
  @ApiModelProperty(value = "Format of a project's description")
  public DescriptionFormatEnum getDescriptionFormat() {
    return descriptionFormat;
  }

  public void setDescriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }

  public Project category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category of a project
   * @return category
  **/
  @ApiModelProperty(value = "Category of a project")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Project closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Closed status of a project
   * @return closed
  **/
  @ApiModelProperty(value = "Closed status of a project")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Project deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Delete status of a project
   * @return deleted
  **/
  @ApiModelProperty(value = "Delete status of a project")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Project template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Template status of a project
   * @return template
  **/
  @ApiModelProperty(value = "Template status of a project")
  public Boolean getTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }

  public Project createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of a project
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation date of a project")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Project createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }

  public Project lastModifiedAt(DateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

   /**
   * Modification date of a project
   * @return lastModifiedAt
  **/
  @ApiModelProperty(value = "Modification date of a project")
  public DateTime getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(DateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  public Project lastModifiedBy(UserReference lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public UserReference getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(UserReference lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.uri, project.uri) &&
        Objects.equals(this.version, project.version) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.keyName, project.keyName) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.descriptionFormat, project.descriptionFormat) &&
        Objects.equals(this.category, project.category) &&
        Objects.equals(this.closed, project.closed) &&
        Objects.equals(this.deleted, project.deleted) &&
        Objects.equals(this.template, project.template) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.createdBy, project.createdBy) &&
        Objects.equals(this.lastModifiedAt, project.lastModifiedAt) &&
        Objects.equals(this.lastModifiedBy, project.lastModifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, version, name, keyName, description, descriptionFormat, category, closed, deleted, template, createdAt, createdBy, lastModifiedAt, lastModifiedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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

