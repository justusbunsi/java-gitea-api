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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateOAuth2ApplicationOptions holds options to create an oauth2 application
 */
@ApiModel(description = "CreateOAuth2ApplicationOptions holds options to create an oauth2 application")

public class CreateOAuth2ApplicationOptions {
  @SerializedName("name")
  private String name = null;

  @SerializedName("redirect_uris")
  private List<String> redirectUris = null;

  public CreateOAuth2ApplicationOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOAuth2ApplicationOptions redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateOAuth2ApplicationOptions addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<String>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * Get redirectUris
   * @return redirectUris
  **/
  @ApiModelProperty(value = "")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOAuth2ApplicationOptions createOAuth2ApplicationOptions = (CreateOAuth2ApplicationOptions) o;
    return Objects.equals(this.name, createOAuth2ApplicationOptions.name) &&
        Objects.equals(this.redirectUris, createOAuth2ApplicationOptions.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, redirectUris);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOAuth2ApplicationOptions {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
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

