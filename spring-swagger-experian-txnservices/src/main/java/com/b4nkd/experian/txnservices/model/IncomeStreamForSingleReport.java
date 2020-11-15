package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.IncomeStreamForSingleReportCadence;
import com.b4nkd.experian.txnservices.model.IncomeStreamForSingleReportNetMonthly;
import com.b4nkd.experian.txnservices.model.IncomeStreamForSingleReportTransactions;
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
 * One instance for an income stream
 */
@ApiModel(description = "One instance for an income stream")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class IncomeStreamForSingleReport   {
  @JsonProperty("id")
  private String id = "0vscb36rn3xs1";

  @JsonProperty("accountId")
  private BigDecimal accountId = null;

  @JsonProperty("name")
  private String name = "Withdrawal";

  @JsonProperty("type")
  private String type = "Uncategorized";

  @JsonProperty("status")
  private String status = "inactive";

  @JsonProperty("cadence")
  private IncomeStreamForSingleReportCadence cadence = null;

  @JsonProperty("netMonthly")
  @Valid
  private List<IncomeStreamForSingleReportNetMonthly> netMonthly = null;

  @JsonProperty("netAnnual")
  private BigDecimal netAnnual = null;

  @JsonProperty("projectedNetAnnual")
  private BigDecimal projectedNetAnnual = null;

  @JsonProperty("estimatedGrossAnnual")
  private BigDecimal estimatedGrossAnnual = null;

  @JsonProperty("projectedGrossAnnual")
  private BigDecimal projectedGrossAnnual = null;

  @JsonProperty("transactions")
  @Valid
  private List<IncomeStreamForSingleReportTransactions> transactions = null;

  public IncomeStreamForSingleReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Finicity income stream ID
   * @return id
  **/
  @ApiModelProperty(value = "Finicity income stream ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncomeStreamForSingleReport accountId(BigDecimal accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Finicity account ID
   * @return accountId
  **/
  @ApiModelProperty(value = "Finicity account ID")
  
    @Valid
    public BigDecimal getAccountId() {
    return accountId;
  }

  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }

  public IncomeStreamForSingleReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for this income stream
   * @return name
  **/
  @ApiModelProperty(value = "A human-readable name for this income stream")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncomeStreamForSingleReport type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of report such as directDeposit, uncategorized, Paycheck, other, etc.
   * @return type
  **/
  @ApiModelProperty(value = "The type of report such as directDeposit, uncategorized, Paycheck, other, etc.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IncomeStreamForSingleReport status(String status) {
    this.status = status;
    return this;
  }

  /**
   * active or inactive (active means that the most-recent deposit occurred as expected by the cadence, and the next expected date is still in the future)
   * @return status
  **/
  @ApiModelProperty(value = "active or inactive (active means that the most-recent deposit occurred as expected by the cadence, and the next expected date is still in the future)")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IncomeStreamForSingleReport cadence(IncomeStreamForSingleReportCadence cadence) {
    this.cadence = cadence;
    return this;
  }

  /**
   * Get cadence
   * @return cadence
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public IncomeStreamForSingleReportCadence getCadence() {
    return cadence;
  }

  public void setCadence(IncomeStreamForSingleReportCadence cadence) {
    this.cadence = cadence;
  }

  public IncomeStreamForSingleReport netMonthly(List<IncomeStreamForSingleReportNetMonthly> netMonthly) {
    this.netMonthly = netMonthly;
    return this;
  }

  public IncomeStreamForSingleReport addNetMonthlyItem(IncomeStreamForSingleReportNetMonthly netMonthlyItem) {
    if (this.netMonthly == null) {
      this.netMonthly = new ArrayList<IncomeStreamForSingleReportNetMonthly>();
    }
    this.netMonthly.add(netMonthlyItem);
    return this;
  }

  /**
   * netMonthly records in an array
   * @return netMonthly
  **/
  @ApiModelProperty(value = "netMonthly records in an array")
      @Valid
    public List<IncomeStreamForSingleReportNetMonthly> getNetMonthly() {
    return netMonthly;
  }

  public void setNetMonthly(List<IncomeStreamForSingleReportNetMonthly> netMonthly) {
    this.netMonthly = netMonthly;
  }

  public IncomeStreamForSingleReport netAnnual(BigDecimal netAnnual) {
    this.netAnnual = netAnnual;
    return this;
  }

  /**
   * Sum of all values in netMonthly over the previous 12 months
   * @return netAnnual
  **/
  @ApiModelProperty(value = "Sum of all values in netMonthly over the previous 12 months")
  
    @Valid
    public BigDecimal getNetAnnual() {
    return netAnnual;
  }

  public void setNetAnnual(BigDecimal netAnnual) {
    this.netAnnual = netAnnual;
  }

  public IncomeStreamForSingleReport projectedNetAnnual(BigDecimal projectedNetAnnual) {
    this.projectedNetAnnual = projectedNetAnnual;
    return this;
  }

  /**
   * Projected net income over the next 12 months, based on netAnnual
   * @return projectedNetAnnual
  **/
  @ApiModelProperty(value = "Projected net income over the next 12 months, based on netAnnual")
  
    @Valid
    public BigDecimal getProjectedNetAnnual() {
    return projectedNetAnnual;
  }

  public void setProjectedNetAnnual(BigDecimal projectedNetAnnual) {
    this.projectedNetAnnual = projectedNetAnnual;
  }

  public IncomeStreamForSingleReport estimatedGrossAnnual(BigDecimal estimatedGrossAnnual) {
    this.estimatedGrossAnnual = estimatedGrossAnnual;
    return this;
  }

  /**
   * Before-tax gross annual income (estimated from netAnnual)
   * @return estimatedGrossAnnual
  **/
  @ApiModelProperty(value = "Before-tax gross annual income (estimated from netAnnual)")
  
    @Valid
    public BigDecimal getEstimatedGrossAnnual() {
    return estimatedGrossAnnual;
  }

  public void setEstimatedGrossAnnual(BigDecimal estimatedGrossAnnual) {
    this.estimatedGrossAnnual = estimatedGrossAnnual;
  }

  public IncomeStreamForSingleReport projectedGrossAnnual(BigDecimal projectedGrossAnnual) {
    this.projectedGrossAnnual = projectedGrossAnnual;
    return this;
  }

  /**
   * Projected gross income over the next 12 months, based on projectedNetAnnual
   * @return projectedGrossAnnual
  **/
  @ApiModelProperty(value = "Projected gross income over the next 12 months, based on projectedNetAnnual")
  
    @Valid
    public BigDecimal getProjectedGrossAnnual() {
    return projectedGrossAnnual;
  }

  public void setProjectedGrossAnnual(BigDecimal projectedGrossAnnual) {
    this.projectedGrossAnnual = projectedGrossAnnual;
  }

  public IncomeStreamForSingleReport transactions(List<IncomeStreamForSingleReportTransactions> transactions) {
    this.transactions = transactions;
    return this;
  }

  public IncomeStreamForSingleReport addTransactionsItem(IncomeStreamForSingleReportTransactions transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<IncomeStreamForSingleReportTransactions>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * A list of the transactions that comprise this income stream
   * @return transactions
  **/
  @ApiModelProperty(value = "A list of the transactions that comprise this income stream")
      @Valid
    public List<IncomeStreamForSingleReportTransactions> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<IncomeStreamForSingleReportTransactions> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStreamForSingleReport incomeStreamForSingleReport = (IncomeStreamForSingleReport) o;
    return Objects.equals(this.id, incomeStreamForSingleReport.id) &&
        Objects.equals(this.accountId, incomeStreamForSingleReport.accountId) &&
        Objects.equals(this.name, incomeStreamForSingleReport.name) &&
        Objects.equals(this.type, incomeStreamForSingleReport.type) &&
        Objects.equals(this.status, incomeStreamForSingleReport.status) &&
        Objects.equals(this.cadence, incomeStreamForSingleReport.cadence) &&
        Objects.equals(this.netMonthly, incomeStreamForSingleReport.netMonthly) &&
        Objects.equals(this.netAnnual, incomeStreamForSingleReport.netAnnual) &&
        Objects.equals(this.projectedNetAnnual, incomeStreamForSingleReport.projectedNetAnnual) &&
        Objects.equals(this.estimatedGrossAnnual, incomeStreamForSingleReport.estimatedGrossAnnual) &&
        Objects.equals(this.projectedGrossAnnual, incomeStreamForSingleReport.projectedGrossAnnual) &&
        Objects.equals(this.transactions, incomeStreamForSingleReport.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, name, type, status, cadence, netMonthly, netAnnual, projectedNetAnnual, estimatedGrossAnnual, projectedGrossAnnual, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStreamForSingleReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cadence: ").append(toIndentedString(cadence)).append("\n");
    sb.append("    netMonthly: ").append(toIndentedString(netMonthly)).append("\n");
    sb.append("    netAnnual: ").append(toIndentedString(netAnnual)).append("\n");
    sb.append("    projectedNetAnnual: ").append(toIndentedString(projectedNetAnnual)).append("\n");
    sb.append("    estimatedGrossAnnual: ").append(toIndentedString(estimatedGrossAnnual)).append("\n");
    sb.append("    projectedGrossAnnual: ").append(toIndentedString(projectedGrossAnnual)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
