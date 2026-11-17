
public class ContinuousNumberTriangle {

    public static void main(String[] args) {
        int n = 5; // simple value for testing

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
