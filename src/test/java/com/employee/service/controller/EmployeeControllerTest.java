package com.employee.service.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.employee.model.EmployeeRequestBody.StatusEnum;
import com.employee.service.domain.UtilTest;
import com.employee.service.domain.model.Event;
import com.employee.service.domain.model.Status;
import com.employee.service.domain.service.EmployeeService;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @Mock
    private StateMachine<Status, Event> stateMachine;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        EmployeeController employeeController = new EmployeeController(employeeService, stateMachine);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    void getEmployees() throws Exception {
        Mockito.when(employeeService.getAllEmployee()).thenReturn(List.of(UtilTest.getEmployeeEntity(Status.ADDED)));
        mockMvc.perform(
            get("/v1alpha/getAllEmployees")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(status().isOk());
    }

    @Test
    void submitEmployee() throws Exception {
        Mockito.when(employeeService.createEmployee(Mockito.any())).thenReturn(UtilTest.getEmployeeEntity(Status.ADDED));
        mockMvc.perform(
            post("/v1alpha/submitEmployee")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(UtilTest.mapper.writeValueAsString(UtilTest.getEmployeeRequestBody(StatusEnum.ADDED))))
            .andExpect(status().isCreated());
    }

    @Test
    void updateStatus() throws Exception {
        Mockito.when(employeeService.updateStatus(Mockito.any(), Mockito.any(Status.class))).thenReturn(UtilTest.getEmployeeEntity(Status.ADDED));
        mockMvc.perform(
            post(String.format("/v1alpha/updateStatus/%s/%s", "10", Status.APPROVED.name()))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(status().isAccepted());
    }
}