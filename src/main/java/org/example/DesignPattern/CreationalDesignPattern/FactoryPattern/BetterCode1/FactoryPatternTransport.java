package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.BetterCode1;

import java.util.Locale;

public class FactoryPatternTransport {
    public static void main(String[] args) {
        Transport factory = TransportFactory.createTransport("Car");
        factory.deliver();
    }
}
class TransportFactory {
    // The static method to create the object we dont want the object of the factory and we want to create the object of the transport interface
    public static Transport createTransport(String type) {
        switch(type.toLowerCase()) {
            case "car": return new Car();
            case "bike": return new Bike();
            default: throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
interface Transport{
    void deliver();
}
class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by car.");
    }
}
class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by bike.");
    }
}