package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.EmailConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the fields within the Initiate Email responce.
 */
@ApiModel(description = "Describes the fields within the Initiate Email responce.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InitiateEmailResponse   {
  @JsonProperty("link")
  private String link = "https://connect.finicity.com";

  @JsonProperty("emailConfig")
  private EmailConfig emailConfig = null;

  public InitiateEmailResponse link(String link) {
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

  public InitiateEmailResponse emailConfig(EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }

  /**
   * Get emailConfig
   * @return emailConfig
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EmailConfig getEmailConfig() {
    return emailConfig;
  }

  public void setEmailConfig(EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateEmailResponse initiateEmailResponse = (InitiateEmailResponse) o;
    return Objects.equals(this.link, initiateEmailResponse.link) &&
        Objects.equals(this.emailConfig, initiateEmailResponse.emailConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, emailConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateEmailResponse {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    emailConfig: ").append(toIndentedString(emailConfig)).append("\n");
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
