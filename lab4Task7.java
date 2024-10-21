public class lab4Task7 {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20};
        System.out.println("Before method call: " + numbers[0] + " " + numbers[1]);
        swap(numbers);
        System.out.println("After method call: " + numbers[0] + " " + numbers[1]);
    }
}
