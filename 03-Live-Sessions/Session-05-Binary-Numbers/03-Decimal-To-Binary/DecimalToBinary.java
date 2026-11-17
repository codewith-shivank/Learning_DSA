
public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 10;   // simple value for testing
        String str = "";

        if (n == 0) {
            System.out.println("0");
            return;
        }

        while (n > 0) {
            str = (n % 2 == 0 ? "0" : "1") + str;
            n = n / 2;
        }

        System.out.println(str);
    }
}
