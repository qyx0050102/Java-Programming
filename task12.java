public class task12 {
    public static void main(String[] args){
        double mile = 24,kilometers,minutes = 45,seconds = 35,hour = 1,speed,time;
        time = hour + minutes /60 +seconds / 60 / 60;
        kilometers = mile * 1.6;
        speed = kilometers / time;
        System.out.println("The average speed is:"+speed);
    }
}
