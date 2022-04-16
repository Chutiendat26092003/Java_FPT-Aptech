package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:56 PM

    Project Name: AbstractClass-Interface
*/

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("CatKeo");
        System.out.println(d1);
        d1.greets();

        Dog d2 = new Dog("Catku");
        d2.greets(d1);
    }
}
