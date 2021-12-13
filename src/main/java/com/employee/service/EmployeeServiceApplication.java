package com.employee.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.config.EnableStateMachine;

/**
 * @author Fady.Magdy
 */

@SpringBootApplication
@EnableStateMachine
@OpenAPIDefinition(info = @Info(title = "Employee service", version = "2.0", description = ""))
public class EmployeeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}
