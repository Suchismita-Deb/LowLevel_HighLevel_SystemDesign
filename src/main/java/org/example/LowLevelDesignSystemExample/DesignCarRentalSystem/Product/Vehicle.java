package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem.Product;

import java.util.Date;

public class Vehicle {

    int vehicleId;
    int vehicleNumber;
    VehicleType vehicleType;
    String companyName;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalRate;
    int numberOfSeat;
    Status status;

    // Getter and setter.
    public int getVehicleID() {
        return vehicleId;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleId = vehicleID;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalRate;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalRate = hourlyRentalCost;
    }

    public int getNoOfSeat() {
        return numberOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.numberOfSeat = noOfSeat;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
