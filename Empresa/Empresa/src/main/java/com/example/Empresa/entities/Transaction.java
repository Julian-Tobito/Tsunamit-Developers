package com.example.Empresa.entities;

import javax.persistence.*;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Column(name = "transaction")
    private double transaction;

    @Column(name = "concept")
    private String concept;

    @Transient
    private Employee user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Transaction() {

    }

    public Transaction(double transaction, String concept, Employee user, int id) {
        this.transaction = transaction;
        this.concept = concept;
        this.user = user;
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction=" + transaction +
                ", concept='" + concept + '\'' +
                ", user=" + user +
                ", id=" + id +
                '}';
    }
}
