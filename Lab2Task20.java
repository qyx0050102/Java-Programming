import java.util.Scanner;

public class Lab2Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        int y = 0;

        switch (x) {
            case 1:
                y = 2;
                break;
            case 2:
                y = 3;
                break;
            default:
                y = x + 3;
        }
        System.out.println("The value of y is " + y);
    }
}
