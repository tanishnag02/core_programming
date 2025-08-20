import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Determine the largest value
        int max = Math.max(number1, Math.max(number2, number3));

        // Output the result for each number
        System.out.println("Is the first number the largest? " + (number1 == max ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 == max ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 == max ? "Yes" : "No"));

        scanner.close();
    }
}
