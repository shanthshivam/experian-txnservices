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
 * Customer account information
 */
@ApiModel(description = "Customer account information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CustomerRequest   {
  @JsonProperty("firstName")
  private String firstName = "John";

  @JsonProperty("lastName")
  private String lastName = "John";

  public CustomerRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The customer's first name(s) / given name(s) (optional)
   * @return firstName
  **/
  @ApiModelProperty(value = "The customer's first name(s) / given name(s) (optional)")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CustomerRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The customer's last name(s) / surname(s) (optional)
   * @return lastName
  **/
  @ApiModelProperty(value = "The customer's last name(s) / surname(s) (optional)")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRequest customerRequest = (CustomerRequest) o;
    return Objects.equals(this.firstName, customerRequest.firstName) &&
        Objects.equals(this.lastName, customerRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
