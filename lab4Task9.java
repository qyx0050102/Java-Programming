public class lab4Task9 {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println("Max of 5 and 10 is " + max(5, 10));
        System.out.println("Max of 5.5 and 10.5 is " + max(5.5, 10.5));
        System.out.println("Max of 5.5, 10.5 and 15.5 is " + max(5.5, 10.5, 15.5));
    }
}
