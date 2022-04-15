package Shape55;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 3:58 PM

    Project Name: AbstractClass-Interface
*/

public class Triangle implements  Shape{
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + "]";
    }
}
