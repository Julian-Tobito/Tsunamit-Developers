package com.crud.ProyectoEmpresa.model;

import javax.persistence.*;

@Entity
@Table(name="Transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "transaccion")
    private double transaccion;

    @Column(name = "concepto")
    private String concepto;

    @Transient
    private Empleado empleado;

    //constructor vacío para springboot
    public Transaccion(){

    }

    public Transaccion(double transaccion, String concepto, Empleado empleado) {
        this.transaccion = transaccion;
        this.concepto = concepto;
        this.empleado = empleado;
    }

    //getters and setters


    public double getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(double transaccion) {
        this.transaccion = transaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "transaccion=" + transaccion +
                ", concepto='" + concepto + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
