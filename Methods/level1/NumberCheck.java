package com.gla.Methods.level1;

import java.util.Scanner;

public class NumberCheck {

    // Method to check number type
    static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calling method
        int result = checkNumber(num);

        // Display output
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}