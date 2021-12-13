package com.employee.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The SMH message request body.
 */
@ApiModel(description = "The SMH message request body.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T15:49:26.825671600+02:00[Africa/Cairo]")
public class EmployeeRequestBody  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private String age;

  @JsonProperty("location")
  private String location;

  /**
   * ADDED
   */
  public enum StatusEnum {
    ADDED("ADDED"),
    
    IN_CHECK("IN_CHECK"),
    
    APPROVED("APPROVED"),
    
    ACTIVE("ACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.ADDED;

  public EmployeeRequestBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * employee name
   * @return name
  */
  @ApiModelProperty(example = "Ahmed Ibrahim", required = true, value = "employee name")
  @NotNull

@Size(min=0,max=255) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeeRequestBody age(String age) {
    this.age = age;
    return this;
  }

  /**
   * employee age
   * @return age
  */
  @ApiModelProperty(example = "30", required = true, value = "employee age")
  @NotNull

@Size(min=0,max=255) 
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public EmployeeRequestBody location(String location) {
    this.location = location;
    return this;
  }

  /**
   * employee location
   * @return location
  */
  @ApiModelProperty(example = "Cairo / Egypt", required = true, value = "employee location")
  @NotNull

@Size(min=0,max=255) 
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public EmployeeRequestBody status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * ADDED
   * @return status
  */
  @ApiModelProperty(required = true, value = "ADDED")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRequestBody employeeRequestBody = (EmployeeRequestBody) o;
    return Objects.equals(this.name, employeeRequestBody.name) &&
        Objects.equals(this.age, employeeRequestBody.age) &&
        Objects.equals(this.location, employeeRequestBody.location) &&
        Objects.equals(this.status, employeeRequestBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, location, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRequestBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

