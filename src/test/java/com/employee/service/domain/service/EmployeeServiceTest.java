package com.employee.service.domain.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.employee.model.EmployeeRequestBody.StatusEnum;
import com.employee.service.domain.UtilTest;
import com.employee.service.domain.model.EmployeeEntity;
import com.employee.service.domain.model.Status;
import com.employee.service.domain.repository.EmployeeRepository;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EmployeeServiceTest {


    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        employeeService = new EmployeeService(employeeRepository);
    }


    @Test
    void createEmployee() {
        when(employeeRepository.save(any(EmployeeEntity.class))).thenReturn(UtilTest.getEmployeeEntity(Status.ADDED));
        EmployeeEntity employee = employeeService.createEmployee(UtilTest.getEmployeeRequestBody(StatusEnum.ADDED));

        ArgumentCaptor<EmployeeEntity> employeeEntity = ArgumentCaptor.forClass(EmployeeEntity.class);
        verify(employeeRepository, times(1)).save(employeeEntity.capture());

        Assertions.assertEquals(employee.getName(), employeeEntity.getValue().getName());
    }

    @Test
    void getAllEmployee() {
        when(employeeRepository.findAll()).thenReturn(List.of(UtilTest.getEmployeeEntity(Status.ADDED)));
        List<EmployeeEntity> allEmployee = employeeService.getAllEmployee();

        verify(employeeRepository, times(1)).findAll();
        Assertions.assertNotNull(allEmployee.get(0));

    }

    @Test
    void updateStatus() {
        when(employeeRepository.save(any(EmployeeEntity.class))).thenReturn(UtilTest.getEmployeeEntity(Status.APPROVED));
        EmployeeEntity employee = employeeService.createEmployee(UtilTest.getEmployeeRequestBody(StatusEnum.APPROVED));

        ArgumentCaptor<EmployeeEntity> employeeEntity = ArgumentCaptor.forClass(EmployeeEntity.class);
        verify(employeeRepository, times(1)).save(employeeEntity.capture());

        Assertions.assertEquals(employee.getStatus().name(), employeeEntity.getValue().getStatus().name());
    }
}