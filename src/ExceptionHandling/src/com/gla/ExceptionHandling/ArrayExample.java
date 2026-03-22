package com.gla.ExceptionHandling;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Ask user for array size
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = null;

            // Initialize array only if size > 0
            if (size > 0) {
                arr = new int[size];

                // Input elements
                System.out.println("Enter array elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            // Ask for index
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            // Access element
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}