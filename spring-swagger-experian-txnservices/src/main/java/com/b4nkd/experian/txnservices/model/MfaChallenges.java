package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.MfaChallengesQuestionItems;
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
 * Send Account Details(MFA Challenge)
 */
@ApiModel(description = "Send Account Details(MFA Challenge)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class MfaChallenges   {
  @JsonProperty("questions")
  @Valid
  private List<MfaChallengesQuestionItems> questions = null;

  public MfaChallenges questions(List<MfaChallengesQuestionItems> questions) {
    this.questions = questions;
    return this;
  }

  public MfaChallenges addQuestionsItem(MfaChallengesQuestionItems questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<MfaChallengesQuestionItems>();
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
    public List<MfaChallengesQuestionItems> getQuestions() {
    return questions;
  }

  public void setQuestions(List<MfaChallengesQuestionItems> questions) {
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
    MfaChallenges mfaChallenges = (MfaChallenges) o;
    return Objects.equals(this.questions, mfaChallenges.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MfaChallenges {\n");
    
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
