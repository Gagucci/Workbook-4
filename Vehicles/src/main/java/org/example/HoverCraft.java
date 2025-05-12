package org.example;

public class HoverCraft extends Vehicle {
    private int fanSize;
    private int maxSpeed;
    private String hovercraftType;

    public int getFanSize() { return fanSize; }
    public String getHovercraftType() { return hovercraftType; }
    public int getMaxSpeed() { return maxSpeed; }

    public void setFanSize(int fanSize) { this.fanSize = fanSize; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    public void setHovercraftType(String hovercraftType) { this.hovercraftType = hovercraftType; }


    public HoverCraft(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric, int fanSize, int maxSpeed, String hovercraftType) {
        super(typeOfVehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleId, odometer, isElectric);
        this.fanSize = fanSize;
        this.maxSpeed = maxSpeed;
        this.hovercraftType = hovercraftType;
    }

    public HoverCraft(int fanSize, int maxSpeed, String hovercraftType) {
        this.fanSize = fanSize;
        this.maxSpeed = maxSpeed;
        this.hovercraftType = hovercraftType;
    }
}
