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


}
