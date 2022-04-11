package inheritance;

/* 
    @author: chu tien dat
    Date: 4/11/2022
    Time: 3:36 PM

    Project Name: java-code
*/

public class LineSub extends Point{
    Point end;

    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2 ,y2);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }


    // get, set
    public Point getBegin() {
        return this;
    }
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }


    //
    public  int getBeginX() {
        return super.getX();
    }
    public  void setBeginX(int x) {
        super.setX(x);
    }
    public int getBeginY() {
        return super.getY();
    }
    public  void setBeginY(int y) {
        super.setY(y);
    }
    public int[] getBeginXY() {
        return super.getXY();
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ", end=" + end + "]";
    }

    public double getLength() {
        return super.distance(end);
    }
}
