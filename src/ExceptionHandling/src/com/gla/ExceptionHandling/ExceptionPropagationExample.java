package com.gla.ExceptionHandling;
public class ExceptionPropagationExample {

    // method1() throws an ArithmeticException
    static void method1() {
        // This will cause ArithmeticException (division by zero)
        int result = 10 / 0;
    }

    // method2() calls method1()
    static void method2() {
        method1(); // Exception propagates from here
    }

    public static void main(String[] args) {
        try {
            method2(); // Call method2, exception may propagate
        } catch (ArithmeticException e) {
            // Handle the exception in main
            System.out.println("Handled exception in main");
        }
    }
}