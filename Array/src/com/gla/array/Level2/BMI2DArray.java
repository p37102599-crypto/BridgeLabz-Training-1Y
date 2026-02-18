package com.gla.array.Level2;
import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // b. Create 2D array and status array
        double[][] personData = new double[number][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[number];

        // c. Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight with validation
            double weight;
            while (true) {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Invalid input! Weight must be positive.");
            }

            // Input height with validation
            double height;
            while (true) {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Invalid input! Height must be positive.");
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            // d. Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display data
        System.out.println("\nHeight, Weight, BMI, and Status of Each Person:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
