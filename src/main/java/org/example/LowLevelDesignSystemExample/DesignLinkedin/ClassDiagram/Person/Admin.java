package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Person;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.CompanyPage;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.Group;

public class Admin extends Person {

    boolean blockUser(User user){
        return false;
    }
    boolean unblockUser(User user){
        return false;
    }
    boolean disablePage(CompanyPage page){
        return false;
    }
    boolean enablePage(CompanyPage page){
        return false;
    }
    boolean deleteGroup(Group group){
        return false;
    }
}
