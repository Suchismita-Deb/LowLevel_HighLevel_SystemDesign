package org.example.Design.DependencyInversionPrinciple.ProblematicCode;

public class NotificationService {

    private EmailService emailService;
    private SmsNotification smsNotification;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsNotification = new SmsNotification();
    }
    public void notifyEmail(String message){
        emailService.send(message);
    }


    public void notifySms(String message){
        System.out.println(message);
    }
}
