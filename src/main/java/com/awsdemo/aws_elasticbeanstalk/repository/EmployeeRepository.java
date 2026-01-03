package com.awsdemo.aws_elasticbeanstalk.repository;

import com.awsdemo.aws_elasticbeanstalk.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
