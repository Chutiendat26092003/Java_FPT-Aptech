package movableInterface;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 3:16 PM

    Project Name: AbstractClass-Interface
*/

public class TestMovableCircle {
    public static void main(String[] args) {
        Movable m1 = new MovableCircle(5, 2, 6, 7, 5);
        System.out.println(m1);

        m1.moveRight();
        m1.moveUp();
        System.out.println(m1);
    }
}
