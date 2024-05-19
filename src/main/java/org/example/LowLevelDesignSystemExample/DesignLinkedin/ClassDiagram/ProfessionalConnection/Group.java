package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Observer;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Subject;

import java.util.ArrayList;
import java.util.List;

public class Group extends Subject {
    int groupId;
    String name;
    String description;
    int totalMembers;
    ArrayList<Observer> members;

    boolean updateDescription(){
        return true;
    }
    void attach(Observer observer)
    {
        members.add(observer);
    }
    void detach(Observer observer)
    {
        // erase the entry of observer from members vector
    }
    void notifyMessage()
    {
        // loop over members
        for (Observer observer : members)
        {
//            observer.update("Hey new post in the group");
        }
    }
}
