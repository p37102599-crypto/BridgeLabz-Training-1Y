package com.gla.classesobjects.level1;
public class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default Constructor
    public Book() {
        title = "Not Assigned";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method
    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 499.0);
        book2.displayDetails();
    }
}