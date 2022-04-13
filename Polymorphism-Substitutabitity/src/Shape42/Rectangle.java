package Shape42;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:40 PM

    Project Name: Polymorphism-Substitutability
*/

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + super.toString() + "]";
    }
}
