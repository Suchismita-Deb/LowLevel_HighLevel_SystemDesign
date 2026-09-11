package org.example.DesignPattern.StructuralDesignPattern.AdapterPattern.ProblematicCode;

public class NoAdapterPattern {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationSystem();
        notificationService.send("abc@gmail.com","Hello World","Testing the email service.");
        // NotificationService sendGridEmail = new NotificationService();
        // The interface mismatch and the application code is using the send method and the new change is using the sendEmail() method.
    }
}
// Legacy system.
class EmailNotificationSystem implements NotificationService{
    public void send(String to, String subject, String message) {
        System.out.println("Sending email to - "+to);
        System.out.println("Subject: "+subject);
        System.out.println("Message: "+message);
    }
}

interface NotificationService{
    void send(String to, String subject, String message);
}
class SendGrid {

    public void sendEmail(String to, String subject, String message) {
        System.out.println("Sending email to - "+to);
        System.out.println("Subject: "+subject);
        System.out.println("Message: "+message);
    }
}
