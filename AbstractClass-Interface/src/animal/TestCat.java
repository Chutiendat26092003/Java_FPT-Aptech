package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:54 PM

    Project Name: AbstractClass-Interface
*/

public class TestCat {
    public static void main(String[] args) {
        Cat c1 = new Cat("Dog");
        System.out.println(c1);
        c1.greets();
    }
}
