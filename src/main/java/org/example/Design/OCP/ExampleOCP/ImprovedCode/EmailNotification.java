package org.example.Design.OCP.ExampleOCP.ImprovedCode;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Email Notification.");
    }
}
