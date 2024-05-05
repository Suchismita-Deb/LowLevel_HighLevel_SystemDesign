package org.example.OCP.ExampleOCP.ImprovedCode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Whatsapp Notification.");
    }
}
