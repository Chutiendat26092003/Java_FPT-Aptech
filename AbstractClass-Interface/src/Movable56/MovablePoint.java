package Movable56;

/* 
    @author: chu tien dat
    Date: 4/14/2022
    Time: 4:06 PM

    Project Name: AbstractClass-Interface
*/

public class MovablePoint implements Movable{
    private int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}
