package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:26 PM

    Project Name: AbstractClass-Interface
*/

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cat("Dog");
        a1.greets();

        Animal a2 = new Dog("CatOne");
        a2.greets();

        Animal a3 = new BigDog("CatTwo");
        a3.greets();

        Dog d1 = (Dog) a2;
        BigDog bd1 = (BigDog) a3;
        bd1.greets(d1);
    }
}
