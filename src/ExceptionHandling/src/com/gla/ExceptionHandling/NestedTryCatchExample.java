package com.gla.ExceptionHandling;
import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Taking index and divisor as input
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Outer try for array index
        try {
            int element = arr[index]; // May throw ArrayIndexOutOfBoundsException

            // Inner try for division
            try {
                int result = element / divisor; // May throw ArithmeticException
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
