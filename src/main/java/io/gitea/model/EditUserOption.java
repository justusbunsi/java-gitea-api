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
 * EditUserOption edit user options
 */
@ApiModel(description = "EditUserOption edit user options")

public class EditUserOption {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("admin")
  private Boolean admin = null;

  @SerializedName("allow_create_organization")
  private Boolean allowCreateOrganization = null;

  @SerializedName("allow_git_hook")
  private Boolean allowGitHook = null;

  @SerializedName("allow_import_local")
  private Boolean allowImportLocal = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("login_name")
  private String loginName = null;

  @SerializedName("max_repo_creation")
  private Long maxRepoCreation = null;

  @SerializedName("must_change_password")
  private Boolean mustChangePassword = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("prohibit_login")
  private Boolean prohibitLogin = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("source_id")
  private Long sourceId = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("website")
  private String website = null;

  public EditUserOption active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public EditUserOption admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public EditUserOption allowCreateOrganization(Boolean allowCreateOrganization) {
    this.allowCreateOrganization = allowCreateOrganization;
    return this;
  }

   /**
   * Get allowCreateOrganization
   * @return allowCreateOrganization
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowCreateOrganization() {
    return allowCreateOrganization;
  }

  public void setAllowCreateOrganization(Boolean allowCreateOrganization) {
    this.allowCreateOrganization = allowCreateOrganization;
  }

  public EditUserOption allowGitHook(Boolean allowGitHook) {
    this.allowGitHook = allowGitHook;
    return this;
  }

   /**
   * Get allowGitHook
   * @return allowGitHook
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowGitHook() {
    return allowGitHook;
  }

  public void setAllowGitHook(Boolean allowGitHook) {
    this.allowGitHook = allowGitHook;
  }

  public EditUserOption allowImportLocal(Boolean allowImportLocal) {
    this.allowImportLocal = allowImportLocal;
    return this;
  }

   /**
   * Get allowImportLocal
   * @return allowImportLocal
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowImportLocal() {
    return allowImportLocal;
  }

  public void setAllowImportLocal(Boolean allowImportLocal) {
    this.allowImportLocal = allowImportLocal;
  }

  public EditUserOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditUserOption email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EditUserOption fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EditUserOption location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public EditUserOption loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * Get loginName
   * @return loginName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public EditUserOption maxRepoCreation(Long maxRepoCreation) {
    this.maxRepoCreation = maxRepoCreation;
    return this;
  }

   /**
   * Get maxRepoCreation
   * @return maxRepoCreation
  **/
  @ApiModelProperty(value = "")
  public Long getMaxRepoCreation() {
    return maxRepoCreation;
  }

  public void setMaxRepoCreation(Long maxRepoCreation) {
    this.maxRepoCreation = maxRepoCreation;
  }

  public EditUserOption mustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
    return this;
  }

   /**
   * Get mustChangePassword
   * @return mustChangePassword
  **/
  @ApiModelProperty(value = "")
  public Boolean isMustChangePassword() {
    return mustChangePassword;
  }

  public void setMustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
  }

  public EditUserOption password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EditUserOption prohibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
    return this;
  }

   /**
   * Get prohibitLogin
   * @return prohibitLogin
  **/
  @ApiModelProperty(value = "")
  public Boolean isProhibitLogin() {
    return prohibitLogin;
  }

  public void setProhibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
  }

  public EditUserOption restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Get restricted
   * @return restricted
  **/
  @ApiModelProperty(value = "")
  public Boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public EditUserOption sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  public EditUserOption visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(value = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public EditUserOption website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditUserOption editUserOption = (EditUserOption) o;
    return Objects.equals(this.active, editUserOption.active) &&
        Objects.equals(this.admin, editUserOption.admin) &&
        Objects.equals(this.allowCreateOrganization, editUserOption.allowCreateOrganization) &&
        Objects.equals(this.allowGitHook, editUserOption.allowGitHook) &&
        Objects.equals(this.allowImportLocal, editUserOption.allowImportLocal) &&
        Objects.equals(this.description, editUserOption.description) &&
        Objects.equals(this.email, editUserOption.email) &&
        Objects.equals(this.fullName, editUserOption.fullName) &&
        Objects.equals(this.location, editUserOption.location) &&
        Objects.equals(this.loginName, editUserOption.loginName) &&
        Objects.equals(this.maxRepoCreation, editUserOption.maxRepoCreation) &&
        Objects.equals(this.mustChangePassword, editUserOption.mustChangePassword) &&
        Objects.equals(this.password, editUserOption.password) &&
        Objects.equals(this.prohibitLogin, editUserOption.prohibitLogin) &&
        Objects.equals(this.restricted, editUserOption.restricted) &&
        Objects.equals(this.sourceId, editUserOption.sourceId) &&
        Objects.equals(this.visibility, editUserOption.visibility) &&
        Objects.equals(this.website, editUserOption.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, admin, allowCreateOrganization, allowGitHook, allowImportLocal, description, email, fullName, location, loginName, maxRepoCreation, mustChangePassword, password, prohibitLogin, restricted, sourceId, visibility, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditUserOption {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    allowCreateOrganization: ").append(toIndentedString(allowCreateOrganization)).append("\n");
    sb.append("    allowGitHook: ").append(toIndentedString(allowGitHook)).append("\n");
    sb.append("    allowImportLocal: ").append(toIndentedString(allowImportLocal)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    maxRepoCreation: ").append(toIndentedString(maxRepoCreation)).append("\n");
    sb.append("    mustChangePassword: ").append(toIndentedString(mustChangePassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    prohibitLogin: ").append(toIndentedString(prohibitLogin)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

