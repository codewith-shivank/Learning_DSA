/**
 * ArithmeticOperatorsDemo
 *
 * A beginner-friendly program demonstrating Java arithmetic operators.
 */
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Basic arithmetic operators.
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b)); // 3, decimal part removed
        System.out.println("Remainder: " + (a % b)); // 1

        // Cast one operand to double for decimal division.
        System.out.println("Decimal division: " + ((double) a / b));

        // Modulus is useful in DSA for even/odd checks and digit extraction.
        int number = 17;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        System.out.println("Last digit of 472: " + (472 % 10));

        // Increment and decrement operators.
        int counter = 5;
        System.out.println("Post-increment: " + counter++); // Print 5, then counter becomes 6
        System.out.println("After increment: " + counter);
        System.out.println("Pre-decrement: " + (--counter)); // Decrement first, then print 5

        // Compound assignment operators.
        int value = 10;
        value += 5;
        value -= 2;
        value *= 2;
        value /= 2;
        value %= 5;
        System.out.println("After compound assignments: " + value);

        // A compound assignment automatically casts the result for a byte.
        byte x = 10;
        x += 10; // Similar to x = (byte) (x + 10)
        System.out.println("byte after +=: " + x);

        // x = x + 10; // Compile error: byte arithmetic is promoted to int.
        x = (byte) (x + 10); // Explicit cast makes the assignment valid.
        System.out.println("byte after explicit cast: " + x);

        // Division by zero must be avoided: it throws ArithmeticException.
        // int invalid = a / 0;
    }
}
