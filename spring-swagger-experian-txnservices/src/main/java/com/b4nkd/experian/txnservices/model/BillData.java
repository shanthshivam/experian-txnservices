package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExternalResellerResponse
 */
@ApiModel(description = "ExternalResellerResponse")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class BillData   {
  @JsonProperty("billDate")
  private String billDate = "2019-10-16T04:56:03.970+0000";

  @JsonProperty("billedTransaction")
  private String billedTransaction = "N";

  @JsonProperty("platformProvider")
  private String platformProvider = "PTEST";

  @JsonProperty("createdDate")
  private String createdDate = "2019-10-09T21:27:56.000+0000";

  @JsonProperty("customerId")
  private String customerId = "11111111";

  @JsonProperty("consumerId")
  private String consumerId = "0h7h3r301md83";

  @JsonProperty("firstname")
  private String firstname = "John";

  @JsonProperty("lastName")
  private String lastName = "Doe";

  @JsonProperty("consumerSSN")
  private String consumerSSN = "6789";

  /**
   * The type of report that was generated.
   */
  public enum ReportTypeEnum {
    VOA("voa"),
    
    VOI("voi"),
    
    VOA_HISTORY("voa-history"),
    
    DCR("dcr"),
    
    LITE("lite"),
    
    FIX("fix");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("reportType")
  private ReportTypeEnum reportType = ReportTypeEnum.VOA;

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("loanId")
  private String loanId = "gjhorjeoijl12";

  @JsonProperty("lastFourReportid")
  private String lastFourReportid = "8907";

  @JsonProperty("reseller")
  private String reseller = "Experian";

  @JsonProperty("resellerProvider")
  private String resellerProvider = "experian";

  @JsonProperty("lenderName")
  private String lenderName = "abc";

  @JsonProperty("partnerId")
  private String partnerId = "2445582773174";

  @JsonProperty("totalRemainingPages")
  private Integer totalRemainingPages = null;

  public BillData billDate(String billDate) {
    this.billDate = billDate;
    return this;
  }

  /**
   * Experian generated billing record date
   * @return billDate
  **/
  @ApiModelProperty(value = "Experian generated billing record date")
  
    public String getBillDate() {
    return billDate;
  }

  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }

  public BillData billedTransaction(String billedTransaction) {
    this.billedTransaction = billedTransaction;
    return this;
  }

  /**
   * Y / N
   * @return billedTransaction
  **/
  @ApiModelProperty(value = "Y / N")
  
    public String getBilledTransaction() {
    return billedTransaction;
  }

  public void setBilledTransaction(String billedTransaction) {
    this.billedTransaction = billedTransaction;
  }

  public BillData platformProvider(String platformProvider) {
    this.platformProvider = platformProvider;
    return this;
  }

  /**
   * Name of platform provider associated with the report
   * @return platformProvider
  **/
  @ApiModelProperty(value = "Name of platform provider associated with the report")
  
    public String getPlatformProvider() {
    return platformProvider;
  }

  public void setPlatformProvider(String platformProvider) {
    this.platformProvider = platformProvider;
  }

  public BillData createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The created date of the report
   * @return createdDate
  **/
  @ApiModelProperty(value = "The created date of the report")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public BillData customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID of Customer
   * @return customerId
  **/
  @ApiModelProperty(value = "ID of Customer")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BillData consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * ID of Consumer
   * @return consumerId
  **/
  @ApiModelProperty(value = "ID of Consumer")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public BillData firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * The first name of the consumer record. This will display null if no consumer is associated with the report listed.
   * @return firstname
  **/
  @ApiModelProperty(value = "The first name of the consumer record. This will display null if no consumer is associated with the report listed.")
  
    public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public BillData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the consumer record.
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name of the consumer record.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BillData consumerSSN(String consumerSSN) {
    this.consumerSSN = consumerSSN;
    return this;
  }

  /**
   * The last four digits of the consumer’s SSN.
   * @return consumerSSN
  **/
  @ApiModelProperty(value = "The last four digits of the consumer’s SSN.")
  
    public String getConsumerSSN() {
    return consumerSSN;
  }

  public void setConsumerSSN(String consumerSSN) {
    this.consumerSSN = consumerSSN;
  }

  public BillData reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * The type of report that was generated.
   * @return reportType
  **/
  @ApiModelProperty(value = "The type of report that was generated.")
  
    public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public BillData status(String status) {
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

  public BillData loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

  /**
   * loan number
   * @return loanId
  **/
  @ApiModelProperty(value = "loan number")
  
    public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public BillData lastFourReportid(String lastFourReportid) {
    this.lastFourReportid = lastFourReportid;
    return this;
  }

  /**
   * The last four characters of the report ID before the “-[report type]” suffix associated with the consumer.
   * @return lastFourReportid
  **/
  @ApiModelProperty(value = "The last four characters of the report ID before the “-[report type]” suffix associated with the consumer.")
  
    public String getLastFourReportid() {
    return lastFourReportid;
  }

  public void setLastFourReportid(String lastFourReportid) {
    this.lastFourReportid = lastFourReportid;
  }

  public BillData reseller(String reseller) {
    this.reseller = reseller;
    return this;
  }

  /**
   * The name of the reseller associated with the report.This will be null if there is no reseller associated with the report.
   * @return reseller
  **/
  @ApiModelProperty(value = "The name of the reseller associated with the report.This will be null if there is no reseller associated with the report.")
  
    public String getReseller() {
    return reseller;
  }

  public void setReseller(String reseller) {
    this.reseller = reseller;
  }

  public BillData resellerProvider(String resellerProvider) {
    this.resellerProvider = resellerProvider;
    return this;
  }

  /**
   * The name of the second level reseller associated with the report. This will be null if there is no second level reseller associated with the report.
   * @return resellerProvider
  **/
  @ApiModelProperty(value = "The name of the second level reseller associated with the report. This will be null if there is no second level reseller associated with the report.")
  
    public String getResellerProvider() {
    return resellerProvider;
  }

  public void setResellerProvider(String resellerProvider) {
    this.resellerProvider = resellerProvider;
  }

  public BillData lenderName(String lenderName) {
    this.lenderName = lenderName;
    return this;
  }

  /**
   * Friendly name of the lender (Partner id)
   * @return lenderName
  **/
  @ApiModelProperty(value = "Friendly name of the lender (Partner id)")
  
    public String getLenderName() {
    return lenderName;
  }

  public void setLenderName(String lenderName) {
    this.lenderName = lenderName;
  }

  public BillData partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * ID of the report partner
   * @return partnerId
  **/
  @ApiModelProperty(value = "ID of the report partner")
  
    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public BillData totalRemainingPages(Integer totalRemainingPages) {
    this.totalRemainingPages = totalRemainingPages;
    return this;
  }

  /**
   * Returns total number of pages remaining to retrieve
   * @return totalRemainingPages
  **/
  @ApiModelProperty(value = "Returns total number of pages remaining to retrieve")
  
    public Integer getTotalRemainingPages() {
    return totalRemainingPages;
  }

  public void setTotalRemainingPages(Integer totalRemainingPages) {
    this.totalRemainingPages = totalRemainingPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillData billData = (BillData) o;
    return Objects.equals(this.billDate, billData.billDate) &&
        Objects.equals(this.billedTransaction, billData.billedTransaction) &&
        Objects.equals(this.platformProvider, billData.platformProvider) &&
        Objects.equals(this.createdDate, billData.createdDate) &&
        Objects.equals(this.customerId, billData.customerId) &&
        Objects.equals(this.consumerId, billData.consumerId) &&
        Objects.equals(this.firstname, billData.firstname) &&
        Objects.equals(this.lastName, billData.lastName) &&
        Objects.equals(this.consumerSSN, billData.consumerSSN) &&
        Objects.equals(this.reportType, billData.reportType) &&
        Objects.equals(this.status, billData.status) &&
        Objects.equals(this.loanId, billData.loanId) &&
        Objects.equals(this.lastFourReportid, billData.lastFourReportid) &&
        Objects.equals(this.reseller, billData.reseller) &&
        Objects.equals(this.resellerProvider, billData.resellerProvider) &&
        Objects.equals(this.lenderName, billData.lenderName) &&
        Objects.equals(this.partnerId, billData.partnerId) &&
        Objects.equals(this.totalRemainingPages, billData.totalRemainingPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billDate, billedTransaction, platformProvider, createdDate, customerId, consumerId, firstname, lastName, consumerSSN, reportType, status, loanId, lastFourReportid, reseller, resellerProvider, lenderName, partnerId, totalRemainingPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillData {\n");
    
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    billedTransaction: ").append(toIndentedString(billedTransaction)).append("\n");
    sb.append("    platformProvider: ").append(toIndentedString(platformProvider)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    consumerSSN: ").append(toIndentedString(consumerSSN)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    lastFourReportid: ").append(toIndentedString(lastFourReportid)).append("\n");
    sb.append("    reseller: ").append(toIndentedString(reseller)).append("\n");
    sb.append("    resellerProvider: ").append(toIndentedString(resellerProvider)).append("\n");
    sb.append("    lenderName: ").append(toIndentedString(lenderName)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    totalRemainingPages: ").append(toIndentedString(totalRemainingPages)).append("\n");
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
