package udea.sprint3.demo.controllers;

import org.springframework.web.bind.annotation.*;
import udea.sprint3.demo.entities.Employee;
import udea.sprint3.demo.services.ServicesEmployee;

import java.util.ArrayList;


@RestController
@RequestMapping("/users")
public class ControllersEmployee {

    private ServicesEmployee service;

    public ControllersEmployee() {

        service= new ServicesEmployee();
    }

    @GetMapping
    public ArrayList<Employee> getAllEmployee(){

        return service.getListEmployee();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

        return service.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id){

        return service.findEmployee(id);
    }

    @PatchMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee){

        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable int id){

        return service.deleteEmployee(id);
    }
}
