////////////////////////////////////////////////////////////////////
// Malik Giafar Mohamed 2075543
// Alessandro Di Pasquale 2075544
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to print Roman numerals in ASCII art
 */
public class RomanPrinter {
    
    // ASCII Art representations for each Roman numeral character
    private static final String[] I_ART = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };
    
    private static final String[] V_ART = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };
    
    private static final String[] X_ART = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };
    
    private static final String[] L_ART = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };
    
    private static final String[] C_ART = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    private static final String[] D_ART = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };
    
    private static final String[] M_ART = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    private static final Map<Character, String[]> ROMAN_ART_MAP = new HashMap<>();
    static {
        ROMAN_ART_MAP.put('I', I_ART);
        ROMAN_ART_MAP.put('V', V_ART);
        ROMAN_ART_MAP.put('X', X_ART);
        ROMAN_ART_MAP.put('L', L_ART);
        ROMAN_ART_MAP.put('C', C_ART);
        ROMAN_ART_MAP.put('D', D_ART);
        ROMAN_ART_MAP.put('M', M_ART);
    }

    /**
     * Print a Roman numeral in ASCII art
     * 
     * @param num Integer to be converted to Roman numeral and printed as ASCII art
     * @return String containing the ASCII art representation of the Roman numeral
     * @throws IllegalArgumentException if the number is out of valid range
     */
    public static String print(int num) {
        if (num <= 0 || num > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    /**
     * Print a Roman numeral string in ASCII art
     * 
     * @param romanNumber String of Roman numerals to be printed as ASCII art
     * @return String containing the ASCII art representation
     */
    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException("Roman numeral string cannot be null or empty");
        }
        
        if (!romanNumber.matches("^[IVXLCDM]+$")) {
            throw new IllegalArgumentException("Roman numeral string contains invalid characters");
        }

        int height = I_ART.length;
        StringBuilder[] result = new StringBuilder[height];
        for (int i = 0; i < height; i++) {
            result[i] = new StringBuilder();
        }

        for (int i = 0; i < romanNumber.length(); i++) {
            char romanChar = romanNumber.charAt(i);
            String[] artToDraw = ROMAN_ART_MAP.get(romanChar);
            
            if (artToDraw == null) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
            }

            for (int j = 0; j < height; j++) {
                result[j].append(artToDraw[j]);
            }
        }

        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < height; i++) {
            finalResult.append(result[i]);
            if (i < height - 1) {
                finalResult.append("\n");
            }
        }
        
        return finalResult.toString();
    }
}