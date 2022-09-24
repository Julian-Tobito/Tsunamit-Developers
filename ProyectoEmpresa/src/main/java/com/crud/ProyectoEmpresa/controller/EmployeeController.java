package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Employee;
import com.crud.ProyectoEmpresa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView addEmployee(@ModelAttribute Employee employee){

        employeeService.addEmployee(employee);
        return new RedirectView("/home/getEmployees");
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
    public RedirectView deleteEmployee( @PathVariable Long id ){

        Employee employee = employeeService.findEmployeeById(id);

        if( employee != null){
            employeeService.deleteEmployee(employee);

            return new RedirectView("/home/getEmployees");
        }

        return null;
    }



}
