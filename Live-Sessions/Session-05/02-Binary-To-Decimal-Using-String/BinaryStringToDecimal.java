
public class BinaryStringToDecimal {

    public static void main(String[] args) {
        String str = "101000"; // Example binary input
        int n = str.length();
        int power = 0;
        int result = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        System.out.println("Result: " + result);
    }
}
