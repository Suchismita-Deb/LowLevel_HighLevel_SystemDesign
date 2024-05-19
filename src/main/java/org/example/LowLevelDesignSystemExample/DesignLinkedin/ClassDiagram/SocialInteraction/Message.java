package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SocialInteraction;

import User;

import java.util.ArrayList;

public class Message {
    int messageId;
    User sender;
    ArrayList<User> recipients;
    String text;
    ArrayList<Character> media;



    boolean addRecipients(ArrayList<User> recipients){
        return true;
    }
}
