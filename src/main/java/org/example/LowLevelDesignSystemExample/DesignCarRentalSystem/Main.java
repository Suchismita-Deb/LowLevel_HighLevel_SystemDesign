package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem;

import org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.BetterCode.PaymentFlow;
import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.Car;
import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.Vehicle;
import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores,users);

        // User comes.
        User user = users.get(0);
        // User search stores based location.
        Location location = new Location(179789,"Bangalore","Karnataka","India");
        Store store = rentalSystem.getStore(location);
        // get the vehicle interested based on filters.
        List<Vehicle> storeVehicles = store.getVehicle(VehicleType.CAR);
        // Reserving the particular vehicle.
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));
        // Generate the bill.
        Bill bill = new Bill(reservation);
        // Make payment.
        Payment payment = new Payment();
        payment.payBill(bill);
        // Trip completed, submit the vehicle and close the reservation.
        store.completeReservation(reservation.reservationID);
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;

    }

    private static List<Vehicle> addVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;


    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;

    }
}
