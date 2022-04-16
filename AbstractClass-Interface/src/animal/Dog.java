package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:40 PM

    Project Name: AbstractClass-Interface
*/

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }



    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
