/**
 * Java Type Casting and Arithmetic Demo
 * 
 * This program explains the difference between compound assignment (+=)
 * and simple assignment with arithmetic (+), specifically regarding
 * implicit type casting in Java.
 */
public class TypeCastingDemo {

    public static void main(String[] args) {
        System.out.println("--- Part 1: The byte example from your code ---");
        
        // 1. Declare a byte variable
        byte x = 10;
        System.out.println("Initial x: " + x);

        // 2. Compound Assignment (+=)
        // In Java, x += 10 is equivalent to x = (byte)(x + 10).
        // The compiler automatically performs an implicit cast back to 'byte'.
        x += 10; 
        System.out.println("After x += 10: " + x); // Output: 20

        // 3. Simple Assignment with Addition (+)
        // In Java, x + 10 results in an 'int' because of integer promotion.
        // You cannot assign an 'int' directly to a 'byte' without an explicit cast.
        // The line below would cause a COMPILE ERROR: "incompatible types: possible lossy conversion from int to byte"
        // x = x + 10; 
        
        // To fix it, we must use an explicit cast:
        x = (byte)(x + 10);
        System.out.println("After x = (byte)(x + 10): " + x); // Output: 30


        System.out.println("\n--- Part 2: Demonstrating Integer Promotion ---");
        
        byte a = 5;
        byte b = 10;
        
        // This also causes a compile error without a cast because a + b becomes an int.
        // byte c = a + b; 
        
        // Correct way:
        byte c = (byte)(a + b);
        System.out.println("Sum of two bytes (with cast): " + c);


        System.out.println("\n--- Part 3: Why does this happen? ---");
        System.out.println("In Java, any arithmetic operation on byte, short, or char");
        System.out.println("automatically promotes the result to an 'int' to prevent overflow.");
        System.out.println("The += operator is special because it includes an implicit cast.");
    }
}