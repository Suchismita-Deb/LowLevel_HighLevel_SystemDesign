package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCode;

public class HumanRobot implements IRobot{

    private String type;

    HumanRobot(String type){
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
