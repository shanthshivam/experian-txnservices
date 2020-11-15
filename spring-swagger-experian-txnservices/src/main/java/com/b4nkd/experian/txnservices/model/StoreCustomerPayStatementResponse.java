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
 * StoreCustomerPayStatementResponse
 */
@ApiModel(description = "StoreCustomerPayStatementResponse")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class StoreCustomerPayStatementResponse   {
  @JsonProperty("assetid")
  private String assetid = "6b599a7e-236f-4a25-b070-425b52b9c1fe";

  public StoreCustomerPayStatementResponse assetid(String assetid) {
    this.assetid = assetid;
    return this;
  }

  /**
   * Stored Pay statement asset ID
   * @return assetid
  **/
  @ApiModelProperty(value = "Stored Pay statement asset ID")
  
    public String getAssetid() {
    return assetid;
  }

  public void setAssetid(String assetid) {
    this.assetid = assetid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreCustomerPayStatementResponse storeCustomerPayStatementResponse = (StoreCustomerPayStatementResponse) o;
    return Objects.equals(this.assetid, storeCustomerPayStatementResponse.assetid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCustomerPayStatementResponse {\n");
    
    sb.append("    assetid: ").append(toIndentedString(assetid)).append("\n");
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
