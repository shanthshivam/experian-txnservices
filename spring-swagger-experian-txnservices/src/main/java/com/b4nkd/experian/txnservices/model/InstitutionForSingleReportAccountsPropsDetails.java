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
 * InstitutionForSingleReportAccountsPropsDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InstitutionForSingleReportAccountsPropsDetails   {
  @JsonProperty("interestMarginBalance")
  private BigDecimal interestMarginBalance = null;

  @JsonProperty("availableCashBalance")
  private BigDecimal availableCashBalance = null;

  @JsonProperty("vestedBalance")
  private BigDecimal vestedBalance = null;

  @JsonProperty("currentLoanBalance")
  private BigDecimal currentLoanBalance = null;

  @JsonProperty("availableBalanceAmount")
  private BigDecimal availableBalanceAmount = null;

  public InstitutionForSingleReportAccountsPropsDetails interestMarginBalance(BigDecimal interestMarginBalance) {
    this.interestMarginBalance = interestMarginBalance;
    return this;
  }

  /**
   * The interest Margin balance of the account - can be null
   * @return interestMarginBalance
  **/
  @ApiModelProperty(value = "The interest Margin balance of the account - can be null")
  
    @Valid
    public BigDecimal getInterestMarginBalance() {
    return interestMarginBalance;
  }

  public void setInterestMarginBalance(BigDecimal interestMarginBalance) {
    this.interestMarginBalance = interestMarginBalance;
  }

  public InstitutionForSingleReportAccountsPropsDetails availableCashBalance(BigDecimal availableCashBalance) {
    this.availableCashBalance = availableCashBalance;
    return this;
  }

  /**
   * The available Cash balance of the account - can be null
   * @return availableCashBalance
  **/
  @ApiModelProperty(value = "The available Cash balance of the account - can be null")
  
    @Valid
    public BigDecimal getAvailableCashBalance() {
    return availableCashBalance;
  }

  public void setAvailableCashBalance(BigDecimal availableCashBalance) {
    this.availableCashBalance = availableCashBalance;
  }

  public InstitutionForSingleReportAccountsPropsDetails vestedBalance(BigDecimal vestedBalance) {
    this.vestedBalance = vestedBalance;
    return this;
  }

  /**
   * The vested balance of the account - can be null
   * @return vestedBalance
  **/
  @ApiModelProperty(value = "The vested balance of the account - can be null")
  
    @Valid
    public BigDecimal getVestedBalance() {
    return vestedBalance;
  }

  public void setVestedBalance(BigDecimal vestedBalance) {
    this.vestedBalance = vestedBalance;
  }

  public InstitutionForSingleReportAccountsPropsDetails currentLoanBalance(BigDecimal currentLoanBalance) {
    this.currentLoanBalance = currentLoanBalance;
    return this;
  }

  /**
   * The current Loan balance of the account - can be null
   * @return currentLoanBalance
  **/
  @ApiModelProperty(value = "The current Loan balance of the account - can be null")
  
    @Valid
    public BigDecimal getCurrentLoanBalance() {
    return currentLoanBalance;
  }

  public void setCurrentLoanBalance(BigDecimal currentLoanBalance) {
    this.currentLoanBalance = currentLoanBalance;
  }

  public InstitutionForSingleReportAccountsPropsDetails availableBalanceAmount(BigDecimal availableBalanceAmount) {
    this.availableBalanceAmount = availableBalanceAmount;
    return this;
  }

  /**
   * The available balance amount of the account - can be null
   * @return availableBalanceAmount
  **/
  @ApiModelProperty(value = "The available balance amount of the account - can be null")
  
    @Valid
    public BigDecimal getAvailableBalanceAmount() {
    return availableBalanceAmount;
  }

  public void setAvailableBalanceAmount(BigDecimal availableBalanceAmount) {
    this.availableBalanceAmount = availableBalanceAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionForSingleReportAccountsPropsDetails institutionForSingleReportAccountsPropsDetails = (InstitutionForSingleReportAccountsPropsDetails) o;
    return Objects.equals(this.interestMarginBalance, institutionForSingleReportAccountsPropsDetails.interestMarginBalance) &&
        Objects.equals(this.availableCashBalance, institutionForSingleReportAccountsPropsDetails.availableCashBalance) &&
        Objects.equals(this.vestedBalance, institutionForSingleReportAccountsPropsDetails.vestedBalance) &&
        Objects.equals(this.currentLoanBalance, institutionForSingleReportAccountsPropsDetails.currentLoanBalance) &&
        Objects.equals(this.availableBalanceAmount, institutionForSingleReportAccountsPropsDetails.availableBalanceAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestMarginBalance, availableCashBalance, vestedBalance, currentLoanBalance, availableBalanceAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionForSingleReportAccountsPropsDetails {\n");
    
    sb.append("    interestMarginBalance: ").append(toIndentedString(interestMarginBalance)).append("\n");
    sb.append("    availableCashBalance: ").append(toIndentedString(availableCashBalance)).append("\n");
    sb.append("    vestedBalance: ").append(toIndentedString(vestedBalance)).append("\n");
    sb.append("    currentLoanBalance: ").append(toIndentedString(currentLoanBalance)).append("\n");
    sb.append("    availableBalanceAmount: ").append(toIndentedString(availableBalanceAmount)).append("\n");
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
