public class Lab6Task12 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 50; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
