package structural_design_patterns.facade;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }
}
