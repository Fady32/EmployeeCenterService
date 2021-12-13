package com.employee.service.domain;

import com.employee.model.EmployeeRequestBody;
import com.employee.model.EmployeeRequestBody.StatusEnum;
import com.employee.service.domain.model.EmployeeEntity;
import com.employee.service.domain.model.Status;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 *
 * @author Fady.Magdy
 */
public class UtilTest {

    public static ObjectMapper mapper = new ObjectMapper();

    public static EmployeeRequestBody getEmployeeRequestBody(StatusEnum status){
        return new EmployeeRequestBody().name("name").age("10").location("Cairo").status(status);
    }

    public static EmployeeEntity getEmployeeEntity(Status status){
        return  new EmployeeEntity().builder().id(10L).name("name").age("10").location("Cairo").status(status).build();
    }
}
