package com.devops.demo.devopsdemo.service;

import com.devops.demo.devopsdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> getEmployeeDetails() {

        List<Employee> employee =  new ArrayList<>();
        Employee details1 =  Employee.builder()
                .Id(100)
                .fistName("Giayana")
                .lastName("Doddamani")
                .age(2)
                .address("NRI layout, Bangalore")
                .state("KA")
                .pinCode(560100)
                .build();
        employee.add(details1);
        Employee details2 =  Employee.builder()
                .Id(200)
                .fistName("Minnu")
                .lastName("D")
                .age(3)
                .address("Gadag")
                .state("KA")
                .pinCode(582103)
                .build();
        employee.add(details2);
        return employee;
    }
}
