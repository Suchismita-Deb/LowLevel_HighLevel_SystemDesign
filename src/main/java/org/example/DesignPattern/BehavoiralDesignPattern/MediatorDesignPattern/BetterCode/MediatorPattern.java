package org.example.DesignPattern.BehavoiralDesignPattern.MediatorDesignPattern.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser bob = new ChatUser("Bob", chatRoom);
        ChatUser alice = new ChatUser("Alice", chatRoom);

        chatRoom.addUser(bob);
        chatRoom.addUser(alice);

        chatRoom.sendMessage("Hello", alice);
    }
}

class ChatUser {
    private String name;
    private ChatMediator chatMediator;

    ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " send the message " + message);
    }

    public void receiveMessage(String message, ChatUser sender) {
        System.out.println(name + " received the message " + message + " from user " + sender.getName());
//        chatMediator.sendMessage(message,this);
    }
}

interface ChatMediator {
    void sendMessage(String message, ChatUser user);

    void addUser(ChatUser user);
}

class ChatRoom implements ChatMediator {
    private List<ChatUser> users;

    ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, ChatUser sender) {
        for (ChatUser user : users) {
            if (!user.getName().equals(sender.getName()))
                user.receiveMessage(message, sender);
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}