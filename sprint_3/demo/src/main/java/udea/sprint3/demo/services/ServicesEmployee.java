package udea.sprint3.demo.services;

import udea.sprint3.demo.entities.Employee;
import udea.sprint3.demo.entities.ListEmployee;

import java.util.ArrayList;

public class ServicesEmployee {

    private ListEmployee listEmployee;

    public ServicesEmployee() {

        listEmployee= new ListEmployee();
    }

    public ArrayList<Employee> getListEmployee(){

        return (ArrayList<Employee>) listEmployee.getListEmployee().clone();

    }

    public Employee findEmployee(int id){

        return listEmployee.findEmployee(id);
    }

    public Employee addEmployee(Employee employee){

        return listEmployee.addEmployee(employee) ? employee:null;
    }

    public Employee updateEmployee(Employee employee){

        return listEmployee.updateEmployee(employee);
    }

    public Employee deleteEmployee(int id){

        return  listEmployee.deleteEmployee(listEmployee.findEmployee(id));
    }
}
