package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.b4nkd.experian.txnservices.model.ReportListPropertyItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reports for Consumer
 */
@ApiModel(description = "Reports for Consumer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ReportList   {
  @JsonProperty("reports")
  @Valid
  private List<ReportListPropertyItems> reports = null;

  public ReportList reports(List<ReportListPropertyItems> reports) {
    this.reports = reports;
    return this;
  }

  public ReportList addReportsItem(ReportListPropertyItems reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<ReportListPropertyItems>();
    }
    this.reports.add(reportsItem);
    return this;
  }

  /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ReportListPropertyItems> getReports() {
    return reports;
  }

  public void setReports(List<ReportListPropertyItems> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportList reportList = (ReportList) o;
    return Objects.equals(this.reports, reportList.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportList {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
