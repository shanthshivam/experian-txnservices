package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.CustomerAccountDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details for a specific Customer account.
 */
@ApiModel(description = "Details for a specific Customer account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CustomerAccount   {
  @JsonProperty("id")
  private String id = "1111";

  @JsonProperty("number")
  private String number = "XXXX-XXXXXX-11111";

  @JsonProperty("name")
  private String name = "Checking";

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("type")
  private String type = "checking";

  @JsonProperty("aggregationStatusCode")
  private BigDecimal aggregationStatusCode = null;

  @JsonProperty("status")
  private String status = "active";

  @JsonProperty("customerId")
  private String customerId = "11111";

  @JsonProperty("institutionId")
  private String institutionId = "111111";

  @JsonProperty("balanceDate")
  private BigDecimal balanceDate = null;

  @JsonProperty("aggregationSuccessDate")
  private BigDecimal aggregationSuccessDate = null;

  @JsonProperty("aggregationAttemptDate")
  private BigDecimal aggregationAttemptDate = null;

  @JsonProperty("createdDate")
  private BigDecimal createdDate = null;

  @JsonProperty("lastUpdatedDate")
  private BigDecimal lastUpdatedDate = null;

  @JsonProperty("currency")
  private String currency = "USD";

  @JsonProperty("lastTransactionDate")
  private BigDecimal lastTransactionDate = null;

  @JsonProperty("institutionLoginId")
  private BigDecimal institutionLoginId = null;

  @JsonProperty("detail")
  private CustomerAccountDetail detail = null;

  @JsonProperty("displayPosition")
  private BigDecimal displayPosition = null;

  public CustomerAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The General Finicity ID of the account
   * @return id
  **/
  @ApiModelProperty(value = "The General Finicity ID of the account")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerAccount number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The account number from the institution (all digits except the last four are obfuscated)
   * @return number
  **/
  @ApiModelProperty(value = "The account number from the institution (all digits except the last four are obfuscated)")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CustomerAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name from the institution
   * @return name
  **/
  @ApiModelProperty(value = "The account name from the institution")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerAccount balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The cleared balance of the account as of balanceDate
   * @return balance
  **/
  @ApiModelProperty(value = "The cleared balance of the account as of balanceDate")
  
    @Valid
    public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public CustomerAccount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * One of the values from Account Types, such as checking or savings
   * @return type
  **/
  @ApiModelProperty(value = "One of the values from Account Types, such as checking or savings")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomerAccount aggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

  /**
   * The status of the most recent aggregation attempt
   * @return aggregationStatusCode
  **/
  @ApiModelProperty(value = "The status of the most recent aggregation attempt")
  
    @Valid
    public BigDecimal getAggregationStatusCode() {
    return aggregationStatusCode;
  }

  public void setAggregationStatusCode(BigDecimal aggregationStatusCode) {
    this.aggregationStatusCode = aggregationStatusCode;
  }

  public CustomerAccount status(String status) {
    this.status = status;
    return this;
  }

  /**
   * pending during account discovery, always active following successful account activation 
   * @return status
  **/
  @ApiModelProperty(value = "pending during account discovery, always active following successful account activation ")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomerAccount customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The Finicity ID of the customer associated with this account
   * @return customerId
  **/
  @ApiModelProperty(value = "The Finicity ID of the customer associated with this account")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomerAccount institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

  /**
   * The Finicity ID of the institution for this account
   * @return institutionId
  **/
  @ApiModelProperty(value = "The Finicity ID of the institution for this account")
  
    public String getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }

  public CustomerAccount balanceDate(BigDecimal balanceDate) {
    this.balanceDate = balanceDate;
    return this;
  }

  /**
   * A timestamp showing when the balance was captured
   * @return balanceDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the balance was captured")
  
    @Valid
    public BigDecimal getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(BigDecimal balanceDate) {
    this.balanceDate = balanceDate;
  }

  public CustomerAccount aggregationSuccessDate(BigDecimal aggregationSuccessDate) {
    this.aggregationSuccessDate = aggregationSuccessDate;
    return this;
  }

  /**
   * A timestamp showing the last successful aggregation of the account
   * @return aggregationSuccessDate
  **/
  @ApiModelProperty(value = "A timestamp showing the last successful aggregation of the account")
  
    @Valid
    public BigDecimal getAggregationSuccessDate() {
    return aggregationSuccessDate;
  }

  public void setAggregationSuccessDate(BigDecimal aggregationSuccessDate) {
    this.aggregationSuccessDate = aggregationSuccessDate;
  }

  public CustomerAccount aggregationAttemptDate(BigDecimal aggregationAttemptDate) {
    this.aggregationAttemptDate = aggregationAttemptDate;
    return this;
  }

  /**
   * A timestamp showing the last aggregation attempt, whether successful or not
   * @return aggregationAttemptDate
  **/
  @ApiModelProperty(value = "A timestamp showing the last aggregation attempt, whether successful or not")
  
    @Valid
    public BigDecimal getAggregationAttemptDate() {
    return aggregationAttemptDate;
  }

  public void setAggregationAttemptDate(BigDecimal aggregationAttemptDate) {
    this.aggregationAttemptDate = aggregationAttemptDate;
  }

  public CustomerAccount createdDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * A timestamp showing when the account was added to the Finicity system
   * @return createdDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the account was added to the Finicity system")
  
    @Valid
    public BigDecimal getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
  }

  public CustomerAccount lastUpdatedDate(BigDecimal lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * A timestamp showing when the account was last updated to the Finicity system
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "A timestamp showing when the account was last updated to the Finicity system")
  
    @Valid
    public BigDecimal getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(BigDecimal lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public CustomerAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Type of currency used
   * @return currency
  **/
  @ApiModelProperty(value = "Type of currency used")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CustomerAccount lastTransactionDate(BigDecimal lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

  /**
   * A timestamp showing the last transaction date
   * @return lastTransactionDate
  **/
  @ApiModelProperty(value = "A timestamp showing the last transaction date")
  
    @Valid
    public BigDecimal getLastTransactionDate() {
    return lastTransactionDate;
  }

  public void setLastTransactionDate(BigDecimal lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
  }

  public CustomerAccount institutionLoginId(BigDecimal institutionLoginId) {
    this.institutionLoginId = institutionLoginId;
    return this;
  }

  /**
   * The institution login ID
   * @return institutionLoginId
  **/
  @ApiModelProperty(value = "The institution login ID")
  
    @Valid
    public BigDecimal getInstitutionLoginId() {
    return institutionLoginId;
  }

  public void setInstitutionLoginId(BigDecimal institutionLoginId) {
    this.institutionLoginId = institutionLoginId;
  }

  public CustomerAccount detail(CustomerAccountDetail detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomerAccountDetail getDetail() {
    return detail;
  }

  public void setDetail(CustomerAccountDetail detail) {
    this.detail = detail;
  }

  public CustomerAccount displayPosition(BigDecimal displayPosition) {
    this.displayPosition = displayPosition;
    return this;
  }

  /**
   * display Position
   * @return displayPosition
  **/
  @ApiModelProperty(value = "display Position")
  
    @Valid
    public BigDecimal getDisplayPosition() {
    return displayPosition;
  }

  public void setDisplayPosition(BigDecimal displayPosition) {
    this.displayPosition = displayPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccount customerAccount = (CustomerAccount) o;
    return Objects.equals(this.id, customerAccount.id) &&
        Objects.equals(this.number, customerAccount.number) &&
        Objects.equals(this.name, customerAccount.name) &&
        Objects.equals(this.balance, customerAccount.balance) &&
        Objects.equals(this.type, customerAccount.type) &&
        Objects.equals(this.aggregationStatusCode, customerAccount.aggregationStatusCode) &&
        Objects.equals(this.status, customerAccount.status) &&
        Objects.equals(this.customerId, customerAccount.customerId) &&
        Objects.equals(this.institutionId, customerAccount.institutionId) &&
        Objects.equals(this.balanceDate, customerAccount.balanceDate) &&
        Objects.equals(this.aggregationSuccessDate, customerAccount.aggregationSuccessDate) &&
        Objects.equals(this.aggregationAttemptDate, customerAccount.aggregationAttemptDate) &&
        Objects.equals(this.createdDate, customerAccount.createdDate) &&
        Objects.equals(this.lastUpdatedDate, customerAccount.lastUpdatedDate) &&
        Objects.equals(this.currency, customerAccount.currency) &&
        Objects.equals(this.lastTransactionDate, customerAccount.lastTransactionDate) &&
        Objects.equals(this.institutionLoginId, customerAccount.institutionLoginId) &&
        Objects.equals(this.detail, customerAccount.detail) &&
        Objects.equals(this.displayPosition, customerAccount.displayPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, name, balance, type, aggregationStatusCode, status, customerId, institutionId, balanceDate, aggregationSuccessDate, aggregationAttemptDate, createdDate, lastUpdatedDate, currency, lastTransactionDate, institutionLoginId, detail, displayPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
    sb.append("    aggregationSuccessDate: ").append(toIndentedString(aggregationSuccessDate)).append("\n");
    sb.append("    aggregationAttemptDate: ").append(toIndentedString(aggregationAttemptDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    institutionLoginId: ").append(toIndentedString(institutionLoginId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    displayPosition: ").append(toIndentedString(displayPosition)).append("\n");
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
