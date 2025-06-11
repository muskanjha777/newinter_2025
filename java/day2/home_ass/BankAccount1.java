package bankac;
import java.util.*;

public class BankAccount1 {
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount1(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f. New balance: %.2f\n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn %.2f. New balance: %.2f\n", amount, balance);
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.printf("Account Number: %s, Holder: %s, Balance: %.2f\n",
                accountNumber, accountHolder, balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount1 b = new BankAccount1("123", "Sayali", 5000);

        b.deposit(500);
        b.withdraw(2000);
        b.displayAccountInfo();
    }
}


