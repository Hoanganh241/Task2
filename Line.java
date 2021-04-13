package task6;

import task5.Point;

public class Line {
    // The private instance variables
    Point begin, end;  //instance of the "point" class
    /** Constructors a Line instance given 2 points at (x1, y1) and (x2, 2) */
    public Line (int x1, int x2, int y1, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    /** Constructors a Line instance given 2 Point instance */
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    //The public getter and setter for the private instance variables
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEn(Point end) {
        this.end = end;
    }
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
        begin.setY();
    }
    public  int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
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
}
