public class Lab2Task2 {
    public static void main(String[] args) {
        int days = 100;
        int dayOfWeek = 2; // 2 represents Tuesday
        int newDay = (dayOfWeek + days) % 7;
        switch (newDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // Add cases for other days...
        }
    }
}
