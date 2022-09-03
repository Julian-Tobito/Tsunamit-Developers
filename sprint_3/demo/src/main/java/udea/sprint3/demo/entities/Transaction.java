package udea.sprint3.demo.entities;

public class Transaction {

    private double transaction;
    private String concept;
    private Employee user;

    public Transaction() {

    }

    public Transaction(double transaction, String concept, Employee user) {
        this.transaction = transaction;
        this.concept = concept;
        this.user = user;
    }

    public double getTransaction() {
        return transaction;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction=" + transaction +
                ", concept='" + concept + '\'' +
                ", user=" + user +
                '}';
    }
}
