public class task10 {
    public static void main(String[] args){
        double mile,kilometers = 14,minutes = 45,seconds = 30,hour,speed;
        hour = minutes /60 +seconds / 60 / 60;
        mile = kilometers / 1.6;
        speed = mile / hour;
        System.out.println("The average speed is:"+speed);
    }
}
