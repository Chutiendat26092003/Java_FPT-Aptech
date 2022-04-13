package Shape42;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:46 PM

    Project Name: Polymorphism-Substitutability
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