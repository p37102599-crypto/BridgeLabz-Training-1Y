package com.gla.array.Level2;
import java.util.Scanner;

public class DigitFrequencyOptimized {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number < 0) number = -number;

        // Frequency array
        int[] frequency = new int[10];

        // Count frequency directly
        if (number == 0) {
            frequency[0] = 1; // Handle 0
        } else {
            while (number != 0) {
                int digit = (int)(number % 10);
                frequency[digit]++;
                number /= 10;
            }
        }

        // Display frequency
        System.out.println("\nDigit frequencies in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}