package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicleObject("Car");
        printVehicleDetail(v1);
        System.out.println();
        Vehicle v12 = VehicleFactory.getVehicleObject("Commercial");
        printVehicleDetail(v12);
    }

    private static void printVehicleDetail(Vehicle v1) {
        System.out.println(v1.getSeatCapacity());
        System.out.println(v1.getTankCapacity());
    }
}
