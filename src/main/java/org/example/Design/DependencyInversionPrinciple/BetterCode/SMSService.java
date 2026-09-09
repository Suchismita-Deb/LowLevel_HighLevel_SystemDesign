package org.example.Design.DependencyInversionPrinciple.BetterCode;

public class SMSService implements NotificationChannel{

    @Override
    public void send(String message) {
        System.out.println("Sneding Sms notification" + message);
    }
}
