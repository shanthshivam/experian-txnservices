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
 * Error Response
 */
@ApiModel(description = "Error Response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Error   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorType")
  private String errorType = null;

  @JsonProperty("message")
  private String message = null;

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Type of Error
   * @return errorType
  **/
  @ApiModelProperty(value = "Type of Error")
  
    public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(value = "Error message")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.errorType, error.errorType) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorType, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
