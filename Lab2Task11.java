import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = input.nextInt();
        double pay = 1000; 
        if (score > 90) {
            pay *= 1.03;
        } else {
            pay *= 1.01;
        }
        System.out.println("New pay is $" + pay);
    }
}
