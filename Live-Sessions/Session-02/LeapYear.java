
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the  Year to  check Wheather is  ass leapYear or  not : ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Entered Year is leapYear: " + year);
        } else {
            System.err.println("Not a leapYear");
        }
    }
}
