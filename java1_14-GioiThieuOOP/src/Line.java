public class Line {
    Point begin, end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1,y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }


    // begin
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x,y);
    }


    // end
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



    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public double getLength() {
        return begin.distance(end);
    }

    public boolean check2IntersectingLines(int xE1, int yE1 , int xE2 , int yE2) {
        int x1 = this.begin.getX();
        int y1 = this.begin.getY();
        int x2 = this.end.getX();
        int y2 = this.end.getY();

        int checkE1 = (y1 - y2) * (xE1 - x1) + (x2 - x1) * (yE1 - y1);
        int checkE2 = (y1 - y2) * (xE2 - x1) + (x2 - x1) * (yE2 - y1);

        int check1 = (yE1 - yE2) * (x1 - xE1) + (xE2 - xE1) * (y1 - yE1);
        int check2 = (yE1 - yE2) * (x2 - xE1) + (xE2 - xE1) * (y2 - yE1);

        if (check1 * check2 < 0 && checkE1 * checkE2 < 0)  {
            return true;
        } else {
            return false;
        }
    }


}
