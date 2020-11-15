package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response Information pertaining to a new Created Consumer
 */
@ApiModel(description = "Response Information pertaining to a new Created Consumer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CreateConsumerResponse   {
  @JsonProperty("id")
  private String id = "123456789";

  @JsonProperty("createdDate")
  private String createdDate = "123456789";

  public CreateConsumerResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Returns the ID of the new Consumer which will be used to create an iWidget
   * @return id
  **/
  @ApiModelProperty(value = "Returns the ID of the new Consumer which will be used to create an iWidget")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateConsumerResponse createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date the Consumer was created at
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the Consumer was created at")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConsumerResponse createConsumerResponse = (CreateConsumerResponse) o;
    return Objects.equals(this.id, createConsumerResponse.id) &&
        Objects.equals(this.createdDate, createConsumerResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsumerResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
