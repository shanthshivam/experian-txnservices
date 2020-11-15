package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.MfaChallengeQuestionItems;
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
 * Collection of MFA Questions to be answered
 */
@ApiModel(description = "Collection of MFA Questions to be answered")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class MfaChallenge   {
  @JsonProperty("questions")
  @Valid
  private List<MfaChallengeQuestionItems> questions = null;

  public MfaChallenge questions(List<MfaChallengeQuestionItems> questions) {
    this.questions = questions;
    return this;
  }

  public MfaChallenge addQuestionsItem(MfaChallengeQuestionItems questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<MfaChallengeQuestionItems>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Multi-Factor Authentication
   * @return questions
  **/
  @ApiModelProperty(value = "Multi-Factor Authentication")
      @Valid
    public List<MfaChallengeQuestionItems> getQuestions() {
    return questions;
  }

  public void setQuestions(List<MfaChallengeQuestionItems> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MfaChallenge mfaChallenge = (MfaChallenge) o;
    return Objects.equals(this.questions, mfaChallenge.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MfaChallenge {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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
