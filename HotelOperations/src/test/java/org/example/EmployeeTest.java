package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    void punchIn() {
        // arrange
        Employee testEmployee = new Employee(1, "John Doe", "Engineering", 25.0);

        // act
        testEmployee.punchIn();

        // assert
        assertNotNull(testEmployee.getPunchInTime(), "Punch-in time should not be null after punching in");
    }

    @Test
    void punchOut() {
        // arrange
        Employee testEmployee = new Employee(1, "John Doe", "Engineering", 25.0);
        //act
        testEmployee.punchIn(); // First, punch in to set the punch-in time
        testEmployee.punchOut();
        // assert
        assertNotNull(testEmployee.getPunchOutTime(), "Punch-out time should not be null after punching out");

    }
}



