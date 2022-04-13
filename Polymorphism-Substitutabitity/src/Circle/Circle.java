package Circle;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:09 PM

    Project Name: Polymorphism-Substitutability
*/

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
