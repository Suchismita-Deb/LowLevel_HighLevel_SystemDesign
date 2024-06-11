package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem;

import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.Vehicle;
import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Store {

    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location storeLocation;
    List<Reservation> reservationList = new ArrayList<>();
    public List<Vehicle> getVehicle(VehicleType vehicleType){


        // Here we can pass more specification of the car.
        // We can choose the car and also we can specify like hatchback, sedan and pass in the parameter.
        return vehicleInventoryManagement.getVehicles();
    }

    // Inventory Management to update and add vehicle.
    public void setVehicle(List<Vehicle> vehicles){
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }
    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservationList.add(reservation);
        return reservation;
    }
    public boolean completeReservation(UUID reservationID){
        // take out the reservation from the list and call complete the reservation method.
        return true;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

}
