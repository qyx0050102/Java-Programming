public class lab4Task13 {
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value = Character.digit(c, 16);
            decimal = decimal * 16 + value;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println("Hex AB8C in decimal is " + hexToDecimal("AB8C"));
    }
}
