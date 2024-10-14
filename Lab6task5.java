import java.util.Scanner;

public class Lab6Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to sum (0 to finish): ");
        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}
