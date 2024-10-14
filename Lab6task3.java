import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 101);
        int guess = 0;
        System.out.print("Guess a number between 0 and 100: ");
        guess = input.nextInt();
        while (guess != numberToGuess) {
            if (guess < numberToGuess) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
            System.out.print("Guess again: ");
            guess = input.nextInt();
        }
        System.out.println("Correct!");
    }
}
