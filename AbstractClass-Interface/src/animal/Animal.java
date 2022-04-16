package animal;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 1:34 PM

    Project Name: AbstractClass-Interface
*/

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
