package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCode;

public class Main {
    public static void main(String[] args) {
        IRobot humanRobot1 = new HumanRobot("humanRobot");
        humanRobot1.display(1,2);

        IRobot humanRobot2 = new HumanRobot("humanRobot");
        humanRobot2.display(10,12);

        IRobot humanRobot3 = new HumanRobot("humanRobot");
        humanRobot3.display(8,12);

        IRobot roboticDog1 = new RoboticDog("roboticDog");
        roboticDog1.display(8,9);

        IRobot roboticDog2 = new RoboticDog("roboticDog");
        roboticDog2.display(89,89);

        IRobot roboticDog3 = new RoboticDog("roboticDog");
        roboticDog3.display(89,98);
    }
}
