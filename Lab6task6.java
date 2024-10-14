import java.util.Scanner;

public class Lab6Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number (0 to finish): ");
            number = input.nextInt();
        } while (number != 0);
        System.out.println("Done.");
    }
}
