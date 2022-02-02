package com.flightReservationSystem;

//class for a type of ticket
public class touristTicket {

    //Private attributes of touristTicket Class
    private String AddressOfHotel;
    private String Location;

    //Constructor call
    public touristTicket(String AddressOfHotel,String Location ){
        this.AddressOfHotel=AddressOfHotel;
        this.Location=Location;
    }

    // Getters and Setters used for accessing private attributes
    public void getAddressOfHotel() {
        System.out.println("Hotel Address " + AddressOfHotel);
    }

    public void setAddressOfHotel(String AddressOfHotel){
        this.AddressOfHotel=AddressOfHotel;
    }

    public void getLocation() {
        System.out.println("Location "+Location);
    }

    public void setLocation(String location) {
        this.Location = location;
    }
}

