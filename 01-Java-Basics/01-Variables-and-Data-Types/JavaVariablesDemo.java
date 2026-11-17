/**
 * Java Variables & Data Types Demo
 * 
 * This program demonstrates the usage of various primitive and non-primitive
 * data types in Java.
 */
public class JavaVariablesDemo {

    public static void main(String[] args) {
        // --- 1. Primitive Data Types ---

        // byte: Used for small integers (-128 to 127)
        // Useful in DSA for saving memory when dealing with large arrays of small numbers
        byte smallNumber = 100;
        System.out.println("byte value: " + smallNumber);

        // short: Used for medium-sized integers (-32,768 to 32,767)
        short mediumNumber = 20000;
        System.out.println("short value: " + mediumNumber);

        // int: The most common integer type (approx. -2 billion to 2 billion)
        // Default choice for loop counters and array indices in DSA
        int count = 150000;
        System.out.println("int value: " + count);

        // long: Used for very large integers (requires 'L' suffix)
        // Essential for DSA problems involving large factorials or distances
        long largeNumber = 9000000000L;
        System.out.println("long value: " + largeNumber);

        // float: Single-precision floating point (requires 'f' suffix)
        // Less precise than double, but uses half the memory
        float price = 19.99f;
        System.out.println("float value: " + price);

        // double: Double-precision floating point
        // Default for decimal calculations in DSA (e.g., averages, coordinates)
        double preciseValue = 3.14159265359;
        System.out.println("double value: " + preciseValue);

        // char: Stores a single character (uses single quotes)
        // Useful for string manipulation problems in DSA
        char grade = 'A';
        System.out.println("char value: " + grade);

        // boolean: Stores true or false
        // Critical for control flow and algorithm conditions
        boolean isFinished = true;
        System.out.println("boolean value: " + isFinished);

        // --- 2. Non-Primitive Data Type ---

        // String: A sequence of characters (uses double quotes)
        // Technically an object, not a primitive type
        String message = "Hello, DSA Learner!";
        System.out.println("String value: " + message);

        // --- 3. Variable Scope Demonstration ---
        
        // Local variable: Only accessible within this main method
        int localVariable = 50;
        System.out.println("Local variable: " + localVariable);

        // --- 4. Type Casting Example ---
        
        // Implicit casting (automatic): small type to large type
        int myInt = 10;
        double myDouble = myInt; // int automatically converted to double
        System.out.println("Implicit cast (int to double): " + myDouble);

        // Explicit casting (manual): large type to small type
        double myLargeDouble = 9.78;
        int mySmallInt = (int) myLargeDouble; // double manually converted to int
        System.out.println("Explicit cast (double to int): " + mySmallInt); // Output will be 9
    }
}