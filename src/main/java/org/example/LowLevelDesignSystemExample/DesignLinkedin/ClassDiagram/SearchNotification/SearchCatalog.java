package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SearchNotification;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.CompanyPage;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Group;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Job;
import User;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchCatalog implements Search {
    HashMap<String, ArrayList<User>> users;
    HashMap<String, ArrayList<CompanyPage>> companies;
    HashMap<String, ArrayList<Job>> jobs;
    HashMap<String, ArrayList<Group>> groups;



    void addNewUser(User user){}
    void addNewCompany(CompanyPage company){}
    void addNewGroup(Group group){}
    void addNewJob(Job job){}


    public ArrayList<User> searchUser(String name)
    {
        // functionality
        ArrayList<User> res = new ArrayList<>();
        return res;
    }

    public ArrayList<CompanyPage> searchCompany(String name)
    {
        // functionality
        ArrayList<CompanyPage> res = new ArrayList<>();
        return res;
    }

    public ArrayList<Group> searchGroup(String name)
    {
        // functionality
        ArrayList<Group> res = new ArrayList<>();
        return res;
    }


    public ArrayList<Job> searchJob(String title)
    {
        // functionality
        ArrayList<Job> res = new ArrayList<>();
        return res;
    }
}
