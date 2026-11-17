
public class CounterBasedFizzBuzz {

    public static void main(String[] args) {
        int n = 100;
        int Fizz = 0;
        int Buzz = 0;
        for (int i = 1; i <= n; i++) {
            Fizz++;
            Buzz++;
            if (Fizz == 3 && Buzz == 5) {
                System.out.println("FizzBuzz");
                Fizz = 0;
                Buzz = 0;
            } else if (Fizz == 3) {
                Fizz = 0;
                System.out.println("Fizz");
            } else if (Buzz == 5) {
                Buzz = 0;
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
