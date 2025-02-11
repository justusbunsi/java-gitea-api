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
 * GeneralRepoSettings contains global repository settings exposed by API
 */
@ApiModel(description = "GeneralRepoSettings contains global repository settings exposed by API")

public class GeneralRepoSettings {
  @SerializedName("http_git_disabled")
  private Boolean httpGitDisabled = null;

  @SerializedName("lfs_disabled")
  private Boolean lfsDisabled = null;

  @SerializedName("migrations_disabled")
  private Boolean migrationsDisabled = null;

  @SerializedName("mirrors_disabled")
  private Boolean mirrorsDisabled = null;

  @SerializedName("stars_disabled")
  private Boolean starsDisabled = null;

  @SerializedName("time_tracking_disabled")
  private Boolean timeTrackingDisabled = null;

  public GeneralRepoSettings httpGitDisabled(Boolean httpGitDisabled) {
    this.httpGitDisabled = httpGitDisabled;
    return this;
  }

   /**
   * Get httpGitDisabled
   * @return httpGitDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isHttpGitDisabled() {
    return httpGitDisabled;
  }

  public void setHttpGitDisabled(Boolean httpGitDisabled) {
    this.httpGitDisabled = httpGitDisabled;
  }

  public GeneralRepoSettings lfsDisabled(Boolean lfsDisabled) {
    this.lfsDisabled = lfsDisabled;
    return this;
  }

   /**
   * Get lfsDisabled
   * @return lfsDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isLfsDisabled() {
    return lfsDisabled;
  }

  public void setLfsDisabled(Boolean lfsDisabled) {
    this.lfsDisabled = lfsDisabled;
  }

  public GeneralRepoSettings migrationsDisabled(Boolean migrationsDisabled) {
    this.migrationsDisabled = migrationsDisabled;
    return this;
  }

   /**
   * Get migrationsDisabled
   * @return migrationsDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isMigrationsDisabled() {
    return migrationsDisabled;
  }

  public void setMigrationsDisabled(Boolean migrationsDisabled) {
    this.migrationsDisabled = migrationsDisabled;
  }

  public GeneralRepoSettings mirrorsDisabled(Boolean mirrorsDisabled) {
    this.mirrorsDisabled = mirrorsDisabled;
    return this;
  }

   /**
   * Get mirrorsDisabled
   * @return mirrorsDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isMirrorsDisabled() {
    return mirrorsDisabled;
  }

  public void setMirrorsDisabled(Boolean mirrorsDisabled) {
    this.mirrorsDisabled = mirrorsDisabled;
  }

  public GeneralRepoSettings starsDisabled(Boolean starsDisabled) {
    this.starsDisabled = starsDisabled;
    return this;
  }

   /**
   * Get starsDisabled
   * @return starsDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isStarsDisabled() {
    return starsDisabled;
  }

  public void setStarsDisabled(Boolean starsDisabled) {
    this.starsDisabled = starsDisabled;
  }

  public GeneralRepoSettings timeTrackingDisabled(Boolean timeTrackingDisabled) {
    this.timeTrackingDisabled = timeTrackingDisabled;
    return this;
  }

   /**
   * Get timeTrackingDisabled
   * @return timeTrackingDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isTimeTrackingDisabled() {
    return timeTrackingDisabled;
  }

  public void setTimeTrackingDisabled(Boolean timeTrackingDisabled) {
    this.timeTrackingDisabled = timeTrackingDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralRepoSettings generalRepoSettings = (GeneralRepoSettings) o;
    return Objects.equals(this.httpGitDisabled, generalRepoSettings.httpGitDisabled) &&
        Objects.equals(this.lfsDisabled, generalRepoSettings.lfsDisabled) &&
        Objects.equals(this.migrationsDisabled, generalRepoSettings.migrationsDisabled) &&
        Objects.equals(this.mirrorsDisabled, generalRepoSettings.mirrorsDisabled) &&
        Objects.equals(this.starsDisabled, generalRepoSettings.starsDisabled) &&
        Objects.equals(this.timeTrackingDisabled, generalRepoSettings.timeTrackingDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpGitDisabled, lfsDisabled, migrationsDisabled, mirrorsDisabled, starsDisabled, timeTrackingDisabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralRepoSettings {\n");
    
    sb.append("    httpGitDisabled: ").append(toIndentedString(httpGitDisabled)).append("\n");
    sb.append("    lfsDisabled: ").append(toIndentedString(lfsDisabled)).append("\n");
    sb.append("    migrationsDisabled: ").append(toIndentedString(migrationsDisabled)).append("\n");
    sb.append("    mirrorsDisabled: ").append(toIndentedString(mirrorsDisabled)).append("\n");
    sb.append("    starsDisabled: ").append(toIndentedString(starsDisabled)).append("\n");
    sb.append("    timeTrackingDisabled: ").append(toIndentedString(timeTrackingDisabled)).append("\n");
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

