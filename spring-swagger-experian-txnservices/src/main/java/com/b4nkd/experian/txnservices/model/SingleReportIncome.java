package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.IncomeStreamForSingleReport;
import com.b4nkd.experian.txnservices.model.SingleReportIncomeIncomeEstimate;
import com.b4nkd.experian.txnservices.model.SingleReportIncomeNetMonthlyProps;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Income Record. This will only be filled in the report type is VOI
 */
@ApiModel(description = "Income Record. This will only be filled in the report type is VOI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class SingleReportIncome   {
  /**
   * Level of confidence of income stream (low, moderate, high)
   */
  public enum ConfidenceTypeEnum {
    HIGH("HIGH"),
    
    MODERATE("MODERATE"),
    
    LOW("LOW");

    private String value;

    ConfidenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConfidenceTypeEnum fromValue(String text) {
      for (ConfidenceTypeEnum b : ConfidenceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("confidenceType")
  private ConfidenceTypeEnum confidenceType = ConfidenceTypeEnum.HIGH;

  @JsonProperty("netMonthly")
  @Valid
  private List<SingleReportIncomeNetMonthlyProps> netMonthly = null;

  @JsonProperty("incomeEstimate")
  private SingleReportIncomeIncomeEstimate incomeEstimate = null;

  @JsonProperty("incomeStreams")
  @Valid
  private List<IncomeStreamForSingleReport> incomeStreams = null;

  public SingleReportIncome confidenceType(ConfidenceTypeEnum confidenceType) {
    this.confidenceType = confidenceType;
    return this;
  }

  /**
   * Level of confidence of income stream (low, moderate, high)
   * @return confidenceType
  **/
  @ApiModelProperty(value = "Level of confidence of income stream (low, moderate, high)")
  
    public ConfidenceTypeEnum getConfidenceType() {
    return confidenceType;
  }

  public void setConfidenceType(ConfidenceTypeEnum confidenceType) {
    this.confidenceType = confidenceType;
  }

  public SingleReportIncome netMonthly(List<SingleReportIncomeNetMonthlyProps> netMonthly) {
    this.netMonthly = netMonthly;
    return this;
  }

  public SingleReportIncome addNetMonthlyItem(SingleReportIncomeNetMonthlyProps netMonthlyItem) {
    if (this.netMonthly == null) {
      this.netMonthly = new ArrayList<SingleReportIncomeNetMonthlyProps>();
    }
    this.netMonthly.add(netMonthlyItem);
    return this;
  }

  /**
   * netMonthly records in an array
   * @return netMonthly
  **/
  @ApiModelProperty(value = "netMonthly records in an array")
      @Valid
    public List<SingleReportIncomeNetMonthlyProps> getNetMonthly() {
    return netMonthly;
  }

  public void setNetMonthly(List<SingleReportIncomeNetMonthlyProps> netMonthly) {
    this.netMonthly = netMonthly;
  }

  public SingleReportIncome incomeEstimate(SingleReportIncomeIncomeEstimate incomeEstimate) {
    this.incomeEstimate = incomeEstimate;
    return this;
  }

  /**
   * Get incomeEstimate
   * @return incomeEstimate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SingleReportIncomeIncomeEstimate getIncomeEstimate() {
    return incomeEstimate;
  }

  public void setIncomeEstimate(SingleReportIncomeIncomeEstimate incomeEstimate) {
    this.incomeEstimate = incomeEstimate;
  }

  public SingleReportIncome incomeStreams(List<IncomeStreamForSingleReport> incomeStreams) {
    this.incomeStreams = incomeStreams;
    return this;
  }

  public SingleReportIncome addIncomeStreamsItem(IncomeStreamForSingleReport incomeStreamsItem) {
    if (this.incomeStreams == null) {
      this.incomeStreams = new ArrayList<IncomeStreamForSingleReport>();
    }
    this.incomeStreams.add(incomeStreamsItem);
    return this;
  }

  /**
   * A list of income stream records
   * @return incomeStreams
  **/
  @ApiModelProperty(value = "A list of income stream records")
      @Valid
    public List<IncomeStreamForSingleReport> getIncomeStreams() {
    return incomeStreams;
  }

  public void setIncomeStreams(List<IncomeStreamForSingleReport> incomeStreams) {
    this.incomeStreams = incomeStreams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleReportIncome singleReportIncome = (SingleReportIncome) o;
    return Objects.equals(this.confidenceType, singleReportIncome.confidenceType) &&
        Objects.equals(this.netMonthly, singleReportIncome.netMonthly) &&
        Objects.equals(this.incomeEstimate, singleReportIncome.incomeEstimate) &&
        Objects.equals(this.incomeStreams, singleReportIncome.incomeStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceType, netMonthly, incomeEstimate, incomeStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleReportIncome {\n");
    
    sb.append("    confidenceType: ").append(toIndentedString(confidenceType)).append("\n");
    sb.append("    netMonthly: ").append(toIndentedString(netMonthly)).append("\n");
    sb.append("    incomeEstimate: ").append(toIndentedString(incomeEstimate)).append("\n");
    sb.append("    incomeStreams: ").append(toIndentedString(incomeStreams)).append("\n");
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
