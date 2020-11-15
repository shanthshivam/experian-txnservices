package com.b4nkd.experian.txnservices.model;

import java.util.Objects;
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
 * Describes the fields within the Specific Characteristic
 */
@ApiModel(description = "Describes the fields within the Specific Characteristic")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")


public class Characteristics   {
  @JsonProperty("name")
  private String name = "avgDailyBalanceOver1Month";

  @JsonProperty("access")
  @Valid
  private List<String> access = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  public Characteristics name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Describes the type of Characteristic
   * @return name
  **/
  @ApiModelProperty(value = "Describes the type of Characteristic")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Characteristics access(List<String> access) {
    this.access = access;
    return this;
  }

  public Characteristics addAccessItem(String accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<String>();
    }
    this.access.add(accessItem);
    return this;
  }

  /**
   * Defines which of the 3 possible Report types (Model, Lender, or Consumer) are included
   * @return access
  **/
  @ApiModelProperty(value = "Defines which of the 3 possible Report types (Model, Lender, or Consumer) are included")
  
    public List<String> getAccess() {
    return access;
  }

  public void setAccess(List<String> access) {
    this.access = access;
  }

  public Characteristics value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Defines the quantity of the specified Characteristic field
   * @return value
  **/
  @ApiModelProperty(value = "Defines the quantity of the specified Characteristic field")
  
    @Valid
    public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characteristics characteristics = (Characteristics) o;
    return Objects.equals(this.name, characteristics.name) &&
        Objects.equals(this.access, characteristics.access) &&
        Objects.equals(this.value, characteristics.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, access, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Characteristics {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
