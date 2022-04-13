package Shape42;

/* 
    @author: chu tien dat
    Date: 4/12/2022
    Time: 10:50 PM

    Project Name: Polymorphism-Substitutability
*/

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is: " + s1.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is: " + s2.getArea());

        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is: " + s3.getArea());
    }
}
