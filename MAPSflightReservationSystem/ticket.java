package com.flightReservationSystem;

import java.util.*;

public abstract class ticket {
    //abstract class is a restricted class that cannot be used to create objects
    //attributes
    private static int pnrCounter = 1000;
    private int pnr;
    private flight flight;
    private passenger passenger;
    private static int seatCounter = 1;
    private int seatNo;
    private boolean ticketType;
    private String dateOfArrival;
    private String timeOfArrival;
    private String dateOfDeparture;
    private String timeOfDeparture;

    private int price;

    //getter and setter methods
    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isTicketType() {
        return ticketType;
    }

    public void setTicketType(boolean ticketType) {
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public com.flightReservationSystem.flight getFlight() {
        return flight;
    }

    public void setFlight(com.flightReservationSystem.flight flight) {
        this.flight = flight;
    }

    public ticket(boolean ticketType, flight flight, passenger passenger, int price, String dateOfArrival,String timeOfArrival,
                  String dateOfDeparture, String timeOfDeparture ) {
        //ticket constructor
        this.pnr = pnrCounter;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNo = seatCounter;
        this.ticketType = ticketType;
        this.price = price;
        this.dateOfArrival=dateOfArrival;
        this.timeOfArrival=timeOfArrival;
        this.dateOfDeparture=dateOfDeparture;
        this.timeOfDeparture=timeOfDeparture;
        pnrCounter++;
        seatCounter++;
    }}