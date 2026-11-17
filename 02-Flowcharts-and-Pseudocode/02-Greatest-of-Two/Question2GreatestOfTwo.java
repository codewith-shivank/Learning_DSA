import java.util.Scanner;

public class Question2GreatestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        if (first > second) {
            System.out.println(first + " is the greatest number.");
        } else if (second > first) {
            System.out.println(second + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
