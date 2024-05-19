package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SocialInteraction;

import User;

import java.util.ArrayList;

public class Comment {
    int commentId;
    User commentOwner;
    String text;
    int totalReacts;
    ArrayList<Comment> comments;


    boolean updateText(){
        return true;
    }
}
