package inheritance;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 9:29 PM

    Project Name: java-code
*/

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base area is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume()
        );

        Cylinder cy2 = new Cylinder(2.0, 5.0);
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base area is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume()
        );
    }
}
