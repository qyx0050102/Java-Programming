import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            int answer = 0;
            do {
                System.out.println("What is " + number1 + " - " + number2 + "? ");
                answer = input.nextInt();
            } while (answer != (number1 - number2));
            System.out.println("Correct!");
        }
    }
}
