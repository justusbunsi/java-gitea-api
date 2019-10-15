/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
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
import io.gitea.model.RepoCommit;
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Commit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-15T10:08:30.717+03:00")
public class Commit {
  @SerializedName("author")
  private User author = null;

  @SerializedName("commit")
  private RepoCommit commit = null;

  @SerializedName("committer")
  private User committer = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("parents")
  private List<CommitMeta> parents = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("url")
  private String url = null;

  public Commit author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Commit commit(RepoCommit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @ApiModelProperty(value = "")
  public RepoCommit getCommit() {
    return commit;
  }

  public void setCommit(RepoCommit commit) {
    this.commit = commit;
  }

  public Commit committer(User committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public User getCommitter() {
    return committer;
  }

  public void setCommitter(User committer) {
    this.committer = committer;
  }

  public Commit htmlUrl(String htmlUrl) {
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

  public Commit parents(List<CommitMeta> parents) {
    this.parents = parents;
    return this;
  }

  public Commit addParentsItem(CommitMeta parentsItem) {
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

  public Commit sha(String sha) {
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

  public Commit url(String url) {
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
    Commit commit = (Commit) o;
    return Objects.equals(this.author, commit.author) &&
        Objects.equals(this.commit, commit.commit) &&
        Objects.equals(this.committer, commit.committer) &&
        Objects.equals(this.htmlUrl, commit.htmlUrl) &&
        Objects.equals(this.parents, commit.parents) &&
        Objects.equals(this.sha, commit.sha) &&
        Objects.equals(this.url, commit.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, commit, committer, htmlUrl, parents, sha, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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

