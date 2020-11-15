package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.Error;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error Response Object
 */
@ApiModel(description = "Error Response Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ErrorResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("success")
  private String success = null;

  public ErrorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array of Error responses.
   * @return errors
  **/
  @ApiModelProperty(value = "Array of Error responses.")
      @Valid
    public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ErrorResponse success(String success) {
    this.success = success;
    return this;
  }

  /**
   * If successful returns true else false.
   * @return success
  **/
  @ApiModelProperty(value = "If successful returns true else false.")
  
    public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errors, errorResponse.errors) &&
        Objects.equals(this.success, errorResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
