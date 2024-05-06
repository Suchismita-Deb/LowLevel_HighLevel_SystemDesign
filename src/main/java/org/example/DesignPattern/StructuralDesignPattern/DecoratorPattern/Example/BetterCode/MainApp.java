package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.BetterCode;

public class MainApp {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("SDEB")));
        notifyAll.send("Message");
        INotifier notifyFbMail = new FacebookDecorator(new Notifier("SDEB"));
        notifyFbMail.send("Message");

    }

}
