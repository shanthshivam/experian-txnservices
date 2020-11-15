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
 * Single Institution Object
 */
@ApiModel(description = "Single Institution Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SingleInstitution   {
  @JsonProperty("name")
  private String name = "Chase";

  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("trans_agg")
  private BigDecimal transAgg = null;

  @JsonProperty("voa")
  private BigDecimal voa = null;

  @JsonProperty("voi")
  private BigDecimal voi = null;

  @JsonProperty("state_agg")
  private BigDecimal stateAgg = null;

  @JsonProperty("ach")
  private BigDecimal ach = null;

  @JsonProperty("aha")
  private BigDecimal aha = null;

  public SingleInstitution name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the institution
   * @return name
  **/
  @ApiModelProperty(value = "Name of the institution")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SingleInstitution id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the Institution
   * @return id
  **/
  @ApiModelProperty(value = "ID of the Institution")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public SingleInstitution transAgg(BigDecimal transAgg) {
    this.transAgg = transAgg;
    return this;
  }

  /**
   * Count of standard Transaction Aggregation
   * @return transAgg
  **/
  @ApiModelProperty(value = "Count of standard Transaction Aggregation")
  
    @Valid
    public BigDecimal getTransAgg() {
    return transAgg;
  }

  public void setTransAgg(BigDecimal transAgg) {
    this.transAgg = transAgg;
  }

  public SingleInstitution voa(BigDecimal voa) {
    this.voa = voa;
    return this;
  }

  /**
   * Count of Verification of Asset
   * @return voa
  **/
  @ApiModelProperty(value = "Count of Verification of Asset")
  
    @Valid
    public BigDecimal getVoa() {
    return voa;
  }

  public void setVoa(BigDecimal voa) {
    this.voa = voa;
  }

  public SingleInstitution voi(BigDecimal voi) {
    this.voi = voi;
    return this;
  }

  /**
   * Count of Verification of Income
   * @return voi
  **/
  @ApiModelProperty(value = "Count of Verification of Income")
  
    @Valid
    public BigDecimal getVoi() {
    return voi;
  }

  public void setVoi(BigDecimal voi) {
    this.voi = voi;
  }

  public SingleInstitution stateAgg(BigDecimal stateAgg) {
    this.stateAgg = stateAgg;
    return this;
  }

  /**
   * Count of PDF Statements from financial institution such as bank statement
   * @return stateAgg
  **/
  @ApiModelProperty(value = "Count of PDF Statements from financial institution such as bank statement")
  
    @Valid
    public BigDecimal getStateAgg() {
    return stateAgg;
  }

  public void setStateAgg(BigDecimal stateAgg) {
    this.stateAgg = stateAgg;
  }

  public SingleInstitution ach(BigDecimal ach) {
    this.ach = ach;
    return this;
  }

  /**
   * Count of Account Owner Verification. Contains full account and routing number
   * @return ach
  **/
  @ApiModelProperty(value = "Count of Account Owner Verification. Contains full account and routing number")
  
    @Valid
    public BigDecimal getAch() {
    return ach;
  }

  public void setAch(BigDecimal ach) {
    this.ach = ach;
  }

  public SingleInstitution aha(BigDecimal aha) {
    this.aha = aha;
    return this;
  }

  /**
   * Count of Account History Aggregation pulled from 24 months of transactions data.
   * @return aha
  **/
  @ApiModelProperty(value = "Count of Account History Aggregation pulled from 24 months of transactions data.")
  
    @Valid
    public BigDecimal getAha() {
    return aha;
  }

  public void setAha(BigDecimal aha) {
    this.aha = aha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleInstitution singleInstitution = (SingleInstitution) o;
    return Objects.equals(this.name, singleInstitution.name) &&
        Objects.equals(this.id, singleInstitution.id) &&
        Objects.equals(this.transAgg, singleInstitution.transAgg) &&
        Objects.equals(this.voa, singleInstitution.voa) &&
        Objects.equals(this.voi, singleInstitution.voi) &&
        Objects.equals(this.stateAgg, singleInstitution.stateAgg) &&
        Objects.equals(this.ach, singleInstitution.ach) &&
        Objects.equals(this.aha, singleInstitution.aha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, transAgg, voa, voi, stateAgg, ach, aha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleInstitution {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transAgg: ").append(toIndentedString(transAgg)).append("\n");
    sb.append("    voa: ").append(toIndentedString(voa)).append("\n");
    sb.append("    voi: ").append(toIndentedString(voi)).append("\n");
    sb.append("    stateAgg: ").append(toIndentedString(stateAgg)).append("\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    aha: ").append(toIndentedString(aha)).append("\n");
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
