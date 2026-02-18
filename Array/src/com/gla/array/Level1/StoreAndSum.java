package com.gla.array.Level1;
import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Create array and total variable
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // c. Break if 0 or negative number entered
            if (input <= 0) {
                break;
            }

            // d. Break if array is full
            if (index == 10) {
                System.out.println("Array limit reached (10 numbers).");
                break;
            }

            // e. Store number and increment index
            numbers[index] = input;
            index++;
        }

        System.out.println("\nNumbers entered:");

        // f. Loop to display numbers and calculate total
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // g. Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}