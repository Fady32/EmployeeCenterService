package com.employee.service.domain.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.employee.model.EmployeeRequestBody;
import com.employee.model.EmployeeRequestBody.StatusEnum;
import com.employee.service.domain.UtilTest;
import com.employee.service.domain.model.EmployeeEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeeMapperTest {


    @Test
    void fromEmployeeDtoToEmployeeEntityTest() {
        EmployeeRequestBody employeeRequestBody = UtilTest.getEmployeeRequestBody(StatusEnum.ADDED);
        EmployeeEntity employeeEntity = EmployeeMapper.fromEmployeeDtoToEmployeeEntity(employeeRequestBody);

        assertEquals(employeeEntity.getStatus().name(), employeeRequestBody.getStatus().getValue());
        assertEquals(employeeEntity.getName(), employeeRequestBody.getName());

    }
}