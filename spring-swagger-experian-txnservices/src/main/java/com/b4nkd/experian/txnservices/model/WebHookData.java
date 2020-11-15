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
 * Allows additional identifiable information to be inserted into webhooks (value1, value2, etc.). Alternative naming conventions may be desired in place of value1, value2 for specific values (e.g. loanNumber, currentDate, etc.)
 */
@ApiModel(description = "Allows additional identifiable information to be inserted into webhooks (value1, value2, etc.). Alternative naming conventions may be desired in place of value1, value2 for specific values (e.g. loanNumber, currentDate, etc.)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class WebHookData   {
  @JsonProperty("value1")
  private String value1 = "123456789";

  @JsonProperty("value2")
  private String value2 = "01Mar19";

  public WebHookData value1(String value1) {
    this.value1 = value1;
    return this;
  }

  /**
   * Additional value1
   * @return value1
  **/
  @ApiModelProperty(value = "Additional value1")
  
    public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public WebHookData value2(String value2) {
    this.value2 = value2;
    return this;
  }

  /**
   * Additional value2
   * @return value2
  **/
  @ApiModelProperty(value = "Additional value2")
  
    public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookData webHookData = (WebHookData) o;
    return Objects.equals(this.value1, webHookData.value1) &&
        Objects.equals(this.value2, webHookData.value2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value1, value2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookData {\n");
    
    sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
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
