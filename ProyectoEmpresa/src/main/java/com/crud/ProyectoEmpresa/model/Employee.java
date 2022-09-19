package com.crud.ProyectoEmpresa.model;

import com.crud.ProyectoEmpresa.enums.TypeRol;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //atributos
    @Column(nullable = false,name = "Name")
    private String name;

    @Column(nullable = false,name = "Email")
    private String email;

    @Column(nullable = false,name = "Phone")
    private String phone;

   @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "type_Rol")
    private TypeRol typeRol;

    @ManyToOne
    @JoinColumn(name = "Enterprise")
    private Enterprise enterprise;

    //constructor vacío para springboot
    public Employee(){
    }

    //constructor


    public Employee(Long id, String name, String email, String phone, TypeRol typeRol) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.typeRol = typeRol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
                ", phone='" + phone + '\'' +
                ", typeRol=" + typeRol +
                ", enterprise=" + enterprise +
                '}';
    }
}
