public class task13 {
    public static void main(String[] args){
        //ax + by = e
        //cx + dy = f

        double x,y,a=3.4,b=50.2,c=2.1,d=55, e=44.5,f=5.9;

        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);

        System.out.println("X is:"+x);
        System.out.println("Y is:"+y);
    }
}
