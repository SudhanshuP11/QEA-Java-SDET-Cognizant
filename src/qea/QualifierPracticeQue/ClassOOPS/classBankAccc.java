package qea.QualifierPracticeQue.ClassOOPS;

class BankAccount {
    private double balance; // ✅ private — encapsulation

    // deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // update balance
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // getter — read balance
    public double getBalance() {
        return balance;
    }
}
public class classBankAccc {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance()); // 500.0

        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance()); // 300.0

        acc.withdraw(1000); // Insufficient balance!
    }
}
