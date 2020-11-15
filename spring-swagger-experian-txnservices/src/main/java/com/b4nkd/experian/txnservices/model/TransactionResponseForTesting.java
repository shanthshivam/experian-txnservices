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
 * Details for the transaction response
 */
@ApiModel(description = "Details for the transaction response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class TransactionResponseForTesting   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public TransactionResponseForTesting id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the new transaction record
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the new transaction record")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionResponseForTesting createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * A timestamp of when the transaction was added
   * @return createdDate
  **/
  @ApiModelProperty(value = "A timestamp of when the transaction was added")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponseForTesting transactionResponseForTesting = (TransactionResponseForTesting) o;
    return Objects.equals(this.id, transactionResponseForTesting.id) &&
        Objects.equals(this.createdDate, transactionResponseForTesting.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponseForTesting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
