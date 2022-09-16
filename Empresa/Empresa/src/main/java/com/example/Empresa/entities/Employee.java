package com.example.Empresa.entities;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Transient
    private TypeRol typeRol;

    @Transient
    private Enterprise enterprise;

    public Employee() {

    }

    public Employee(int id, String name, String email, TypeRol typeRol, Enterprise enterprise) {

        this.id=id;
        this.name = name;
        this.email = email;
        this.typeRol = typeRol;
        this.enterprise = enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeRol getTypeRol() {
        return typeRol;
    }

    public void setTypeRol(TypeRol typeRol) {
        this.typeRol = typeRol;
    }


    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", typeRol=" + typeRol +
                ", enterprise=" + enterprise +
                '}';
    }
}
