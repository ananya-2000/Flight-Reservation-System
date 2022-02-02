package com.flightReservationSystem;

public class Contact {
    private long mobileNumber;
    private int phoneNumber;

    public Contact(long mobileNumber, int phoneNumber) {
        this.mobileNumber = mobileNumber;
        this.phoneNumber = phoneNumber;
    }

    public void getMobileNumber() {
        System.out.println("Mobile Number "+mobileNumber);
    }

    public void getPhoneNumber() {
        System.out.println("Phone Number "+phoneNumber);
    }
}
