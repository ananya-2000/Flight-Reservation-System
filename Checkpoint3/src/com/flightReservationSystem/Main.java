package com.flightReservationSystem;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //main method is the entry point of any java program
        System.out.println("Welcome to MAPS Flight Reservation System");
        System.out.println(" ");
        //create passenger objects
        passenger p1 = createPassenger("Ananya", 987796748, "ananya@gmail.com", "Number 2", "Delhi", "Delhi");
        passenger p2 = createPassenger("Kirti", 800764213, "kirti@upgrad.com", "Number 4", "Amritsar", "Punjab");
        //create flight objects
        flight f1 = createFlights(1050, 50, "MAPS Airlines", 0, 2, "Delhi", "Punjab");
        flight f2 = createFlights(1900, 50, "MAPS Airlines", 0, 2, "Punjab", "Delhi");
        //book tickets
        regularTicket t1 = createTicket1(false, p1,f1, 5000, "3feb", "15:00", "3feb", "13:00",true, true, true);
        String[] locations = {"Rajghat", "Cannaught place", "Faridabad", "The Big Tree cafe", "Gurgaon DLF"};
        touristTicket t2 = createTicket2(true, p2,f2, 6500, "3feb", "17:00", "3feb", "15:00","JW Mariott Delhi", locations);
        //print ticket
        System.out.println("Passenger Details: ");
        System.out.println("Passenger ID: "+p1.getPassengerId());
        System.out.println("Name: "+p1.getName());
        System.out.println("Contact Details: Phone: "+p1.getPhone()+" Email: "+p1.getEmail());
        System.out.println("Address: "+p1.getStreet()+", "+p1.getCity()+", "+p1.getState());
        System.out.println("Flight Details:");
        System.out.println("Airline: "+f1.getAirline()+" | Flight Number: "+f1.getFlightNumber()+" | Seating Capacity: "+f1.getCapacity());
        System.out.println("Departure: "+f1.getDeparture()+" | Destination: "+f1.getDestination()+" | Travel Time: "+f1.getJourneyTime());
        printTicketDetails(t1);
        System.out.println("Passenger Details: ");
        System.out.println("Passenger ID: "+p2.getPassengerId());
        System.out.println("Name: "+p2.getName());
        System.out.println("Contact Details: Phone: "+p2.getPhone()+" Email: "+p2.getEmail());
        System.out.println("Address: "+p2.getStreet()+", "+p2.getCity()+", "+p2.getState());
        System.out.println("Flight Details:");
        System.out.println("Airline: "+f2.getAirline()+" | Flight Number: "+f2.getFlightNumber()+" | Seating Capacity: "+f2.getCapacity());
        System.out.println("Departure: "+f2.getDeparture()+" | Destination: "+f2.getDestination()+" | Travel Time: "+f2.getJourneyTime());
        printTicketDetails(t2);
    }

    public static passenger createPassenger(String name, long phone, String email, String street, String city, String state){
        //creates and returns a passenger object
        return new passenger(name, phone, email, street, city, state);
    }

    public static flight createFlights(int flightNumber, int capacity, String airline, int seatsBooked, int time, String departure, String destination) {
        //creates and returns a flight object
        return new flight(flightNumber, capacity, airline, seatsBooked, time, departure, destination);
    }

    public static regularTicket createTicket1(boolean ticketType, passenger passenger, flight flight, int price,String dateOfArrival, String timeOfArrival,
                                              String dateOfDeparture, String timeOfDeparture, boolean food, boolean water, boolean snacks){
        //creates and returns a reguralTicket object
        return new regularTicket(ticketType, flight, passenger, price,dateOfArrival,timeOfArrival, dateOfDeparture, timeOfDeparture, food, water, snacks);
    }

    public static touristTicket createTicket2(boolean ticketType, passenger passenger, flight flight, int price,String dateOfArrival, String timeOfArrival,
                                              String dateOfDeparture, String timeOfDeparture, String hotelAddress, String[] touristLocations){
        //creates and returns a touristTicket object
        return new touristTicket(ticketType, flight, passenger, price,dateOfArrival,timeOfArrival, dateOfDeparture, timeOfDeparture, hotelAddress, touristLocations);
    }

    //overloading printTicketDetails method to print ticket PNR based on ticket type
    public static void printTicketDetails(regularTicket t1){
        //prints regular ticket PNR
        int pnr = t1.getPnr();
        System.out.println("Your Regular Ticket PNR: "+pnr);
        System.out.println("Value Added Services: Food: "+t1.isFood()+" Water: "+t1.isWater()+" Snacks: "+t1.isSnacks());
    }

    public static void printTicketDetails(touristTicket t2){
        //prints tourist ticket PNR
        int pnr = t2.getPnr();
        System.out.println("Your Tourist Ticket PNR: "+pnr);
        System.out.println("Hotel: "+t2.getHotelAddress());
        System.out.println("Places to visit: ");
        String[] locations = t2.getTouristLocations();
        System.out.print(locations[0]+", "+locations[1]+", "+locations[2]+", "+locations[3]+", "+locations[4]);
    }
}

