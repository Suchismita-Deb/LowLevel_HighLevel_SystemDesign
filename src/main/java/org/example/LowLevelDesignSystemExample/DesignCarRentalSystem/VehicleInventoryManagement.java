package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem;

import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    // Inventory Management is for particular store. If there are 10 stores then each store will haev the Inventory Management.
    List<Vehicle> vehicles;
    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        //filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
