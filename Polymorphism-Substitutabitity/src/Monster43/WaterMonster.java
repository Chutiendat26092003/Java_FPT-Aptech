package Monster43;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 2:57 PM

    Project Name: Polymorphism-Substitutability
*/

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
