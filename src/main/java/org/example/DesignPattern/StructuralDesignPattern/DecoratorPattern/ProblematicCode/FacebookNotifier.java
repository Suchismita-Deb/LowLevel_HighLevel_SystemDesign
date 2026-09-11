package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.ProblematicCode;

public class FacebookNotifier extends Notifier{
    public FacebookNotifier(String userName){
        super(userName);
    }

    @Override
    public void send(String message) {
        String fbName = databaseService.getFbNameFromUserName(getUserName());
        System.out.println("Sending " + message + " on Facebook to " + fbName);
    }
}
