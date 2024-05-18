package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubject(){
        List<String> subjects = new ArrayList<>();
        subjects.add("Business Analytics.");
        subjects.add("Engineering Management.");
        this.subject = subjects;
        return this;
    }
}
