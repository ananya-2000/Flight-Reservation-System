package com.flightReservationSystem;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc =  new Scanner(System.in);
        long regular,tourist;
        System.out.println("Welcome to MAPS Flight Reservation System! ");
        System.out.println("We are happy to serve you, Kindly create your profile by giving 1 as an input!");

        int choose = sc.nextInt();

        //creating user profile

        switch (choose) {
            case 1:
            { System.out.println("Register yourself to book a ticket to your destination :) ");
                Scanner s =  new Scanner(System.in);
                System.out.println("Please Enter your name:");
                String name = s.nextLine();
                System.out.println("Enter your email:");
                String email = s.nextLine();
                System.out.println("Enter your gender:");
                String gender = s.nextLine();
                Passenger passenger = new Passenger(1234,name,email,gender);
                System.out.println("Hurray! We are are only one step away from creating your profile");
                System.out.println("Please enter your address, press any key to continue.");
                System.out.println("Street:");
                String street = s.nextLine();
                System.out.println("City:");
                String city = s.nextLine();
                System.out.println("State:");
                String state = s.next();
                System.out.println("Pin Code:");
                int pinCode = s.nextInt();

                Address address = new Address(street,city,state,pinCode);

                System.out.println("Enter mobile Number:");
                long mobile = s.nextLong();
                System.out.println("Enter Telephone Number:");
                int telephone = s.nextInt();
                Contact contact = new Contact(mobile,telephone);

                System.out.println("Thanks we have created your profile, You can now go ahead and book your ticket :D");
                break;
            }
            default:
            { System.out.println("Invalid Choice-----------");
                break;
            }
        }
    }
}