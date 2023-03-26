package com.example.recyclerview.model;

public class Contacts {
    //id
    private int id;
    //name and number and status
    private String name,number,status;

    public Contacts(int id, String name, String number, String status) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.status = status;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
