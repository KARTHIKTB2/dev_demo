package com.devops.demo.devopsdemo.service;

import com.devops.demo.devopsdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getEmployeeDetails();
}
