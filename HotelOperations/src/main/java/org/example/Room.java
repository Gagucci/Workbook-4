package org.example;

public class Room {
    private int numberOfBeds;
    private int price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int _numberOfBeds, int _price) {
        this.numberOfBeds = _numberOfBeds;
        this.price = _price;
        this.occupied = false;
        this.dirty = true; // Rooms are dirty by default
        this.available = true; // Rooms are available by default
    }

    public int getNumberOfBeds() { return numberOfBeds; }
    public int getPrice() { return price; }
    public boolean isOccupied() { return occupied; }
    public boolean isDirty() { return dirty; }
    public boolean isAvailable() { return available; }

    public void checkIn(Room room) {
        if (room.isAvailable() && !room.isOccupied()) {
            room.occupied = true;
            room.available = false;
            room.dirty = true; // Mark as dirty when checked in
            System.out.println("Room checked in successfully.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut(Room room) {
        if (room.isOccupied()) {
            room.occupied = false;
            room.dirty = true; // Mark as dirty when checked out
            System.out.println("Room checked out successfully.");
        } else {
            System.out.println("Room is not occupied, cannot check out.");
        }
    }

    public void cleanRoom(Room room) {
        if (room.isDirty()) {
            room.dirty = false; // Mark as clean
            System.out.println("Room cleaned successfully.");
            room.available = true; // Mark as available after cleaning
        } else {
            System.out.println("Room is already clean.");
        }
    }

}
