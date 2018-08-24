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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EditHookOption options when modify one hook
 */
@ApiModel(description = "EditHookOption options when modify one hook")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T18:29:44.562+01:00")
public class EditHookOption {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("config")
  private Map<String, String> config = null;

  @SerializedName("events")
  private List<String> events = null;

  public EditHookOption active(Boolean active) {
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

  public EditHookOption config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public EditHookOption putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<String, String>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public EditHookOption events(List<String> events) {
    this.events = events;
    return this;
  }

  public EditHookOption addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditHookOption editHookOption = (EditHookOption) o;
    return Objects.equals(this.active, editHookOption.active) &&
        Objects.equals(this.config, editHookOption.config) &&
        Objects.equals(this.events, editHookOption.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, config, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditHookOption {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

