package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringKataNumberAdderTest {
    private StringKataNumberAdder sut;

    @BeforeEach
    void setUp() {
        sut = new StringKataNumberAdder();
    }

    @Test
    void emptyReturnsNull() {
        //Arrange
        //Act
        var result = sut.add("");
        //Assert
        assertEquals(0, result);
    }

    @Test
    void nullReturnsNull() {
        //Arrange
        //Act
        var result = sut.add("0");
        //Assert
        assertEquals(0, result);
    }

    @Test
    void oneReturnsOne() {
        //Arrange
        //Act
        var result = sut.add("1");
        //Assert
        assertEquals(1, result);
    }
    @Test
    void numbersSeperatedByCommaResultInSumOfNumbers(){
        //Arrange
        //Act
        var result = sut.add("1, 3, 6");
        //Assert
        assertEquals(10, result);
    }
    @Test
    void numbersSeparatedByDotResultsInSumOfNumbers(){
        //Arrange
        //Act
        var result = sut.add("2. 5. 13.");
        //Assert
        assertEquals(20, result);

    }
    void numbersSeparatedByDashResultsInSumOfNumbers(){
        //Arrange
        //Act
        var result = sut.add("5-5-13");
        //Assert
        assertEquals(23, result);

    }
}