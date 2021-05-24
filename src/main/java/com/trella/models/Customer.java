package com.trella.models;

public class Customer {

    private int id ;
    private String firstName = "";
    private String lastName = "";
    private String postalCode = "";


    public Customer(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public Customer() {

    }

    public Customer id(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public Customer firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer postalName(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Customer build() {
        return new Customer(firstName, lastName, postalCode);
    }
}