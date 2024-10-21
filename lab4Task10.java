import java.util.Random;

public class lab4Task10 {
    public static char getRandomLowerCaseLetter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        System.out.println(getRandomLowerCaseLetter());
    }
}
