import java.util.Scanner;

public class HeightWeightArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights from the user
        System.out.println("Enter the heights of 11 football players (in cm or meters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("\nThe mean height of the football team is: " + mean);

        scanner.close();
    }
}
