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
 * The consumer&#x27;s birth date
 */
@ApiModel(description = "The consumer's birth date")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class ConsumerBirthday   {
  @JsonProperty("year")
  private String year = "1994";

  @JsonProperty("month")
  private String month = "01";

  @JsonProperty("dayOfMonth")
  private String dayOfMonth = "16";

  public ConsumerBirthday year(String year) {
    this.year = year;
    return this;
  }

  /**
   * The birthday's 4-digit year
   * @return year
  **/
  @ApiModelProperty(value = "The birthday's 4-digit year")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public ConsumerBirthday month(String month) {
    this.month = month;
    return this;
  }

  /**
   * The birthday's 2-digit month (01 is January)
   * @return month
  **/
  @ApiModelProperty(value = "The birthday's 2-digit month (01 is January)")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public ConsumerBirthday dayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * The birthday's 2-digit day-of-month
   * @return dayOfMonth
  **/
  @ApiModelProperty(value = "The birthday's 2-digit day-of-month")
  
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
    ConsumerBirthday consumerBirthday = (ConsumerBirthday) o;
    return Objects.equals(this.year, consumerBirthday.year) &&
        Objects.equals(this.month, consumerBirthday.month) &&
        Objects.equals(this.dayOfMonth, consumerBirthday.dayOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, dayOfMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerBirthday {\n");
    
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
