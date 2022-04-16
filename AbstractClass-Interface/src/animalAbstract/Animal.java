package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:14 PM

    Project Name: AbstractClass-Interface
*/

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void greets();
}
