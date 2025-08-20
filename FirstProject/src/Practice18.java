import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number input from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Create an array to store the multiplication table (1 to 10)
        int[] table = new int[10];

        // Populate the array with multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}

