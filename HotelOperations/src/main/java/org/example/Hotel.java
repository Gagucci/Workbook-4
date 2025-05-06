package org.example;

public class Hotel {
    private String name;
    private int numberOfRooms;
    private int numberOfSuites;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String _name, int _numberOfRooms, int _numberOfSuites) {
        this.name = _name;
        this.numberOfRooms = _numberOfRooms;
        this.numberOfSuites = _numberOfSuites;
    }
    public Hotel(String _name, int _numberOfSuites, int _bookedSuites, int _bookedBasicRooms) {
        this.name = _name;
        this.numberOfSuites = _numberOfSuites;
        this.bookedSuites = _bookedSuites;
        this.bookedBasicRooms = _bookedBasicRooms;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getNumberOfRooms() { return numberOfRooms; }
    public void setNumberOfRooms(int numberOfRooms) { this.numberOfRooms = numberOfRooms; }
    public int getNumberOfSuites() { return numberOfSuites; }
    public void setNumberOfSuites(int numberOfSuites) { this.numberOfSuites = numberOfSuites; }
    public int getBookedSuites() { return bookedSuites; }
    public void setBookedSuites(int bookedSuites) { this.bookedSuites = bookedSuites; }
    public int getBookedBasicRooms() { return bookedBasicRooms; }
    public void setBookedBasicRooms(int bookedBasicRooms) { this.bookedBasicRooms = bookedBasicRooms; }

    public boolean bookRoom(int _numberOfRooms, boolean _isSuite) {
        if (_isSuite) {
            if (bookedSuites < numberOfSuites) {
                bookedSuites++;
                numberOfSuites--;
                return true;
            } else {
                return false; // No available suites
            }
        } else {
            if ((bookedBasicRooms + bookedSuites) < _numberOfRooms) {
                bookedBasicRooms++;
                return true;
            } else {
                return false; // No available basic rooms
            }
        }
    }

    public void getAvailableSuites() {
        int availableSuites = numberOfSuites - bookedSuites;
        System.out.printf("Available Suites: %d%n", availableSuites);
    }

    public void getAvailableRooms() {
        int availableRooms = numberOfRooms - (bookedBasicRooms + bookedSuites);
        System.out.printf("Available Rooms: %d%n", availableRooms);
    }
    
}



