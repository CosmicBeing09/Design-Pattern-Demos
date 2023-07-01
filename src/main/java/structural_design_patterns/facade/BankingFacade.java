package structural_design_patterns.facade;

public class BankingFacade {
    private BankAccount bankAccount;
    private CreditCardProcessor cardProcessor;
    private EmailService emailService;

    public BankingFacade(int accountNumber, double balance) {
        bankAccount = new BankAccount(accountNumber, balance);
        cardProcessor = new CreditCardProcessor();
        emailService = new EmailService();
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
        emailService.sendEmail("customer@example.com", "Deposit Notification",
                "You have deposited $" + amount + " into your account.");
    }

    public void withdraw(double amount) {
        bankAccount.withdraw(amount);
        emailService.sendEmail("customer@example.com", "Withdrawal Notification",
                "You have withdrawn $" + amount + " from your account.");
    }

    public void makePaymentWithCreditCard(String creditCardNumber, double amount) {
        cardProcessor.processPayment(creditCardNumber, amount);
        emailService.sendEmail("customer@example.com", "Payment Confirmation",
                "Your payment of $" + amount + " has been processed using Credit Card: " + creditCardNumber);
    }

    public double getAccountBalance() {
        return bankAccount.getBalance();
    }
}
