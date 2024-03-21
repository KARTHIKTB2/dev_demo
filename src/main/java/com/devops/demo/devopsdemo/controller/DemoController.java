package com.devops.demo.devopsdemo.controller;

import com.devops.demo.devopsdemo.model.Employee;
import com.devops.demo.devopsdemo.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/devops/v1")
public class DemoController {

    @Autowired
    EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value="/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployeeDetails(){
       return employeeService.getEmployeeDetails();
    }

    @GetMapping(value="/ping", produces = {"*/*"}, consumes = {"*/*"})
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("Success response", HttpStatus.OK);
    }
}
