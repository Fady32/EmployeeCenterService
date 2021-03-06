package com.employee.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;b&gt;Problem Detail&lt;/b&gt; as a way to carry machine-readable details of errors in a HTTP response to avoid the need to define new error response formats for HTTP APIs &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7807\&quot;&gt;RFC 7807&lt;/a&gt; 
 */
@ApiModel(description = "<b>Problem Detail</b> as a way to carry machine-readable details of errors in a HTTP response to avoid the need to define new error response formats for HTTP APIs <a href=\"https://tools.ietf.org/html/rfc7807\">RFC 7807</a> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T15:49:26.825671600+02:00[Africa/Cairo]")
public class Problem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private URI type = URI.create("about:blank");

  @JsonProperty("title")
  private JsonNullable<String> title = JsonNullable.undefined();

  @JsonProperty("status")
  private JsonNullable<Integer> status = JsonNullable.undefined();

  @JsonProperty("detail")
  private JsonNullable<String> detail = JsonNullable.undefined();

  @JsonProperty("instance")
  private URI instance;

  public Problem type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide human-readable documentation for the problem type (e.g., using HTML). 
   * @return type
  */
  @ApiModelProperty(example = "", value = "An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide human-readable documentation for the problem type (e.g., using HTML). ")

  @Valid

  public URI getType() {
    return type;
  }

  public void setType(URI type) {
    this.type = type;
  }

  public Problem title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * A short, summary of the problem type. Written in English and readable for engineers (usually not suited for non-technical stakeholders and not localized); example: Service Unavailable 
   * @return title
  */
  @ApiModelProperty(example = "Service Unavailable.", value = "A short, summary of the problem type. Written in English and readable for engineers (usually not suited for non-technical stakeholders and not localized); example: Service Unavailable ")


  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public Problem status(Integer status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * The HTTP status code generated by the origin server for this occurrence of the problem.
   * minimum: 100
   * maximum: 600
   * @return status
  */
  @ApiModelProperty(example = "500", value = "The HTTP status code generated by the origin server for this occurrence of the problem.")

@Min(100) @Max(600) 
  public JsonNullable<Integer> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<Integer> status) {
    this.status = status;
  }

  public Problem detail(String detail) {
    this.detail = JsonNullable.of(detail);
    return this;
  }

  /**
   * A human readable explanation specific to this occurrence of the problem.
   * @return detail
  */
  @ApiModelProperty(example = "API call timed out.", value = "A human readable explanation specific to this occurrence of the problem.")


  public JsonNullable<String> getDetail() {
    return detail;
  }

  public void setDetail(JsonNullable<String> detail) {
    this.detail = detail;
  }

  public Problem instance(URI instance) {
    this.instance = instance;
    return this;
  }

  /**
   * An absolute URI that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced. 
   * @return instance
  */
  @ApiModelProperty(value = "An absolute URI that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced. ")

  @Valid

  public URI getInstance() {
    return instance;
  }

  public void setInstance(URI instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

