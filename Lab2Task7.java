import java.util.Scanner;

public class Lab2Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side of the hexagon: ");
        double side = input.nextDouble();
        double area = (3 * Math.pow(side, 2)) / 2;
        System.out.println("The area of the hexagon is " + area);
    }
}
