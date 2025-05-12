package org.example;

public class Motorcycle extends Vehicle {
    private int cc;
    private String motorcycleType;
    private boolean hasPassengerCar;

    public int getCc() { return cc; }
    public String getMotorcycleType() { return motorcycleType; }
    public boolean isHasPassengerCar() { return hasPassengerCar; }

    public void setCc(int cc) { this.cc = cc; }
    public void setMotorcycleType(String motorcycleType) { this.motorcycleType = motorcycleType; }
    public void setHasPassengerCar(boolean hasPassengerCar) { this.hasPassengerCar = hasPassengerCar; }

    public Motorcycle(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric, int cc, String motorcycleType, boolean hasPassengerCar) {
        super(typeOfVehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleId, odometer, isElectric);
        this.cc = cc;
        this.motorcycleType = motorcycleType;
        this.hasPassengerCar = hasPassengerCar;
    }

    public Motorcycle(int cc, String motorcycleType, boolean hasPassengerCar) {
        this.cc = cc;
        this.motorcycleType = motorcycleType;
        this.hasPassengerCar = hasPassengerCar;
    }
}
