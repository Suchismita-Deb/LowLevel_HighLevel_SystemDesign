package org.example.Design.OCP.ExampleOCP.ProblematicCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification(){
        System.out.println("Sending SMS Notification.");
    }

    public void sendEmailNotification(){
        System.out.println("Sending Email Notification.");
    }

    public void sendWhatsappNotification(){
        System.out.println("Sending Whatsapp Notification.");
    }

}
