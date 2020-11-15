package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.ConsumerRequestBirthday;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Requires a Customer ID injected into the endpoint
 */
@ApiModel(description = "Requires a Customer ID injected into the endpoint")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ConsumerRequest   {
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
  private String phone = "1231231234";

  @JsonProperty("ssn")
  private String ssn = "123-45-6789";

  @JsonProperty("birthday")
  private ConsumerRequestBirthday birthday = null;

  @JsonProperty("email")
  private String email = "joel.embiid@experian.com";

  public ConsumerRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The full first name should be entered when available. Blanks and special characters (except dash) are not allowed. Compound names should contain a dash (e.g., Billy-Bob)
   * @return firstName
  **/
  @ApiModelProperty(value = "The full first name should be entered when available. Blanks and special characters (except dash) are not allowed. Compound names should contain a dash (e.g., Billy-Bob)")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConsumerRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The full last name should be entered when available.  Blanks and special characters are not allowed
   * @return lastName
  **/
  @ApiModelProperty(value = "The full last name should be entered when available.  Blanks and special characters are not allowed")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ConsumerRequest address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Include the house number, directional, street name, street type, and street suffix data (Apt)
   * @return address
  **/
  @ApiModelProperty(value = "Include the house number, directional, street name, street type, and street suffix data (Apt)")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ConsumerRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city should be entered. Cities with numbers should be spelled out (e.g., 29 Palms should be entered as Twenty Nine Palms)
   * @return city
  **/
  @ApiModelProperty(value = "The city should be entered. Cities with numbers should be spelled out (e.g., 29 Palms should be entered as Twenty Nine Palms)")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ConsumerRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The U.S. Postal two-position state code
   * @return state
  **/
  @ApiModelProperty(value = "The U.S. Postal two-position state code")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ConsumerRequest zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The ZIP code is required. The only exception is on international addresses when the country code should be used. It may be 9 characters and may contain a hyphen to separate the first 5 digits from the last 4 digits. It is required on all current address data.
   * @return zip
  **/
  @ApiModelProperty(value = "The ZIP code is required. The only exception is on international addresses when the country code should be used. It may be 9 characters and may contain a hyphen to separate the first 5 digits from the last 4 digits. It is required on all current address data.")
  
    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public ConsumerRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Best number to reach the Consumer
   * @return phone
  **/
  @ApiModelProperty(value = "Best number to reach the Consumer")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ConsumerRequest ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * The full Social Security number should be entered if available. The social may be input with or without hyphens (e.g., 123456789 or 123-45-6789). Omit if no Social Security number is available.
   * @return ssn
  **/
  @ApiModelProperty(value = "The full Social Security number should be entered if available. The social may be input with or without hyphens (e.g., 123456789 or 123-45-6789). Omit if no Social Security number is available.")
  
    public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public ConsumerRequest birthday(ConsumerRequestBirthday birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerRequestBirthday getBirthday() {
    return birthday;
  }

  public void setBirthday(ConsumerRequestBirthday birthday) {
    this.birthday = birthday;
  }

  public ConsumerRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The associated email for the consumer. Must be a valid email
   * @return email
  **/
  @ApiModelProperty(value = "The associated email for the consumer. Must be a valid email")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRequest consumerRequest = (ConsumerRequest) o;
    return Objects.equals(this.firstName, consumerRequest.firstName) &&
        Objects.equals(this.lastName, consumerRequest.lastName) &&
        Objects.equals(this.address, consumerRequest.address) &&
        Objects.equals(this.city, consumerRequest.city) &&
        Objects.equals(this.state, consumerRequest.state) &&
        Objects.equals(this.zip, consumerRequest.zip) &&
        Objects.equals(this.phone, consumerRequest.phone) &&
        Objects.equals(this.ssn, consumerRequest.ssn) &&
        Objects.equals(this.birthday, consumerRequest.birthday) &&
        Objects.equals(this.email, consumerRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, city, state, zip, phone, ssn, birthday, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRequest {\n");
    
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
