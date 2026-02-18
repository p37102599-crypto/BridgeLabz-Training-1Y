package com.gla.array.Level2;
import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        // b. Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d & e. Extract digits and store in array
        while (number != 0) {
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            index++;

            // f. Check maxDigit limit
            if (index == maxDigit) {
                break;
            }

            number = number / 10;
        }

        // g. Variables to store largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Loop through the array to find largest and second largest
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