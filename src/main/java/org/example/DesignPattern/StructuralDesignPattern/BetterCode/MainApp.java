package org.example.DesignPattern.StructuralDesignPattern.BetterCode;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/v6tpISNjHf8
     */
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

    }

}
