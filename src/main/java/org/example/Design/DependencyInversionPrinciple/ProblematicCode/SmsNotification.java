package org.example.Design.DependencyInversionPrinciple.ProblematicCode;

public class SmsNotification {


    public void send(String message) {
        System.out.println("SMS send"+message);
    }
}
