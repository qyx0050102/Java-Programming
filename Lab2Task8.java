import java.util.Scanner;

public class Lab2Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double monthlyInterestRate = 0.05 / 12;
        double accountValue = 0;
        for (int month = 1; month <= 6; month++) {
            accountValue += monthlySaving;
            accountValue += accountValue * monthlyInterestRate;
        }
        System.out.println("The account value after six months is $" + accountValue);
    }
}
