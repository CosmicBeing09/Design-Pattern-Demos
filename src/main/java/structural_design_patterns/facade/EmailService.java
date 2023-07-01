package structural_design_patterns.facade;

public class EmailService {
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // Email sending logic...
    }
}
