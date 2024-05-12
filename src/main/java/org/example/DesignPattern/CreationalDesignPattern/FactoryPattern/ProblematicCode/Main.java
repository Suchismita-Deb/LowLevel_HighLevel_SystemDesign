package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        String s = "Circle";
        if(s.equalsIgnoreCase("Circle")){
            Shape s1 = new Circle();
            s1.draw();
        }
        else if(s.equalsIgnoreCase("Rectangle")){
            Shape s2 = new Rectangle();
            s2.draw();
        }
        else if(s.equalsIgnoreCase("Square")){
            Shape s3 = new Square();
            s3.draw();
        }
        else{
            Shape s4 = new NullObject();
            s4.draw();
        }
    }
}
