////////////////////////////////////////////////////////////////////
// Malik Giafar Mohamed 2075543
// Alessandro Di Pasquale 2075544
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Class to convert integer numbers to Roman numerals 
 */
public class IntegerToRoman {
    
    /**
     * Converts an integer number to its Roman numeral representation
     * 
     * @param number Integer number to convert (1-1000)
     * @return String representation of the Roman numeral
     * @throws IllegalArgumentException if number is out of valid range (1-1000)
     */
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }
        
        StringBuilder result = new StringBuilder();
        
        // Define Roman numeral symbols and their corresponding values
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // Iteratively find largest symbol that fits
        int i = 0;
        while (number > 0) {
            if (number >= values[i]) {
                result.append(symbols[i]);
                number -= values[i];
            } else {
                i++;
            }
        }
        
        return result.toString();
    }
}