import java.util.Scanner;
public class Switchcasecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee level (1-4");
        int level = sc.nextInt();

        double baseSalary = 0;
        double hra = 0;

        switch (level) {
            case 1:
                baseSalary = 50000;
                hra = baseSalary * 0.30;
                break;
            case 2:
                baseSalary = 40000;
                hra = baseSalary * 0.25;
                break;
            case 3:
                baseSalary = 30000;
                hra = baseSalary * 0.20;
                break;
            case 4:
                baseSalary = 20000;
                hra = baseSalary * 0.15;
                break;
            default:
                System.out.println("Invalid level entered");
                return;
        }

        double totalSalary = baseSalary + hra;
        System.out.println("Total Salary:" + totalSalary);
        }
    }

