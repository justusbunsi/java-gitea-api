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
 * IssueLabelsOption a collection of labels
 */
@ApiModel(description = "IssueLabelsOption a collection of labels")

public class IssueLabelsOption {
  @SerializedName("labels")
  private List<Long> labels = null;

  public IssueLabelsOption labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public IssueLabelsOption addLabelsItem(Long labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Long>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * list of label IDs
   * @return labels
  **/
  @ApiModelProperty(value = "list of label IDs")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLabelsOption issueLabelsOption = (IssueLabelsOption) o;
    return Objects.equals(this.labels, issueLabelsOption.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLabelsOption {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

