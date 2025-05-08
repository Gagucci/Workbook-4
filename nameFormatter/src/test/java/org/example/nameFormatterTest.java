package org.example;

import static org.junit.jupiter.api.Assertions.*;

class nameFormatterTest {

    @org.junit.jupiter.api.Test
    void format() {
        // arrange
        String fullName = "John Doe";
        // act
        nameFormatter.format("John Doe");
        // assert
        assertEquals("John Doe", nameFormatter.format(fullName), "Full name should be formatted correctly");
    }

    @org.junit.jupiter.api.Test
    void testFormat() {
        // arrange
        String firstName = "John";
        String lastName = "Doe";
        // act
        nameFormatter.format("John", "Doe");
        // assert
        assertEquals("John Doe", nameFormatter.format(firstName, lastName), "First and last name should be formatted correctly");
    }

    @org.junit.jupiter.api.Test
    void testFormat1() {

    }
}