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
 * SingleReportIncomeNetMonthlyProps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SingleReportIncomeNetMonthlyProps   {
  @JsonProperty("month")
  private BigDecimal month = null;

  @JsonProperty("net")
  private BigDecimal net = null;

  public SingleReportIncomeNetMonthlyProps month(BigDecimal month) {
    this.month = month;
    return this;
  }

  /**
   * Timestamp for the first day of this month
   * @return month
  **/
  @ApiModelProperty(value = "Timestamp for the first day of this month")
  
    @Valid
    public BigDecimal getMonth() {
    return month;
  }

  public void setMonth(BigDecimal month) {
    this.month = month;
  }

  public SingleReportIncomeNetMonthlyProps net(BigDecimal net) {
    this.net = net;
    return this;
  }

  /**
   * Total income during the given month, across all income streams
   * @return net
  **/
  @ApiModelProperty(value = "Total income during the given month, across all income streams")
  
    @Valid
    public BigDecimal getNet() {
    return net;
  }

  public void setNet(BigDecimal net) {
    this.net = net;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleReportIncomeNetMonthlyProps singleReportIncomeNetMonthlyProps = (SingleReportIncomeNetMonthlyProps) o;
    return Objects.equals(this.month, singleReportIncomeNetMonthlyProps.month) &&
        Objects.equals(this.net, singleReportIncomeNetMonthlyProps.net);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, net);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleReportIncomeNetMonthlyProps {\n");
    
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
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
