import java.util.Scanner;

public class Lab2Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double weightInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
    }
}
