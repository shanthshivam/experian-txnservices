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
 * Income Estimates annually
 */
@ApiModel(description = "Income Estimates annually")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SingleReportIncomeIncomeEstimate   {
  @JsonProperty("netAnnual")
  private BigDecimal netAnnual = null;

  @JsonProperty("projectedNetAnnual")
  private BigDecimal projectedNetAnnual = null;

  @JsonProperty("estimatedGrossAnnual")
  private BigDecimal estimatedGrossAnnual = null;

  @JsonProperty("projectedGrossAnnual")
  private BigDecimal projectedGrossAnnual = null;

  public SingleReportIncomeIncomeEstimate netAnnual(BigDecimal netAnnual) {
    this.netAnnual = netAnnual;
    return this;
  }

  /**
   * Sum of all values in netMonthlyIncome over the previous 12 months
   * @return netAnnual
  **/
  @ApiModelProperty(value = "Sum of all values in netMonthlyIncome over the previous 12 months")
  
    @Valid
    public BigDecimal getNetAnnual() {
    return netAnnual;
  }

  public void setNetAnnual(BigDecimal netAnnual) {
    this.netAnnual = netAnnual;
  }

  public SingleReportIncomeIncomeEstimate projectedNetAnnual(BigDecimal projectedNetAnnual) {
    this.projectedNetAnnual = projectedNetAnnual;
    return this;
  }

  /**
   * Projected net income over the next 12 months, across all income streams, based on netAnnualIncome
   * @return projectedNetAnnual
  **/
  @ApiModelProperty(value = "Projected net income over the next 12 months, across all income streams, based on netAnnualIncome")
  
    @Valid
    public BigDecimal getProjectedNetAnnual() {
    return projectedNetAnnual;
  }

  public void setProjectedNetAnnual(BigDecimal projectedNetAnnual) {
    this.projectedNetAnnual = projectedNetAnnual;
  }

  public SingleReportIncomeIncomeEstimate estimatedGrossAnnual(BigDecimal estimatedGrossAnnual) {
    this.estimatedGrossAnnual = estimatedGrossAnnual;
    return this;
  }

  /**
   * Before-tax gross annual income (estimated from netAnnual) across all income stream in the past 12 months
   * @return estimatedGrossAnnual
  **/
  @ApiModelProperty(value = "Before-tax gross annual income (estimated from netAnnual) across all income stream in the past 12 months")
  
    @Valid
    public BigDecimal getEstimatedGrossAnnual() {
    return estimatedGrossAnnual;
  }

  public void setEstimatedGrossAnnual(BigDecimal estimatedGrossAnnual) {
    this.estimatedGrossAnnual = estimatedGrossAnnual;
  }

  public SingleReportIncomeIncomeEstimate projectedGrossAnnual(BigDecimal projectedGrossAnnual) {
    this.projectedGrossAnnual = projectedGrossAnnual;
    return this;
  }

  /**
   * Projected gross income over the next 12 months, based on projectedNetAnnual
   * @return projectedGrossAnnual
  **/
  @ApiModelProperty(value = "Projected gross income over the next 12 months, based on projectedNetAnnual")
  
    @Valid
    public BigDecimal getProjectedGrossAnnual() {
    return projectedGrossAnnual;
  }

  public void setProjectedGrossAnnual(BigDecimal projectedGrossAnnual) {
    this.projectedGrossAnnual = projectedGrossAnnual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleReportIncomeIncomeEstimate singleReportIncomeIncomeEstimate = (SingleReportIncomeIncomeEstimate) o;
    return Objects.equals(this.netAnnual, singleReportIncomeIncomeEstimate.netAnnual) &&
        Objects.equals(this.projectedNetAnnual, singleReportIncomeIncomeEstimate.projectedNetAnnual) &&
        Objects.equals(this.estimatedGrossAnnual, singleReportIncomeIncomeEstimate.estimatedGrossAnnual) &&
        Objects.equals(this.projectedGrossAnnual, singleReportIncomeIncomeEstimate.projectedGrossAnnual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netAnnual, projectedNetAnnual, estimatedGrossAnnual, projectedGrossAnnual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleReportIncomeIncomeEstimate {\n");
    
    sb.append("    netAnnual: ").append(toIndentedString(netAnnual)).append("\n");
    sb.append("    projectedNetAnnual: ").append(toIndentedString(projectedNetAnnual)).append("\n");
    sb.append("    estimatedGrossAnnual: ").append(toIndentedString(estimatedGrossAnnual)).append("\n");
    sb.append("    projectedGrossAnnual: ").append(toIndentedString(projectedGrossAnnual)).append("\n");
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
