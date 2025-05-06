package org.example;

public class Reservation {
    private String roomType;
    private final String kingRoom = "King Room";
    private final String doubleRoom = "Double Room";
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String _roomType, double _price, int _numberOfNights) {
        this.roomType = _roomType;
        this.price = _price;
        this.numberOfNights = _numberOfNights;
        this.weekend = false; // Default to false, can be set later if needed
    }

    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }
    public int getNumberOfNights() { return numberOfNights; }
    public boolean isWeekend() { return weekend; }

    public void setRoomType(String _roomType) { this.roomType = _roomType; }
    public int setNumberOfNights(int _numberOfNights) {
        this.numberOfNights = _numberOfNights;
        return this.numberOfNights;
    }
    public void setWeekend(boolean weekend) { this.weekend = weekend; }

    public void getReservationTotal() {
        double total = price * numberOfNights;
        if (roomType.equalsIgnoreCase("King Room")) {
            price = 139.00; // Base price for King Room
        } else if (roomType.equalsIgnoreCase("Double Room")) {
            price = 124.00;
        }
        if (weekend) {
           total = (total * .10) + total; // 10% increase for weekend stays
        }
        System.out.printf("Total reservation cost for %s: $%.2f%n", roomType, total);
    }
}



