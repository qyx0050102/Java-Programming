import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        int sum = 5 + 3; 
        do {
            System.out.print("What is the sum of 5 + 3? ");
            answer = input.nextInt();
        } while (answer != sum);
        System.out.println("Correct!");
    }
}
