package org.example.DesignPattern.BehavoiralDesignPattern.MediatorDesignPattern.ProblematicCode;

public class NoMediatorPattern {
    public static void main(String[] args) {
        User bob = new User("Bob");
        User alice = new User("Alice");

        bob.sendMessage("Hello",alice);
        bob.sendMessage("World",alice);

        // The number of participant and one user will send the message to the other users and total of O(N2) complexity.
    }
}
class User {
    private String name;

    User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void sendMessage(String message, User recipient){
        System.out.println(name +" send the message "+message + " to user " + recipient);
    }
}