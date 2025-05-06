package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void add_ShouldReturnTheSUmOfTwoNumbers() {
        // arrange
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.add(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);

    }
    @Test
    void subtract_ShouldReturnTheDifferenceOfTwoNumbers() {
        // arrange
        int firstNumber = 10;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.subtract(firstNumber, secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);
    }

}