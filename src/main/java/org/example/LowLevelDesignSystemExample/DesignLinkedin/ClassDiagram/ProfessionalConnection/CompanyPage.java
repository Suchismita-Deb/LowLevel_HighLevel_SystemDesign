package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection;

import java.util.ArrayList;

public class CompanyPage {
    int pageId;
    String name;
    String description;
    String type;
    int companySize;
    User createdBy;
    ArrayList<Job> jobs;

    boolean createJobPosting(){
        return true;
    }
    boolean deleteJobPosting(Job job){
        return true;
    }
}
