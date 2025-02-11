/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.16.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

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
 * CreateKeyOption options when creating a key
 */
@ApiModel(description = "CreateKeyOption options when creating a key")

public class CreateKeyOption {
  @SerializedName("key")
  private String key = null;

  @SerializedName("read_only")
  private Boolean readOnly = null;

  @SerializedName("title")
  private String title = null;

  public CreateKeyOption key(String key) {
    this.key = key;
    return this;
  }

   /**
   * An armored SSH key to add
   * @return key
  **/
  @ApiModelProperty(required = true, value = "An armored SSH key to add")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreateKeyOption readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Describe if the key has only read access or read/write
   * @return readOnly
  **/
  @ApiModelProperty(value = "Describe if the key has only read access or read/write")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public CreateKeyOption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the key to add
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of the key to add")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKeyOption createKeyOption = (CreateKeyOption) o;
    return Objects.equals(this.key, createKeyOption.key) &&
        Objects.equals(this.readOnly, createKeyOption.readOnly) &&
        Objects.equals(this.title, createKeyOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, readOnly, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKeyOption {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

