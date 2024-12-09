public class C {
    private int x = 10; 
    private void convert() {
       
    }
}

public class D {
    public void test() {
        C c = new C();
        c.x = 20; 
        c.convert(); 
    }
}
