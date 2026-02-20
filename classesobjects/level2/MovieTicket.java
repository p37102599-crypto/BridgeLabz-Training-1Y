package com.gla.classesobjects.level2;
public class MovieTicket {

    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    // Main method
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");

        ticket.bookTicket(15, 250.0);
        ticket.displayTicketDetails();
    }
}