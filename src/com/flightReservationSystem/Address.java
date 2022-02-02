package com.flightReservationSystem;

public class Address {
    private String street;
    private String city;
    private  String state;
    private  int pinCode;


    public Address(String street, String city, String state, int pinCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode=pinCode;
    }

    public void getStreet() {
        System.out.println("Street: "+street);

    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void getCity() {
        System.out.println("City: "+city);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void getState() {
        System.out.println("State: "+state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getPostalCode() {
        System.out.println("PostalCode: "+pinCode);
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }


}



