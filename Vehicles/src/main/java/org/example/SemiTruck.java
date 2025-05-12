package org.example;

public class SemiTruck extends Vehicle {
    private int maxLoadBearing;
    private int numberOfTrailers;
    private int numberOfWheels;
    private boolean hasSleepingCabin;

    public int getMaxLoadBearing() { return maxLoadBearing; }
    public int getNumberOfTrailers() { return numberOfTrailers; }
    public int getNumberOfWheels() { return numberOfWheels; }
    public boolean isHasSleepingCabin() { return hasSleepingCabin; }

    public void setMaxLoadBearing(int maxLoadBearing) { this.maxLoadBearing = maxLoadBearing; }
    public void setNumberOfTrailers(int numberOfTrailers) { this.numberOfTrailers = numberOfTrailers; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }
    public void setHasSleepingCabin(boolean hasSleepingCabin) { this.hasSleepingCabin = hasSleepingCabin; }

    public SemiTruck(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric, int maxLoadBearing, int numberOfTrailers, int numberOfWheels, boolean hasSleepingCabin) {
        super(typeOfVehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleId, odometer, isElectric);
        this.maxLoadBearing = maxLoadBearing;
        this.numberOfTrailers = numberOfTrailers;
        this.numberOfWheels = numberOfWheels;
        this.hasSleepingCabin = hasSleepingCabin;
    }

    public SemiTruck(int maxLoadBearing, int numberOfTrailers, int numberOfWheels, boolean hasSleepingCabin) {
        this.maxLoadBearing = maxLoadBearing;
        this.numberOfTrailers = numberOfTrailers;
        this.numberOfWheels = numberOfWheels;
        this.hasSleepingCabin = hasSleepingCabin;
    }
}
