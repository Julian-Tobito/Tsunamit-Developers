package udea.sprint3.demo.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTransactionTest {

    private ListTransaction listTransaction;
    private Enterprise enterprise1;
    private Enterprise enterprise2;

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    private Transaction transaction1;
    private Transaction transaction2;
    void setup(){

        listTransaction= new ListTransaction();
        enterprise1= new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234);
        enterprise2= new Enterprise("AMB", "cra 23 #56-89","3154152027",5678);
        employee1=new Employee(123,"Carlos","Carlos@gmail.com",TypeRol.ADMINISTRADOR,enterprise1);
        employee2=new Employee(456,"Daniel","Daniel@gmail.com",TypeRol.OPERATIVO,enterprise1);
        employee3=new Employee(789,"Gabriela","Gabriela@gmail.com",TypeRol.ADMINISTRADOR,enterprise2);
        transaction1= new Transaction(20_000,"Papeleria",employee1,123);
        transaction2= new Transaction(15_000,"Gastos varios",employee2,123);


    }
    @Test
    void findTrasaction() {

        setup();
        assertNull(listTransaction.findTrasaction(999));
        listTransaction.addTransaction(transaction1);
        assertNotNull(listTransaction.findTrasaction(123));
    }

    @Test
    void addTransaction() {

        setup();

        assertTrue(listTransaction.addTransaction(transaction1));
        assertFalse(listTransaction.addTransaction(transaction1));
    }

    @Test
    void updateTransaction() {

        setup();
        listTransaction.addTransaction(transaction1);
        assertNotNull(listTransaction.updateTransaction(transaction2));
        assertNull(listTransaction.updateTransaction(new Transaction(55_000,"Gastos transporte",employee3,777)));
    }

    @Test
    void deleteTransaction() {

        setup();
        listTransaction.addTransaction(transaction1);
        assertNull(listTransaction.deleteTransaction(listTransaction.findTrasaction(111)));
        assertNotNull(listTransaction.deleteTransaction(listTransaction.findTrasaction(123)));
    }

    @Test
    void getListTransaction() {

        setup();
        listTransaction.addTransaction(transaction1);
        assertEquals("Papeleria",listTransaction.getListTransaction().get(0).getConcept());
    }
}