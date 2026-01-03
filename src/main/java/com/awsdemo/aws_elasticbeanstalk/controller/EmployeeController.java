package com.awsdemo.aws_elasticbeanstalk.controller;

import com.awsdemo.aws_elasticbeanstalk.entity.Employee;
import com.awsdemo.aws_elasticbeanstalk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("register")
    public String register(@RequestBody Employee employee){
        employeeService.save(employee);
        return "Registered";
    }

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
