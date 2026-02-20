package com.gla.classesobjects.level1;
public class HotelBooking {

    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Using Default Constructor
        HotelBooking booking1 = new HotelBooking();

        // Using Parameterized Constructor
        HotelBooking booking2 = new HotelBooking("Rahul", "Deluxe", 3);

        // Using Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}