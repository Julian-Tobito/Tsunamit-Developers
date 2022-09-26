package udea.sprint3.demo.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEmployeeTest {

    private ListEmployee listEmployee;
    private Enterprise enterprise1;

    private Employee employee1;
    private Employee employee2;
    void setup(){

        listEmployee= new ListEmployee();
        enterprise1= new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234);
        employee1=new Employee(123,"Carlos","Carlos@gmail.com",TypeRol.ADMINISTRADOR,enterprise1);
        employee2=new Employee(123,"Daniel","Daniel@gmail.com",TypeRol.OPERATIVO,enterprise1);

    }

    @Test
    void findEmployee() {

        setup();
        assertNull(listEmployee.findEmployee(123));
        listEmployee.addEmployee(employee1);
        assertNotNull(listEmployee.findEmployee(123));
    }

    @Test
    void addEmployee() {

        setup();

        assertTrue(listEmployee.addEmployee(employee1));
        assertFalse(listEmployee.addEmployee(employee1));
    }

    @Test
    void updateEmployee() {

        setup();
        listEmployee.addEmployee(employee1);
        assertNotNull(listEmployee.updateEmployee(employee2));
        assertNull(listEmployee.updateEmployee(new Employee(456,"Gabriela","Gabriela@gmail.com",TypeRol.OPERATIVO,enterprise1)));
    }

    @Test
    void deleteEmployee() {

        setup();
        listEmployee.addEmployee(employee1);
        assertNull(listEmployee.deleteEmployee(listEmployee.findEmployee(333)));
        assertNotNull(listEmployee.deleteEmployee(listEmployee.findEmployee(123)));
    }

    @Test
    void getListEmployee() {

        setup();
        listEmployee.addEmployee(employee1);
        assertEquals("Carlos",listEmployee.getListEmployee().get(0).getName());
    }
}