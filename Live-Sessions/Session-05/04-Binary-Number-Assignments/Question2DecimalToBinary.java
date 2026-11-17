import java.util.Scanner;

/**
 * Question 2: Convert decimal numbers into binary forms
 * 
 * Given decimal numbers:
 * 1. 25 -> 11001
 * 2. 49 -> 110001
 * 3. 31 -> 11111
 * 4. 88 -> 1011000
 */
public class Question2DecimalToBinary {
    
    /**
     * Converts a decimal number to binary
     */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal /= 2;
            binary.insert(0, remainder);
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        // Test cases from the assignment
        int[] testCases = {25, 49, 31, 88};
        String[] expected = {"11001", "110001", "11111", "1011000"};
        
        System.out.println("=== Question 2: Decimal to Binary Conversion ===\n");
        
        for (int i = 0; i < testCases.length; i++) {
            String result = decimalToBinary(testCases[i]);
            System.out.println(testCases[i] + " in binary = " + result);
            
            if (result.equals(expected[i])) {
                System.out.println("  ✓ Correct (Expected: " + expected[i] + ")\n");
            } else {
                System.out.println("  ✗ Incorrect (Expected: " + expected[i] + ")\n");
            }
        }
        
        // Interactive mode
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert (or press Enter to exit):");
        
        while (scanner.hasNextInt()) {
            int decimalNum = scanner.nextInt();
            System.out.println(decimalNum + " in binary = " + decimalToBinary(decimalNum));
            System.out.println("Enter another decimal number (or press Enter to exit):");
        }
        
        scanner.close();
    }
}
