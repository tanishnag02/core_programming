import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
        int number = scanner.nextInt();

        // Array to store results for 4 values (6 to 9)
        int[] multiplicationResult = new int[4];

        // Compute and store multiplication results from 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6; // i=0 -> 6, i=1 -> 7, etc.
            multiplicationResult[i] = number * multiplier;
        }

        // Display the result
        System.out.println("\nMultiplication table for " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}

