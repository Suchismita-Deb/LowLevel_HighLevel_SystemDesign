package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

import java.util.List;

public abstract class StudentBuilder {
    int roll;
    int age;
    String name;
    String location;
    String mobileNumber;
    List<String> subject;

    public StudentBuilder setRoll(int roll){
        this.roll = roll;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setLocation(String location){
        this.location = location;
        return this;
    }

    public StudentBuilder setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }

}
