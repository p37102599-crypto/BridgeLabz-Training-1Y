package com.gla.ExceptionHandling;

// Custom checked exception
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

