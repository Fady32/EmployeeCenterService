package com.employee.service.controller;

import com.employee.controller.V1alphaApi;
import com.employee.model.Employee;
import com.employee.model.Employee.StatusEnum;
import com.employee.model.EmployeeRequestBody;
import com.employee.model.Response;
import com.employee.service.domain.model.EmployeeEntity;
import com.employee.service.domain.model.Event;
import com.employee.service.domain.model.Status;
import com.employee.service.domain.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.statemachine.StateMachine;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author Fady.Magdy
 */
@RestController
public class EmployeeController implements V1alphaApi {

    private final EmployeeService employeeService;

    private final StateMachine<Status, Event> stateMachine;

    public EmployeeController(EmployeeService employeeService,
        StateMachine<Status, Event> stateMachine) {
        this.employeeService = employeeService;
        this.stateMachine = stateMachine;
        this.stateMachine.start();
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employeeService.getAllEmployee()
            .forEach(employeeEntity -> employees.add(new Employee().id(employeeEntity.getId().intValue()).name(employeeEntity.getName())
                .age(employeeEntity.getAge()).location(employeeEntity.getLocation())
                .status(StatusEnum.fromValue(employeeEntity.getStatus().name()))));

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Response> submitEmployee(@Valid EmployeeRequestBody employeeRequestBody) {
        EmployeeEntity employeeEntity = employeeService.createEmployee(employeeRequestBody);

        return new ResponseEntity<>(new Response().employeeId(String.valueOf(employeeEntity.getId())).employeeName(employeeEntity.getName()),
            HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Response> updateEmployee(@Size(min = 1, max = 255) String employeeId, @Valid EmployeeRequestBody employeeRequestBody) {
        EmployeeEntity employeeEntity = employeeService.updateEmployee(employeeId, employeeRequestBody);
        return new ResponseEntity<>(new Response().employeeId(String.valueOf(employeeEntity.getId())).employeeName(employeeEntity.getName()),
            HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Response> updateStatus(@Size(min = 1, max = 255) String employeeId, String status) {
        EmployeeEntity employeeEntity = employeeService.updateStatus(employeeId, Status.fromValue(status));

        switch (Status.fromValue(status)) {
            case IN_CHECK: {

                stateMachine.sendEvent(Event.IN_PROGRESS);
                break;
            }
            case APPROVED: {
                stateMachine.sendEvent(Event.APPROVED);
                break;
            }
            case ACTIVE: {
                stateMachine.sendEvent(Event.PUBLISH_STATUS);
                break;
            }
            case ADDED:
            default:
                break;
        }

        return new ResponseEntity<>(new Response().employeeId(String.valueOf(employeeEntity.getId())).employeeName(employeeEntity.getName()),
            HttpStatus.ACCEPTED);
    }
}
