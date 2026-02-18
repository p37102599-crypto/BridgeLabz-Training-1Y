package com.gla.array.Level1;
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Get integer input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if input is a natural number
        if (number <= 0) {
            System.out.println("Error: Not a natural number. Program exits.");
            sc.close();
            return; // exit program
        }

        // b. Create arrays for odd and even numbers
        int evenSize = number / 2; // max even numbers
        int oddSize = number / 2 + (number % 2); // max odd numbers

        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];

        // c. Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // d. Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // e. Print odd numbers array
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print even numbers array
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}