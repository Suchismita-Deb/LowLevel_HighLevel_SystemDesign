package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Person;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.*;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.CompanyPage;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Group;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Job;

import java.util.ArrayList;

public class User extends Person implements Observer {

    int userId;
    String dateOfJoining;
    Profile profile;

    ArrayList<User> followsUsers; // contain most recent 10 follows
    ArrayList<CompanyPage> followCompanies;
    ArrayList<User> connections;
    // vector<User> followsUsers;
    // vector<CompanyPage> followCompanies;
    ArrayList<Group> joinedGroups;
    ArrayList<CompanyPage> createdPages;
    ArrayList<Group> createdGroups;

    boolean sendMessage(Message message){return true;}
    boolean sendInvite(ConnectionInvitation invite){return true;}
    boolean cancelInvite(ConnectionInvitation invite){return true;}
    boolean createPage(CompanyPage page){return true;}
    boolean deletePage(CompanyPage page){return true;}
    boolean createGroup(Group group){return true;}
    boolean deleteGroup(Group group){return true;}
    boolean createPost(Post post){return true;}
    boolean deletePost(Post post){return true;}
    boolean createComment(Comment comment){return true;}
    boolean deleteComment(Comment comment){return true;}
    boolean react(Post post){return true;}
    boolean requestRecommendation(User user){return true;}
    boolean acceptRecommendation(User user){return true;}
    boolean applyForJob(Job job){return true;}

    @Override
    public void update(String message) {

    }
}
