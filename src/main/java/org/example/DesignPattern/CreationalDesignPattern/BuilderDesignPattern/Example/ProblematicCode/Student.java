package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.ProblematicCode;

public class Student {
    int roll;
    int age;
    String name;
    String location;
    String mobileNumber;

    public Student(int roll, int age, String name, String location, String mobileNumber){
        this.roll = roll;
        this.age = age;
        this.name = name;
        this.location = location;
        this.mobileNumber = mobileNumber;
    }


    public Student(int roll, int age){
        this.roll = roll;
        this.age = age;
    }
    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
//    This constructor is not possible as we have the same parameter.
//    public Student(int roll, String location){
//        this.roll = roll;
//        this.location = location;
//    }

}
