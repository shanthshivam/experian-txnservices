package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer account information for specified customerID
 */
@ApiModel(description = "Customer account information for specified customerID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Customer   {
  @JsonProperty("id")
  private String id = "11111111";

  @JsonProperty("username")
  private String username = "TestUser123";

  @JsonProperty("firstName")
  private String firstName = "John";

  @JsonProperty("lastName")
  private String lastName = "John";

  /**
   * Either testing or active
   */
  public enum TypeEnum {
    TESTING("testing"),
    
    ACTIVE("active");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = TypeEnum.ACTIVE;

  @JsonProperty("createdDate")
  private String createdDate = "123456789";

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Returns the unique ID associated with the  Customer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Returns the unique ID associated with the  Customer")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The customer's username, assigned by the partner (a unique identifier), must be a minimum 6 characters, maximum 255 characters, any mix of uppercase, lowercase, numeric, and non-alphabet special characters. The use of email in this field is discouraged and it is recommended to use a unique non-email identifier. 
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The customer's username, assigned by the partner (a unique identifier), must be a minimum 6 characters, maximum 255 characters, any mix of uppercase, lowercase, numeric, and non-alphabet special characters. The use of email in this field is discouraged and it is recommended to use a unique non-email identifier. ")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Customer firstName(String firstName) {
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

  public Customer lastName(String lastName) {
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

  public Customer type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Either testing or active
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Either testing or active")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Customer createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * A timestamp showing when the customer was added
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "A timestamp showing when the customer was added")
      @NotNull

    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.username, customer.username) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.type, customer.type) &&
        Objects.equals(this.createdDate, customer.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, type, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
