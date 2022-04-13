package Circle;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:25 PM

    Project Name: Polymorphism-Substitutability
*/

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1.getRadius()); // Circle

//        c1.getHeight(); error
//        c1.getVolume(); error


        System.out.println(c1.toString()); //Cylinder
        System.out.println(c1.getArea());//Cylinder


    }
}
