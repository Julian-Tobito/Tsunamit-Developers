package com.example.Empresa.entities;


import javax.persistence.*;

@Entity
@Table(name="Enterprise")
public class Enterprise {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int nit;

    public Enterprise() {

    }

    public Enterprise(String name, String address, String phone, int nit) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nit = nit;
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
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", nit=" + nit +
                '}';
    }
}
