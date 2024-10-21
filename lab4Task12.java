public class lab4Task12 {
    public static void printMonth(int month, int year) {
    }

    public static void printYear(int year) {
        for (int month = 1; month <= 12; month++) {
            printMonth(month, year);
        }
    }

    public static void main(String[] args) {
        printYear(2024);
    }
}
