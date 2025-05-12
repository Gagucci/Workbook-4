package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int safetyRating;
    private String carType;

    public int getNumberOfDoors() { return numberOfDoors; }
    public int getSafetyRating() { return safetyRating; }
    public String getCarType() { return carType; }

    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
    public void setSafetyRating(int safetyRating) { this.safetyRating = safetyRating; }
    public void setCarType(String carType) { this.carType = carType; }

//    public Car(String typeOfVehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleId, int odometer, boolean isElectric, int numberOfDoors, int safetyRating, String carType) {
//        super(typeOfVehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleId, odometer, isElectric);
//        this.numberOfDoors = numberOfDoors;
//        this.safetyRating = safetyRating;
//        this.carType = carType;
//    }
//
//    public Car(int numberOfDoors, int safetyRating, String carType) {
//        this.numberOfDoors = numberOfDoors;
//        this.safetyRating = safetyRating;
//        this.carType = carType;
//    }
}
