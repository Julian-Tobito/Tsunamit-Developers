package com.example.Empresa.entities;
import java.util.ArrayList;

public class ListEmployee {

    private ArrayList<Employee> listEmployee;

    public ListEmployee() {

        listEmployee= new ArrayList<>();
    }

    public Employee findEmployee(int id){

        for(Employee employee:listEmployee){
            if(Integer.compare(employee.getId(),id)==0){//da cero si son iguales
                return employee;
            }
        }
        return null;
    }

    public boolean addEmployee(Employee employee){

        if(findEmployee(employee.getId())==null){

            listEmployee.add(employee);
            return true;
        }
        return false;
    }

    public Employee updateEmployee(Employee employee){

        Employee employeeaux= findEmployee(employee.getId());

        if(employeeaux!=null){

            listEmployee.set(listEmployee.indexOf(employeeaux),employee);
            return listEmployee.get(listEmployee.indexOf(employee));
        }
        return null;
    }

    public Employee deleteEmployee(Employee employee){

        if(listEmployee.contains(employee)){

            listEmployee.remove(employee);
            return employee;
        }

        return null;
    }

    public ArrayList<Employee> getListEmployee() {
        return (ArrayList<Employee>) listEmployee.clone();
    }
}
