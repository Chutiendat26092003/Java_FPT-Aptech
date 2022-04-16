package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:15 PM

    Project Name: AbstractClass-Interface
*/

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(" Meow");
    }
}
