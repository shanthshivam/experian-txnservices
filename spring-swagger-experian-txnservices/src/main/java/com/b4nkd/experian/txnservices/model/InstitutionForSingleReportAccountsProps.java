package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReportAccountsPropsAsset;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReportAccountsPropsDetails;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReportAccountsPropsTransactions;
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
 * InstitutionForSingleReportAccountsProps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InstitutionForSingleReportAccountsProps   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("number")
  private String number = "XX1111";

  @JsonProperty("ownerName")
  private String ownerName = "Patrick & Lorraine Purchaser";

  @JsonProperty("ownerAddress")
  private String ownerAddress = "7195 Belmont St. Parlin, NJ 08859";

  @JsonProperty("name")
  private String name = "Checking";

  @JsonProperty("type")
  private String type = "checking";

  @JsonProperty("availableBalance")
  private BigDecimal availableBalance = null;

  @JsonProperty("aggregationStatusCode")
  private BigDecimal aggregationStatusCode = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("balanceDate")
  private String balanceDate = "1519282800";

  @JsonProperty("averageMonthlyBalance")
  private BigDecimal averageMonthlyBalance = null;

  @JsonProperty("transactions")
  @Valid
  private List<InstitutionForSingleReportAccountsPropsTransactions> transactions = null;

  @JsonProperty("asset")
  private InstitutionForSingleReportAccountsPropsAsset asset = null;

  @JsonProperty("details")
  private InstitutionForSingleReportAccountsPropsDetails details = null;

  public InstitutionForSingleReportAccountsProps id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Finicity account ID
   * @return id
  **/
  @ApiModelProperty(value = "Finicity account ID")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public InstitutionForSingleReportAccountsProps number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The account number from the institution (obfuscated)
   * @return number
  **/
  @ApiModelProperty(value = "The account number from the institution (obfuscated)")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public InstitutionForSingleReportAccountsProps ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")
  
    public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public InstitutionForSingleReportAccountsProps ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

  /**
   * The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerAddress
  **/
  @ApiModelProperty(value = "The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")
  
    public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public InstitutionForSingleReportAccountsProps name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name from the institution.
   * @return name
  **/
  @ApiModelProperty(value = "The account name from the institution.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstitutionForSingleReportAccountsProps type(String type) {
    this.type = type;
    return this;
  }

  /**
   * For VOA the possibilities are checking / savings / moneyMarket / cd / investment For VOI the options are checking / savings / moneyMarket 
   * @return type
  **/
  @ApiModelProperty(value = "For VOA the possibilities are checking / savings / moneyMarket / cd / investment For VOI the options are checking / savings / moneyMarket ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstitutionForSingleReportAccountsProps availableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * The available balance of the account.
   * @return availableBalance
  **/
  @ApiModelProperty(value = "The available balance of the account.")
  
    @Valid
    public BigDecimal getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }

  public InstitutionForSingleReportAccountsProps aggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

  /**
   * Finicity aggregation status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)
   * @return aggregationStatusCode
  **/
  @ApiModelProperty(value = "Finicity aggregation status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)")
  
    @Valid
    public BigDecimal getAggregationStatusCode() {
    return aggregationStatusCode;
  }

  public void setAggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
  }

  public InstitutionForSingleReportAccountsProps balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The cleared balance of the account as-of balanceDate.
   * @return balance
  **/
  @ApiModelProperty(value = "The cleared balance of the account as-of balanceDate.")
  
    @Valid
    public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public InstitutionForSingleReportAccountsProps balanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
    return this;
  }

  /**
   * A timestamp showing when the balance was captured
   * @return balanceDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the balance was captured")
  
    public String getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(String balanceDate) {
    this.balanceDate = balanceDate;
  }

  public InstitutionForSingleReportAccountsProps averageMonthlyBalance(BigDecimal averageMonthlyBalance) {
    this.averageMonthlyBalance = averageMonthlyBalance;
    return this;
  }

  /**
   * The average monthly balance of this account
   * @return averageMonthlyBalance
  **/
  @ApiModelProperty(value = "The average monthly balance of this account")
  
    @Valid
    public BigDecimal getAverageMonthlyBalance() {
    return averageMonthlyBalance;
  }

  public void setAverageMonthlyBalance(BigDecimal averageMonthlyBalance) {
    this.averageMonthlyBalance = averageMonthlyBalance;
  }

  public InstitutionForSingleReportAccountsProps transactions(List<InstitutionForSingleReportAccountsPropsTransactions> transactions) {
    this.transactions = transactions;
    return this;
  }

  public InstitutionForSingleReportAccountsProps addTransactionsItem(InstitutionForSingleReportAccountsPropsTransactions transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<InstitutionForSingleReportAccountsPropsTransactions>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Array of all transaction records
   * @return transactions
  **/
  @ApiModelProperty(value = "Array of all transaction records")
      @Valid
    public List<InstitutionForSingleReportAccountsPropsTransactions> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<InstitutionForSingleReportAccountsPropsTransactions> transactions) {
    this.transactions = transactions;
  }

  public InstitutionForSingleReportAccountsProps asset(InstitutionForSingleReportAccountsPropsAsset asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   * @return asset
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InstitutionForSingleReportAccountsPropsAsset getAsset() {
    return asset;
  }

  public void setAsset(InstitutionForSingleReportAccountsPropsAsset asset) {
    this.asset = asset;
  }

  public InstitutionForSingleReportAccountsProps details(InstitutionForSingleReportAccountsPropsDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InstitutionForSingleReportAccountsPropsDetails getDetails() {
    return details;
  }

  public void setDetails(InstitutionForSingleReportAccountsPropsDetails details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionForSingleReportAccountsProps institutionForSingleReportAccountsProps = (InstitutionForSingleReportAccountsProps) o;
    return Objects.equals(this.id, institutionForSingleReportAccountsProps.id) &&
        Objects.equals(this.number, institutionForSingleReportAccountsProps.number) &&
        Objects.equals(this.ownerName, institutionForSingleReportAccountsProps.ownerName) &&
        Objects.equals(this.ownerAddress, institutionForSingleReportAccountsProps.ownerAddress) &&
        Objects.equals(this.name, institutionForSingleReportAccountsProps.name) &&
        Objects.equals(this.type, institutionForSingleReportAccountsProps.type) &&
        Objects.equals(this.availableBalance, institutionForSingleReportAccountsProps.availableBalance) &&
        Objects.equals(this.aggregationStatusCode, institutionForSingleReportAccountsProps.aggregationStatusCode) &&
        Objects.equals(this.balance, institutionForSingleReportAccountsProps.balance) &&
        Objects.equals(this.balanceDate, institutionForSingleReportAccountsProps.balanceDate) &&
        Objects.equals(this.averageMonthlyBalance, institutionForSingleReportAccountsProps.averageMonthlyBalance) &&
        Objects.equals(this.transactions, institutionForSingleReportAccountsProps.transactions) &&
        Objects.equals(this.asset, institutionForSingleReportAccountsProps.asset) &&
        Objects.equals(this.details, institutionForSingleReportAccountsProps.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, ownerName, ownerAddress, name, type, availableBalance, aggregationStatusCode, balance, balanceDate, averageMonthlyBalance, transactions, asset, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionForSingleReportAccountsProps {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
    sb.append("    averageMonthlyBalance: ").append(toIndentedString(averageMonthlyBalance)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
