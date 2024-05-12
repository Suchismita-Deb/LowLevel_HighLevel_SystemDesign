package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.BetterCode;

public class ShapeFactory {
    public static Shape getShape(String type){
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        }
        else if("Rectangle".equalsIgnoreCase(type)){
            return new Rectangle();
        }
        else if("Square".equalsIgnoreCase(type)){
            return new Square();
        }

        return new NullObject();
    }
}
