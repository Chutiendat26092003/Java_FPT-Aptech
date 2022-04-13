package ABC44;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 3:16 PM

    Project Name: Polymorphism-Substitutability
*/

public class B extends A{
    public B() {
        System.out.println("Constructed an is instance of B");
    }

    @Override
    public String toString() {
        return "This is B";
    }
}
