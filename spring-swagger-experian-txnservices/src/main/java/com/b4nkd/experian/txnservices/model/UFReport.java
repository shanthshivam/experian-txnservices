package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.UFReportLenderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Full UltraFICO Response
 */
@ApiModel(description = "Full UltraFICO Response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class UFReport   {
  @JsonProperty("ssn_Variation_Indicator")
  private String ssnVariationIndicator = "*6660000";

  @JsonProperty("consumerNames")
  @Valid
  private List<String> consumerNames = null;

  @JsonProperty("consumerAddresses")
  @Valid
  private List<String> consumerAddresses = null;

  @JsonProperty("modelId")
  private String modelId = "UF";

  @JsonProperty("UltraFICO_Score_or_Exclusion")
  private String ultraFICOScoreOrExclusion = "0000";

  @JsonProperty("UltraFICO_Score_Negative_Reason_Code_1")
  private String ultraFICOScoreNegativeReasonCode1 = "0000";

  @JsonProperty("UltraFICO_Score_Negative_Reason_Code_2")
  private String ultraFICOScoreNegativeReasonCode2 = "0000";

  @JsonProperty("UltraFICO_Score_Negative_Reason_Code_3")
  private String ultraFICOScoreNegativeReasonCode3 = "0000";

  @JsonProperty("UltraFICO_Score_Negative_Reason_Code_4")
  private String ultraFICOScoreNegativeReasonCode4 = "0000";

  @JsonProperty("UltraFICO_Score_Negative_FACTA")
  private String ultraFICOScoreNegativeFACTA = "0000";

  @JsonProperty("voluntary_BK_Withdrawn")
  private String voluntaryBKWithdrawn = "0000";

  @JsonProperty("chapter_7_BK_Reported")
  private String chapter7BKReported = "0000";

  @JsonProperty("chapter_11_BK_Reported")
  private String chapter11BKReported = "0000";

  @JsonProperty("chapter_12_BK_Reported")
  private String chapter12BKReported = "0000";

  @JsonProperty("chapter_13_BK_Reported")
  private String chapter13BKReported = "0000";

  @JsonProperty("accounts_Closed")
  private String accountsClosed = "0000";

  @JsonProperty("account_Disputed")
  private String accountDisputed = "0000";

  @JsonProperty("lenderResponse")
  private UFReportLenderResponse lenderResponse = null;

  @JsonProperty("transactionId")
  private BigDecimal transactionId = null;

  @JsonProperty("message_Text")
  private String messageText = "0000";

  @JsonProperty("message_Code")
  private String messageCode = "0000";

  @JsonProperty("statement_Text")
  private String statementText = "0000";

  public UFReport ssnVariationIndicator(String ssnVariationIndicator) {
    this.ssnVariationIndicator = ssnVariationIndicator;
    return this;
  }

  /**
   * SSN matched to Consumer
   * @return ssnVariationIndicator
  **/
  @ApiModelProperty(value = "SSN matched to Consumer")
  
    public String getSsnVariationIndicator() {
    return ssnVariationIndicator;
  }

  public void setSsnVariationIndicator(String ssnVariationIndicator) {
    this.ssnVariationIndicator = ssnVariationIndicator;
  }

  public UFReport consumerNames(List<String> consumerNames) {
    this.consumerNames = consumerNames;
    return this;
  }

  public UFReport addConsumerNamesItem(String consumerNamesItem) {
    if (this.consumerNames == null) {
      this.consumerNames = new ArrayList<String>();
    }
    this.consumerNames.add(consumerNamesItem);
    return this;
  }

  /**
   * A list of consumer names with best names matched
   * @return consumerNames
  **/
  @ApiModelProperty(value = "A list of consumer names with best names matched")
  
    public List<String> getConsumerNames() {
    return consumerNames;
  }

  public void setConsumerNames(List<String> consumerNames) {
    this.consumerNames = consumerNames;
  }

  public UFReport consumerAddresses(List<String> consumerAddresses) {
    this.consumerAddresses = consumerAddresses;
    return this;
  }

  public UFReport addConsumerAddressesItem(String consumerAddressesItem) {
    if (this.consumerAddresses == null) {
      this.consumerAddresses = new ArrayList<String>();
    }
    this.consumerAddresses.add(consumerAddressesItem);
    return this;
  }

  /**
   * A list of consumer address with best addresses matched
   * @return consumerAddresses
  **/
  @ApiModelProperty(value = "A list of consumer address with best addresses matched")
  
    public List<String> getConsumerAddresses() {
    return consumerAddresses;
  }

  public void setConsumerAddresses(List<String> consumerAddresses) {
    this.consumerAddresses = consumerAddresses;
  }

  public UFReport modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * The Type of Model returned
   * @return modelId
  **/
  @ApiModelProperty(value = "The Type of Model returned")
  
    public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public UFReport ultraFICOScoreOrExclusion(String ultraFICOScoreOrExclusion) {
    this.ultraFICOScoreOrExclusion = ultraFICOScoreOrExclusion;
    return this;
  }

  /**
   * UltraFICO_Score_or_Exclusion
   * @return ultraFICOScoreOrExclusion
  **/
  @ApiModelProperty(value = "UltraFICO_Score_or_Exclusion")
  
    public String getUltraFICOScoreOrExclusion() {
    return ultraFICOScoreOrExclusion;
  }

  public void setUltraFICOScoreOrExclusion(String ultraFICOScoreOrExclusion) {
    this.ultraFICOScoreOrExclusion = ultraFICOScoreOrExclusion;
  }

  public UFReport ultraFICOScoreNegativeReasonCode1(String ultraFICOScoreNegativeReasonCode1) {
    this.ultraFICOScoreNegativeReasonCode1 = ultraFICOScoreNegativeReasonCode1;
    return this;
  }

  /**
   * UltraFICO_Score_Negative_Reason_Code_1
   * @return ultraFICOScoreNegativeReasonCode1
  **/
  @ApiModelProperty(value = "UltraFICO_Score_Negative_Reason_Code_1")
  
    public String getUltraFICOScoreNegativeReasonCode1() {
    return ultraFICOScoreNegativeReasonCode1;
  }

  public void setUltraFICOScoreNegativeReasonCode1(String ultraFICOScoreNegativeReasonCode1) {
    this.ultraFICOScoreNegativeReasonCode1 = ultraFICOScoreNegativeReasonCode1;
  }

  public UFReport ultraFICOScoreNegativeReasonCode2(String ultraFICOScoreNegativeReasonCode2) {
    this.ultraFICOScoreNegativeReasonCode2 = ultraFICOScoreNegativeReasonCode2;
    return this;
  }

  /**
   * UltraFICO_Score_Negative_Reason_Code_2
   * @return ultraFICOScoreNegativeReasonCode2
  **/
  @ApiModelProperty(value = "UltraFICO_Score_Negative_Reason_Code_2")
  
    public String getUltraFICOScoreNegativeReasonCode2() {
    return ultraFICOScoreNegativeReasonCode2;
  }

  public void setUltraFICOScoreNegativeReasonCode2(String ultraFICOScoreNegativeReasonCode2) {
    this.ultraFICOScoreNegativeReasonCode2 = ultraFICOScoreNegativeReasonCode2;
  }

  public UFReport ultraFICOScoreNegativeReasonCode3(String ultraFICOScoreNegativeReasonCode3) {
    this.ultraFICOScoreNegativeReasonCode3 = ultraFICOScoreNegativeReasonCode3;
    return this;
  }

  /**
   * UltraFICO_Score_Negative_Reason_Code_3
   * @return ultraFICOScoreNegativeReasonCode3
  **/
  @ApiModelProperty(value = "UltraFICO_Score_Negative_Reason_Code_3")
  
    public String getUltraFICOScoreNegativeReasonCode3() {
    return ultraFICOScoreNegativeReasonCode3;
  }

  public void setUltraFICOScoreNegativeReasonCode3(String ultraFICOScoreNegativeReasonCode3) {
    this.ultraFICOScoreNegativeReasonCode3 = ultraFICOScoreNegativeReasonCode3;
  }

  public UFReport ultraFICOScoreNegativeReasonCode4(String ultraFICOScoreNegativeReasonCode4) {
    this.ultraFICOScoreNegativeReasonCode4 = ultraFICOScoreNegativeReasonCode4;
    return this;
  }

  /**
   * UltraFICO_Score_Negative_Reason_Code_4
   * @return ultraFICOScoreNegativeReasonCode4
  **/
  @ApiModelProperty(value = "UltraFICO_Score_Negative_Reason_Code_4")
  
    public String getUltraFICOScoreNegativeReasonCode4() {
    return ultraFICOScoreNegativeReasonCode4;
  }

  public void setUltraFICOScoreNegativeReasonCode4(String ultraFICOScoreNegativeReasonCode4) {
    this.ultraFICOScoreNegativeReasonCode4 = ultraFICOScoreNegativeReasonCode4;
  }

  public UFReport ultraFICOScoreNegativeFACTA(String ultraFICOScoreNegativeFACTA) {
    this.ultraFICOScoreNegativeFACTA = ultraFICOScoreNegativeFACTA;
    return this;
  }

  /**
   * UltraFICO_Score_Negative_FACTA
   * @return ultraFICOScoreNegativeFACTA
  **/
  @ApiModelProperty(value = "UltraFICO_Score_Negative_FACTA")
  
    public String getUltraFICOScoreNegativeFACTA() {
    return ultraFICOScoreNegativeFACTA;
  }

  public void setUltraFICOScoreNegativeFACTA(String ultraFICOScoreNegativeFACTA) {
    this.ultraFICOScoreNegativeFACTA = ultraFICOScoreNegativeFACTA;
  }

  public UFReport voluntaryBKWithdrawn(String voluntaryBKWithdrawn) {
    this.voluntaryBKWithdrawn = voluntaryBKWithdrawn;
    return this;
  }

  /**
   * Voluntary BK Withdrawn by Consumer
   * @return voluntaryBKWithdrawn
  **/
  @ApiModelProperty(value = "Voluntary BK Withdrawn by Consumer")
  
    public String getVoluntaryBKWithdrawn() {
    return voluntaryBKWithdrawn;
  }

  public void setVoluntaryBKWithdrawn(String voluntaryBKWithdrawn) {
    this.voluntaryBKWithdrawn = voluntaryBKWithdrawn;
  }

  public UFReport chapter7BKReported(String chapter7BKReported) {
    this.chapter7BKReported = chapter7BKReported;
    return this;
  }

  /**
   * Chapter 7 BK Reported
   * @return chapter7BKReported
  **/
  @ApiModelProperty(value = "Chapter 7 BK Reported")
  
    public String getChapter7BKReported() {
    return chapter7BKReported;
  }

  public void setChapter7BKReported(String chapter7BKReported) {
    this.chapter7BKReported = chapter7BKReported;
  }

  public UFReport chapter11BKReported(String chapter11BKReported) {
    this.chapter11BKReported = chapter11BKReported;
    return this;
  }

  /**
   * Chapter 11 BK Reported
   * @return chapter11BKReported
  **/
  @ApiModelProperty(value = "Chapter 11 BK Reported")
  
    public String getChapter11BKReported() {
    return chapter11BKReported;
  }

  public void setChapter11BKReported(String chapter11BKReported) {
    this.chapter11BKReported = chapter11BKReported;
  }

  public UFReport chapter12BKReported(String chapter12BKReported) {
    this.chapter12BKReported = chapter12BKReported;
    return this;
  }

  /**
   * Chapter 12 BK Reported
   * @return chapter12BKReported
  **/
  @ApiModelProperty(value = "Chapter 12 BK Reported")
  
    public String getChapter12BKReported() {
    return chapter12BKReported;
  }

  public void setChapter12BKReported(String chapter12BKReported) {
    this.chapter12BKReported = chapter12BKReported;
  }

  public UFReport chapter13BKReported(String chapter13BKReported) {
    this.chapter13BKReported = chapter13BKReported;
    return this;
  }

  /**
   * Chapter 13 BK Reported
   * @return chapter13BKReported
  **/
  @ApiModelProperty(value = "Chapter 13 BK Reported")
  
    public String getChapter13BKReported() {
    return chapter13BKReported;
  }

  public void setChapter13BKReported(String chapter13BKReported) {
    this.chapter13BKReported = chapter13BKReported;
  }

  public UFReport accountsClosed(String accountsClosed) {
    this.accountsClosed = accountsClosed;
    return this;
  }

  /**
   * Accounts Closed by Consumer
   * @return accountsClosed
  **/
  @ApiModelProperty(value = "Accounts Closed by Consumer")
  
    public String getAccountsClosed() {
    return accountsClosed;
  }

  public void setAccountsClosed(String accountsClosed) {
    this.accountsClosed = accountsClosed;
  }

  public UFReport accountDisputed(String accountDisputed) {
    this.accountDisputed = accountDisputed;
    return this;
  }

  /**
   * Accounts Disputed by Consumer
   * @return accountDisputed
  **/
  @ApiModelProperty(value = "Accounts Disputed by Consumer")
  
    public String getAccountDisputed() {
    return accountDisputed;
  }

  public void setAccountDisputed(String accountDisputed) {
    this.accountDisputed = accountDisputed;
  }

  public UFReport lenderResponse(UFReportLenderResponse lenderResponse) {
    this.lenderResponse = lenderResponse;
    return this;
  }

  /**
   * Get lenderResponse
   * @return lenderResponse
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UFReportLenderResponse getLenderResponse() {
    return lenderResponse;
  }

  public void setLenderResponse(UFReportLenderResponse lenderResponse) {
    this.lenderResponse = lenderResponse;
  }

  public UFReport transactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "transactionId")
  
    @Valid
    public BigDecimal getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
  }

  public UFReport messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * message_Text
   * @return messageText
  **/
  @ApiModelProperty(value = "message_Text")
  
    public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public UFReport messageCode(String messageCode) {
    this.messageCode = messageCode;
    return this;
  }

  /**
   * message_Code
   * @return messageCode
  **/
  @ApiModelProperty(value = "message_Code")
  
    public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public UFReport statementText(String statementText) {
    this.statementText = statementText;
    return this;
  }

  /**
   * statement_Text
   * @return statementText
  **/
  @ApiModelProperty(value = "statement_Text")
  
    public String getStatementText() {
    return statementText;
  }

  public void setStatementText(String statementText) {
    this.statementText = statementText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UFReport ufReport = (UFReport) o;
    return Objects.equals(this.ssnVariationIndicator, ufReport.ssnVariationIndicator) &&
        Objects.equals(this.consumerNames, ufReport.consumerNames) &&
        Objects.equals(this.consumerAddresses, ufReport.consumerAddresses) &&
        Objects.equals(this.modelId, ufReport.modelId) &&
        Objects.equals(this.ultraFICOScoreOrExclusion, ufReport.ultraFICOScoreOrExclusion) &&
        Objects.equals(this.ultraFICOScoreNegativeReasonCode1, ufReport.ultraFICOScoreNegativeReasonCode1) &&
        Objects.equals(this.ultraFICOScoreNegativeReasonCode2, ufReport.ultraFICOScoreNegativeReasonCode2) &&
        Objects.equals(this.ultraFICOScoreNegativeReasonCode3, ufReport.ultraFICOScoreNegativeReasonCode3) &&
        Objects.equals(this.ultraFICOScoreNegativeReasonCode4, ufReport.ultraFICOScoreNegativeReasonCode4) &&
        Objects.equals(this.ultraFICOScoreNegativeFACTA, ufReport.ultraFICOScoreNegativeFACTA) &&
        Objects.equals(this.voluntaryBKWithdrawn, ufReport.voluntaryBKWithdrawn) &&
        Objects.equals(this.chapter7BKReported, ufReport.chapter7BKReported) &&
        Objects.equals(this.chapter11BKReported, ufReport.chapter11BKReported) &&
        Objects.equals(this.chapter12BKReported, ufReport.chapter12BKReported) &&
        Objects.equals(this.chapter13BKReported, ufReport.chapter13BKReported) &&
        Objects.equals(this.accountsClosed, ufReport.accountsClosed) &&
        Objects.equals(this.accountDisputed, ufReport.accountDisputed) &&
        Objects.equals(this.lenderResponse, ufReport.lenderResponse) &&
        Objects.equals(this.transactionId, ufReport.transactionId) &&
        Objects.equals(this.messageText, ufReport.messageText) &&
        Objects.equals(this.messageCode, ufReport.messageCode) &&
        Objects.equals(this.statementText, ufReport.statementText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssnVariationIndicator, consumerNames, consumerAddresses, modelId, ultraFICOScoreOrExclusion, ultraFICOScoreNegativeReasonCode1, ultraFICOScoreNegativeReasonCode2, ultraFICOScoreNegativeReasonCode3, ultraFICOScoreNegativeReasonCode4, ultraFICOScoreNegativeFACTA, voluntaryBKWithdrawn, chapter7BKReported, chapter11BKReported, chapter12BKReported, chapter13BKReported, accountsClosed, accountDisputed, lenderResponse, transactionId, messageText, messageCode, statementText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UFReport {\n");
    
    sb.append("    ssnVariationIndicator: ").append(toIndentedString(ssnVariationIndicator)).append("\n");
    sb.append("    consumerNames: ").append(toIndentedString(consumerNames)).append("\n");
    sb.append("    consumerAddresses: ").append(toIndentedString(consumerAddresses)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    ultraFICOScoreOrExclusion: ").append(toIndentedString(ultraFICOScoreOrExclusion)).append("\n");
    sb.append("    ultraFICOScoreNegativeReasonCode1: ").append(toIndentedString(ultraFICOScoreNegativeReasonCode1)).append("\n");
    sb.append("    ultraFICOScoreNegativeReasonCode2: ").append(toIndentedString(ultraFICOScoreNegativeReasonCode2)).append("\n");
    sb.append("    ultraFICOScoreNegativeReasonCode3: ").append(toIndentedString(ultraFICOScoreNegativeReasonCode3)).append("\n");
    sb.append("    ultraFICOScoreNegativeReasonCode4: ").append(toIndentedString(ultraFICOScoreNegativeReasonCode4)).append("\n");
    sb.append("    ultraFICOScoreNegativeFACTA: ").append(toIndentedString(ultraFICOScoreNegativeFACTA)).append("\n");
    sb.append("    voluntaryBKWithdrawn: ").append(toIndentedString(voluntaryBKWithdrawn)).append("\n");
    sb.append("    chapter7BKReported: ").append(toIndentedString(chapter7BKReported)).append("\n");
    sb.append("    chapter11BKReported: ").append(toIndentedString(chapter11BKReported)).append("\n");
    sb.append("    chapter12BKReported: ").append(toIndentedString(chapter12BKReported)).append("\n");
    sb.append("    chapter13BKReported: ").append(toIndentedString(chapter13BKReported)).append("\n");
    sb.append("    accountsClosed: ").append(toIndentedString(accountsClosed)).append("\n");
    sb.append("    accountDisputed: ").append(toIndentedString(accountDisputed)).append("\n");
    sb.append("    lenderResponse: ").append(toIndentedString(lenderResponse)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    statementText: ").append(toIndentedString(statementText)).append("\n");
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
