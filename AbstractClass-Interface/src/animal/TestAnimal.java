package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:44 PM

    Project Name: AbstractClass-Interface
*/

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Mammal("Fo");
        System.out.println(a1);

        Animal a2 = new Cat("Dog");
        System.out.println(a2);

        Mammal m1 = (Mammal) a2;
        System.out.println(m1);

        Cat c1 = (Cat) a2;
        c1.greets();
    }
}
