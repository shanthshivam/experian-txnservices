package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.CreateLinkRequestWebhookData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Generates the Finicity Connect Link, which is how the users will add their account data to the customer entity you have created. Requires a Partner ID, Customer ID, and Consumer ID
 */
@ApiModel(description = "Generates the Finicity Connect Link, which is how the users will add their account data to the customer entity you have created. Requires a Partner ID, Customer ID, and Consumer ID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CreateLinkRequest   {
  /**
   * The Report type you wish to have generated for you. ‘Lite’ will provide just the iframe UI to manage the credentials of the end user.
   */
  public enum TypeEnum {
    VOA("voa"),
    
    VOI("voi"),
    
    VOA_HISTORY("voa-history"),
    
    DCR("dcr"),
    
    LITE("lite"),
    
    FIX("fix");

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
  private TypeEnum type = TypeEnum.VOI;

  @JsonProperty("partnerId")
  private String partnerId = "123456789";

  @JsonProperty("customerId")
  private String customerId = "123456789";

  @JsonProperty("consumerId")
  private String consumerId = "123456789";

  @JsonProperty("redirectUri")
  private String redirectUri = "https://www.experian.com/";

  @JsonProperty("fromDate")
  private String fromDate = "1494449017";

  @JsonProperty("webhook")
  private String webhook = "www.google.com/";

  @JsonProperty("webhookContentType")
  private String webhookContentType = "application/json";

  @JsonProperty("webhookData")
  private CreateLinkRequestWebhookData webhookData = null;

  @JsonProperty("institutionLoginId")
  private String institutionLoginId = "9764";

  public CreateLinkRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The Report type you wish to have generated for you. ‘Lite’ will provide just the iframe UI to manage the credentials of the end user.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The Report type you wish to have generated for you. ‘Lite’ will provide just the iframe UI to manage the credentials of the end user.")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateLinkRequest partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * The client_id you can obtain from your Finicity developer dashboard or the OAuth
   * @return partnerId
  **/
  @ApiModelProperty(required = true, value = "The client_id you can obtain from your Finicity developer dashboard or the OAuth")
      @NotNull

    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public CreateLinkRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Obtained from the CreateCustomer object
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "Obtained from the CreateCustomer object")
      @NotNull

    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CreateLinkRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Obtained from the CreateConsumer object
   * @return consumerId
  **/
  @ApiModelProperty(required = true, value = "Obtained from the CreateConsumer object")
      @NotNull

    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public CreateLinkRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * The url that customers will be redirected to after completing Finicity Connect
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "The url that customers will be redirected to after completing Finicity Connect")
      @NotNull

    public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public CreateLinkRequest fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * This is an optional field for use of 'voa' and 'voi' Connect types and passed as an Epoch Timestamp (in seconds). Without this param, the report defaults to 6 months if available. fromDate is not used in Connect sessions with 'aggregation' type. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data 
   * @return fromDate
  **/
  @ApiModelProperty(value = "This is an optional field for use of 'voa' and 'voi' Connect types and passed as an Epoch Timestamp (in seconds). Without this param, the report defaults to 6 months if available. fromDate is not used in Connect sessions with 'aggregation' type. If included, the epoch timestamp should be 10 digits long, and be within two years of the present day. Extending the epoch timestamp beyond 10 digits will default back to six months of data ")
  
    public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public CreateLinkRequest webhook(String webhook) {
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

  public CreateLinkRequest webhookContentType(String webhookContentType) {
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

  public CreateLinkRequest webhookData(CreateLinkRequestWebhookData webhookData) {
    this.webhookData = webhookData;
    return this;
  }

  /**
   * Get webhookData
   * @return webhookData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CreateLinkRequestWebhookData getWebhookData() {
    return webhookData;
  }

  public void setWebhookData(CreateLinkRequestWebhookData webhookData) {
    this.webhookData = webhookData;
  }

  public CreateLinkRequest institutionLoginId(String institutionLoginId) {
    this.institutionLoginId = institutionLoginId;
    return this;
  }

  /**
   * The institutionId will call connect for the financialinstitution you are requesting example ‘101732’returns connect for Finbank, ‘5’ returns connect for‘Chase’. Only a single institutionId can be passed.
   * @return institutionLoginId
  **/
  @ApiModelProperty(value = "The institutionId will call connect for the financialinstitution you are requesting example ‘101732’returns connect for Finbank, ‘5’ returns connect for‘Chase’. Only a single institutionId can be passed.")
  
    public String getInstitutionLoginId() {
    return institutionLoginId;
  }

  public void setInstitutionLoginId(String institutionLoginId) {
    this.institutionLoginId = institutionLoginId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkRequest createLinkRequest = (CreateLinkRequest) o;
    return Objects.equals(this.type, createLinkRequest.type) &&
        Objects.equals(this.partnerId, createLinkRequest.partnerId) &&
        Objects.equals(this.customerId, createLinkRequest.customerId) &&
        Objects.equals(this.consumerId, createLinkRequest.consumerId) &&
        Objects.equals(this.redirectUri, createLinkRequest.redirectUri) &&
        Objects.equals(this.fromDate, createLinkRequest.fromDate) &&
        Objects.equals(this.webhook, createLinkRequest.webhook) &&
        Objects.equals(this.webhookContentType, createLinkRequest.webhookContentType) &&
        Objects.equals(this.webhookData, createLinkRequest.webhookData) &&
        Objects.equals(this.institutionLoginId, createLinkRequest.institutionLoginId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, partnerId, customerId, consumerId, redirectUri, fromDate, webhook, webhookContentType, webhookData, institutionLoginId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookContentType: ").append(toIndentedString(webhookContentType)).append("\n");
    sb.append("    webhookData: ").append(toIndentedString(webhookData)).append("\n");
    sb.append("    institutionLoginId: ").append(toIndentedString(institutionLoginId)).append("\n");
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
