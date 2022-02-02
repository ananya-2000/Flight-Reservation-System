package com.flightReservationSystem;

public abstract class ticket {
    String PnrNumber;
    String ArrivalDate;
    String ArrivalTime;
    String DepartureDate;
    String DepartureTime;
    int durationOfJourney;
    int ticketPrice;
    int seatNumber;
    Flight flight;

    public ticket(String PnrNumber, String ArrivalDate, String ArrivalTime, String DepartureDate, String DepartureTime,
                  int durationOfJourney, int ticketPrice, int seatNumber) {
        this.PnrNumber = PnrNumber; //PNR Number
        this.ArrivalDate = ArrivalDate; // Date of arrival of train
        this.ArrivalTime= ArrivalTime; // Time of arrival of train
        this.DepartureDate = DepartureDate; // Date of departure of train
        this.DepartureTime = DepartureTime; // Time of Departure of train
        this.durationOfJourney = durationOfJourney; // Duration of Journey
        this.ticketPrice = ticketPrice; // Price of the ticket booked
        this.seatNumber = seatNumber; // Seat Number

    }

    public abstract void printPnrNumber();
    public abstract void printSeatNumber();
    public abstract void printTicketPrice();
    public abstract void printArrivalDate();
    public abstract void printArrivalTime();
    public abstract void printDepartureTime();
    public abstract void printDepartureDate();
    public abstract void printDurationOfJourney();

}
