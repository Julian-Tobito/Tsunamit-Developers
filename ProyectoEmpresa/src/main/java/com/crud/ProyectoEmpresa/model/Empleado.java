package com.crud.ProyectoEmpresa.model;

import com.crud.ProyectoEmpresa.enums.TypeRol;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //atributos
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    //private String nombreEmpresa;

    @Column(name = "typeRol")
    private String typeRol;

    @Transient
    private Empresa empresa;


    //constructor
    public Empleado(String nombre, String correo , String typeRol,
                    Empresa empresa) {
        this.nombre = nombre;
        this.correo = correo;
        //this.nombreEmpresa = nombreEmpresa;
        this.typeRol = typeRol;
        this.empresa = empresa;
    }

    //constructor vacío para springboot
    public Empleado(){

    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    //Getters and Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getCorreo() {

        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    /*public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }*/

    public String getTypeRol() {
        return typeRol;
    }

    public void setTypeRol(String typeRol) {
        this.typeRol = typeRol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                //", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", typeRol='" + typeRol + '\'' +
                '}';
    }

    //@Enumerated(EnumType.STRING)
    //@Column(name="tipo")
    //private TypeRol tipo;



}
