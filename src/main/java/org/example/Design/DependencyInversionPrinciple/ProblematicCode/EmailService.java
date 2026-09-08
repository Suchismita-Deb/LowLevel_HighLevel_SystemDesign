package org.example.Design.DependencyInversionPrinciple.ProblematicCode;

public class EmailService {

    public void send(String message) {
        System.out.println("Email send"+message);
    }
}
