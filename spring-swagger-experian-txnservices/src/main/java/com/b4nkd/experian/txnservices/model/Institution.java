package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.InstitutionAddressProps;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An institution is a financial institution (FI) such as a bank, investment firm, or other organization, which provides financial accounts for their customers. Finicity&#x27;s Institution resource includes services for looking up supported financial institutions and for obtaining the login form of a specific institution, in order to discover and activate customer accounts.
 */
@ApiModel(description = "An institution is a financial institution (FI) such as a bank, investment firm, or other organization, which provides financial accounts for their customers. Finicity's Institution resource includes services for looking up supported financial institutions and for obtaining the login form of a specific institution, in order to discover and activate customer accounts.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Institution   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = "Finbank Profiles - A";

  @JsonProperty("accountTypeDescription")
  private String accountTypeDescription = "TestFI";

  @JsonProperty("phone")
  private String phone = "5555555555";

  @JsonProperty("urlHomeApp")
  private String urlHomeApp = "http://www.finbank.com";

  @JsonProperty("urlLogonApp")
  private String urlLogonApp = "http://www.finbank.com/login";

  @JsonProperty("oauthEnabled")
  private Boolean oauthEnabled = false;

  @JsonProperty("urlForgotPassword")
  private String urlForgotPassword = "http://www.finbank.com/forgotPassword";

  @JsonProperty("urlOnlineRegistration")
  private String urlOnlineRegistration = "http://www.finbank.com/register";

  @JsonProperty("class")
  private String propertyClass = "testfi";

  @JsonProperty("specialText")
  private String specialText = "Please enter your FinBank Profiles Banking Userid and Banking Password required for login.";

  @JsonProperty("address")
  private InstitutionAddressProps address = null;

  @JsonProperty("currency")
  private String currency = "USD";

  @JsonProperty("email")
  private String email = "finbank@finicity.com";

  public Institution id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * The institution ID
   * @return id
  **/
  @ApiModelProperty(value = "The institution ID")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Institution name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the institution
   * @return name
  **/
  @ApiModelProperty(value = "The name of the institution")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Institution accountTypeDescription(String accountTypeDescription) {
    this.accountTypeDescription = accountTypeDescription;
    return this;
  }

  /**
   * One of the values Banking, Investments, Credit Cards/Accounts, Workplace Retirement, Mortgages and Loans, Insurance
   * @return accountTypeDescription
  **/
  @ApiModelProperty(value = "One of the values Banking, Investments, Credit Cards/Accounts, Workplace Retirement, Mortgages and Loans, Insurance")
  
    public String getAccountTypeDescription() {
    return accountTypeDescription;
  }

  public void setAccountTypeDescription(String accountTypeDescription) {
    this.accountTypeDescription = accountTypeDescription;
  }

  public Institution phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The institution's primary phone number
   * @return phone
  **/
  @ApiModelProperty(value = "The institution's primary phone number")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Institution urlHomeApp(String urlHomeApp) {
    this.urlHomeApp = urlHomeApp;
    return this;
  }

  /**
   * The URL of the institution's primary home page
   * @return urlHomeApp
  **/
  @ApiModelProperty(value = "The URL of the institution's primary home page")
  
    public String getUrlHomeApp() {
    return urlHomeApp;
  }

  public void setUrlHomeApp(String urlHomeApp) {
    this.urlHomeApp = urlHomeApp;
  }

  public Institution urlLogonApp(String urlLogonApp) {
    this.urlLogonApp = urlLogonApp;
    return this;
  }

  /**
   * The URL of the institution's login page
   * @return urlLogonApp
  **/
  @ApiModelProperty(value = "The URL of the institution's login page")
  
    public String getUrlLogonApp() {
    return urlLogonApp;
  }

  public void setUrlLogonApp(String urlLogonApp) {
    this.urlLogonApp = urlLogonApp;
  }

  public Institution oauthEnabled(Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
    return this;
  }

  /**
   * Whether or not the oAuthenticaiton is enabled
   * @return oauthEnabled
  **/
  @ApiModelProperty(value = "Whether or not the oAuthenticaiton is enabled")
  
    public Boolean isOauthEnabled() {
    return oauthEnabled;
  }

  public void setOauthEnabled(Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
  }

  public Institution urlForgotPassword(String urlForgotPassword) {
    this.urlForgotPassword = urlForgotPassword;
    return this;
  }

  /**
   * The URL to go to for a Forgotten password
   * @return urlForgotPassword
  **/
  @ApiModelProperty(value = "The URL to go to for a Forgotten password")
  
    public String getUrlForgotPassword() {
    return urlForgotPassword;
  }

  public void setUrlForgotPassword(String urlForgotPassword) {
    this.urlForgotPassword = urlForgotPassword;
  }

  public Institution urlOnlineRegistration(String urlOnlineRegistration) {
    this.urlOnlineRegistration = urlOnlineRegistration;
    return this;
  }

  /**
   * The URL to register online
   * @return urlOnlineRegistration
  **/
  @ApiModelProperty(value = "The URL to register online")
  
    public String getUrlOnlineRegistration() {
    return urlOnlineRegistration;
  }

  public void setUrlOnlineRegistration(String urlOnlineRegistration) {
    this.urlOnlineRegistration = urlOnlineRegistration;
  }

  public Institution propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Defines the class of instutition
   * @return propertyClass
  **/
  @ApiModelProperty(value = "Defines the class of instutition")
  
    public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Institution specialText(String specialText) {
    this.specialText = specialText;
    return this;
  }

  /**
   * Any special text found on the institution's website
   * @return specialText
  **/
  @ApiModelProperty(value = "Any special text found on the institution's website")
  
    public String getSpecialText() {
    return specialText;
  }

  public void setSpecialText(String specialText) {
    this.specialText = specialText;
  }

  public Institution address(InstitutionAddressProps address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InstitutionAddressProps getAddress() {
    return address;
  }

  public void setAddress(InstitutionAddressProps address) {
    this.address = address;
  }

  public Institution currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The institution's primary currency
   * @return currency
  **/
  @ApiModelProperty(value = "The institution's primary currency")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Institution email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The institution's primary contact email
   * @return email
  **/
  @ApiModelProperty(value = "The institution's primary contact email")
  
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
    Institution institution = (Institution) o;
    return Objects.equals(this.id, institution.id) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.accountTypeDescription, institution.accountTypeDescription) &&
        Objects.equals(this.phone, institution.phone) &&
        Objects.equals(this.urlHomeApp, institution.urlHomeApp) &&
        Objects.equals(this.urlLogonApp, institution.urlLogonApp) &&
        Objects.equals(this.oauthEnabled, institution.oauthEnabled) &&
        Objects.equals(this.urlForgotPassword, institution.urlForgotPassword) &&
        Objects.equals(this.urlOnlineRegistration, institution.urlOnlineRegistration) &&
        Objects.equals(this.propertyClass, institution.propertyClass) &&
        Objects.equals(this.specialText, institution.specialText) &&
        Objects.equals(this.address, institution.address) &&
        Objects.equals(this.currency, institution.currency) &&
        Objects.equals(this.email, institution.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accountTypeDescription, phone, urlHomeApp, urlLogonApp, oauthEnabled, urlForgotPassword, urlOnlineRegistration, propertyClass, specialText, address, currency, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountTypeDescription: ").append(toIndentedString(accountTypeDescription)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    urlHomeApp: ").append(toIndentedString(urlHomeApp)).append("\n");
    sb.append("    urlLogonApp: ").append(toIndentedString(urlLogonApp)).append("\n");
    sb.append("    oauthEnabled: ").append(toIndentedString(oauthEnabled)).append("\n");
    sb.append("    urlForgotPassword: ").append(toIndentedString(urlForgotPassword)).append("\n");
    sb.append("    urlOnlineRegistration: ").append(toIndentedString(urlOnlineRegistration)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    specialText: ").append(toIndentedString(specialText)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
