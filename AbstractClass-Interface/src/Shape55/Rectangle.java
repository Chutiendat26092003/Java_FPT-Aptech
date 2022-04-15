package Shape55;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 3:55 PM

    Project Name: AbstractClass-Interface
*/

public class Rectangle implements Shape{
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
