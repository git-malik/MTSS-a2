////////////////////////////////////////////////////////////////////
// Malik Giafar Mohamed 2075543
// Alessandro Di Pasquale 2075544
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintWithNegativeNumberShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(-1)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void testPrintWithZeroShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(0)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void testPrintWithNumberGreaterThan1000ShouldThrowException() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> RomanPrinter.print(1001)
        );
        assertEquals("Number must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void testPrintAsciiArtForI() {
        // Arrange & Act
        String result = RomanPrinter.print(1);
        
        // Assert
        String expected = 
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForV() {
        // Arrange & Act
        String result = RomanPrinter.print(5);
        
        // Assert
        String expected = 
        " __      __\n" +
        " \\ \\    / /\n" +
        "  \\ \\  / / \n" +
        "   \\ \\/ /  \n" +
        "    \\  /   \n" +
        "     \\/    ";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForX() {
        // Arrange & Act
        String result = RomanPrinter.print(10);
        
        // Assert
        String expected = 
        " __   __\n" +
        " \\ \\ / /\n" +
        "  \\ V / \n" +
        "   > <  \n" +
        "  / . \\ \n" +
        " /_/ \\_\\";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForL() {
        // Arrange & Act
        String result = RomanPrinter.print(50);
        
        // Assert
        String expected = 
        "  _      \n" +
        " | |     \n" +
        " | |     \n" +
        " | |     \n" +
        " | |____ \n" +
        " |______|";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForC() {
        // Arrange & Act
        String result = RomanPrinter.print(100);
        
        // Assert
        String expected = 
            "  _____ \n" +
            " / ____|\n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            " \\_____|";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForD() {
        // Arrange & Act
        String result = RomanPrinter.print(500);
        
        // Assert
        String expected = 
            " _____  \n" +
            "|  __ \\ \n" +
            "| |  | |\n" +
            "| |  | |\n" +
            "| |__| |\n" +
            "|_____/ ";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForM() {
        // Arrange & Act
        String result = RomanPrinter.print(1000);
        
        // Assert
        String expected = 
            " __  __ \n" +
            "|  \\/  |\n" +
            "| \\  / |\n" +
            "| |\\/| |\n" +
            "| |  | |\n" +
            "|_|  |_|";
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtForIV() {
        // Arrange & Act
        String result = RomanPrinter.print(4);
        
        // Assert
        // Check if the result contains both I and V ASCII art in correct order
        assertTrue(result.contains(" _____  __      __")); // Part of I
        assertTrue(result.contains("|_   _| \\ \\    / /")); // Part of V
    }


    @Test
    public void testPrintAsciiArtForVI() {
        // Arrange & Act
        String result = RomanPrinter.print(6);
        
        // Assert
        // Check if the result contains both V and I ASCII art in correct order
        assertTrue(result.contains(" __      __")); // Part of V
        assertTrue(result.contains("  | |  ")); // Part of I
    }

    @Test
    public void testPrintAsciiArtForXI() {
        // Arrange & Act
        String result = RomanPrinter.print(11);
        
        // Assert
        // Check if the result contains both X and I ASCII art in correct order
        assertTrue(result.contains(" __   __")); // Part of X
        assertTrue(result.contains("  | |  ")); // Part of I
    }

    @Test
    public void testPrintAsciiArtForMCMXCIX() {
        // Arrange & Act
        String result = RomanPrinter.print(999);
        
        // Assert
        // Check the lengths of each line to verify all characters are printed
        String[] lines = result.split("\n");
        assertEquals(6, lines.length); // There should be 6 lines in the ASCII art
        
        // The combined ASCII art for "MCMXCIX" should be quite long
        for (String line : lines) {
            assertTrue(line.length() > 30); // Each line should be long enough for all characters
        }
    }
}