package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCodeDoubt;

public class Main {
    public static void main(String[] args) {
        IRobot robot1 = RobotFactory.createObject("humanRobot");
        robot1.display(10,20);

        IRobot robot2 = RobotFactory.createObject("humanRobot");
        robot2.display(20,30);

        IRobot robot3 = RobotFactory.createObject("dogRobot");
        robot3.display(12,20);
    }
}
