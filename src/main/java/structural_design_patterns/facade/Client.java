package structural_design_patterns.facade;

public class Client {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade(123456789, 1000.0);
        bankingFacade.deposit(500.0);
        bankingFacade.withdraw(200.0);
        bankingFacade.makePaymentWithCreditCard("1234 5678 9012 3456", 100.0);

        double accountBalance = bankingFacade.getAccountBalance();
        System.out.println("Current Account Balance: $" + accountBalance);
    }
}
