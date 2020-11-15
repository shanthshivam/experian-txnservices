package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.UFReportLenderResponseInstitutionsAccounts;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of institution records, including information about the individual accounts used in this report
 */
@ApiModel(description = "A list of institution records, including information about the individual accounts used in this report")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class UFReportLenderResponseInstitutions   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = "FinBank Profiles - A";

  @JsonProperty("accounts")
  private UFReportLenderResponseInstitutionsAccounts accounts = null;

  public UFReportLenderResponseInstitutions id(BigDecimal id) {
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

  public UFReportLenderResponseInstitutions name(String name) {
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

  public UFReportLenderResponseInstitutions accounts(UFReportLenderResponseInstitutionsAccounts accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UFReportLenderResponseInstitutionsAccounts getAccounts() {
    return accounts;
  }

  public void setAccounts(UFReportLenderResponseInstitutionsAccounts accounts) {
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
    UFReportLenderResponseInstitutions ufReportLenderResponseInstitutions = (UFReportLenderResponseInstitutions) o;
    return Objects.equals(this.id, ufReportLenderResponseInstitutions.id) &&
        Objects.equals(this.name, ufReportLenderResponseInstitutions.name) &&
        Objects.equals(this.accounts, ufReportLenderResponseInstitutions.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UFReportLenderResponseInstitutions {\n");
    
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
