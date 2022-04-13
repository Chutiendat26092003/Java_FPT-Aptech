package Circle;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:17 PM

    Project Name: Polymorphism-Substitutability
*/

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[Height" + height + "," + super.toString() + "]";
    }
}
