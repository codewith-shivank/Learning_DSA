import java.util.Scanner;

public class Question4AverageOf25Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        for (int scoreNumber = 1; scoreNumber <= 25; scoreNumber++) {
            System.out.print("Enter exam score " + scoreNumber + ": ");
            total += scanner.nextDouble();
        }

        double average = total / 25;
        System.out.println("Average of the 25 exam scores = " + average);

        scanner.close();
    }
}
