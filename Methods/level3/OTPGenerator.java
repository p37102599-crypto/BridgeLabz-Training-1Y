package com.gla.Methods.level3;
public class OTPGenerator {

    // a. Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generates number between 100000 and 999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // c. Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all unique
    }

    public static void main(String[] args) {

        // b. Array to store 10 OTP numbers
        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique ✅");
        } else {
            System.out.println("Duplicate OTP found ❌");
        }
    }
}