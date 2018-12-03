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
import org.openapitools.client.model.Attachment;
import org.openapitools.client.model.CommentReference;
import org.openapitools.client.model.UserReference;

/**
 * Comment of a tracker item
 */
@ApiModel(description = "Comment of a tracker item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-12-02T20:31:20.747+01:00[Europe/Budapest]")
public class Comment {
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

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserReference createdBy = null;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private DateTime modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIER = "modifier";
  @SerializedName(SERIALIZED_NAME_MODIFIER)
  private UserReference modifier = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * Format of a comment
   */
  @JsonAdapter(CommentFormatEnum.Adapter.class)
  public enum CommentFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    CommentFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentFormatEnum fromValue(String text) {
      for (CommentFormatEnum b : CommentFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<CommentFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommentFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMENT_FORMAT = "commentFormat";
  @SerializedName(SERIALIZED_NAME_COMMENT_FORMAT)
  private CommentFormatEnum commentFormat;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private CommentReference replyTo = null;

  public Comment id(Integer id) {
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

  public Comment uri(String uri) {
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

  public Comment name(String name) {
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

  public Comment type(String type) {
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

  public Comment version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version of a comment
   * @return version
  **/
  @ApiModelProperty(value = "Version of a comment")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Comment createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of a comment
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation date of a comment")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Comment createdBy(UserReference createdBy) {
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

  public Comment modifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Modification date of a comment
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "Modification date of a comment")
  public DateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Comment modifier(UserReference modifier) {
    this.modifier = modifier;
    return this;
  }

   /**
   * Get modifier
   * @return modifier
  **/
  @ApiModelProperty(value = "")
  public UserReference getModifier() {
    return modifier;
  }

  public void setModifier(UserReference modifier) {
    this.modifier = modifier;
  }

  public Comment attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Comment addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments of a comment
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments of a comment")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Comment comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Text of a comment
   * @return comment
  **/
  @ApiModelProperty(value = "Text of a comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Comment commentFormat(CommentFormatEnum commentFormat) {
    this.commentFormat = commentFormat;
    return this;
  }

   /**
   * Format of a comment
   * @return commentFormat
  **/
  @ApiModelProperty(value = "Format of a comment")
  public CommentFormatEnum getCommentFormat() {
    return commentFormat;
  }

  public void setCommentFormat(CommentFormatEnum commentFormat) {
    this.commentFormat = commentFormat;
  }

  public Comment replyTo(CommentReference replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @ApiModelProperty(value = "")
  public CommentReference getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(CommentReference replyTo) {
    this.replyTo = replyTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.uri, comment.uri) &&
        Objects.equals(this.name, comment.name) &&
        Objects.equals(this.type, comment.type) &&
        Objects.equals(this.version, comment.version) &&
        Objects.equals(this.createdAt, comment.createdAt) &&
        Objects.equals(this.createdBy, comment.createdBy) &&
        Objects.equals(this.modifiedAt, comment.modifiedAt) &&
        Objects.equals(this.modifier, comment.modifier) &&
        Objects.equals(this.attachments, comment.attachments) &&
        Objects.equals(this.comment, comment.comment) &&
        Objects.equals(this.commentFormat, comment.commentFormat) &&
        Objects.equals(this.replyTo, comment.replyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, type, version, createdAt, createdBy, modifiedAt, modifier, attachments, comment, commentFormat, replyTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commentFormat: ").append(toIndentedString(commentFormat)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
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

