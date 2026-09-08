package org.example.Design.DependencyInversionPrinciple.BetterCode;

public class SMSService implements NotificationChannel{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sneding Sms notification" + message);
    }
}
