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
 * Describes the fields within the Store Customer Pay Statement.
 */
@ApiModel(description = "Describes the fields within the Store Customer Pay Statement.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class StoreCustomerPayStatementRequest   {
  @JsonProperty("label")
  private String label = "2019";

  @JsonProperty("statement")
  private Object statement = null;

  public StoreCustomerPayStatementRequest label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Statement label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Statement label")
      @NotNull

    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public StoreCustomerPayStatementRequest statement(Object statement) {
    this.statement = statement;
    return this;
  }

  /**
   * base64 encode value of pay statement.
   * @return statement
  **/
  @ApiModelProperty(required = true, value = "base64 encode value of pay statement.")
      @NotNull

    public Object getStatement() {
    return statement;
  }

  public void setStatement(Object statement) {
    this.statement = statement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreCustomerPayStatementRequest storeCustomerPayStatementRequest = (StoreCustomerPayStatementRequest) o;
    return Objects.equals(this.label, storeCustomerPayStatementRequest.label) &&
        Objects.equals(this.statement, storeCustomerPayStatementRequest.statement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, statement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCustomerPayStatementRequest {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
