import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Create array to store results
        String[] resultArray = new String[number + 1]; // from 0 to number

        // FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                resultArray[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                resultArray[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                resultArray[i] = "Buzz";
            } else {
                resultArray[i] = String.valueOf(i);
            }
        }

        // Display the result
        System.out.println("\nFizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + resultArray[i]);
        }

        scanner.close();
    } // <- End of main method
}     // <- End of class
