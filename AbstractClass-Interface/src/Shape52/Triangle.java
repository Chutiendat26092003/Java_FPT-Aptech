package Shape52;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 10:57 AM

    Project Name: AbstractClass-Interface
*/

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + super.toString() + "]";
    }
}
