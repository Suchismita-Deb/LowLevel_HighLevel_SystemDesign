package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

import java.util.List;

public class Student {
    int roll;
    int age;
    String name;
    String location;
    String mobileNumber;
    List<String> subject;

    public Student(StudentBuilder builder){
        this.roll = builder.roll;
    }

    public String toString(){
        return ""+"Roll Number "+this.roll+" "+
                "Age "+this.age+" "+
                "Name "+this.name+" "+
                "Location "+this.location+" "+
                "Mobile Number "+this.mobileNumber;
    }
}
