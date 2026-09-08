package org.example.Design.DependencyInversionPrinciple.BetterCode;

public class NotificationService {

    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void sendNotification(String message) {
        notificationChannel.send("Hello"); // The interface has the method and any object of the NotificationChannel will implement the method.

    }
}
