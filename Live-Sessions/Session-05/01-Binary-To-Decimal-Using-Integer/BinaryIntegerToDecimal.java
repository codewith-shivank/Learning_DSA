
import java.util.Scanner;

public class BinaryIntegerToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary: ");
        int digit = sc.nextInt();
        int base = 1;
        int ans = 0;

        while (digit > 0) {
            int lastDigit = digit % 2;
            ans += lastDigit * base;
            base *= 2;
            digit /= 10;
        }
        System.out.println("Result: " + ans);
    }
}
