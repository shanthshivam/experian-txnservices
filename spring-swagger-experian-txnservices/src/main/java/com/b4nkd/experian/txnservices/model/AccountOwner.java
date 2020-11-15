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


public class AccountOwner   {
  @JsonProperty("ownerName")
  private String ownerName = "Patrick & Lorraine Purchaser";

  @JsonProperty("ownerAddress")
  private String ownerAddress = "7195 Belmont St. Parlin, NJ 08859";

  public AccountOwner ownerName(String ownerName) {
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

  public AccountOwner ownerAddress(String ownerAddress) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountOwner accountOwner = (AccountOwner) o;
    return Objects.equals(this.ownerName, accountOwner.ownerName) &&
        Objects.equals(this.ownerAddress, accountOwner.ownerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, ownerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwner {\n");
    
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
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
