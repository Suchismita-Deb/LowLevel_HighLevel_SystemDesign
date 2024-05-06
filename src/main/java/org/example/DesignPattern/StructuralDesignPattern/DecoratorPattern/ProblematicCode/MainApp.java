package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.ProblematicCode;

import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode.FacebookDecorator;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode.INotifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode.Notifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode.WhatsAppDecorator;

public class MainApp {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode.Notifier("SDEB")));
        notifyAll.send("Message");
        INotifier notifyFbMail = new FacebookDecorator(new Notifier("SDEB"));
        notifyFbMail.send("Message");

    }

}
