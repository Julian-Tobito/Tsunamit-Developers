package com.crud.ProyectoEmpresa.model;


import javax.persistence.*;

@Entity //eso es una identidad por eso debe tener Id
@Table(name="Enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //atributos
    @Column(nullable = false,name = "Name")
    private String name;

    @Column(nullable = false,name = "Address")
    private String address;

    @Column(nullable = false,name = "Phone")
    private String phone;

    @Column(nullable = false,name = "Nit")
    private int nit;

    //constructor vacío para springboot
    public Enterprise(){

    }

    //constructor
    public Enterprise(Long id, String name, String address, String phone, int nit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nit = nit;
    }

    //getters and setters


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", nit=" + nit +
                '}';
    }
}
