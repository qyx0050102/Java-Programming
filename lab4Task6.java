public class lab4Task6 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before method call: " + number);
        swap(number);
        System.out.println("After method call: " + number);
    }

    public static void swap(int a) {
        a = a + 5;
        System.out.println("Inside method: " + a);
    }
}
