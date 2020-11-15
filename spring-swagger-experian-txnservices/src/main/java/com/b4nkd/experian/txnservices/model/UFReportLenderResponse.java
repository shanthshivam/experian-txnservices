package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.Characteristics;
import com.b4nkd.experian.txnservices.model.UFReportLenderResponseInstitutions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lenders DDA Characteristics Report
 */
@ApiModel(description = "Lenders DDA Characteristics Report")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class UFReportLenderResponse   {
  @JsonProperty("id")
  private String id = "j48rf6h4naw6";

  @JsonProperty("title")
  private String title = "Finicity DDA Characteristics Report";

  @JsonProperty("requestId")
  private String requestId = "0a1b2c3d3";

  @JsonProperty("consumerId")
  private String consumerId = "cf4af042ed1e67efbd4c7383403a0bb5";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "6789";

  @JsonProperty("type")
  private String type = "dcr";

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("createdDate")
  private BigDecimal createdDate = null;

  @JsonProperty("startDate")
  private BigDecimal startDate = null;

  @JsonProperty("endDate")
  private BigDecimal endDate = null;

  @JsonProperty("days")
  private BigDecimal days = null;

  @JsonProperty("seasoned")
  private Boolean seasoned = true;

  @JsonProperty("institutions")
  private UFReportLenderResponseInstitutions institutions = null;

  @JsonProperty("compositionCharacteristics")
  @Valid
  private List<Characteristics> compositionCharacteristics = null;

  @JsonProperty("cashFlowCharacteristics")
  @Valid
  private List<Characteristics> cashFlowCharacteristics = null;

  @JsonProperty("negativeCharacteristics")
  @Valid
  private List<Characteristics> negativeCharacteristics = null;

  @JsonProperty("transactionCharacteristics")
  @Valid
  private List<Characteristics> transactionCharacteristics = null;

  @JsonProperty("activityCharacteristics")
  @Valid
  private List<Characteristics> activityCharacteristics = null;

  @JsonProperty("portfolioId")
  private String portfolioId = "abcdef12345-port";

  public UFReportLenderResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Finicity report ID (max length 32 characters)
   * @return id
  **/
  @ApiModelProperty(value = "The Finicity report ID (max length 32 characters)")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UFReportLenderResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The full name of the report
   * @return title
  **/
  @ApiModelProperty(value = "The full name of the report")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UFReportLenderResponse requestId(String requestId) {
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

  public UFReportLenderResponse consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Finicity report consumer ID (max length 32 characters)
   * @return consumerId
  **/
  @ApiModelProperty(value = "Finicity report consumer ID (max length 32 characters)")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public UFReportLenderResponse consumerSsn(String consumerSsn) {
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

  public UFReportLenderResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The report type you wish to have generated for you. Can be a comma delimited list.
   * @return type
  **/
  @ApiModelProperty(value = "The report type you wish to have generated for you. Can be a comma delimited list.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UFReportLenderResponse status(String status) {
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

  public UFReportLenderResponse createdDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date format of when the report was generated
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date format of when the report was generated")
  
    @Valid
    public BigDecimal getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
  }

  public UFReportLenderResponse startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The postedDate of the earliest transaction analyzed for this report
   * @return startDate
  **/
  @ApiModelProperty(value = "The postedDate of the earliest transaction analyzed for this report")
  
    @Valid
    public BigDecimal getStartDate() {
    return startDate;
  }

  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  public UFReportLenderResponse endDate(BigDecimal endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The postedDate of the latest transaction analyzed for this report
   * @return endDate
  **/
  @ApiModelProperty(value = "The postedDate of the latest transaction analyzed for this report")
  
    @Valid
    public BigDecimal getEndDate() {
    return endDate;
  }

  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

  public UFReportLenderResponse days(BigDecimal days) {
    this.days = days;
    return this;
  }

  /**
   * Number of days covered by the report
   * @return days
  **/
  @ApiModelProperty(value = "Number of days covered by the report")
  
    @Valid
    public BigDecimal getDays() {
    return days;
  }

  public void setDays(BigDecimal days) {
    this.days = days;
  }

  public UFReportLenderResponse seasoned(Boolean seasoned) {
    this.seasoned = seasoned;
    return this;
  }

  /**
   * true if the report covers more than 180 days
   * @return seasoned
  **/
  @ApiModelProperty(value = "true if the report covers more than 180 days")
  
    public Boolean isSeasoned() {
    return seasoned;
  }

  public void setSeasoned(Boolean seasoned) {
    this.seasoned = seasoned;
  }

  public UFReportLenderResponse institutions(UFReportLenderResponseInstitutions institutions) {
    this.institutions = institutions;
    return this;
  }

  /**
   * Get institutions
   * @return institutions
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UFReportLenderResponseInstitutions getInstitutions() {
    return institutions;
  }

  public void setInstitutions(UFReportLenderResponseInstitutions institutions) {
    this.institutions = institutions;
  }

  public UFReportLenderResponse compositionCharacteristics(List<Characteristics> compositionCharacteristics) {
    this.compositionCharacteristics = compositionCharacteristics;
    return this;
  }

  public UFReportLenderResponse addCompositionCharacteristicsItem(Characteristics compositionCharacteristicsItem) {
    if (this.compositionCharacteristics == null) {
      this.compositionCharacteristics = new ArrayList<Characteristics>();
    }
    this.compositionCharacteristics.add(compositionCharacteristicsItem);
    return this;
  }

  /**
   * Composition Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).
   * @return compositionCharacteristics
  **/
  @ApiModelProperty(value = "Composition Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).")
      @Valid
    public List<Characteristics> getCompositionCharacteristics() {
    return compositionCharacteristics;
  }

  public void setCompositionCharacteristics(List<Characteristics> compositionCharacteristics) {
    this.compositionCharacteristics = compositionCharacteristics;
  }

  public UFReportLenderResponse cashFlowCharacteristics(List<Characteristics> cashFlowCharacteristics) {
    this.cashFlowCharacteristics = cashFlowCharacteristics;
    return this;
  }

  public UFReportLenderResponse addCashFlowCharacteristicsItem(Characteristics cashFlowCharacteristicsItem) {
    if (this.cashFlowCharacteristics == null) {
      this.cashFlowCharacteristics = new ArrayList<Characteristics>();
    }
    this.cashFlowCharacteristics.add(cashFlowCharacteristicsItem);
    return this;
  }

  /**
   * Cash Flow Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).
   * @return cashFlowCharacteristics
  **/
  @ApiModelProperty(value = "Cash Flow Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).")
      @Valid
    public List<Characteristics> getCashFlowCharacteristics() {
    return cashFlowCharacteristics;
  }

  public void setCashFlowCharacteristics(List<Characteristics> cashFlowCharacteristics) {
    this.cashFlowCharacteristics = cashFlowCharacteristics;
  }

  public UFReportLenderResponse negativeCharacteristics(List<Characteristics> negativeCharacteristics) {
    this.negativeCharacteristics = negativeCharacteristics;
    return this;
  }

  public UFReportLenderResponse addNegativeCharacteristicsItem(Characteristics negativeCharacteristicsItem) {
    if (this.negativeCharacteristics == null) {
      this.negativeCharacteristics = new ArrayList<Characteristics>();
    }
    this.negativeCharacteristics.add(negativeCharacteristicsItem);
    return this;
  }

  /**
   * Negative Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).
   * @return negativeCharacteristics
  **/
  @ApiModelProperty(value = "Negative Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).")
      @Valid
    public List<Characteristics> getNegativeCharacteristics() {
    return negativeCharacteristics;
  }

  public void setNegativeCharacteristics(List<Characteristics> negativeCharacteristics) {
    this.negativeCharacteristics = negativeCharacteristics;
  }

  public UFReportLenderResponse transactionCharacteristics(List<Characteristics> transactionCharacteristics) {
    this.transactionCharacteristics = transactionCharacteristics;
    return this;
  }

  public UFReportLenderResponse addTransactionCharacteristicsItem(Characteristics transactionCharacteristicsItem) {
    if (this.transactionCharacteristics == null) {
      this.transactionCharacteristics = new ArrayList<Characteristics>();
    }
    this.transactionCharacteristics.add(transactionCharacteristicsItem);
    return this;
  }

  /**
   * Transaction Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”). <br><br>There are only six examples of this, found in the Transactions Characteristics Record.
   * @return transactionCharacteristics
  **/
  @ApiModelProperty(value = "Transaction Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”). <br><br>There are only six examples of this, found in the Transactions Characteristics Record.")
      @Valid
    public List<Characteristics> getTransactionCharacteristics() {
    return transactionCharacteristics;
  }

  public void setTransactionCharacteristics(List<Characteristics> transactionCharacteristics) {
    this.transactionCharacteristics = transactionCharacteristics;
  }

  public UFReportLenderResponse activityCharacteristics(List<Characteristics> activityCharacteristics) {
    this.activityCharacteristics = activityCharacteristics;
    return this;
  }

  public UFReportLenderResponse addActivityCharacteristicsItem(Characteristics activityCharacteristicsItem) {
    if (this.activityCharacteristics == null) {
      this.activityCharacteristics = new ArrayList<Characteristics>();
    }
    this.activityCharacteristics.add(activityCharacteristicsItem);
    return this;
  }

  /**
   * Activity Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).
   * @return activityCharacteristics
  **/
  @ApiModelProperty(value = "Activity Characteristics Record. <br><br>NOTE: All characteristics are calculated at the customer level, across all accounts in the report, except where the field name indicates (the field name ends with “account”).")
      @Valid
    public List<Characteristics> getActivityCharacteristics() {
    return activityCharacteristics;
  }

  public void setActivityCharacteristics(List<Characteristics> activityCharacteristics) {
    this.activityCharacteristics = activityCharacteristics;
  }

  public UFReportLenderResponse portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Portfolio ID
   * @return portfolioId
  **/
  @ApiModelProperty(value = "Portfolio ID")
  
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
    UFReportLenderResponse ufReportLenderResponse = (UFReportLenderResponse) o;
    return Objects.equals(this.id, ufReportLenderResponse.id) &&
        Objects.equals(this.title, ufReportLenderResponse.title) &&
        Objects.equals(this.requestId, ufReportLenderResponse.requestId) &&
        Objects.equals(this.consumerId, ufReportLenderResponse.consumerId) &&
        Objects.equals(this.consumerSsn, ufReportLenderResponse.consumerSsn) &&
        Objects.equals(this.type, ufReportLenderResponse.type) &&
        Objects.equals(this.status, ufReportLenderResponse.status) &&
        Objects.equals(this.createdDate, ufReportLenderResponse.createdDate) &&
        Objects.equals(this.startDate, ufReportLenderResponse.startDate) &&
        Objects.equals(this.endDate, ufReportLenderResponse.endDate) &&
        Objects.equals(this.days, ufReportLenderResponse.days) &&
        Objects.equals(this.seasoned, ufReportLenderResponse.seasoned) &&
        Objects.equals(this.institutions, ufReportLenderResponse.institutions) &&
        Objects.equals(this.compositionCharacteristics, ufReportLenderResponse.compositionCharacteristics) &&
        Objects.equals(this.cashFlowCharacteristics, ufReportLenderResponse.cashFlowCharacteristics) &&
        Objects.equals(this.negativeCharacteristics, ufReportLenderResponse.negativeCharacteristics) &&
        Objects.equals(this.transactionCharacteristics, ufReportLenderResponse.transactionCharacteristics) &&
        Objects.equals(this.activityCharacteristics, ufReportLenderResponse.activityCharacteristics) &&
        Objects.equals(this.portfolioId, ufReportLenderResponse.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, requestId, consumerId, consumerSsn, type, status, createdDate, startDate, endDate, days, seasoned, institutions, compositionCharacteristics, cashFlowCharacteristics, negativeCharacteristics, transactionCharacteristics, activityCharacteristics, portfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UFReportLenderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seasoned: ").append(toIndentedString(seasoned)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    compositionCharacteristics: ").append(toIndentedString(compositionCharacteristics)).append("\n");
    sb.append("    cashFlowCharacteristics: ").append(toIndentedString(cashFlowCharacteristics)).append("\n");
    sb.append("    negativeCharacteristics: ").append(toIndentedString(negativeCharacteristics)).append("\n");
    sb.append("    transactionCharacteristics: ").append(toIndentedString(transactionCharacteristics)).append("\n");
    sb.append("    activityCharacteristics: ").append(toIndentedString(activityCharacteristics)).append("\n");
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
