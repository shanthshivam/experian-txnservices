package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.BillData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExternalResellerResponse
 */
@ApiModel(description = "ExternalResellerResponse")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ExternalResellerResponse   {
  @JsonProperty("data")
  @Valid
  private List<BillData> data = null;

  @JsonProperty("message")
  private String message = "External reseller billing details successfully retrieved";

  @JsonProperty("status")
  private String status = "success";

  public ExternalResellerResponse data(List<BillData> data) {
    this.data = data;
    return this;
  }

  public ExternalResellerResponse addDataItem(BillData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<BillData>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of Billing Data
   * @return data
  **/
  @ApiModelProperty(value = "Array of Billing Data")
      @Valid
    public List<BillData> getData() {
    return data;
  }

  public void setData(List<BillData> data) {
    this.data = data;
  }

  public ExternalResellerResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message Text
   * @return message
  **/
  @ApiModelProperty(value = "message Text")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExternalResellerResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Response status
   * @return status
  **/
  @ApiModelProperty(value = "Response status")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalResellerResponse externalResellerResponse = (ExternalResellerResponse) o;
    return Objects.equals(this.data, externalResellerResponse.data) &&
        Objects.equals(this.message, externalResellerResponse.message) &&
        Objects.equals(this.status, externalResellerResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalResellerResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
