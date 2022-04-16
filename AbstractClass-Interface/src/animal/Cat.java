package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:38 PM

    Project Name: AbstractClass-Interface
*/

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
