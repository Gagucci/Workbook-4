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
        // arrange
        String prefix = "Mr.";
        String firstName = "John";
        String middleName = "A.";
        String lastName = "Doe";
        String suffix = "PhD";
        // act
        nameFormatter.format("Doe", "Mr.", "John", "A.", "PhD");
        // assert
        assertEquals("Doe, Mr. John A. , PhD", nameFormatter.format(lastName, prefix, firstName, middleName, suffix), "Full name with prefix and suffix should be formatted correctly");
    }
}