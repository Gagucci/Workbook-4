package org.example;

public class Moped extends Vehicle {
    private String mopedSize;
    private String mopedType;

    public String getMopedSize() { return mopedSize; }
    public String getMopedType() { return mopedType; }

    public void setMopedSize(String mopedSize) { this.mopedSize = mopedSize; }
    public void setMopedType(String mopedType) { this.mopedType = mopedType; }

    public Moped(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric, String mopedSize, String mopedType) {
        super(typeOfVehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleId, odometer, isElectric);
        this.mopedSize = mopedSize;
        this.mopedType = mopedType;
    }

    public Moped(String mopedSize, String mopedType) {
        this.mopedSize = mopedSize;
        this.mopedType = mopedType;
    }
}
