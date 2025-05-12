package org.example;

public class Main {
    public static void main(String[] args) {

        Car jetta =  new Car();



        System.out.println(jetta.getTypeOfVehicle() + " " + jetta.getVehicleMake() + " " + jetta.getVehicleModel() + " has a safety rating of " + jetta.getSafetyRating() + " and has " + jetta.getNumberOfDoors() + " doors." + " It was made in " + jetta.getVehicleYearMade() + " and has an odometer reading of " + jetta.getOdometer() + ".");
        System.out.println("It has a cargo capacity of " + jetta.getCargoCapacity() + " and a fuel capacity of " + jetta.getFuelCapacity() + ".");
    }
    // im no longer confused
}