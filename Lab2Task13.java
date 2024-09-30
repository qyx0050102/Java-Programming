import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if ((number % 2 == 0 && number % 3 == 0) || (number % 2 != 0 && number % 3 != 0)) {
            System.out.println("Divisible by 2 and 3, or by neither.");
        } else {
            System.out.println("Divisible by 2 or 3, but not both.");
        }
    }
}
