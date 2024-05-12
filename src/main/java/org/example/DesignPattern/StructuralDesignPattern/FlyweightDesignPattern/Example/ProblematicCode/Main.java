package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        for(int i=0;i<1000;i++){
            Robot humanRobot = new Robot(x+i,y+i,"HumanRobot");
        }
        for(int i=0;i<5000;i++){
            Robot roboticDog = new Robot(x+i,y+i,"RoboticDog");
        }
    }
}
