package BankingSystem;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new SavingsAccount("SA101", "Amit", 8000);
        BankAccount a2 = new CurrentAccount("CA202", "Riya", 15000);

        accounts.add(a1);
        accounts.add(a2);

        for (BankAccount acc : accounts) {

            acc.deposit(2000);
            acc.withdraw(1000);

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(50000);
                System.out.println("Loan Eligible: " +
                        ((Loanable) acc).calculateLoanEligibility());
            }

            System.out.println("-----------------------");
        }
    }
}