package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.SubscriptionRecord;
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
 * List Of Subscription Record
 */
@ApiModel(description = "List Of Subscription Record")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SubscriptionList   {
  @JsonProperty("subscriptions")
  @Valid
  private List<SubscriptionRecord> subscriptions = null;

  public SubscriptionList subscriptions(List<SubscriptionRecord> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionList addSubscriptionsItem(SubscriptionRecord subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<SubscriptionRecord>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SubscriptionRecord> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionRecord> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionList subscriptionList = (SubscriptionList) o;
    return Objects.equals(this.subscriptions, subscriptionList.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionList {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
