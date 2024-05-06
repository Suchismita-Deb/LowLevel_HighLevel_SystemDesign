package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.ProblematicCode;

import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.BetterCode.FacebookDecorator;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.BetterCode.INotifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.BetterCode.Notifier;
import org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example.BetterCode.WhatsAppDecorator;

public class MainApp {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("SDEB")));
        notifyAll.send("Message");
        INotifier notifyFbMail = new FacebookDecorator(new Notifier("SDEB"));
        notifyFbMail.send("Message");

    }

}
