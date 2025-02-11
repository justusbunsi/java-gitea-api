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
import io.gitea.model.CommitMeta;
import io.gitea.model.CommitUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * FileCommitResponse
 */

public class FileCommitResponse {
  @SerializedName("author")
  private CommitUser author = null;

  @SerializedName("committer")
  private CommitUser committer = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("parents")
  private List<CommitMeta> parents = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("tree")
  private CommitMeta tree = null;

  @SerializedName("url")
  private String url = null;

  public FileCommitResponse author(CommitUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public CommitUser getAuthor() {
    return author;
  }

  public void setAuthor(CommitUser author) {
    this.author = author;
  }

  public FileCommitResponse committer(CommitUser committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public CommitUser getCommitter() {
    return committer;
  }

  public void setCommitter(CommitUser committer) {
    this.committer = committer;
  }

  public FileCommitResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public FileCommitResponse htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @ApiModelProperty(value = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public FileCommitResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FileCommitResponse parents(List<CommitMeta> parents) {
    this.parents = parents;
    return this;
  }

  public FileCommitResponse addParentsItem(CommitMeta parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<CommitMeta>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @ApiModelProperty(value = "")
  public List<CommitMeta> getParents() {
    return parents;
  }

  public void setParents(List<CommitMeta> parents) {
    this.parents = parents;
  }

  public FileCommitResponse sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @ApiModelProperty(value = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public FileCommitResponse tree(CommitMeta tree) {
    this.tree = tree;
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  @ApiModelProperty(value = "")
  public CommitMeta getTree() {
    return tree;
  }

  public void setTree(CommitMeta tree) {
    this.tree = tree;
  }

  public FileCommitResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCommitResponse fileCommitResponse = (FileCommitResponse) o;
    return Objects.equals(this.author, fileCommitResponse.author) &&
        Objects.equals(this.committer, fileCommitResponse.committer) &&
        Objects.equals(this.created, fileCommitResponse.created) &&
        Objects.equals(this.htmlUrl, fileCommitResponse.htmlUrl) &&
        Objects.equals(this.message, fileCommitResponse.message) &&
        Objects.equals(this.parents, fileCommitResponse.parents) &&
        Objects.equals(this.sha, fileCommitResponse.sha) &&
        Objects.equals(this.tree, fileCommitResponse.tree) &&
        Objects.equals(this.url, fileCommitResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer, created, htmlUrl, message, parents, sha, tree, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCommitResponse {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

