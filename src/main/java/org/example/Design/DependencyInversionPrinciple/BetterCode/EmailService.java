package org.example.Design.DependencyInversionPrinciple.BetterCode;

public class EmailService implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
