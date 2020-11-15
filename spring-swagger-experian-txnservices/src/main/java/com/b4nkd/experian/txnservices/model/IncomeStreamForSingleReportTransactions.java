package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IncomeStreamForSingleReportTransactions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class IncomeStreamForSingleReportTransactions   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("postedDate")
  private BigDecimal postedDate = null;

  @JsonProperty("description")
  private String description = "JABERWOCKY CREDIT N.A. JABERWOCKY";

  @JsonProperty("memo")
  private String memo = "PPD ID: 1234567893";

  @JsonProperty("institutionTransactionId")
  private String institutionTransactionId = "0000000000";

  @JsonProperty("category")
  private String category = "Income";

  @JsonProperty("reportId")
  private String reportId = "0vscb36rn3xs";

  public IncomeStreamForSingleReportTransactions id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Finicity transaction ID
   * @return id
  **/
  @ApiModelProperty(value = "Finicity transaction ID")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public IncomeStreamForSingleReportTransactions amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The total amount of this transactions. Transactions for deposits are positive values; withdrawals and debits are negative values.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount of this transactions. Transactions for deposits are positive values; withdrawals and debits are negative values.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public IncomeStreamForSingleReportTransactions postedDate(BigDecimal postedDate) {
    this.postedDate = postedDate;
    return this;
  }

  /**
   * A timestamp showing when the transaction was posted or cleared by the institution
   * @return postedDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the transaction was posted or cleared by the institution")
  
    @Valid
    public BigDecimal getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(BigDecimal postedDate) {
    this.postedDate = postedDate;
  }

  public IncomeStreamForSingleReportTransactions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the transaction, as provided by the institution (often known as payee)
   * @return description
  **/
  @ApiModelProperty(value = "The description of the transaction, as provided by the institution (often known as payee)")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncomeStreamForSingleReportTransactions memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * The memo field of the transaction, as provided by the institution
   * @return memo
  **/
  @ApiModelProperty(value = "The memo field of the transaction, as provided by the institution")
  
    public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public IncomeStreamForSingleReportTransactions institutionTransactionId(String institutionTransactionId) {
    this.institutionTransactionId = institutionTransactionId;
    return this;
  }

  /**
   * A unique ID of the transaction, as provided by the institution (often known as FITID)
   * @return institutionTransactionId
  **/
  @ApiModelProperty(value = "A unique ID of the transaction, as provided by the institution (often known as FITID)")
  
    public String getInstitutionTransactionId() {
    return institutionTransactionId;
  }

  public void setInstitutionTransactionId(String institutionTransactionId) {
    this.institutionTransactionId = institutionTransactionId;
  }

  public IncomeStreamForSingleReportTransactions category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The assigned category for this transaction
   * @return category
  **/
  @ApiModelProperty(value = "The assigned category for this transaction")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IncomeStreamForSingleReportTransactions reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * The specific ID report
   * @return reportId
  **/
  @ApiModelProperty(value = "The specific ID report")
  
    public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStreamForSingleReportTransactions incomeStreamForSingleReportTransactions = (IncomeStreamForSingleReportTransactions) o;
    return Objects.equals(this.id, incomeStreamForSingleReportTransactions.id) &&
        Objects.equals(this.amount, incomeStreamForSingleReportTransactions.amount) &&
        Objects.equals(this.postedDate, incomeStreamForSingleReportTransactions.postedDate) &&
        Objects.equals(this.description, incomeStreamForSingleReportTransactions.description) &&
        Objects.equals(this.memo, incomeStreamForSingleReportTransactions.memo) &&
        Objects.equals(this.institutionTransactionId, incomeStreamForSingleReportTransactions.institutionTransactionId) &&
        Objects.equals(this.category, incomeStreamForSingleReportTransactions.category) &&
        Objects.equals(this.reportId, incomeStreamForSingleReportTransactions.reportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, postedDate, description, memo, institutionTransactionId, category, reportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStreamForSingleReportTransactions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    institutionTransactionId: ").append(toIndentedString(institutionTransactionId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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
