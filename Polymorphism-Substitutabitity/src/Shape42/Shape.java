package Shape42;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:37 PM

    Project Name: Polymorphism-Substitutability
*/

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
