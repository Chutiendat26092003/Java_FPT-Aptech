package Movable56;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 4:12 PM

    Project Name: AbstractClass-Interface
*/

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1, 2);
        System.out.println(p1);

        p1.moveDown();
        System.out.println(p1);

        p1.moveRight();
        System.out.println(p1);

        Movable p2 = new MovablePoint(3, 4);
        p2.moveUp();
        System.out.println(p2);

        MovablePoint p3 = (MovablePoint) p2;
        System.out.println(p3);

    }
}
