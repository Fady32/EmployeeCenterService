package com.employee.service.domain.service;

import com.employee.model.EmployeeRequestBody;
import com.employee.service.domain.mapper.EmployeeMapper;
import com.employee.service.domain.model.EmployeeEntity;
import com.employee.service.domain.model.Status;
import com.employee.service.domain.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Fady.Magdy
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity createEmployee(EmployeeRequestBody employeeRequestBody) {
        return employeeRepository.save(EmployeeMapper.fromEmployeeDtoToEmployeeEntity(employeeRequestBody));
    }

    public EmployeeEntity updateEmployee(String empId, EmployeeRequestBody employeeRequestBody) {

        EmployeeEntity employeeEntity = EmployeeMapper.fromEmployeeDtoToEmployeeEntity(employeeRequestBody);
        employeeEntity.setId(Long.valueOf(empId));
        return employeeRepository.save(employeeEntity);
    }

    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }


    public EmployeeEntity updateStatus(String id, Status status) {
        EmployeeEntity employeeEntity = employeeRepository.getOne(Long.valueOf(id));
        employeeEntity.setStatus(status);
        return employeeRepository.save(employeeEntity);

    }

}
