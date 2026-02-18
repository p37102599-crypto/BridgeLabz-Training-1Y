package com.gla.array.Level2;
import java.util.Scanner;

public class ReverseArrayNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // Use long to handle large numbers

        if (number < 0) {
            number = -number; // Handle negative numbers
        }

        // b. Find the count of digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        if (count == 0) count = 1; // Handle input 0

        // c. Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // d. Array to store reversed elements (optional, here digits already store in reverse order)
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // e. Display digits in reverse order
        System.out.print("\nDigits of the number in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]); // digits already in reverse order
        }

        System.out.println("\nNumber reversed using array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]); // fully reversed using another array
        }

        sc.close();
    }
}