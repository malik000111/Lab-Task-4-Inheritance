// BankTest.java
// Main class to test the banking system
// Creates objects and performs required operations

public class BankTest {

    public static void main(String[] args) {

        // Create Savings Accounts
        SavingsAccount sa1 = new SavingsAccount("SA001", 0.03);
        SavingsAccount sa2 = new SavingsAccount("SA002", 0.05);

        // Create Checking Accounts
        CheckingAccount ca1 = new CheckingAccount("CA001", 500.0);
        CheckingAccount ca2 = new CheckingAccount("CA002", 300.0);

        // ---- Perform operations separately ----

        // Savings Account 1
        sa1.deposit(200.0);
        sa1.withdraw(150.0);
        sa1.withdraw(400.0);  // Test minimum balance rule
        sa1.addInterest();
        System.out.println(sa1);

        System.out.println("---------------------");

        // Savings Account 2
        sa2.deposit(200.0);
        sa2.withdraw(150.0);
        sa2.withdraw(400.0);
        sa2.addInterest();
        System.out.println(sa2);

        System.out.println("---------------------");

        // Checking Account 1
        ca1.deposit(200.0);
        ca1.withdraw(150.0);
        ca1.withdraw(400.0);  // Test overdraft rule
        System.out.println(ca1);

        System.out.println("---------------------");

        // Checking Account 2
        ca2.deposit(200.0);
        ca2.withdraw(150.0);
        ca2.withdraw(400.0);
        System.out.println(ca2);
    }
}
