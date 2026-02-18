package com.gla.Methods.level3;
import java.util.Scanner;

public class NumberChecker {

    // a. Method to find count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;

        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // b. Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        number = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // c. Method to check Duck Number
    // (As per question: number having a non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    // d. Method to check Armstrong Number
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // e. Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // f. Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nDigits count: " + digitCount);

        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\nDuck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second Largest digit: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second Smallest digit: " + smallest[1]);

        sc.close();
    }
}