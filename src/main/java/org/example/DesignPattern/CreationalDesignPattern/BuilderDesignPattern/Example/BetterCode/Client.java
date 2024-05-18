package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new EngineerStudentBuilder());
        Student engineeringStudent = director.createStudent();
        System.out.println(engineeringStudent.toString());

        Director director1 = new Director(new MBAStudentBuilder());
        Student mbaStudent = director1.createStudent();
        System.out.println(mbaStudent.toString());
    }
}
