package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SocialInteraction;

import User;

import java.util.ArrayList;

public class Post {
    int postId;
    User postOwner;
    String text;
    ArrayList<Character> media;
    int totalReacts;
    int totalShares;
    vector<Comment> comments;

    boolean updateText(){
        return true;
    }
}
