import java.util.Scanner;

public class Lab2Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day (1-7, 0=Sunday): ");
        int day = input.nextInt();
        String[] daysOfWeek = {"Weekend", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day == 0) {
            System.out.println("Weekend");
        } else if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else {
            System.out.println("Invalid input");
        }
    }
}
