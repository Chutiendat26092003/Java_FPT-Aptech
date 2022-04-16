package movableInterface;

/* 
    @author: chu tien dat
    Date: 4/16/2022
    Time: 3:10 PM

    Project Name: AbstractClass-Interface
*/

public class TestMovablePoint {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(m1);

        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

    }
}
