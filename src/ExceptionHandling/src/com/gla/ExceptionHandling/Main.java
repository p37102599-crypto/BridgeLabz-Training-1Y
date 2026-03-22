package com.gla.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000); // Initial balance

        try {
            account.withdraw(2000); // Valid withdrawal
            account.withdraw(4000); // Exceeds balance
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-100); // Negative amount
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}