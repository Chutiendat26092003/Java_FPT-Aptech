package ABC44;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 3:18 PM

    Project Name: Polymorphism-Substitutability
*/

public class TestCasting {
    public static void main(String[] args) {
        A a1 = new C();
        System.out.println(a1); // run C

        B b1 = (B)a1; //downcast ok
        System.out.println(b1); // run C

        C c1 = (C) b1; //downcast ok
        System.out.println(c1); // run C

        A a2 = new B();
        System.out.println(a2);  // run B

        B b2 = (B) a2; //downcast ok
        C c2 = (C) a2; // error
    }
}
