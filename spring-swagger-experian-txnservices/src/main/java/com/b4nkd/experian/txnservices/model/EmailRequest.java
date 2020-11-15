package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.Email;
import com.b4nkd.experian.txnservices.model.WebHookData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the fields within the Initiate Email request.
 */
@ApiModel(description = "Describes the fields within the Initiate Email request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class EmailRequest   {
  @JsonProperty("partnerId")
  private String partnerId = "123456789";

  @JsonProperty("consumerId")
  private String consumerId = "123456789";

  @JsonProperty("customerId")
  private String customerId = "123456789";

  @JsonProperty("redirectUri")
  private String redirectUri = "https://www.experian.com/";

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

  @JsonProperty("fromDate")
  private String fromDate = "1494449017";

  @JsonProperty("webhook")
  private String webhook = "www.google.com/";

  @JsonProperty("webhookContentType")
  private String webhookContentType = "application/json";

  @JsonProperty("webhookData")
  private WebHookData webhookData = null;

  @JsonProperty("analytics")
  private String analytics = "google:UA-123456789-1";

  @JsonProperty("email")
  private Email email = null;

  public EmailRequest partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * The partner id you can obtain from your Finicity developer dashboard
   * @return partnerId
  **/
  @ApiModelProperty(required = true, value = "The partner id you can obtain from your Finicity developer dashboard")
      @NotNull

    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public EmailRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * ID of the consumer
   * @return consumerId
  **/
  @ApiModelProperty(value = "ID of the consumer")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public EmailRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID of the customer
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "ID of the customer")
      @NotNull

    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public EmailRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * The url that customers will be redirected to after completing Finicity Connect.
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "The url that customers will be redirected to after completing Finicity Connect.")
      @NotNull

    public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public EmailRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The report type you wish to have generated for you. Valid types include ‘voa’, ‘voi’, and ‘aggregation’.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The report type you wish to have generated for you. Valid types include ‘voa’, ‘voi’, and ‘aggregation’.")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EmailRequest fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * This is an optional field for use with only 'voa' Connect type. The fromDate param should not be used with the 'voi' Connect type.The `fromDate` param is an Epoch Timestamp (in seconds), such as “1494449017”. Without this param, the report defaults to 6 months if available. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data.
   * @return fromDate
  **/
  @ApiModelProperty(value = "This is an optional field for use with only 'voa' Connect type. The fromDate param should not be used with the 'voi' Connect type.The `fromDate` param is an Epoch Timestamp (in seconds), such as “1494449017”. Without this param, the report defaults to 6 months if available. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data.")
  
    public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public EmailRequest webhook(String webhook) {
    this.webhook = webhook;
    return this;
  }

  /**
   * The publicly available url you wish to be posted to when the user starts and completes Finicity Connect
   * @return webhook
  **/
  @ApiModelProperty(value = "The publicly available url you wish to be posted to when the user starts and completes Finicity Connect")
  
    public String getWebhook() {
    return webhook;
  }

  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }

  public EmailRequest webhookContentType(String webhookContentType) {
    this.webhookContentType = webhookContentType;
    return this;
  }

  /**
   * The format of the data you wish to be posted to your server. Valid values are 'application/json' and 'application/xml'
   * @return webhookContentType
  **/
  @ApiModelProperty(value = "The format of the data you wish to be posted to your server. Valid values are 'application/json' and 'application/xml'")
  
    public String getWebhookContentType() {
    return webhookContentType;
  }

  public void setWebhookContentType(String webhookContentType) {
    this.webhookContentType = webhookContentType;
  }

  public EmailRequest webhookData(WebHookData webhookData) {
    this.webhookData = webhookData;
    return this;
  }

  /**
   * Get webhookData
   * @return webhookData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WebHookData getWebhookData() {
    return webhookData;
  }

  public void setWebhookData(WebHookData webhookData) {
    this.webhookData = webhookData;
  }

  public EmailRequest analytics(String analytics) {
    this.analytics = analytics;
    return this;
  }

  /**
   * Google Analytics can be used with Connect to provide an additional layer of transparency of end user engagement
   * @return analytics
  **/
  @ApiModelProperty(value = "Google Analytics can be used with Connect to provide an additional layer of transparency of end user engagement")
  
    public String getAnalytics() {
    return analytics;
  }

  public void setAnalytics(String analytics) {
    this.analytics = analytics;
  }

  public EmailRequest email(Email email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
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
    EmailRequest emailRequest = (EmailRequest) o;
    return Objects.equals(this.partnerId, emailRequest.partnerId) &&
        Objects.equals(this.consumerId, emailRequest.consumerId) &&
        Objects.equals(this.customerId, emailRequest.customerId) &&
        Objects.equals(this.redirectUri, emailRequest.redirectUri) &&
        Objects.equals(this.type, emailRequest.type) &&
        Objects.equals(this.fromDate, emailRequest.fromDate) &&
        Objects.equals(this.webhook, emailRequest.webhook) &&
        Objects.equals(this.webhookContentType, emailRequest.webhookContentType) &&
        Objects.equals(this.webhookData, emailRequest.webhookData) &&
        Objects.equals(this.analytics, emailRequest.analytics) &&
        Objects.equals(this.email, emailRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, consumerId, customerId, redirectUri, type, fromDate, webhook, webhookContentType, webhookData, analytics, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRequest {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookContentType: ").append(toIndentedString(webhookContentType)).append("\n");
    sb.append("    webhookData: ").append(toIndentedString(webhookData)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
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
