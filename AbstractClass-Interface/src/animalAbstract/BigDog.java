package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:18 PM

    Project Name: AbstractClass-Interface
*/

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog another) {
        System.out.println("Wooooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooooooooooooooooow");
    }
}
