package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.PayStatementReport;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the fields within the Generate Pay Statement Extraction Report.
 */
@ApiModel(description = "Describes the fields within the Generate Pay Statement Extraction Report.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Constraints   {
  @JsonProperty("payStatementReport")
  private PayStatementReport payStatementReport = null;

  public Constraints payStatementReport(PayStatementReport payStatementReport) {
    this.payStatementReport = payStatementReport;
    return this;
  }

  /**
   * Get payStatementReport
   * @return payStatementReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PayStatementReport getPayStatementReport() {
    return payStatementReport;
  }

  public void setPayStatementReport(PayStatementReport payStatementReport) {
    this.payStatementReport = payStatementReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraints constraints = (Constraints) o;
    return Objects.equals(this.payStatementReport, constraints.payStatementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payStatementReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraints {\n");
    
    sb.append("    payStatementReport: ").append(toIndentedString(payStatementReport)).append("\n");
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
