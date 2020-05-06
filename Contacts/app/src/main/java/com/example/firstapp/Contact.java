package com.example.firstapp;

import java.io.Serializable;

public class Contact implements Serializable {
    private String phone;
    private String name;
    private String surname;
    private String email;


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name, String surname,String phone, String email){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public Contact() {
    }
}
