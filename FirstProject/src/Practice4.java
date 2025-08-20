import java.util.Scanner;
public class Practice4{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr marks of 1st subject;");
        float a = sc.nextFloat();
        System.out.print("Enter the marks of 2nd subjecy:");
        float b = sc.nextFloat();
        System.out.print("Enter the marks of 3rd subject:");
        float c = sc.nextFloat();
        System.out.print("Enter the makrs of 4th subject:");
        float d = sc.nextFloat();
        System.out.print("Enter the marks of 5th subject:");
        float e = sc.nextFloat();
        float average = (a+b+c+d+e)/500;
        float percentage = average*100;
        System.out.print("Percentage is:");
        System.out.println(percentage);
    }
}
