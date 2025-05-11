////////////////////////////////////////////////////////////////////
// Malik Giafar Mohamed 2075543
// Alessandro Di Pasquale 2075544
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class IntegerToRomanTest {

    // Test cases for invalid inputs 
    @Test
    public void testConvertWithNegativeNumberShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> IntegerToRoman.convert(-1)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void testConvertWithZeroShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> IntegerToRoman.convert(0)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void testConvertWithNumberGreaterThan1000ShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> IntegerToRoman.convert(1001)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    // Test cases for first 3 numbers
    @Test
    public void testConvertOne() {
        // Arrange & Act
        String result = IntegerToRoman.convert(1);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertTwo() {
        // Arrange & Act
        String result = IntegerToRoman.convert(2);
        // Assert
        assertEquals("II", result);
    }

    @Test
    public void testConvertThree() {
        // Arrange & Act
        String result = IntegerToRoman.convert(3);
        // Assert
        assertEquals("III", result);
    }

    // Test cases for first 6 numbers
    @Test
    public void testConvertFour() {
        // Arrange & Act
        String result = IntegerToRoman.convert(4);
        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void testConvertFive() {
        // Arrange & Act
        String result = IntegerToRoman.convert(5);
        // Assert
        assertEquals("V", result);
    }

    @Test
    public void testConvertSix() {
        // Arrange & Act
        String result = IntegerToRoman.convert(6);
        // Assert
        assertEquals("VI", result);
    }

    // Test cases for numbers 7-10
    @Test
    public void testConvertSeven() {
        // Arrange & Act
        String result = IntegerToRoman.convert(7);
        // Assert
        assertEquals("VII", result);
    }

    @Test
    public void testConvertEight() {
        // Arrange & Act
        String result = IntegerToRoman.convert(8);
        // Assert
        assertEquals("VIII", result);
    }

    @Test
    public void testConvertNine() {
        // Arrange & Act
        String result = IntegerToRoman.convert(9);
        // Assert
        assertEquals("IX", result);
    }

    @Test
    public void testConvertTen() {
        // Arrange & Act
        String result = IntegerToRoman.convert(10);
        // Assert
        assertEquals("X", result);
    }

    // Test cases for specific numbers between 11-50
    @Test
    public void testConvertFourteen() {
        // Arrange & Act
        String result = IntegerToRoman.convert(14);
        // Assert
        assertEquals("XIV", result);
    }

    @Test
    public void testConvertFifteen() {
        // Arrange & Act
        String result = IntegerToRoman.convert(15);
        // Assert
        assertEquals("XV", result);
    }

    @Test
    public void testConvertNineteen() {
        // Arrange & Act
        String result = IntegerToRoman.convert(19);
        // Assert
        assertEquals("XIX", result);
    }

    @Test
    public void testConvertTwenty() {
        // Arrange & Act
        String result = IntegerToRoman.convert(20);
        // Assert
        assertEquals("XX", result);
    }

    @Test
    public void testConvertFortyNine() {
        // Arrange & Act
        String result = IntegerToRoman.convert(49);
        // Assert
        assertEquals("XLIX", result);
    }

    @Test
    public void testConvertFifty() {
        // Arrange & Act
        String result = IntegerToRoman.convert(50);
        // Assert
        assertEquals("L", result);
    }

    // Test cases for specific numbers between 51-100
    @Test
    public void testConvertNinetyNine() {
        // Arrange & Act
        String result = IntegerToRoman.convert(99);
        // Assert
        assertEquals("XCIX", result);
    }

    @Test
    public void testConvertOneHundred() {
        // Arrange & Act
        String result = IntegerToRoman.convert(100);
        // Assert
        assertEquals("C", result);
    }

    // Test cases for specific numbers between 101-500
    @Test
    public void testConvertFourHundredNinetyNine() {
        // Arrange & Act
        String result = IntegerToRoman.convert(499);
        // Assert
        assertEquals("CDXCIX", result);
    }

    @Test
    public void testConvertFiveHundred() {
        // Arrange & Act
        String result = IntegerToRoman.convert(500);
        // Assert
        assertEquals("D", result);
    }

    // Test cases for specific numbers between 501-1000
    @Test
    public void testConvertNineHundredNinetyNine() {
        // Arrange & Act
        String result = IntegerToRoman.convert(999);
        // Assert
        assertEquals("CMXCIX", result);
    }

    @Test
    public void testConvertOneThousand() {
        // Arrange & Act
        String result = IntegerToRoman.convert(1000);
        // Assert
        assertEquals("M", result);
    }
}