package com.gla.classesobjects.level2;
public class BankAccount {

    // Attributes
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Amar",
                1234567890L,
                10000
        );

        account.displayBalance();
        account.deposit(3000);
        account.withdraw(4000);
        account.displayBalance();
    }
}