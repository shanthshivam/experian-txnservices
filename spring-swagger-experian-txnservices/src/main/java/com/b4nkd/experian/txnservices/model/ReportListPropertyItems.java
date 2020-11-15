package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
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
 * ReportListPropertyItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ReportListPropertyItems   {
  @JsonProperty("id")
  private String id = "e8a9c7e185ecd";

  @JsonProperty("consumerId")
  private String consumerId = "0h7h3r301md83";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "1111";

  @JsonProperty("requesterName")
  private String requesterName = "Experian";

  /**
   * voa or voi
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
  private TypeEnum type = TypeEnum.VOA;

  @JsonProperty("status")
  private String status = "success";

  @JsonProperty("createdDate")
  private String createdDate = "1494646441";

  @JsonProperty("customerId")
  private BigDecimal customerId = null;

  @JsonProperty("institutions")
  @Valid
  private List<InstitutionForSingleReport> institutions = null;

  public ReportListPropertyItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the report (UUID with max length 32 characters)
   * @return id
  **/
  @ApiModelProperty(value = "ID of the report (UUID with max length 32 characters)")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportListPropertyItems consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * ID of the consumer (UUID with max length 32 characters)
   * @return consumerId
  **/
  @ApiModelProperty(value = "ID of the consumer (UUID with max length 32 characters)")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ReportListPropertyItems consumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
    return this;
  }

  /**
   * Last 4 digits of the report consumer's Social Security number
   * @return consumerSsn
  **/
  @ApiModelProperty(value = "Last 4 digits of the report consumer's Social Security number")
  
    public String getConsumerSsn() {
    return consumerSsn;
  }

  public void setConsumerSsn(String consumerSsn) {
    this.consumerSsn = consumerSsn;
  }

  public ReportListPropertyItems requesterName(String requesterName) {
    this.requesterName = requesterName;
    return this;
  }

  /**
   * Name of the company requesting data
   * @return requesterName
  **/
  @ApiModelProperty(value = "Name of the company requesting data")
  
    public String getRequesterName() {
    return requesterName;
  }

  public void setRequesterName(String requesterName) {
    this.requesterName = requesterName;
  }

  public ReportListPropertyItems type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * voa or voi
   * @return type
  **/
  @ApiModelProperty(value = "voa or voi")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ReportListPropertyItems status(String status) {
    this.status = status;
    return this;
  }

  /**
   * inProgress or success or failure
   * @return status
  **/
  @ApiModelProperty(value = "inProgress or success or failure")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReportListPropertyItems createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date the report was generated
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the report was generated")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ReportListPropertyItems customerId(BigDecimal customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID of Customer to fetch
   * @return customerId
  **/
  @ApiModelProperty(value = "ID of Customer to fetch")
  
    @Valid
    public BigDecimal getCustomerId() {
    return customerId;
  }

  public void setCustomerId(BigDecimal customerId) {
    this.customerId = customerId;
  }

  public ReportListPropertyItems institutions(List<InstitutionForSingleReport> institutions) {
    this.institutions = institutions;
    return this;
  }

  public ReportListPropertyItems addInstitutionsItem(InstitutionForSingleReport institutionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportListPropertyItems reportListPropertyItems = (ReportListPropertyItems) o;
    return Objects.equals(this.id, reportListPropertyItems.id) &&
        Objects.equals(this.consumerId, reportListPropertyItems.consumerId) &&
        Objects.equals(this.consumerSsn, reportListPropertyItems.consumerSsn) &&
        Objects.equals(this.requesterName, reportListPropertyItems.requesterName) &&
        Objects.equals(this.type, reportListPropertyItems.type) &&
        Objects.equals(this.status, reportListPropertyItems.status) &&
        Objects.equals(this.createdDate, reportListPropertyItems.createdDate) &&
        Objects.equals(this.customerId, reportListPropertyItems.customerId) &&
        Objects.equals(this.institutions, reportListPropertyItems.institutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, consumerId, consumerSsn, requesterName, type, status, createdDate, customerId, institutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportListPropertyItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
