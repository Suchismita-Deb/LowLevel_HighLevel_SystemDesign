package org.example.OCP.ExampleOCP.ImprovedCode;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Email Notification.");
    }
}
