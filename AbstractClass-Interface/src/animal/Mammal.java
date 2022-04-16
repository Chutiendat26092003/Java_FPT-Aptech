package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:36 PM

    Project Name: AbstractClass-Interface
*/

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
