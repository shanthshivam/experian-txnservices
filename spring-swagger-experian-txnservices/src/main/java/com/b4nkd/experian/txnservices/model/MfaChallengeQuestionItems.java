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
 * MFA Question object
 */
@ApiModel(description = "MFA Question object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class MfaChallengeQuestionItems   {
  @JsonProperty("text")
  private String text = "Enter name of your first pet.";

  public MfaChallengeQuestionItems text(String text) {
    this.text = text;
    return this;
  }

  /**
   * MFA Challenge Question
   * @return text
  **/
  @ApiModelProperty(value = "MFA Challenge Question")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MfaChallengeQuestionItems mfaChallengeQuestionItems = (MfaChallengeQuestionItems) o;
    return Objects.equals(this.text, mfaChallengeQuestionItems.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MfaChallengeQuestionItems {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
