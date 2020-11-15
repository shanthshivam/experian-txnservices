package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.GeneratePayStatementReportResponseConstraints;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeneratePayStatementReportResponse
 */
@ApiModel(description = "GeneratePayStatementReportResponse")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class GeneratePayStatementReportResponse   {
  @JsonProperty("id")
  private String id = "2634jhsd823j92812";

  @JsonProperty("requestId")
  private String requestId = "0a1b2c3d3";

  @JsonProperty("consumerId")
  private String consumerId = "0h7h3r301md83";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "1111";

  @JsonProperty("constraints")
  private GeneratePayStatementReportResponseConstraints constraints = null;

  /**
   * paystatement
   */
  public enum TypeEnum {
    PAYSTATEMENT("paystatement");

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
  private TypeEnum type = TypeEnum.PAYSTATEMENT;

  /**
   * paystatement
   */
  public enum ReportStyleEnum {
    PAYSTATEMENT("paystatement");

    private String value;

    ReportStyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportStyleEnum fromValue(String text) {
      for (ReportStyleEnum b : ReportStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("reportStyle")
  private ReportStyleEnum reportStyle = ReportStyleEnum.PAYSTATEMENT;

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("title")
  private String title = "“Finicity Pay Statement Extraction Report”";

  public GeneratePayStatementReportResponse id(String id) {
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

  public GeneratePayStatementReportResponse requestId(String requestId) {
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

  public GeneratePayStatementReportResponse consumerId(String consumerId) {
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

  public GeneratePayStatementReportResponse consumerSsn(String consumerSsn) {
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

  public GeneratePayStatementReportResponse constraints(GeneratePayStatementReportResponseConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GeneratePayStatementReportResponseConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(GeneratePayStatementReportResponseConstraints constraints) {
    this.constraints = constraints;
  }

  public GeneratePayStatementReportResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * paystatement
   * @return type
  **/
  @ApiModelProperty(value = "paystatement")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GeneratePayStatementReportResponse reportStyle(ReportStyleEnum reportStyle) {
    this.reportStyle = reportStyle;
    return this;
  }

  /**
   * paystatement
   * @return reportStyle
  **/
  @ApiModelProperty(value = "paystatement")
  
    public ReportStyleEnum getReportStyle() {
    return reportStyle;
  }

  public void setReportStyle(ReportStyleEnum reportStyle) {
    this.reportStyle = reportStyle;
  }

  public GeneratePayStatementReportResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the report.This will return as inProgress or success or failure
   * @return status
  **/
  @ApiModelProperty(value = "The status of the report.This will return as inProgress or success or failure")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GeneratePayStatementReportResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Finicity report title
   * @return title
  **/
  @ApiModelProperty(value = "Finicity report title")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePayStatementReportResponse generatePayStatementReportResponse = (GeneratePayStatementReportResponse) o;
    return Objects.equals(this.id, generatePayStatementReportResponse.id) &&
        Objects.equals(this.requestId, generatePayStatementReportResponse.requestId) &&
        Objects.equals(this.consumerId, generatePayStatementReportResponse.consumerId) &&
        Objects.equals(this.consumerSsn, generatePayStatementReportResponse.consumerSsn) &&
        Objects.equals(this.constraints, generatePayStatementReportResponse.constraints) &&
        Objects.equals(this.type, generatePayStatementReportResponse.type) &&
        Objects.equals(this.reportStyle, generatePayStatementReportResponse.reportStyle) &&
        Objects.equals(this.status, generatePayStatementReportResponse.status) &&
        Objects.equals(this.title, generatePayStatementReportResponse.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestId, consumerId, consumerSsn, constraints, type, reportStyle, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratePayStatementReportResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reportStyle: ").append(toIndentedString(reportStyle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
