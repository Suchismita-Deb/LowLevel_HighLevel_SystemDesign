package org.example.DesignPattern.StructuralDesignPattern.AdapterPattern.BetterCode;

public class AdapterPattern {
    public static void main(String[] args) {
        NotificationService notificationService = new SendGridAdapter(new SendGrid()); // The class takes the value in parameter in the constructor.
        notificationService.send("abc@gmail.com","hello World","Testing the email service.");
        // The send method is used and the send method is internally calling the sendEmail().
    }
}
interface NotificationService{
    void send(String to, String subject, String message);
}
class SendGridAdapter implements NotificationService{

    private SendGrid sendGrid;
    // The instance will be used to send the email.


    public SendGridAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public void send(String to, String subject, String message) {
        // Adapter method and it will convert all the request that are coming as Send() will be moved to the sendEmail() method.
        sendGrid.sendEmail(to, subject, message);
    }
}
class SendGrid {

    public void sendEmail(String to, String subject, String message) {
        System.out.println("Sending email to - "+to);
        System.out.println("Subject: "+subject);
        System.out.println("Message: "+message);
    }
}