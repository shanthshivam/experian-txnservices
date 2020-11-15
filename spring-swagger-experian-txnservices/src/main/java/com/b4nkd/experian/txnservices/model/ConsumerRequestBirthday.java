package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the birthday of the created Consumer
 */
@ApiModel(description = "Defines the birthday of the created Consumer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ConsumerRequestBirthday   {
  @JsonProperty("year")
  private String year = "1994";

  @JsonProperty("month")
  private String month = "03";

  @JsonProperty("dayOfMonth")
  private String dayOfMonth = "16";

  public ConsumerRequestBirthday year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Birthday Year of Consumer
   * @return year
  **/
  @ApiModelProperty(value = "Birthday Year of Consumer")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public ConsumerRequestBirthday month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Birthday Month of Consumer
   * @return month
  **/
  @ApiModelProperty(value = "Birthday Month of Consumer")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public ConsumerRequestBirthday dayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * Birthday Day of consumer
   * @return dayOfMonth
  **/
  @ApiModelProperty(value = "Birthday Day of consumer")
  
    public String getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRequestBirthday consumerRequestBirthday = (ConsumerRequestBirthday) o;
    return Objects.equals(this.year, consumerRequestBirthday.year) &&
        Objects.equals(this.month, consumerRequestBirthday.month) &&
        Objects.equals(this.dayOfMonth, consumerRequestBirthday.dayOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, dayOfMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRequestBirthday {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
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
