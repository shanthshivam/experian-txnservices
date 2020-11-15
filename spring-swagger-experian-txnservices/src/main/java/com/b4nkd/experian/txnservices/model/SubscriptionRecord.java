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
 * Details for one subscription
 */
@ApiModel(description = "Details for one subscription")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SubscriptionRecord   {
  @JsonProperty("id")
  private String id = "7462";

  @JsonProperty("accountId")
  private String accountId = "2055";

  /**
   * account or transaction
   */
  public enum TypeEnum {
    ACCOUNT("account"),
    
    TRANSACTION("transaction");

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
  private TypeEnum type = TypeEnum.TRANSACTION;

  @JsonProperty("callbackUrl")
  private String callbackUrl = "https://www.mydomain.com/txpush/listener";

  @JsonProperty("signingKey")
  private String signingKey = "zg4U0v1IvTzFEHIXzJMxPHnfUwWZAMVpXrUuNuL9IvZI0Qzk";

  public SubscriptionRecord id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The subscription ID
   * @return id
  **/
  @ApiModelProperty(value = "The subscription ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionRecord accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account being monitored by this subscription
   * @return accountId
  **/
  @ApiModelProperty(value = "The account being monitored by this subscription")
  
    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SubscriptionRecord type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * account or transaction
   * @return type
  **/
  @ApiModelProperty(value = "account or transaction")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SubscriptionRecord callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * The TxPUSH Listener URL where event notifications will be sent
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "The TxPUSH Listener URL where event notifications will be sent")
  
    public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public SubscriptionRecord signingKey(String signingKey) {
    this.signingKey = signingKey;
    return this;
  }

  /**
   * A signing key that will be used to validate the signature of events received for this subscription
   * @return signingKey
  **/
  @ApiModelProperty(value = "A signing key that will be used to validate the signature of events received for this subscription")
  
    public String getSigningKey() {
    return signingKey;
  }

  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRecord subscriptionRecord = (SubscriptionRecord) o;
    return Objects.equals(this.id, subscriptionRecord.id) &&
        Objects.equals(this.accountId, subscriptionRecord.accountId) &&
        Objects.equals(this.type, subscriptionRecord.type) &&
        Objects.equals(this.callbackUrl, subscriptionRecord.callbackUrl) &&
        Objects.equals(this.signingKey, subscriptionRecord.signingKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, type, callbackUrl, signingKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
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
