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
 * CallbackUrl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CallbackUrl   {
  @JsonProperty("callbackUrl")
  private String callbackUrl = "https://www.mydomain.com/txpush/listener";

  public CallbackUrl callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * The TxPUSH Listener URL to receive TxPUSH notifications
   * @return callbackUrl
  **/
  @ApiModelProperty(required = true, value = "The TxPUSH Listener URL to receive TxPUSH notifications")
      @NotNull

    public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackUrl callbackUrl = (CallbackUrl) o;
    return Objects.equals(this.callbackUrl, callbackUrl.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackUrl {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
