public class task11 {
    public static void main(String[] args){
        double sum,time;
        time = 365 * 24 * 60 * 60 * 5;
        sum = 312032486;
        sum = sum + time/7.0 - time/13 + time/45;
        String Sum = String.format("%.3f",sum);
        System.out.println("population for each of the next five years is: "+Sum);
    }
}
