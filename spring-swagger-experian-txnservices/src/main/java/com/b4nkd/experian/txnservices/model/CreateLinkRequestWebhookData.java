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
 * Any additional data you wish to be passed back in the webhook URL. This data can contain sub parameters and multiple sub parameters.
 */
@ApiModel(description = "Any additional data you wish to be passed back in the webhook URL. This data can contain sub parameters and multiple sub parameters.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CreateLinkRequestWebhookData   {
  @JsonProperty("value1")
  private String value1 = "123456789";

  @JsonProperty("value2")
  private String value2 = "03March2019";

  public CreateLinkRequestWebhookData value1(String value1) {
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

  public CreateLinkRequestWebhookData value2(String value2) {
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
    CreateLinkRequestWebhookData createLinkRequestWebhookData = (CreateLinkRequestWebhookData) o;
    return Objects.equals(this.value1, createLinkRequestWebhookData.value1) &&
        Objects.equals(this.value2, createLinkRequestWebhookData.value2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value1, value2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkRequestWebhookData {\n");
    
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
