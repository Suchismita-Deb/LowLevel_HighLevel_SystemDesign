package org.example.DesignPattern.CreationalDesignPattern.PrototypeDesignPattern.Example.BetterCode;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(1,12,"Rohan");
        Student obj1 = (Student) obj.clone();
    }
}
