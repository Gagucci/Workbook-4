package org.example;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        // arrange
        Room testRoom =  new Room(2, 100);

        // act
        testRoom.checkIn(testRoom);

        // assert
        assertTrue(testRoom.isOccupied(), "Room should be occupied after check-in");
        assertFalse(testRoom.isAvailable(), "Room should not be available after check-in");
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        // arrange
        Room testRoom = new Room(2, 100);
        // act
        testRoom.checkIn(testRoom);
        testRoom.checkOut(testRoom);
        // assert
        assertFalse(testRoom.isOccupied(), "Room should not be occupied after check-out");
        assertTrue(testRoom.isDirty(), "Room should be dirty after check-out");
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        // arrange
        Room testRoom = new Room(2, 100);
        // act
        testRoom.checkIn(testRoom);
        testRoom.checkOut(testRoom);
        testRoom.cleanRoom(testRoom);
        // assert
        assertFalse(testRoom.isOccupied(), "Room should not be occupied after checking out");
        assertFalse(testRoom.isDirty(), "Room should be clean after cleaning");
        assertTrue(testRoom.isAvailable(), "Room should be available after cleaning");
    }
}