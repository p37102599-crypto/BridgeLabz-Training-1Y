package com.gla.Methods.level1;
import java.util.Scanner;

public class Handshakes {

    // Method to calculate maximum handshakes
    static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calling method
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display output
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();
    }
}