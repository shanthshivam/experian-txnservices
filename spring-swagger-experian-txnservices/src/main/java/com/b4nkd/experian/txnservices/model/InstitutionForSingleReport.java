package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReportAccountsProps;
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
 * Single institution which will be used in an array as part of the Single Customer Report
 */
@ApiModel(description = "Single institution which will be used in an array as part of the Single Customer Report")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class InstitutionForSingleReport   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = "FinBank Profiles - A";

  @JsonProperty("accounts")
  @Valid
  private List<InstitutionForSingleReportAccountsProps> accounts = null;

  public InstitutionForSingleReport id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Finicity institution ID
   * @return id
  **/
  @ApiModelProperty(value = "Finicity institution ID")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public InstitutionForSingleReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Finicity institution name
   * @return name
  **/
  @ApiModelProperty(value = "Finicity institution name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstitutionForSingleReport accounts(List<InstitutionForSingleReportAccountsProps> accounts) {
    this.accounts = accounts;
    return this;
  }

  public InstitutionForSingleReport addAccountsItem(InstitutionForSingleReportAccountsProps accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<InstitutionForSingleReportAccountsProps>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * A list of account records
   * @return accounts
  **/
  @ApiModelProperty(value = "A list of account records")
      @Valid
    public List<InstitutionForSingleReportAccountsProps> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<InstitutionForSingleReportAccountsProps> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionForSingleReport institutionForSingleReport = (InstitutionForSingleReport) o;
    return Objects.equals(this.id, institutionForSingleReport.id) &&
        Objects.equals(this.name, institutionForSingleReport.name) &&
        Objects.equals(this.accounts, institutionForSingleReport.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionForSingleReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
