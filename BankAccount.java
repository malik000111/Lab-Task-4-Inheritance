// BankAccount.java
// Superclass representing a general bank account
// Demonstrates encapsulation (private fields + public methods)

public class BankAccount {

    // Private fields (Encapsulation)
    private String accountNumber;
    protected double balance;  // protected so subclasses can access

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;  // Initialize balance to 0
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("BankAccount[%s, balance=%.2f]",
                accountNumber, balance);
    }
}
