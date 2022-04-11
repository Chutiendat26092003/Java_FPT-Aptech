package inheritance;

/* 
    @author: chu tien dat
    Date: 4/11/2022
    Time: 3:32 PM

    Project Name: java-code
*/

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));
    }

    public double distance(Point another) {
        return Math.sqrt((another.y - this.y) * (another.y - this.y) + (another.x - this.x) * (another.x - this.x));
    }

    public double distance() {
        return Math.sqrt(this.y * this.y + this.x * this.x);
    }
}
