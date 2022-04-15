package Shape52;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 10:41 AM

    Project Name: AbstractClass-Interface
*/

abstract public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    abstract public double getArea();

}
