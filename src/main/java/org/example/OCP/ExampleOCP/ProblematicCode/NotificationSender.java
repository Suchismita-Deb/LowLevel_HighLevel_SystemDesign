package org.example.OCP.ExampleOCP.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypeList){
        for(NotificationType types:notificationTypeList){
            if(types==NotificationType.SMS){
                types.sendSMSNotification();
            }
            else if(types==NotificationType.EMAIL){
                types.sendEmailNotification();
            }
            else if(types==NotificationType.WHATSAPP){
                types.sendWhatsappNotification();
            }
        }
    }
}
