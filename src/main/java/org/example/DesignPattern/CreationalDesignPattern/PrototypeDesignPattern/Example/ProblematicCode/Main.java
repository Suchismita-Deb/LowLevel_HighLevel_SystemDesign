package org.example.DesignPattern.CreationalDesignPattern.PrototypeDesignPattern.Example.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(1,12,"Rohan");

        // Cloning another object.
        Student obj1 = new Student();
        obj1.name = obj.name;
        obj1.age = obj.age;
        // roll cannot be copied as roll is private.
        // obj1.roll = obj.roll;
    }
}
