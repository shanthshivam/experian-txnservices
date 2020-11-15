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
 * Response Information pertaining to a new Created Customer
 */
@ApiModel(description = "Response Information pertaining to a new Created Customer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CreateCustomerResponse   {
  @JsonProperty("id")
  private String id = "11111111";

  @JsonProperty("createdDate")
  private String createdDate = "123456789";

  public CreateCustomerResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Generates a unique ID associated with the new Customer which will be used in the endpoint for creating a Consumer
   * @return id
  **/
  @ApiModelProperty(value = "Generates a unique ID associated with the new Customer which will be used in the endpoint for creating a Consumer")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateCustomerResponse createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Indicates the date that the customer was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "Indicates the date that the customer was created")
  
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
    CreateCustomerResponse createCustomerResponse = (CreateCustomerResponse) o;
    return Objects.equals(this.id, createCustomerResponse.id) &&
        Objects.equals(this.createdDate, createCustomerResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerResponse {\n");
    
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
