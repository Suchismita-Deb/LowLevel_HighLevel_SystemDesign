package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObject = new ShapeFactory();
        Shape s1 = shapeFactoryObject.getShape("Circle");
        s1.draw();
        Shape s2 = shapeFactoryObject.getShape("Rectangle");
        s2.draw();
        Shape s3 = shapeFactoryObject.getShape("Square");
        s3.draw();
    }
}
