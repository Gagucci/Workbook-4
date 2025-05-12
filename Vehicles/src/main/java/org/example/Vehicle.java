package org.example;

public class Vehicle {
    private String typeOfVehicle;
    private String vehicleMake;
    private String vehicleModel;
    private int passengerCount;
    private int cargoCapacity;
    private int fuelCapacity;
    private int travelRange;
    private int vehicleYearMade;
    private String vehicleID;
    private int odometer;
    private boolean isElectric;

    public String typeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String vehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String vehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int passengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int cargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int fuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int travelRange() {
        return travelRange;
    }

    public void setTravelRange(int travelRange) {
        this.travelRange = travelRange;
    }

    public int vehicleYearMade() {
        return vehicleYearMade;
    }

    public void setVehicleYearMade(int vehicleYearMade) {
        this.vehicleYearMade = vehicleYearMade;
    }

    public String vehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int odometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
