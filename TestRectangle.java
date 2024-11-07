public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Rectangle 1 - Width: " + rect1.getWidth() + ", Height: " + rect1.getHeight() +
                ", Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 - Width: " + rect2.getWidth() + ", Height: " + rect2.getHeight() +
                ", Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
    }
}
