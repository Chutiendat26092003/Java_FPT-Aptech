package animalAbstract;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 2:35 PM

    Project Name: AbstractClass-Interface
*/

public class TestBigDog {
    public static void main(String[] args) {
        Animal a1 = new BigDog("CatSmallOne");
        a1.greets();

        Animal a2 = new BigDog("CatSmallTwo");
        BigDog bd1 = (BigDog) a1;
        BigDog bd2 = (BigDog) a2;
        bd1.greets(bd2);
    }
}
