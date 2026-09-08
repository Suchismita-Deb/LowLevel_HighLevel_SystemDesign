package org.example.Design.DependencyInversionPrinciple.BetterCode;

public class Main {

    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.sendNotification("Hello");
    }
}
