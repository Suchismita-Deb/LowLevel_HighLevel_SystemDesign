package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCode;

public class RoboticDog implements IRobot{

    private String type;

    RoboticDog(String type){
        this.type = type;
    }

    // There is only getter and no setter. 
    public String getType(){
        return type;
    }

    @Override
    public void display(int x, int y) {

    }
}
