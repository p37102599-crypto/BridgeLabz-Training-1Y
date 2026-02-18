package com.gla.Methods.level1;
public class Trigonometry {

    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return results in an array
        return new double[] { sin, cos, tan };
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        Trigonometry obj = new Trigonometry();
        double angle = 45;

        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}