package inheritance;

/* 
    @author: chu tien dat
    Date: 4/11/2022
    Time: 2:23 PM

    Project Name: java-code
*/

public class Point3D extends Point2D{
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")";
    }
}
