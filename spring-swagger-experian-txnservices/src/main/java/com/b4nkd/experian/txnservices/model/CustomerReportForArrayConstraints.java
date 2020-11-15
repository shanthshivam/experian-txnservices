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
 * Specifies use of a fromDate or accountIds included in the call
 */
@ApiModel(description = "Specifies use of a fromDate or accountIds included in the call")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CustomerReportForArrayConstraints   {
  @JsonProperty("fromDate")
  private String fromDate = "1494449017";

  @JsonProperty("accountId")
  private BigDecimal accountId = null;

  public CustomerReportForArrayConstraints fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * This is an optional field for use of 'voa' and 'voi' Connect types and passed as an Epoch Timestamp (in seconds). Without this param, the report defaults to 6 months if available. fromDate is not used in Connect sessions with 'aggregation' type. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data 
   * @return fromDate
  **/
  @ApiModelProperty(value = "This is an optional field for use of 'voa' and 'voi' Connect types and passed as an Epoch Timestamp (in seconds). Without this param, the report defaults to 6 months if available. fromDate is not used in Connect sessions with 'aggregation' type. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data ")
  
    public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public CustomerReportForArrayConstraints accountId(BigDecimal accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Finicity account ID
   * @return accountId
  **/
  @ApiModelProperty(value = "Finicity account ID")
  
    @Valid
    public BigDecimal getAccountId() {
    return accountId;
  }

  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerReportForArrayConstraints customerReportForArrayConstraints = (CustomerReportForArrayConstraints) o;
    return Objects.equals(this.fromDate, customerReportForArrayConstraints.fromDate) &&
        Objects.equals(this.accountId, customerReportForArrayConstraints.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerReportForArrayConstraints {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
