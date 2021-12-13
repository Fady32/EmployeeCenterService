package com.employee.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T15:49:26.825671600+02:00[Africa/Cairo]")
public class Response  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("employeeId")
  private String employeeId;

  @JsonProperty("employeeName")
  private String employeeName;

  public Response employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * employee ID
   * @return employeeId
  */
  @ApiModelProperty(value = "employee ID")

@Size(min=0,max=255) 
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Response employeeName(String employeeName) {
    this.employeeName = employeeName;
    return this;
  }

  /**
   * employee name
   * @return employeeName
  */
  @ApiModelProperty(value = "employee name")

@Size(min=0,max=255) 
  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.employeeId, response.employeeId) &&
        Objects.equals(this.employeeName, response.employeeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

