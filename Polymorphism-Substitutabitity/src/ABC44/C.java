package ABC44;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 3:17 PM

    Project Name: Polymorphism-Substitutability
*/

public class C extends B{
    public C() {
        System.out.println("Constructed an is instance of C");
    }

    @Override
    public String toString() {
        return "This is C";
    }
}
