// CheckingAccount.java
// Subclass of BankAccount
// Allows overdraft up to a limit
// Demonstrates method overriding

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method
    // Allow balance to go negative but not below -overdraftLimit
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else if ((balance - amount) >= -overdraftLimit) {
            balance -= amount;
        }
        else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("CheckingAccount[%s, balance=%.2f, overdraftLimit=%.1f]",
                getAccountNumber(), balance, overdraftLimit);
    }
}
