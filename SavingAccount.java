// SavingsAccount.java
// Subclass of BankAccount
// Adds interest and minimum balance restriction
// Demonstrates method overriding

public class SavingsAccount extends BankAccount {

    private double interestRate; // Example: 0.03 = 3%

    // Constructor
    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Override withdraw method
    // Rule: After withdrawal, balance must be >= 100
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else if ((balance - amount) >= 100) {
            balance -= amount;
        }
        else {
            System.out.println("Cannot withdraw: minimum balance of 100 required");
        }
    }

    // Add interest to balance
    public void addInterest() {
        balance = balance + (balance * interestRate);
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("SavingsAccount[%s, balance=%.2f, interestRate=%.1f%%]",
                getAccountNumber(), balance, interestRate * 100);
    }
}
