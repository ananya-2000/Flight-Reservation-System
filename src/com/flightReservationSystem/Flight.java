package com.flightReservationSystem;

public class Flight {
    private long flightNo;
    private  String airlineOfFlight;
    private  int numberOfSeats;
    private  boolean SeatsAvailable;

    public Flight(long flightNo, String airlineOfFlight, int numberOfSeats, boolean SeatsAvailable) {
        this.flightNo = flightNo;
        this.airlineOfFlight = airlineOfFlight;
        this.numberOfSeats = numberOfSeats;
        this.SeatsAvailable = SeatsAvailable;
    }

    public long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(long flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirlineOfFlight() {
        return airlineOfFlight;
    }

    public void setAirlineOfFlight(String airlineOfFlight) {
        this.airlineOfFlight = airlineOfFlight;
    }

    public int getNumberOfSeats() {
        return numberOfSeats ;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isSeatsAvailable() {
        return SeatsAvailable;
    }

    public void setSeatsAvailable(boolean SeatsAvailable) {
        this.SeatsAvailable = SeatsAvailable;
    }
}
