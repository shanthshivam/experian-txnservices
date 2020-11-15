package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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


public class EmailConfig   {
  @JsonProperty("link")
  private String link = "https://connect.finicity.com";

  /**
   * The report type you wish to have generated for you. Valid types include ‘voa’, ‘voi’, and ‘aggregation’.
   */
  public enum TypeEnum {
    VOA("voa"),
    
    VOI("voi"),
    
    AGGREGATION("aggregation");

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
  private TypeEnum type = TypeEnum.VOA;

  @JsonProperty("subject")
  private String subject = "Verify your income";

  @JsonProperty("brandColor")
  private String brandColor = "#000";

  @JsonProperty("brandLogo")
  private String brandLogo = "https://acme-lending.com/logo.png";

  @JsonProperty("institutionName")
  private String institutionName = "Acme Lending";

  @JsonProperty("institutionAddress")
  private String institutionAddress = "222 Winipeg Drive SLC UT, 84109";

  @JsonProperty("supportPhone")
  private BigDecimal supportPhone = null;

  @JsonProperty("from")
  private String from = "lender-john@acme-lending.com";

  @JsonProperty("signature")
  @Valid
  private List<String> signature = null;

  @JsonProperty("partnerId")
  private String partnerId = "123456789";

  @JsonProperty("to")
  private String to = "consumer-bob@gmail.com";

  @JsonProperty("firstName")
  private String firstName = "Bob";

  public EmailConfig link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Generates the Link
   * @return link
  **/
  @ApiModelProperty(value = "Generates the Link")
  
    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public EmailConfig type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The report type you wish to have generated for you. Valid types include ‘voa’, ‘voi’, and ‘aggregation’.
   * @return type
  **/
  @ApiModelProperty(value = "The report type you wish to have generated for you. Valid types include ‘voa’, ‘voi’, and ‘aggregation’.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EmailConfig subject(String subject) {
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

  public EmailConfig brandColor(String brandColor) {
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

  public EmailConfig brandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
    return this;
  }

  /**
   * A valid url that points to the logo you want to appear in the email. For optimal display, should have dimensions no greater than 110 pixels tall and 300 pixels wide
   * @return brandLogo
  **/
  @ApiModelProperty(value = "A valid url that points to the logo you want to appear in the email. For optimal display, should have dimensions no greater than 110 pixels tall and 300 pixels wide")
  
    public String getBrandLogo() {
    return brandLogo;
  }

  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }

  public EmailConfig institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

  /**
   * The name of your company that will appear in the email
   * @return institutionName
  **/
  @ApiModelProperty(value = "The name of your company that will appear in the email")
  
    public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public EmailConfig institutionAddress(String institutionAddress) {
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

  public EmailConfig supportPhone(BigDecimal supportPhone) {
    this.supportPhone = supportPhone;
    return this;
  }

  /**
   * Phone number that will be listed for support in the email.
   * @return supportPhone
  **/
  @ApiModelProperty(value = "Phone number that will be listed for support in the email.")
  
    @Valid
    public BigDecimal getSupportPhone() {
    return supportPhone;
  }

  public void setSupportPhone(BigDecimal supportPhone) {
    this.supportPhone = supportPhone;
  }

  public EmailConfig from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The “from” address that will appear in user’s inboxes.
   * @return from
  **/
  @ApiModelProperty(value = "The “from” address that will appear in user’s inboxes.")
  
    public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public EmailConfig signature(List<String> signature) {
    this.signature = signature;
    return this;
  }

  public EmailConfig addSignatureItem(String signatureItem) {
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

  public EmailConfig partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * The partner id you can obtain from your Finicity developer dashboard
   * @return partnerId
  **/
  @ApiModelProperty(value = "The partner id you can obtain from your Finicity developer dashboard")
  
    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public EmailConfig to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The email address you wish to receive the email
   * @return to
  **/
  @ApiModelProperty(value = "The email address you wish to receive the email")
  
    public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public EmailConfig firstName(String firstName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConfig emailConfig = (EmailConfig) o;
    return Objects.equals(this.link, emailConfig.link) &&
        Objects.equals(this.type, emailConfig.type) &&
        Objects.equals(this.subject, emailConfig.subject) &&
        Objects.equals(this.brandColor, emailConfig.brandColor) &&
        Objects.equals(this.brandLogo, emailConfig.brandLogo) &&
        Objects.equals(this.institutionName, emailConfig.institutionName) &&
        Objects.equals(this.institutionAddress, emailConfig.institutionAddress) &&
        Objects.equals(this.supportPhone, emailConfig.supportPhone) &&
        Objects.equals(this.from, emailConfig.from) &&
        Objects.equals(this.signature, emailConfig.signature) &&
        Objects.equals(this.partnerId, emailConfig.partnerId) &&
        Objects.equals(this.to, emailConfig.to) &&
        Objects.equals(this.firstName, emailConfig.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, type, subject, brandColor, brandLogo, institutionName, institutionAddress, supportPhone, from, signature, partnerId, to, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfig {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionAddress: ").append(toIndentedString(institutionAddress)).append("\n");
    sb.append("    supportPhone: ").append(toIndentedString(supportPhone)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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
