package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem;

import org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product.Vehicle;

import java.util.Date;
import java.util.UUID;

public class Reservation {

    UUID reservationID;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public UUID createReserve(User user, Vehicle vehicle) {
        // generate new id;
        reservationID = UUID.randomUUID();
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationID;
    }

    // Reservation modify operations can be added here.
}
