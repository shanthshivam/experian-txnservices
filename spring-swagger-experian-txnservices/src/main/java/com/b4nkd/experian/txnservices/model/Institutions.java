package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.SingleInstitution;
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
 * Returns all institutions
 */
@ApiModel(description = "Returns all institutions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Institutions   {
  @JsonProperty("requestedDate")
  private BigDecimal requestedDate = null;

  @JsonProperty("institutions")
  @Valid
  private List<SingleInstitution> institutions = null;

  public Institutions requestedDate(BigDecimal requestedDate) {
    this.requestedDate = requestedDate;
    return this;
  }

  /**
   * Date of the request
   * @return requestedDate
  **/
  @ApiModelProperty(value = "Date of the request")
  
    @Valid
    public BigDecimal getRequestedDate() {
    return requestedDate;
  }

  public void setRequestedDate(BigDecimal requestedDate) {
    this.requestedDate = requestedDate;
  }

  public Institutions institutions(List<SingleInstitution> institutions) {
    this.institutions = institutions;
    return this;
  }

  public Institutions addInstitutionsItem(SingleInstitution institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<SingleInstitution>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

  /**
   * An array containing all the Customer Objects which includes id, username, type, createdDate
   * @return institutions
  **/
  @ApiModelProperty(value = "An array containing all the Customer Objects which includes id, username, type, createdDate")
      @Valid
    public List<SingleInstitution> getInstitutions() {
    return institutions;
  }

  public void setInstitutions(List<SingleInstitution> institutions) {
    this.institutions = institutions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institutions institutions = (Institutions) o;
    return Objects.equals(this.requestedDate, institutions.requestedDate) &&
        Objects.equals(this.institutions, institutions.institutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedDate, institutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institutions {\n");
    
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
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
