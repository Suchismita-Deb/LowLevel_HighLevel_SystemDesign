package org.example.Design.OCP.ExampleOCP.ImprovedCode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Whatsapp Notification.");
    }
}
