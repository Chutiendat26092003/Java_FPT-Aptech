package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:17 PM

    Project Name: AbstractClass-Interface
*/

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Wooooof");
    }
}
