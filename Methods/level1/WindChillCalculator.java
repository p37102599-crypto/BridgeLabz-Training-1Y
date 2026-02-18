package com.gla.Methods.level1;

import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74
                + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        // Creating object and calling method
        WindChillCalculator wc = new WindChillCalculator();
        double windChill = wc.calculateWindChill(temperature, windSpeed);

        // Output
        System.out.println("The wind chill temperature is: " + windChill);

        sc.close();
    }
}
