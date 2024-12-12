package org.example.Design.OCP.ExampleOCP.ImprovedCode;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sms Notification.");
    }
}
