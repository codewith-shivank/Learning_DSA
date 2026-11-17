/**
 * Question 3: Perform binary addition
 * 
 * Given addition:
 *    10
 * + 11
 * ----
 *  101
 * 
 * Rules:
 * 0 + 0 = 0, carry = 0
 * 1 + 0 = 1, carry = 0
 * 0 + 1 = 1, carry = 0
 * 1 + 1 = 0, carry = 1
 */
public class Question3BinaryAddition {
    
    /**
     * Adds two binary numbers represented as strings
     */
    public static String binaryAdd(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        // Make sure we process all digits
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            
            int sum = digitA + digitB + carry;
            carry = sum / 2;
            result.insert(0, sum % 2);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        // Test case from the assignment
        String[] testA = {"10"};
        String[] testB = {"11"};
        String[] expected = {"101"};
        
        System.out.println("=== Question 3: Binary Addition ===\n");
        
        for (int i = 0; i < testA.length; i++) {
            String result = binaryAdd(testA[i], testB[i]);
            System.out.println("  " + testA[i] + " + " + testB[i] + " = " + result);
            
            if (result.equals(expected[i])) {
                System.out.println("  ✓ Correct (Expected: " + expected[i] + ")\n");
            } else {
                System.out.println("  ✗ Incorrect (Expected: " + expected[i] + ")\n");
            }
        }
        
        // Interactive mode
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter first binary number (or press Enter to exit):");
        
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine().trim();
            if (a.isEmpty()) break;
            
            System.out.println("Enter second binary number:");
            String b = scanner.nextLine().trim();
            
            System.out.println(a + " + " + b + " = " + binaryAdd(a, b));
            System.out.println("Enter first binary number (or press Enter to exit):");
        }
        
        scanner.close();
    }
}
