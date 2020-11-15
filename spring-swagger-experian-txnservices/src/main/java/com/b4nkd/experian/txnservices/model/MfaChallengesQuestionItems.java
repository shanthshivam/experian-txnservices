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
 * Properties of the MFA Challenge
 */
@ApiModel(description = "Properties of the MFA Challenge")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class MfaChallengesQuestionItems   {
  @JsonProperty("text")
  private String text = "Enter name of your first pet.";

  @JsonProperty("answer")
  private String answer = "Venkt.";

  public MfaChallengesQuestionItems text(String text) {
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

  public MfaChallengesQuestionItems answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * MFA Challenge Answer
   * @return answer
  **/
  @ApiModelProperty(value = "MFA Challenge Answer")
  
    public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MfaChallengesQuestionItems mfaChallengesQuestionItems = (MfaChallengesQuestionItems) o;
    return Objects.equals(this.text, mfaChallengesQuestionItems.text) &&
        Objects.equals(this.answer, mfaChallengesQuestionItems.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MfaChallengesQuestionItems {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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
