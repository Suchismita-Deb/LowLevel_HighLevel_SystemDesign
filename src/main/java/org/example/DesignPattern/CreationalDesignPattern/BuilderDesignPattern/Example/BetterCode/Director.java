package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.Example.BetterCode;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineerStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }
    private Student createEngineeringStudent(){
        return studentBuilder.setRoll(1).setAge(20).setLocation("Japan").setSubject().build();
    }
    private Student createMBAStudent(){
        return studentBuilder.setRoll(1).setAge(20).setLocation("Japan").setSubject().build();
    }
}
