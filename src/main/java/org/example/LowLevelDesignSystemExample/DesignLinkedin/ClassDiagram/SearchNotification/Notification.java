package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SearchNotification;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Account;

public class Notification {
    int notificationId;
    String createdOn;
    String content;

    boolean sendNotification(Account account){
        return true;
    }
}
