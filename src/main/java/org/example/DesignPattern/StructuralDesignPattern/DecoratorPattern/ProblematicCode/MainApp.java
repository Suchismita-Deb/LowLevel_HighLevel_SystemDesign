package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.ProblematicCode;

import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode1.FacebookDecorator;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode1.INotifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode1.Notifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode1.WhatsAppDecorator;

public class MainApp {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("SDEB")));
        notifyAll.send("Message");
        INotifier notifyFbMail = new FacebookDecorator(new Notifier("SDEB"));
        notifyFbMail.send("Message");

    }

}
