package com.awsdemo.aws_elasticbeanstalk.service;

import com.awsdemo.aws_elasticbeanstalk.entity.Employee;
import com.awsdemo.aws_elasticbeanstalk.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
