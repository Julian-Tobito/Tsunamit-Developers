package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Employee;
import com.crud.ProyectoEmpresa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //constructor


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable Long id ){

        return employeeService.findEmployeeById(id);
    }

    @PatchMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee ){

        if ( employeeService.findEmployeeById(employee.getId()) != null ){
            return employeeService.updateEmployee(employee);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee( @PathVariable Long id ){

        Employee employee = employeeService.findEmployeeById(id);

        if( employee != null){
            employeeService.deleteEmployee(employee);

            return employee;
        }

        return null;
    }



}