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
 * Parent element for the address of the institution&#x27;s headquarters
 */
@ApiModel(description = "Parent element for the address of the institution's headquarters")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InstitutionAddressProps   {
  @JsonProperty("addressLine1")
  private String addressLine1 = "11111 Hospital Lane";

  @JsonProperty("addressLine2")
  private String addressLine2 = "11111 Hospital Lane";

  @JsonProperty("city")
  private String city = "Los Angeles";

  @JsonProperty("state")
  private String state = "CA";

  @JsonProperty("postalCode")
  private String postalCode = "94134";

  @JsonProperty("country")
  private String country = "USA";

  public InstitutionAddressProps addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Address information for the institution's 1st headquarters
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Address information for the institution's 1st headquarters")
  
    public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public InstitutionAddressProps addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Address information for the institution's 2nd headquarters
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Address information for the institution's 2nd headquarters")
  
    public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public InstitutionAddressProps city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the institution's headquarters
   * @return city
  **/
  @ApiModelProperty(value = "The city of the institution's headquarters")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public InstitutionAddressProps state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Two-letter code for the state of the institution's headquarters
   * @return state
  **/
  @ApiModelProperty(value = "Two-letter code for the state of the institution's headquarters")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InstitutionAddressProps postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal code of the institution's headquarters
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code of the institution's headquarters")
  
    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public InstitutionAddressProps country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of the institution's headquarters
   * @return country
  **/
  @ApiModelProperty(value = "The country of the institution's headquarters")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionAddressProps institutionAddressProps = (InstitutionAddressProps) o;
    return Objects.equals(this.addressLine1, institutionAddressProps.addressLine1) &&
        Objects.equals(this.addressLine2, institutionAddressProps.addressLine2) &&
        Objects.equals(this.city, institutionAddressProps.city) &&
        Objects.equals(this.state, institutionAddressProps.state) &&
        Objects.equals(this.postalCode, institutionAddressProps.postalCode) &&
        Objects.equals(this.country, institutionAddressProps.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionAddressProps {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
