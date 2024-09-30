import java.util.Scanner;

public class Lab2Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity);
        System.out.println("The total is $" + total);
    }
}
