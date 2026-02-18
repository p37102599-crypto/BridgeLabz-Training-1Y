package com.gla.array.Level2;
import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // Use long for very large numbers

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // b. Initial array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // c. Extract digits dynamically
        while (number != 0) {
            int lastDigit = (int)(number % 10);
            digits[index] = lastDigit;
            index++;

            // a & b. Increase array size if index equals maxDigit
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            number = number / 10;
        }

        // h. Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display results
        System.out.println("\nDigits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}