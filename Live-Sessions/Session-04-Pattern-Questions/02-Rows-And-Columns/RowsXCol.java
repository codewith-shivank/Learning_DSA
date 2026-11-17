
import java.util.Scanner;

public class RowsXCol {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of  rows:");
            int row = sc.nextInt();
            System.out.print("Enter the number of col:");
            int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
