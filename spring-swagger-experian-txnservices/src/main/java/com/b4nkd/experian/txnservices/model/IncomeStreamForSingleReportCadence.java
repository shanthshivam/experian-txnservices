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
 * The chronological rhythm discovered for this set of deposits
 */
@ApiModel(description = "The chronological rhythm discovered for this set of deposits")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class IncomeStreamForSingleReportCadence   {
  @JsonProperty("startDate")
  private BigDecimal startDate = null;

  @JsonProperty("stopDate")
  private BigDecimal stopDate = null;

  @JsonProperty("type")
  private String type = "single";

  public IncomeStreamForSingleReportCadence startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * postedDate of the first deposit transaction
   * @return startDate
  **/
  @ApiModelProperty(value = "postedDate of the first deposit transaction")
  
    @Valid
    public BigDecimal getStartDate() {
    return startDate;
  }

  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  public IncomeStreamForSingleReportCadence stopDate(BigDecimal stopDate) {
    this.stopDate = stopDate;
    return this;
  }

  /**
   * postedDate of the final deposit transaction record (omitted if status is active)
   * @return stopDate
  **/
  @ApiModelProperty(value = "postedDate of the final deposit transaction record (omitted if status is active)")
  
    @Valid
    public BigDecimal getStopDate() {
    return stopDate;
  }

  public void setStopDate(BigDecimal stopDate) {
    this.stopDate = stopDate;
  }

  public IncomeStreamForSingleReportCadence type(String type) {
    this.type = type;
    return this;
  }

  /**
   * single / weekly / biweekly / monthly
   * @return type
  **/
  @ApiModelProperty(value = "single / weekly / biweekly / monthly")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStreamForSingleReportCadence incomeStreamForSingleReportCadence = (IncomeStreamForSingleReportCadence) o;
    return Objects.equals(this.startDate, incomeStreamForSingleReportCadence.startDate) &&
        Objects.equals(this.stopDate, incomeStreamForSingleReportCadence.stopDate) &&
        Objects.equals(this.type, incomeStreamForSingleReportCadence.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, stopDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStreamForSingleReportCadence {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stopDate: ").append(toIndentedString(stopDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
