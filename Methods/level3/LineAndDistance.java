package com.gla.Methods.level3;
import java.util.Scanner;

public class LineAndDistance {

    // b. Method to find Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );
    }

    // c. Method to find slope and y-intercept
    // returns array: [0] = slope (m), [1] = y-intercept (b)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;          // y-intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take inputs
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Line equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}
