package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.ProblematicCode;

public class DatabaseService {
    public String getMailFromUsername(String userName) {
        return userName + "@mail.com";
    }

    public String getFbNameFromUserName(String userName) {
        return userName + "@phone";
    }

    public String getPhoneNbrFromUserName(String userName) {
        return userName + "@Facebook";
    }
}
