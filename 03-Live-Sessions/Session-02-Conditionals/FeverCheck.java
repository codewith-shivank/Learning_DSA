
import java.util.Scanner;

class FeverCheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the  temprature");
            int temp = sc.nextInt();
            if (temp > 100) {
                System.out.println("you  have  fewer");
            } else {
                System.out.println("no");
            }
        }
    }
}
