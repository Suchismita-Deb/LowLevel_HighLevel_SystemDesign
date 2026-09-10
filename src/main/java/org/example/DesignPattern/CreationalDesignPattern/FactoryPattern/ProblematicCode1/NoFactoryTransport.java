package org.example.DesignPattern.CreationalDesignPattern.FactoryPattern.ProblematicCode1;

public class NoFactoryTransport {
    public static void main(String[] args) {
        Transport transport = new Car();
        transport.deliver();
        Transport transport1 = new Bike();
        transport1.deliver();
    }
}
interface Transport{
    void deliver();
}
class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by car.");
    }
}
class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by bike.");
    }
}