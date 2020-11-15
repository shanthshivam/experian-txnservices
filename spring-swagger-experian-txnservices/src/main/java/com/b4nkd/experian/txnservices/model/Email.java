package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
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
 * All details of email
 */
@ApiModel(description = "All details of email")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Email   {
  @JsonProperty("to")
  private String to = "consumer-bob@gmail.com";

  @JsonProperty("from")
  private String from = "lender-john@acme-lending.com";

  @JsonProperty("subject")
  private String subject = "Verify your income";

  @JsonProperty("firstName")
  private String firstName = "Bob";

  @JsonProperty("brandColor")
  private String brandColor = "#000";

  @JsonProperty("brandLogo")
  private String brandLogo = "https://acme-lending.com/logo.png";

  @JsonProperty("institutionName")
  private String institutionName = "Acme Lending";

  @JsonProperty("institutionAddress")
  private String institutionAddress = "222 Winipeg Drive SLC UT, 84109";

  @JsonProperty("supportPhone")
  private String supportPhone = "800-555-5555";

  @JsonProperty("signature")
  @Valid
  private List<String> signature = null;

  public Email to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The email address you wish to receive the email
   * @return to
  **/
  @ApiModelProperty(required = true, value = "The email address you wish to receive the email")
      @NotNull

    public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Email from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The “from” address that will appear in user’s inboxes.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The “from” address that will appear in user’s inboxes.")
      @NotNull

    public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Email subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The “subject” line that will appear in user’s inboxes. Defaults to ‘Verify your Financial Information’
   * @return subject
  **/
  @ApiModelProperty(value = "The “subject” line that will appear in user’s inboxes. Defaults to ‘Verify your Financial Information’")
  
    public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Email firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The name of the customer that will appear in the email.
   * @return firstName
  **/
  @ApiModelProperty(value = "The name of the customer that will appear in the email.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Email brandColor(String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

  /**
   * The header color in the email. Defaults to dark blue
   * @return brandColor
  **/
  @ApiModelProperty(value = "The header color in the email. Defaults to dark blue")
  
    public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }

  public Email brandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
    return this;
  }

  /**
   * A valid url that points to the logo you want to appear in the email. For optimal display, should have dimensions no greater than 110 pixels tall and 300 pixels wide
   * @return brandLogo
  **/
  @ApiModelProperty(required = true, value = "A valid url that points to the logo you want to appear in the email. For optimal display, should have dimensions no greater than 110 pixels tall and 300 pixels wide")
      @NotNull

    public String getBrandLogo() {
    return brandLogo;
  }

  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }

  public Email institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

  /**
   * The name of your company that will appear in the email
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The name of your company that will appear in the email")
      @NotNull

    public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public Email institutionAddress(String institutionAddress) {
    this.institutionAddress = institutionAddress;
    return this;
  }

  /**
   * Address that will appear in the footer of the email
   * @return institutionAddress
  **/
  @ApiModelProperty(value = "Address that will appear in the footer of the email")
  
    public String getInstitutionAddress() {
    return institutionAddress;
  }

  public void setInstitutionAddress(String institutionAddress) {
    this.institutionAddress = institutionAddress;
  }

  public Email supportPhone(String supportPhone) {
    this.supportPhone = supportPhone;
    return this;
  }

  /**
   * Phone number that will be listed for support in the email.
   * @return supportPhone
  **/
  @ApiModelProperty(value = "Phone number that will be listed for support in the email.")
  
    public String getSupportPhone() {
    return supportPhone;
  }

  public void setSupportPhone(String supportPhone) {
    this.supportPhone = supportPhone;
  }

  public Email signature(List<String> signature) {
    this.signature = signature;
    return this;
  }

  public Email addSignatureItem(String signatureItem) {
    if (this.signature == null) {
      this.signature = new ArrayList<String>();
    }
    this.signature.add(signatureItem);
    return this;
  }

  /**
   * Signature can be applied. In xml a separate line in signature is delineated by each <signature> tag. In json this is simply an array.
   * @return signature
  **/
  @ApiModelProperty(value = "Signature can be applied. In xml a separate line in signature is delineated by each <signature> tag. In json this is simply an array.")
  
    public List<String> getSignature() {
    return signature;
  }

  public void setSignature(List<String> signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.to, email.to) &&
        Objects.equals(this.from, email.from) &&
        Objects.equals(this.subject, email.subject) &&
        Objects.equals(this.firstName, email.firstName) &&
        Objects.equals(this.brandColor, email.brandColor) &&
        Objects.equals(this.brandLogo, email.brandLogo) &&
        Objects.equals(this.institutionName, email.institutionName) &&
        Objects.equals(this.institutionAddress, email.institutionAddress) &&
        Objects.equals(this.supportPhone, email.supportPhone) &&
        Objects.equals(this.signature, email.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, subject, firstName, brandColor, brandLogo, institutionName, institutionAddress, supportPhone, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionAddress: ").append(toIndentedString(institutionAddress)).append("\n");
    sb.append("    supportPhone: ").append(toIndentedString(supportPhone)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
