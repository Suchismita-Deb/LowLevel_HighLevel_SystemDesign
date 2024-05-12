package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getVehicleName("XUV"));
        printVehicleDetail(v1);

    }
    public static void printVehicleDetail(Vehicle vehicle){
        System.out.println(vehicle.getSeatingCapacity());
    }
}
