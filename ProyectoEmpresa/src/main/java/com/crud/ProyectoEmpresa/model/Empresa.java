package com.crud.ProyectoEmpresa.model;


import javax.persistence.*;

@Entity //eso es una identidad por eso debe tener Id
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //atributos
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "nit")
    private int nit;


    //constructor
    public Empresa(String nombre, String direccion, String telefono, int nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    //constructor vacío para springboot
    public Empresa(){

    }

    //getters and setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public String getTelefono() {

        return telefono;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public int getNit() {

        return nit;
    }

    public void setNit(int nit) {

        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit=" + nit +
                '}';
    }


    //relación con Empleado
    //@OneToOne
    //private Empleado empleado;


}
