import java.util.Random;

public class Lab2Task17 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(9) + 1;
        int number2 = random.nextInt(9) + 1;
        int answer = number1 + number2;
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int userAnswer = Integer.parseInt(input.nextLine());
        if (userAnswer == answer) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
