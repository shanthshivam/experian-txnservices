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
 * An asset record for the account (VOA only). This will only be filled in if the report type is VOA.
 */
@ApiModel(description = "An asset record for the account (VOA only). This will only be filled in if the report type is VOA.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InstitutionForSingleReportAccountsPropsAsset   {
  @JsonProperty("type")
  private String type = "checking";

  @JsonProperty("currentBalance")
  private BigDecimal currentBalance = null;

  @JsonProperty("twoMonthAverage")
  private BigDecimal twoMonthAverage = null;

  @JsonProperty("sixMonthAverage")
  private BigDecimal sixMonthAverage = null;

  @JsonProperty("beginningBalance")
  private BigDecimal beginningBalance = null;

  public InstitutionForSingleReportAccountsPropsAsset type(String type) {
    this.type = type;
    return this;
  }

  /**
   * checking / savings / moneyMarket / cd / investment
   * @return type
  **/
  @ApiModelProperty(value = "checking / savings / moneyMarket / cd / investment")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstitutionForSingleReportAccountsPropsAsset currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Current balance of the account
   * @return currentBalance
  **/
  @ApiModelProperty(value = "Current balance of the account")
  
    @Valid
    public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public InstitutionForSingleReportAccountsPropsAsset twoMonthAverage(BigDecimal twoMonthAverage) {
    this.twoMonthAverage = twoMonthAverage;
    return this;
  }

  /**
   * Two month average daily balance of the account
   * @return twoMonthAverage
  **/
  @ApiModelProperty(value = "Two month average daily balance of the account")
  
    @Valid
    public BigDecimal getTwoMonthAverage() {
    return twoMonthAverage;
  }

  public void setTwoMonthAverage(BigDecimal twoMonthAverage) {
    this.twoMonthAverage = twoMonthAverage;
  }

  public InstitutionForSingleReportAccountsPropsAsset sixMonthAverage(BigDecimal sixMonthAverage) {
    this.sixMonthAverage = sixMonthAverage;
    return this;
  }

  /**
   * Six month average daily balance of the account
   * @return sixMonthAverage
  **/
  @ApiModelProperty(value = "Six month average daily balance of the account")
  
    @Valid
    public BigDecimal getSixMonthAverage() {
    return sixMonthAverage;
  }

  public void setSixMonthAverage(BigDecimal sixMonthAverage) {
    this.sixMonthAverage = sixMonthAverage;
  }

  public InstitutionForSingleReportAccountsPropsAsset beginningBalance(BigDecimal beginningBalance) {
    this.beginningBalance = beginningBalance;
    return this;
  }

  /**
   * Beginning balance of account per the time period in the report
   * @return beginningBalance
  **/
  @ApiModelProperty(value = "Beginning balance of account per the time period in the report")
  
    @Valid
    public BigDecimal getBeginningBalance() {
    return beginningBalance;
  }

  public void setBeginningBalance(BigDecimal beginningBalance) {
    this.beginningBalance = beginningBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionForSingleReportAccountsPropsAsset institutionForSingleReportAccountsPropsAsset = (InstitutionForSingleReportAccountsPropsAsset) o;
    return Objects.equals(this.type, institutionForSingleReportAccountsPropsAsset.type) &&
        Objects.equals(this.currentBalance, institutionForSingleReportAccountsPropsAsset.currentBalance) &&
        Objects.equals(this.twoMonthAverage, institutionForSingleReportAccountsPropsAsset.twoMonthAverage) &&
        Objects.equals(this.sixMonthAverage, institutionForSingleReportAccountsPropsAsset.sixMonthAverage) &&
        Objects.equals(this.beginningBalance, institutionForSingleReportAccountsPropsAsset.beginningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, currentBalance, twoMonthAverage, sixMonthAverage, beginningBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionForSingleReportAccountsPropsAsset {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    twoMonthAverage: ").append(toIndentedString(twoMonthAverage)).append("\n");
    sb.append("    sixMonthAverage: ").append(toIndentedString(sixMonthAverage)).append("\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
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
