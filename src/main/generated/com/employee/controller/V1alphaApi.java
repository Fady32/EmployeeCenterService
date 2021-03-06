/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.employee.controller;

import com.employee.model.Employee;
import com.employee.model.EmployeeRequestBody;
import com.employee.model.Problem;
import com.employee.model.Response;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T15:49:26.825671600+02:00[Africa/Cairo]")
@Validated
@Api(value = "v1alpha", description = "the v1alpha API")
public interface V1alphaApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v1alpha/getAllEmployees : get employees informations
     * get employees informations
     *
     * @return Respresentation of employees (status code 200)
     *         or Bad Request (status code 400)
     *         or Un Authorized Request (status code 401)
     *         or Forbidden Request (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "get employees informations", nickname = "getEmployees", notes = "get employees informations", response = Employee.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={ "Get all employees", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respresentation of employees", response = Employee.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Problem.class),
        @ApiResponse(code = 401, message = "Un Authorized Request", response = Problem.class),
        @ApiResponse(code = 403, message = "Forbidden Request", response = Problem.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Problem.class) })
    @GetMapping(
        value = "/v1alpha/getAllEmployees",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Employee>> getEmployees() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Ahmed Ibrahim\", \"location\" : \"Cairo / Egypt\", \"id\" : 10, \"age\" : \"30\", \"status\" : \"ADDED\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /v1alpha/submitEmployee : add new employee
     * add new employee
     *
     * @param employeeRequestBody The Employee details request body. (required)
     * @return ok (status code 200)
     *         or Bad Request (status code 400)
     *         or Un Authorized Request (status code 401)
     *         or Forbidden Request (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "add new employee", nickname = "submitEmployee", notes = "add new employee", response = Response.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={ "Add new employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Response.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Problem.class),
        @ApiResponse(code = 401, message = "Un Authorized Request", response = Problem.class),
        @ApiResponse(code = 403, message = "Forbidden Request", response = Problem.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Problem.class) })
    @PostMapping(
        value = "/v1alpha/submitEmployee",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Response> submitEmployee(@ApiParam(value = "The Employee details request body." ,required=true )  @Valid @RequestBody EmployeeRequestBody employeeRequestBody) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"employeeName\" : \"employeeName\", \"employeeId\" : \"employeeId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /v1alpha/submitEmployee/{employeeId} : update employee informations
     * update employee informations
     *
     * @param employeeId Unique identifier for employee. (required)
     * @param employeeRequestBody The Employee updated details request body. (required)
     * @return Ok (status code 200)
     *         or Bad Request (status code 400)
     *         or Un Authorized Request (status code 401)
     *         or Forbidden Request (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "update employee informations", nickname = "updateEmployee", notes = "update employee informations", response = Response.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={ "Edit the employee details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Response.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Problem.class),
        @ApiResponse(code = 401, message = "Un Authorized Request", response = Problem.class),
        @ApiResponse(code = 403, message = "Forbidden Request", response = Problem.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Problem.class) })
    @PutMapping(
        value = "/v1alpha/submitEmployee/{employeeId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Response> updateEmployee(@Size(min=1,max=255) @ApiParam(value = "Unique identifier for employee.",required=true) @PathVariable("employeeId") String employeeId,@ApiParam(value = "The Employee updated details request body." ,required=true )  @Valid @RequestBody EmployeeRequestBody employeeRequestBody) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"employeeName\" : \"employeeName\", \"employeeId\" : \"employeeId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /v1alpha/updateStatus/{employeeId}/{status} : update employee informations
     * update employee informations
     *
     * @param employeeId Unique identifier for employee (required)
     * @param status New employee status (required)
     * @return Ok (status code 200)
     *         or Bad Request (status code 400)
     *         or Un Authorized Request (status code 401)
     *         or Forbidden Request (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "update employee informations", nickname = "updateStatus", notes = "update employee informations", response = Response.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={ "Edit the employee details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Response.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Problem.class),
        @ApiResponse(code = 401, message = "Un Authorized Request", response = Problem.class),
        @ApiResponse(code = 403, message = "Forbidden Request", response = Problem.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Problem.class) })
    @PostMapping(
        value = "/v1alpha/updateStatus/{employeeId}/{status}",
        produces = { "application/json" }
    )
    default ResponseEntity<Response> updateStatus(@Size(min=1,max=255) @ApiParam(value = "Unique identifier for employee",required=true) @PathVariable("employeeId") String employeeId,@ApiParam(value = "New employee status",required=true, allowableValues = "\"IN-CHECK\", \"APPROVED\", \"ACTIVE\"") @PathVariable("status") String status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"employeeName\" : \"employeeName\", \"employeeId\" : \"employeeId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
