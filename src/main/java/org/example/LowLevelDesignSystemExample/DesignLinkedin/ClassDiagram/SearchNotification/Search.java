package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SearchNotification;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.CompanyPage;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Group;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Job;
import User;

import java.util.ArrayList;

public interface Search {
    ArrayList<User> searchUser(String name);
    ArrayList<CompanyPage> searchCompany(String name);
    ArrayList<Group> searchGroup(String name);
    ArrayList<Job> searchJob(String title);
}
