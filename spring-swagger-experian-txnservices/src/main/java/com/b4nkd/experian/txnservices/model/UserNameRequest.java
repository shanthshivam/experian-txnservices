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
 * New Customer&#x27;s username, assigned by the partner (a unique identifier), following these rules Minimum 6 characters Maximum 255 characters Any mix of uppercase, lowercase, numeric, and special characters
 */
@ApiModel(description = "New Customer's username, assigned by the partner (a unique identifier), following these rules Minimum 6 characters Maximum 255 characters Any mix of uppercase, lowercase, numeric, and special characters")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class UserNameRequest   {
  @JsonProperty("username")
  private String username = "TestUser123";

  @JsonProperty("firstName")
  private String firstName = "John";

  @JsonProperty("lastName")
  private String lastName = "Doe";

  public UserNameRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username should be unique
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username should be unique")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserNameRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of User
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of User")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserNameRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of User
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of User")
  
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
    UserNameRequest userNameRequest = (UserNameRequest) o;
    return Objects.equals(this.username, userNameRequest.username) &&
        Objects.equals(this.firstName, userNameRequest.firstName) &&
        Objects.equals(this.lastName, userNameRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNameRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
