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
 * Defines the details of the account
 */
@ApiModel(description = "Defines the details of the account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CustomerAccountDetail   {
  @JsonProperty("availableBalanceAmount")
  private BigDecimal availableBalanceAmount = null;

  @JsonProperty("periodInterestRate")
  private String periodInterestRate = "4.5";

  public CustomerAccountDetail availableBalanceAmount(BigDecimal availableBalanceAmount) {
    this.availableBalanceAmount = availableBalanceAmount;
    return this;
  }

  /**
   * The balance avilable in the account as of balanceDate
   * @return availableBalanceAmount
  **/
  @ApiModelProperty(required = true, value = "The balance avilable in the account as of balanceDate")
      @NotNull

    @Valid
    public BigDecimal getAvailableBalanceAmount() {
    return availableBalanceAmount;
  }

  public void setAvailableBalanceAmount(BigDecimal availableBalanceAmount) {
    this.availableBalanceAmount = availableBalanceAmount;
  }

  public CustomerAccountDetail periodInterestRate(String periodInterestRate) {
    this.periodInterestRate = periodInterestRate;
    return this;
  }

  /**
   * The effective interest rate for each compounding period
   * @return periodInterestRate
  **/
  @ApiModelProperty(value = "The effective interest rate for each compounding period")
  
    public String getPeriodInterestRate() {
    return periodInterestRate;
  }

  public void setPeriodInterestRate(String periodInterestRate) {
    this.periodInterestRate = periodInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccountDetail customerAccountDetail = (CustomerAccountDetail) o;
    return Objects.equals(this.availableBalanceAmount, customerAccountDetail.availableBalanceAmount) &&
        Objects.equals(this.periodInterestRate, customerAccountDetail.periodInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBalanceAmount, periodInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccountDetail {\n");
    
    sb.append("    availableBalanceAmount: ").append(toIndentedString(availableBalanceAmount)).append("\n");
    sb.append("    periodInterestRate: ").append(toIndentedString(periodInterestRate)).append("\n");
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
