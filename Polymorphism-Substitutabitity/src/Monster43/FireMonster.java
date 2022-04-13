package Monster43;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 2:55 PM

    Project Name: Polymorphism-Substitutability
*/

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
