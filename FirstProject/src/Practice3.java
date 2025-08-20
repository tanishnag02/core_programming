import java.util.Scanner; // ✅ Import must be at the top

public class Practice3 { // ✅ Class name should match file name

    public static void main(String[] args) {
        System.out.println("It works!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}
