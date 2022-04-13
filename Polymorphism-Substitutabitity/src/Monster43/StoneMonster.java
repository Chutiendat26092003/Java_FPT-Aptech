package Monster43;

/* 
    @author: chu tien dat
    Date: 4/13/2022
    Time: 2:58 PM

    Project Name: Polymorphism-Substitutability
*/

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
