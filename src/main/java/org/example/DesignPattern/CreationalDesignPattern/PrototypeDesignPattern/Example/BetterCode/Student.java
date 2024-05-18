package org.example.DesignPattern.CreationalDesignPattern.PrototypeDesignPattern.Example.BetterCode;

public class Student implements Prototype{
    private int roll;
    public int age;
    public String name;

    Student(){}

    public Student(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(roll,age,name);
    }
}
