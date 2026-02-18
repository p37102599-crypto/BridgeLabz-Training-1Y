package com.gla.array.Level2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // b. Count digits (optional, used for array size)
        long temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 0) count = 1; // handle 0

        // c. Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // d. Find frequency of each digit
        int[] frequency = new int[10]; // 0-9

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency of each digit
        System.out.println("\nDigit frequencies in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}