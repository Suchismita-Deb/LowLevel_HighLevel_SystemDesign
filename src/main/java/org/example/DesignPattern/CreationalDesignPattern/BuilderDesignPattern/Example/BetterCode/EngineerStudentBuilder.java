package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Computer Science");
        this.subject = subjects;
        return this;
    }
}
