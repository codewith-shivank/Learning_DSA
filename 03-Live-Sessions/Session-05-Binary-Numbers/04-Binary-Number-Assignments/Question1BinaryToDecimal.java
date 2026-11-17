import java.util.Scanner;

/**
 * Question 1: Convert binary numbers into decimal forms
 * 
 * Given binary numbers:
 * 1. 111111 -> 63
 * 2. 10110  -> 22
 * 3. 10011  -> 19
 * 4. 110010 -> 50
 */
public class Question1BinaryToDecimal {
    
    /**
     * Converts a binary number (as an integer) to decimal
     */
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        
        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        
        return decimal;
    }
    
    public static void main(String[] args) {
        // Test cases from the assignment
        int[] testCases = {111111, 10110, 10011, 110010};
        String[] expected = {"111111", "10110", "10011", "110010"};
        int[] expectedDecimal = {63, 22, 19, 50};
        
        System.out.println("=== Question 1: Binary to Decimal Conversion ===\n");
        
        for (int i = 0; i < testCases.length; i++) {
            int result = binaryToDecimal(testCases[i]);
            System.out.println(expected[i] + " in decimal = " + result);
            
            if (result == expectedDecimal[i]) {
                System.out.println("  ✓ Correct (Expected: " + expectedDecimal[i] + ")\n");
            } else {
                System.out.println("  ✗ Incorrect (Expected: " + expectedDecimal[i] + ")\n");
            }
        }
        
        // Interactive mode
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number to convert (or press Enter to exit):");
        
        while (scanner.hasNextInt()) {
            int binaryNum = scanner.nextInt();
            System.out.println(binaryNum + " in decimal = " + binaryToDecimal(binaryNum));
            System.out.println("Enter another binary number (or press Enter to exit):");
        }
        
        scanner.close();
    }
}
