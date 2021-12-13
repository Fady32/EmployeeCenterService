package com.employee.service.domain.mapper;

import com.employee.model.EmployeeRequestBody;
import com.employee.service.domain.model.EmployeeEntity;
import com.employee.service.domain.model.Status;

/**
 *
 *
 * @author Fady.Magdy
 */
public final class EmployeeMapper {


    private EmployeeMapper() {
        super();
    }

    public static EmployeeEntity fromEmployeeDtoToEmployeeEntity(EmployeeRequestBody requestBody) {
        return EmployeeEntity.builder().name(requestBody.getName()).age(requestBody.getAge())
            .location(requestBody.getLocation()).status(Status.fromValue(requestBody.getStatus().getValue())).build();
    }

}
