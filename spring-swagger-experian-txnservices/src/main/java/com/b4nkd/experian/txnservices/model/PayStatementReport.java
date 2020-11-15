package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
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
 * The object that contains the information required for the Pay Statement Extraction Report to generate.
 */
@ApiModel(description = "The object that contains the information required for the Pay Statement Extraction Report to generate.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class PayStatementReport   {
  @JsonProperty("assetIds")
  @Valid
  private List<String> assetIds = null;

  public PayStatementReport assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public PayStatementReport addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<String>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

  /**
   * The list of pay statement asset IDs.
   * @return assetIds
  **/
  @ApiModelProperty(value = "The list of pay statement asset IDs.")
  
    public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayStatementReport payStatementReport = (PayStatementReport) o;
    return Objects.equals(this.assetIds, payStatementReport.assetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStatementReport {\n");
    
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
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
