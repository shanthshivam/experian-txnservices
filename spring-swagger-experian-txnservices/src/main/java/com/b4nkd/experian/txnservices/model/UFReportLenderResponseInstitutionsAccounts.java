package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of account records
 */
@ApiModel(description = "A list of account records")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class UFReportLenderResponseInstitutionsAccounts   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("ownerName")
  private String ownerName = "Patrick & Lorraine Purchaser";

  @JsonProperty("firstNameConfidence")
  private BigDecimal firstNameConfidence = null;

  @JsonProperty("lastNameConfidence")
  private BigDecimal lastNameConfidence = null;

  @JsonProperty("ownerAddress")
  private String ownerAddress = "7195 Belmont St. Parlin, NJ 08859";

  @JsonProperty("addressConfidence")
  private BigDecimal addressConfidence = null;

  @JsonProperty("name")
  private String name = "Checking";

  @JsonProperty("number")
  private String number = "XX1111";

  @JsonProperty("type")
  private String type = "checking";

  @JsonProperty("aggregationStatusCode")
  private BigDecimal aggregationStatusCode = null;

  @JsonProperty("calcStatus")
  private String calcStatus = "excluded";

  @JsonProperty("reason")
  private String reason = "Business Account";

  public UFReportLenderResponseInstitutionsAccounts id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Finicity account ID
   * @return id
  **/
  @ApiModelProperty(value = "Finicity account ID")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public UFReportLenderResponseInstitutionsAccounts ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")
  
    public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public UFReportLenderResponseInstitutionsAccounts firstNameConfidence(BigDecimal firstNameConfidence) {
    this.firstNameConfidence = firstNameConfidence;
    return this;
  }

  /**
   * Confidence level out of 100 of the first name
   * @return firstNameConfidence
  **/
  @ApiModelProperty(value = "Confidence level out of 100 of the first name")
  
    @Valid
    public BigDecimal getFirstNameConfidence() {
    return firstNameConfidence;
  }

  public void setFirstNameConfidence(BigDecimal firstNameConfidence) {
    this.firstNameConfidence = firstNameConfidence;
  }

  public UFReportLenderResponseInstitutionsAccounts lastNameConfidence(BigDecimal lastNameConfidence) {
    this.lastNameConfidence = lastNameConfidence;
    return this;
  }

  /**
   * Confidence level out of 100 of the last name
   * @return lastNameConfidence
  **/
  @ApiModelProperty(value = "Confidence level out of 100 of the last name")
  
    @Valid
    public BigDecimal getLastNameConfidence() {
    return lastNameConfidence;
  }

  public void setLastNameConfidence(BigDecimal lastNameConfidence) {
    this.lastNameConfidence = lastNameConfidence;
  }

  public UFReportLenderResponseInstitutionsAccounts ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

  /**
   * The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerAddress
  **/
  @ApiModelProperty(value = "The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")
  
    public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public UFReportLenderResponseInstitutionsAccounts addressConfidence(BigDecimal addressConfidence) {
    this.addressConfidence = addressConfidence;
    return this;
  }

  /**
   * Confidence level out of 100 of the address
   * @return addressConfidence
  **/
  @ApiModelProperty(value = "Confidence level out of 100 of the address")
  
    @Valid
    public BigDecimal getAddressConfidence() {
    return addressConfidence;
  }

  public void setAddressConfidence(BigDecimal addressConfidence) {
    this.addressConfidence = addressConfidence;
  }

  public UFReportLenderResponseInstitutionsAccounts name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name from the institution.
   * @return name
  **/
  @ApiModelProperty(value = "The account name from the institution.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UFReportLenderResponseInstitutionsAccounts number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The account number from the institution (obfuscated)
   * @return number
  **/
  @ApiModelProperty(value = "The account number from the institution (obfuscated)")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public UFReportLenderResponseInstitutionsAccounts type(String type) {
    this.type = type;
    return this;
  }

  /**
   * For VOA the possibilities are checking / savings / moneyMarket / cd / investment For VOI the options are checking / savings / moneyMarket 
   * @return type
  **/
  @ApiModelProperty(value = "For VOA the possibilities are checking / savings / moneyMarket / cd / investment For VOI the options are checking / savings / moneyMarket ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UFReportLenderResponseInstitutionsAccounts aggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

  /**
   * Finicity aggregation status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)
   * @return aggregationStatusCode
  **/
  @ApiModelProperty(value = "Finicity aggregation status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)")
  
    @Valid
    public BigDecimal getAggregationStatusCode() {
    return aggregationStatusCode;
  }

  public void setAggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
  }

  public UFReportLenderResponseInstitutionsAccounts calcStatus(String calcStatus) {
    this.calcStatus = calcStatus;
    return this;
  }

  /**
   * Status of the calc
   * @return calcStatus
  **/
  @ApiModelProperty(value = "Status of the calc")
  
    public String getCalcStatus() {
    return calcStatus;
  }

  public void setCalcStatus(String calcStatus) {
    this.calcStatus = calcStatus;
  }

  public UFReportLenderResponseInstitutionsAccounts reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the status
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the status")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UFReportLenderResponseInstitutionsAccounts ufReportLenderResponseInstitutionsAccounts = (UFReportLenderResponseInstitutionsAccounts) o;
    return Objects.equals(this.id, ufReportLenderResponseInstitutionsAccounts.id) &&
        Objects.equals(this.ownerName, ufReportLenderResponseInstitutionsAccounts.ownerName) &&
        Objects.equals(this.firstNameConfidence, ufReportLenderResponseInstitutionsAccounts.firstNameConfidence) &&
        Objects.equals(this.lastNameConfidence, ufReportLenderResponseInstitutionsAccounts.lastNameConfidence) &&
        Objects.equals(this.ownerAddress, ufReportLenderResponseInstitutionsAccounts.ownerAddress) &&
        Objects.equals(this.addressConfidence, ufReportLenderResponseInstitutionsAccounts.addressConfidence) &&
        Objects.equals(this.name, ufReportLenderResponseInstitutionsAccounts.name) &&
        Objects.equals(this.number, ufReportLenderResponseInstitutionsAccounts.number) &&
        Objects.equals(this.type, ufReportLenderResponseInstitutionsAccounts.type) &&
        Objects.equals(this.aggregationStatusCode, ufReportLenderResponseInstitutionsAccounts.aggregationStatusCode) &&
        Objects.equals(this.calcStatus, ufReportLenderResponseInstitutionsAccounts.calcStatus) &&
        Objects.equals(this.reason, ufReportLenderResponseInstitutionsAccounts.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerName, firstNameConfidence, lastNameConfidence, ownerAddress, addressConfidence, name, number, type, aggregationStatusCode, calcStatus, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UFReportLenderResponseInstitutionsAccounts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    firstNameConfidence: ").append(toIndentedString(firstNameConfidence)).append("\n");
    sb.append("    lastNameConfidence: ").append(toIndentedString(lastNameConfidence)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    addressConfidence: ").append(toIndentedString(addressConfidence)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    calcStatus: ").append(toIndentedString(calcStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
