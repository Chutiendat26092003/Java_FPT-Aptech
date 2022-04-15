package Shape55;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 3:59 PM

    Project Name: AbstractClass-Interface
*/


public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(1,2);
        System.out.println(s1);
        System.out.println("Area is: " + s1.getArea());

        Shape s2 = new Triangle(3, 4);
        System.out.println(s2);
        System.out.println("Area is: " + s2.getArea());

    }
}
