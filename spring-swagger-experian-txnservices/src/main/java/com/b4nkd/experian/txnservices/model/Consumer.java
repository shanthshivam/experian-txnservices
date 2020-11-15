package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.ConsumerBirthday;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Get Consumer Response based on consumerID
 */
@ApiModel(description = "Get Consumer Response based on consumerID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Consumer   {
  @JsonProperty("id")
  private String id = "0h7h3r301md83";

  @JsonProperty("firstName")
  private String firstName = "Joel";

  @JsonProperty("lastName")
  private String lastName = "Embiid";

  @JsonProperty("address")
  private String address = "3601 S Broad St";

  @JsonProperty("city")
  private String city = "Philadelphia";

  @JsonProperty("state")
  private String state = "PA";

  @JsonProperty("zip")
  private String zip = "19148";

  @JsonProperty("phone")
  private String phone = "888-888-8888";

  @JsonProperty("ssn")
  private String ssn = "5555";

  @JsonProperty("birthday")
  private ConsumerBirthday birthday = null;

  @JsonProperty("email")
  private String email = "joel.embiid@experian.com";

  @JsonProperty("createdDate")
  private BigDecimal createdDate = null;

  public Consumer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the consumer
   * @return id
  **/
  @ApiModelProperty(value = "ID of the consumer")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Consumer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The consumer's first name(s) / given name(s)
   * @return firstName
  **/
  @ApiModelProperty(value = "The consumer's first name(s) / given name(s)")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Consumer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The consumer's last name(s) / surname(s)
   * @return lastName
  **/
  @ApiModelProperty(value = "The consumer's last name(s) / surname(s)")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Consumer address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The consumer's street address
   * @return address
  **/
  @ApiModelProperty(value = "The consumer's street address")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Consumer city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The consumer's city
   * @return city
  **/
  @ApiModelProperty(value = "The consumer's city")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Consumer state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The consumer's state
   * @return state
  **/
  @ApiModelProperty(value = "The consumer's state")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Consumer zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The consumer's ZIP code
   * @return zip
  **/
  @ApiModelProperty(value = "The consumer's ZIP code")
  
    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Consumer phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The consumer's phone number
   * @return phone
  **/
  @ApiModelProperty(value = "The consumer's phone number")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Consumer ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Last 4 digits of the consumer's Social Security number
   * @return ssn
  **/
  @ApiModelProperty(value = "Last 4 digits of the consumer's Social Security number")
  
    public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Consumer birthday(ConsumerBirthday birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerBirthday getBirthday() {
    return birthday;
  }

  public void setBirthday(ConsumerBirthday birthday) {
    this.birthday = birthday;
  }

  public Consumer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The consumer's email address
   * @return email
  **/
  @ApiModelProperty(value = "The consumer's email address")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Consumer createdDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * A timestamp showing when the account was added to the Finicity system
   * @return createdDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the account was added to the Finicity system")
  
    @Valid
    public BigDecimal getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(BigDecimal createdDate) {
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
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.id, consumer.id) &&
        Objects.equals(this.firstName, consumer.firstName) &&
        Objects.equals(this.lastName, consumer.lastName) &&
        Objects.equals(this.address, consumer.address) &&
        Objects.equals(this.city, consumer.city) &&
        Objects.equals(this.state, consumer.state) &&
        Objects.equals(this.zip, consumer.zip) &&
        Objects.equals(this.phone, consumer.phone) &&
        Objects.equals(this.ssn, consumer.ssn) &&
        Objects.equals(this.birthday, consumer.birthday) &&
        Objects.equals(this.email, consumer.email) &&
        Objects.equals(this.createdDate, consumer.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, address, city, state, zip, phone, ssn, birthday, email, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
