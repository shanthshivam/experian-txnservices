package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.CustomerReportForArrayConstraints;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Generate Report Response
 */
@ApiModel(description = "Generate Report Response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class GenerateReportResponse   {
  @JsonProperty("id")
  private String id = "2634jhsd823j92812";

  @JsonProperty("requestId")
  private String requestId = "0a1b2c3d3";

  @JsonProperty("consumerId")
  private String consumerId = "0h7h3r301md83";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "1111";

  @JsonProperty("constraints")
  private CustomerReportForArrayConstraints constraints = null;

  /**
   * voa, voi, or voa-history
   */
  public enum TypeEnum {
    VOA("voa"),
    
    VOI("voi"),
    
    VOA_HISTORY("voa-history"),
    
    DCR("dcr");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = TypeEnum.VOA;

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("portfolioId")
  private String portfolioId = "1234abcdef-port";

  public GenerateReportResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The reportId, to be passed to Get Report. (UUID with max length 32 characters).
   * @return id
  **/
  @ApiModelProperty(value = "The reportId, to be passed to Get Report. (UUID with max length 32 characters).")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GenerateReportResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * unique requestId for this specific call request
   * @return requestId
  **/
  @ApiModelProperty(value = "unique requestId for this specific call request")
  
    public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GenerateReportResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * ID of the consumer (UUID with max length 32 characters)
   * @return consumerId
  **/
  @ApiModelProperty(value = "ID of the consumer (UUID with max length 32 characters)")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public GenerateReportResponse consumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
    return this;
  }

  /**
   * Last 4 digits of the report consumer's Social Security number
   * @return consumerSsn
  **/
  @ApiModelProperty(value = "Last 4 digits of the report consumer's Social Security number")
  
    public String getConsumerSsn() {
    return consumerSsn;
  }

  public void setConsumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
  }

  public GenerateReportResponse constraints(CustomerReportForArrayConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomerReportForArrayConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(CustomerReportForArrayConstraints constraints) {
    this.constraints = constraints;
  }

  public GenerateReportResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * voa, voi, or voa-history
   * @return type
  **/
  @ApiModelProperty(value = "voa, voi, or voa-history")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GenerateReportResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * inProgress or success or failure
   * @return status
  **/
  @ApiModelProperty(value = "inProgress or success or failure")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GenerateReportResponse portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Finicity portfolio ID
   * @return portfolioId
  **/
  @ApiModelProperty(value = "Finicity portfolio ID")
  
    public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateReportResponse generateReportResponse = (GenerateReportResponse) o;
    return Objects.equals(this.id, generateReportResponse.id) &&
        Objects.equals(this.requestId, generateReportResponse.requestId) &&
        Objects.equals(this.consumerId, generateReportResponse.consumerId) &&
        Objects.equals(this.consumerSsn, generateReportResponse.consumerSsn) &&
        Objects.equals(this.constraints, generateReportResponse.constraints) &&
        Objects.equals(this.type, generateReportResponse.type) &&
        Objects.equals(this.status, generateReportResponse.status) &&
        Objects.equals(this.portfolioId, generateReportResponse.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestId, consumerId, consumerSsn, constraints, type, status, portfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateReportResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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
