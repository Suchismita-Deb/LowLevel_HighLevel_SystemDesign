package org.example.OCP.ExampleOCP.ImprovedCode;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<Notification> notifications){
        for(Notification notification:notifications){
            notification.send();
        }
    }
}
