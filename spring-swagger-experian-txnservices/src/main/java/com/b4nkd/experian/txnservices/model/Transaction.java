package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Transaction   {
  @JsonProperty("amount")
  private String amount = "-4.25";

  @JsonProperty("description")
  private String description = "Lunch";

  /**
   * active or pending (optional)
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = StatusEnum.ACTIVE;

  @JsonProperty("postedDate")
  private String postedDate = "1444253131";

  @JsonProperty("transactionDate")
  private String transactionDate = "1444253131";

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the transaction
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transaction")
      @NotNull

    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the transaction
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the transaction")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * active or pending (optional)
   * @return status
  **/
  @ApiModelProperty(value = "active or pending (optional)")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

  /**
   * An optional timestamp for the transaction's posted date value for this transaction
   * @return postedDate
  **/
  @ApiModelProperty(required = true, value = "An optional timestamp for the transaction's posted date value for this transaction")
      @NotNull

    public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public Transaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * An optional timestamp for the transaction's posted date value for this transaction
   * @return transactionDate
  **/
  @ApiModelProperty(required = true, value = "An optional timestamp for the transaction's posted date value for this transaction")
      @NotNull

    public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.postedDate, transaction.postedDate) &&
        Objects.equals(this.transactionDate, transaction.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, status, postedDate, transactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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
