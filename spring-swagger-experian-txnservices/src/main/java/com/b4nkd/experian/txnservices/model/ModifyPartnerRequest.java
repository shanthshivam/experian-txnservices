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
 * Requires the current Partner Secret and new Partner Secret
 */
@ApiModel(description = "Requires the current Partner Secret and new Partner Secret")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ModifyPartnerRequest   {
  @JsonProperty("partnerId")
  private String partnerId = "00000000";

  @JsonProperty("partnerSecret")
  private String partnerSecret = "00000000aaaa";

  @JsonProperty("newPartnerSecret")
  private String newPartnerSecret = "00000000bbbbb";

  public ModifyPartnerRequest partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Partner ID from Developer Portal
   * @return partnerId
  **/
  @ApiModelProperty(value = "Partner ID from Developer Portal")
  
    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public ModifyPartnerRequest partnerSecret(String partnerSecret) {
    this.partnerSecret = partnerSecret;
    return this;
  }

  /**
   * Current value of Partner Secret from Developer Portal
   * @return partnerSecret
  **/
  @ApiModelProperty(value = "Current value of Partner Secret from Developer Portal")
  
    public String getPartnerSecret() {
    return partnerSecret;
  }

  public void setPartnerSecret(String partnerSecret) {
    this.partnerSecret = partnerSecret;
  }

  public ModifyPartnerRequest newPartnerSecret(String newPartnerSecret) {
    this.newPartnerSecret = newPartnerSecret;
    return this;
  }

  /**
   * The new value for Partner Secret
   * @return newPartnerSecret
  **/
  @ApiModelProperty(value = "The new value for Partner Secret")
  
    public String getNewPartnerSecret() {
    return newPartnerSecret;
  }

  public void setNewPartnerSecret(String newPartnerSecret) {
    this.newPartnerSecret = newPartnerSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyPartnerRequest modifyPartnerRequest = (ModifyPartnerRequest) o;
    return Objects.equals(this.partnerId, modifyPartnerRequest.partnerId) &&
        Objects.equals(this.partnerSecret, modifyPartnerRequest.partnerSecret) &&
        Objects.equals(this.newPartnerSecret, modifyPartnerRequest.newPartnerSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, partnerSecret, newPartnerSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyPartnerRequest {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerSecret: ").append(toIndentedString(partnerSecret)).append("\n");
    sb.append("    newPartnerSecret: ").append(toIndentedString(newPartnerSecret)).append("\n");
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
