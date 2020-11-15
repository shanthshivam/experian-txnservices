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
 * Describes the fields within the External Reseller request.
 */
@ApiModel(description = "Describes the fields within the External Reseller request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ExternalResellerRequest   {
  @JsonProperty("ewacsuserid")
  private String ewacsuserid = "kg_A1234";

  public ExternalResellerRequest ewacsuserid(String ewacsuserid) {
    this.ewacsuserid = ewacsuserid;
    return this;
  }

  /**
   * ewacs userid
   * @return ewacsuserid
  **/
  @ApiModelProperty(required = true, value = "ewacs userid")
      @NotNull

    public String getEwacsuserid() {
    return ewacsuserid;
  }

  public void setEwacsuserid(String ewacsuserid) {
    this.ewacsuserid = ewacsuserid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalResellerRequest externalResellerRequest = (ExternalResellerRequest) o;
    return Objects.equals(this.ewacsuserid, externalResellerRequest.ewacsuserid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ewacsuserid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalResellerRequest {\n");
    
    sb.append("    ewacsuserid: ").append(toIndentedString(ewacsuserid)).append("\n");
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
