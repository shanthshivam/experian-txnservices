package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Get Account Details
 */
@ApiModel(description = "Get Account Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Account   {
  @JsonProperty("routingNumber")
  private String routingNumber = "123456789";

  @JsonProperty("realAccountNumber")
  private String realAccountNumber = "002345678901";

  public Account routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  /**
   * The account's 9-digit Routing Transit Number
   * @return routingNumber
  **/
  @ApiModelProperty(value = "The account's 9-digit Routing Transit Number")
  
    public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public Account realAccountNumber(String realAccountNumber) {
    this.realAccountNumber = realAccountNumber;
    return this;
  }

  /**
   * The full account number, assigned by the institution
   * @return realAccountNumber
  **/
  @ApiModelProperty(value = "The full account number, assigned by the institution")
  
    public String getRealAccountNumber() {
    return realAccountNumber;
  }

  public void setRealAccountNumber(String realAccountNumber) {
    this.realAccountNumber = realAccountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.routingNumber, account.routingNumber) &&
        Objects.equals(this.realAccountNumber, account.realAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, realAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    realAccountNumber: ").append(toIndentedString(realAccountNumber)).append("\n");
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
