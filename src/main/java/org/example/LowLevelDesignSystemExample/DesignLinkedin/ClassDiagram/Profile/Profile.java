package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Profile;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Achievement;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Analytics;
import java.util.ArrayList;

public class Profile {
    String headline;
    String about;
    String gender;
    ArrayList<Character> profilePicture;
    ArrayList<Character> coverPhoto;

    ArrayList<Experience> experiences;
    ArrayList<Education> educations;
    ArrayList<Skills> skills;
    ArrayList<Achievement> achievements;
    ArrayList<Recommendation> recommendations;
    Analytics analytics;

    boolean addExperience(Experience experience){
        return true;
    }
    boolean addEducation(Education education){
        return true;
    }
    boolean addSkill(Skills skill){
        return true;
    }
    boolean addAchievement(Achievement achievement){
        return true;
    }
}
