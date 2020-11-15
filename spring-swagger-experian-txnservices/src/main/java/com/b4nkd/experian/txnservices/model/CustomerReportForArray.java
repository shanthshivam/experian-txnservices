package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.CustomerReportForArrayConstraints;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReport;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details for a Customer Report used for multiple Reports. This contains less properties than the single Customer Report
 */
@ApiModel(description = "Details for a Customer Report used for multiple Reports. This contains less properties than the single Customer Report")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class CustomerReportForArray   {
  @JsonProperty("id")
  private String id = "j48rf6h4naw6";

  @JsonProperty("consumerId")
  private String consumerId = "cf4af042ed1e67efbd4c7383403a0bb5";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "6789";

  @JsonProperty("requesterName")
  private String requesterName = "Experian";

  /**
   * The Report type you wish to have generated for you. Can be a comma delimited list.
   */
  public enum TypeEnum {
    VOA("voa"),
    
    VOI("voi"),
    
    VOA_HISTORY("voa-history"),
    
    DCR("dcr");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = TypeEnum.VOI;

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("createdDate")
  private BigDecimal createdDate = null;

  @JsonProperty("customerId")
  private BigDecimal customerId = null;

  @JsonProperty("institutions")
  @Valid
  private List<InstitutionForSingleReport> institutions = null;

  @JsonProperty("constraints")
  private CustomerReportForArrayConstraints constraints = null;

  public CustomerReportForArray id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Report ID
   * @return id
  **/
  @ApiModelProperty(value = "Unique Report ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerReportForArray consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Unique consumer ID
   * @return consumerId
  **/
  @ApiModelProperty(value = "Unique consumer ID")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public CustomerReportForArray consumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
    return this;
  }

  /**
   * The last 4 digits of the Social Security number.
   * @return consumerSsn
  **/
  @ApiModelProperty(value = "The last 4 digits of the Social Security number.")
  
    public String getConsumerSsn() {
    return consumerSsn;
  }

  public void setConsumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
  }

  public CustomerReportForArray requesterName(String requesterName) {
    this.requesterName = requesterName;
    return this;
  }

  /**
   * Finicity account name that the report was generated under (only included when report status is \"successful\")
   * @return requesterName
  **/
  @ApiModelProperty(value = "Finicity account name that the report was generated under (only included when report status is \"successful\")")
  
    public String getRequesterName() {
    return requesterName;
  }

  public void setRequesterName(String requesterName) {
    this.requesterName = requesterName;
  }

  public CustomerReportForArray type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The Report type you wish to have generated for you. Can be a comma delimited list.
   * @return type
  **/
  @ApiModelProperty(value = "The Report type you wish to have generated for you. Can be a comma delimited list.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CustomerReportForArray status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Response status
   * @return status
  **/
  @ApiModelProperty(value = "Response status")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomerReportForArray createdDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date format of when the Report was generated
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date format of when the Report was generated")
  
    @Valid
    public BigDecimal getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
  }

  public CustomerReportForArray customerId(BigDecimal customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * set to 0
   * @return customerId
  **/
  @ApiModelProperty(value = "set to 0")
  
    @Valid
    public BigDecimal getCustomerId() {
    return customerId;
  }

  public void setCustomerId(BigDecimal customerId) {
    this.customerId = customerId;
  }

  public CustomerReportForArray institutions(List<InstitutionForSingleReport> institutions) {
    this.institutions = institutions;
    return this;
  }

  public CustomerReportForArray addInstitutionsItem(InstitutionForSingleReport institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<InstitutionForSingleReport>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

  /**
   * A list of institution records, including information about the individual accounts used in this report
   * @return institutions
  **/
  @ApiModelProperty(value = "A list of institution records, including information about the individual accounts used in this report")
      @Valid
    public List<InstitutionForSingleReport> getInstitutions() {
    return institutions;
  }

  public void setInstitutions(List<InstitutionForSingleReport> institutions) {
    this.institutions = institutions;
  }

  public CustomerReportForArray constraints(CustomerReportForArrayConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomerReportForArrayConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(CustomerReportForArrayConstraints constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerReportForArray customerReportForArray = (CustomerReportForArray) o;
    return Objects.equals(this.id, customerReportForArray.id) &&
        Objects.equals(this.consumerId, customerReportForArray.consumerId) &&
        Objects.equals(this.consumerSsn, customerReportForArray.consumerSsn) &&
        Objects.equals(this.requesterName, customerReportForArray.requesterName) &&
        Objects.equals(this.type, customerReportForArray.type) &&
        Objects.equals(this.status, customerReportForArray.status) &&
        Objects.equals(this.createdDate, customerReportForArray.createdDate) &&
        Objects.equals(this.customerId, customerReportForArray.customerId) &&
        Objects.equals(this.institutions, customerReportForArray.institutions) &&
        Objects.equals(this.constraints, customerReportForArray.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, consumerId, consumerSsn, requesterName, type, status, createdDate, customerId, institutions, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerReportForArray {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
