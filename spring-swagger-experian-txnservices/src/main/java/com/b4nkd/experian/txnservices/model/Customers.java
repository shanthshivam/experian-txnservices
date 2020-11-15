package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.Customer;
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
 * Returns all customers
 */
@ApiModel(description = "Returns all customers")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Customers   {
  @JsonProperty("found")
  private BigDecimal found = null;

  @JsonProperty("displaying")
  private BigDecimal displaying = null;

  @JsonProperty("moreAvailable")
  private Boolean moreAvailable = true;

  @JsonProperty("customers")
  @Valid
  private List<Customer> customers = null;

  public Customers found(BigDecimal found) {
    this.found = found;
    return this;
  }

  /**
   * Total number of records matching search criteria
   * @return found
  **/
  @ApiModelProperty(value = "Total number of records matching search criteria")
  
    @Valid
    public BigDecimal getFound() {
    return found;
  }

  public void setFound(BigDecimal found) {
    this.found = found;
  }

  public Customers displaying(BigDecimal displaying) {
    this.displaying = displaying;
    return this;
  }

  /**
   * Number of records in this response
   * @return displaying
  **/
  @ApiModelProperty(value = "Number of records in this response")
  
    @Valid
    public BigDecimal getDisplaying() {
    return displaying;
  }

  public void setDisplaying(BigDecimal displaying) {
    this.displaying = displaying;
  }

  public Customers moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

  /**
   * true if this response does not contain the last record in the result set
   * @return moreAvailable
  **/
  @ApiModelProperty(value = "true if this response does not contain the last record in the result set")
  
    public Boolean isMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  public Customers customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  public Customers addCustomersItem(Customer customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<Customer>();
    }
    this.customers.add(customersItem);
    return this;
  }

  /**
   * An array containing all the Customer Objects which includes id, username, type, createdDate
   * @return customers
  **/
  @ApiModelProperty(value = "An array containing all the Customer Objects which includes id, username, type, createdDate")
      @Valid
    public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customers customers = (Customers) o;
    return Objects.equals(this.found, customers.found) &&
        Objects.equals(this.displaying, customers.displaying) &&
        Objects.equals(this.moreAvailable, customers.moreAvailable) &&
        Objects.equals(this.customers, customers.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, displaying, moreAvailable, customers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customers {\n");
    
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    displaying: ").append(toIndentedString(displaying)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
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
