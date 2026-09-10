package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.BetterCode;

public class FactoryPatternShape {

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

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle.");
    }
}

class NullObject implements Shape {
    @Override
    public void draw() {
        System.out.println("Following Null Object Pattern.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        }

        return new NullObject();
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square.");
    }
}