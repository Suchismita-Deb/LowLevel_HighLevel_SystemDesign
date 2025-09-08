package org.example.LowLevelDesignSystemExample.DesignLinkedin.src.services;


import org.example.LowLevelDesignSystemExample.DesignLinkedin.src.entities.Member;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.src.entities.Notification;

public class NotificationService {
    public void sendNotification(Member member, Notification notification) {
        // In a real system, this would push to a queue or a websocket.
        // Here, we directly call the member's update method.
        member.update(notification);
    }
}
