package com.crud.ProyectoEmpresa.model;

import javax.persistence.*;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false,name = "Amount")
    private double amount;

    @Column(nullable = false,name = "Concept")
    private String concept;

    @ManyToOne
    @JoinColumn(name = "Employee")
    private Employee employee;


    //constructor vacío para springboot
    public Transaction(){

    }

    public Transaction(Long id, double amount, String concept) {
        this.id = id;
        this.amount = amount;
        this.concept = concept;
    }

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + employee +
                '}';
    }
}
