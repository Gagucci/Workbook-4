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

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getTravelRange() {
        return travelRange;
    }

    public int getVehicleYearMade() {
        return vehicleYearMade;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public int getOdometer() {
        return odometer;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setTravelRange(int travelRange) {
        this.travelRange = travelRange;
    }

    public void setVehicleYearMade(int vehicleYearMade) {
        this.vehicleYearMade = vehicleYearMade;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Vehicle(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric) {
        this.typeOfVehicle = typeOfVehicle;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.passengerCount = passengerCount;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.travelRange = travelRange;
        this.vehicleYearMade = vehicleYearMade;
        this.vehicleID = vehicleId;
        this.odometer = odometer;
        this.isElectric = isElectric;
    }

    public Vehicle() {

    }
}