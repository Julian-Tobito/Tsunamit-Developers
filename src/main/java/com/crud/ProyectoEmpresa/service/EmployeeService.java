package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.Employee;
import com.crud.ProyectoEmpresa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired // anotación para especificarle a springboot que acá estoy haciendo Inyección de Dependencias
    private EmployeeRepository employeeRepository;

    //constructor
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //método para visualizar a partir del GET
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    //método para crear a partir del POST
    public Employee addEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

    //GET para un solo empleado
    public Employee findEmployeeById(Long id ){
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        if( optEmployee.isPresent()){

            return optEmployee.get();
        }

        return null;
    }

    //método para editar o actualizar a partir del PATCH
    /***
     * Permite actualizar un objeto
     * Precondicion: El objeto existe
     * Poscondicion: si existe se modifica
     * @param employee referencia del objeto que se actualiza
     * @return objeto actualizado
     */
    public Employee updateEmployee( Employee employee ){
        return employeeRepository.save(employee);
    }

    //método para eliminar
    /***
     * Permite eliminar un objeto
     * precondicion: el objeto existe
     * Poscondicion: si existe se elimina
     * @param employee referencia del objeto que se elimina
     * @return objeto eliminado
     */

    public void deleteEmployee( Employee employee){

        employeeRepository.delete(employee);
    }

}
