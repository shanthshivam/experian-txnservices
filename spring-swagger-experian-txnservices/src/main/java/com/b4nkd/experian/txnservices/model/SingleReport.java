package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.InstitutionForSingleReport;
import com.b4nkd.experian.txnservices.model.SingleReportAssets;
import com.b4nkd.experian.txnservices.model.SingleReportIncome;
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
 * Full Details for a specific Customer report given the customerID
 */
@ApiModel(description = "Full Details for a specific Customer report given the customerID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SingleReport   {
  @JsonProperty("id")
  private String id = "j48rf6h4naw6";

  @JsonProperty("title")
  private String title = "Finicity Verification of Income";

  @JsonProperty("requestId")
  private String requestId = "0a1b2c3d3";

  @JsonProperty("consumerId")
  private String consumerId = "cf4af042ed1e67efbd4c7383403a0bb5";

  @JsonProperty("consumerSsn")
  private String consumerSsn = "6789";

  @JsonProperty("requesterName")
  private String requesterName = "Experian";

  /**
   * The report type you wish to have generated for you. Can be a comma delimited list.
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

  @JsonProperty("startDate")
  private BigDecimal startDate = null;

  @JsonProperty("endDate")
  private BigDecimal endDate = null;

  @JsonProperty("days")
  private BigDecimal days = null;

  @JsonProperty("seasoned")
  private Boolean seasoned = true;

  @JsonProperty("institutions")
  @Valid
  private List<InstitutionForSingleReport> institutions = null;

  @JsonProperty("income")
  private SingleReportIncome income = null;

  @JsonProperty("assets")
  private SingleReportAssets assets = null;

  @JsonProperty("consolidatedAvailableBalance")
  private BigDecimal consolidatedAvailableBalance = null;

  public SingleReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Finicity report ID (max length 32 characters)
   * @return id
  **/
  @ApiModelProperty(value = "The Finicity report ID (max length 32 characters)")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SingleReport title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Finicity Verification of Assets or Finicity Verification of Income
   * @return title
  **/
  @ApiModelProperty(value = "Finicity Verification of Assets or Finicity Verification of Income")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SingleReport requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * unique requestId for this specific call request
   * @return requestId
  **/
  @ApiModelProperty(value = "unique requestId for this specific call request")
  
    public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SingleReport consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Finicity report consumer ID (max length 32 characters)
   * @return consumerId
  **/
  @ApiModelProperty(value = "Finicity report consumer ID (max length 32 characters)")
  
    public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public SingleReport consumerSsn(String consumerSsn) {
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

  public SingleReport requesterName(String requesterName) {
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

  public SingleReport type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The report type you wish to have generated for you. Can be a comma delimited list.
   * @return type
  **/
  @ApiModelProperty(value = "The report type you wish to have generated for you. Can be a comma delimited list.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SingleReport status(String status) {
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

  public SingleReport createdDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date format of when the report was generated
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date format of when the report was generated")
  
    @Valid
    public BigDecimal getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(BigDecimal createdDate) {
    this.createdDate = createdDate;
  }

  public SingleReport startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The postedDate of the earliest transaction analyzed for this report
   * @return startDate
  **/
  @ApiModelProperty(value = "The postedDate of the earliest transaction analyzed for this report")
  
    @Valid
    public BigDecimal getStartDate() {
    return startDate;
  }

  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  public SingleReport endDate(BigDecimal endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The postedDate of the latest transaction analyzed for this report
   * @return endDate
  **/
  @ApiModelProperty(value = "The postedDate of the latest transaction analyzed for this report")
  
    @Valid
    public BigDecimal getEndDate() {
    return endDate;
  }

  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

  public SingleReport days(BigDecimal days) {
    this.days = days;
    return this;
  }

  /**
   * Number of days covered by the report
   * @return days
  **/
  @ApiModelProperty(value = "Number of days covered by the report")
  
    @Valid
    public BigDecimal getDays() {
    return days;
  }

  public void setDays(BigDecimal days) {
    this.days = days;
  }

  public SingleReport seasoned(Boolean seasoned) {
    this.seasoned = seasoned;
    return this;
  }

  /**
   * true if the report covers more than 180 days
   * @return seasoned
  **/
  @ApiModelProperty(value = "true if the report covers more than 180 days")
  
    public Boolean isSeasoned() {
    return seasoned;
  }

  public void setSeasoned(Boolean seasoned) {
    this.seasoned = seasoned;
  }

  public SingleReport institutions(List<InstitutionForSingleReport> institutions) {
    this.institutions = institutions;
    return this;
  }

  public SingleReport addInstitutionsItem(InstitutionForSingleReport institutionsItem) {
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

  public SingleReport income(SingleReportIncome income) {
    this.income = income;
    return this;
  }

  /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SingleReportIncome getIncome() {
    return income;
  }

  public void setIncome(SingleReportIncome income) {
    this.income = income;
  }

  public SingleReport assets(SingleReportAssets assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SingleReportAssets getAssets() {
    return assets;
  }

  public void setAssets(SingleReportAssets assets) {
    this.assets = assets;
  }

  public SingleReport consolidatedAvailableBalance(BigDecimal consolidatedAvailableBalance) {
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
    return this;
  }

  /**
   * This will only be available if the report type is VOA
   * @return consolidatedAvailableBalance
  **/
  @ApiModelProperty(value = "This will only be available if the report type is VOA")
  
    @Valid
    public BigDecimal getConsolidatedAvailableBalance() {
    return consolidatedAvailableBalance;
  }

  public void setConsolidatedAvailableBalance(BigDecimal consolidatedAvailableBalance) {
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleReport singleReport = (SingleReport) o;
    return Objects.equals(this.id, singleReport.id) &&
        Objects.equals(this.title, singleReport.title) &&
        Objects.equals(this.requestId, singleReport.requestId) &&
        Objects.equals(this.consumerId, singleReport.consumerId) &&
        Objects.equals(this.consumerSsn, singleReport.consumerSsn) &&
        Objects.equals(this.requesterName, singleReport.requesterName) &&
        Objects.equals(this.type, singleReport.type) &&
        Objects.equals(this.status, singleReport.status) &&
        Objects.equals(this.createdDate, singleReport.createdDate) &&
        Objects.equals(this.startDate, singleReport.startDate) &&
        Objects.equals(this.endDate, singleReport.endDate) &&
        Objects.equals(this.days, singleReport.days) &&
        Objects.equals(this.seasoned, singleReport.seasoned) &&
        Objects.equals(this.institutions, singleReport.institutions) &&
        Objects.equals(this.income, singleReport.income) &&
        Objects.equals(this.assets, singleReport.assets) &&
        Objects.equals(this.consolidatedAvailableBalance, singleReport.consolidatedAvailableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, requestId, consumerId, consumerSsn, requesterName, type, status, createdDate, startDate, endDate, days, seasoned, institutions, income, assets, consolidatedAvailableBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seasoned: ").append(toIndentedString(seasoned)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    consolidatedAvailableBalance: ").append(toIndentedString(consolidatedAvailableBalance)).append("\n");
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
