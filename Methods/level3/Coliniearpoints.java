package com.gla.Methods.level3;
public class Coliniearpoints {

    // b. Method using slope formula
    public static boolean isCollinearBySlope(int x1, int y1,
                                             int x2, int y2,
                                             int x3, int y3) {

        // Avoid division by zero using cross multiplication
        return (y2 - y1) * (x3 - x2) ==
                (y3 - y2) * (x2 - x1);
    }

    // c. Method using area of triangle formula
    public static boolean isCollinearByArea(int x1, int y1,
                                            int x2, int y2,
                                            int x3, int y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points:");
        System.out.println("A(" + x1 + "," + y1 + ")");
        System.out.println("B(" + x2 + "," + y2 + ")");
        System.out.println("C(" + x3 + "," + y3 + ")");

        // Check using slope method
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear by Slope Method ✅");
        } else {
            System.out.println("Not Collinear by Slope Method ❌");
        }

        // Check using area method
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear by Area Method ✅");
        } else {
            System.out.println("Not Collinear by Area Method ❌");
        }
    }
}
