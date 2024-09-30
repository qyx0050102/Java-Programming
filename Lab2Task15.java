import java.util.Scanner;

public class Lab2Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;

        if (divisibleBy2 && divisibleBy3) {
            System.out.println("The number is divisible by both 2 and 3.");
        } else if (divisibleBy2 || divisibleBy3) {
            System.out.println("The number is divisible by either 2 or 3.");
        } else {
            System.out.println("The number is not divisible by 2 or 3.");
        }
    }
}

