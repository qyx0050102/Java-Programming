
import java.util.Scanner;

public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance to drive: ");
        double distance = input.nextDouble();
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double cost = distance / mpg * pricePerGallon;
        System.out.println("The cost of the trip is $" + cost);
    }
}
