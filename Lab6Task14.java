public class Lab6Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 1.07;
        int years = 0;
        while (tuition < 20000) {
            tuition *= rate;
            years++;
        }
        System.out.println("Tuition will double in " + years + " years.");
    }
}
