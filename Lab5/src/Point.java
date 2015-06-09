/**
 * Created by AnatoliyKapustin on 26.05.2015.
 */
public class Point {
    public double x;
    public double y;

    Point()
    {
        x = 0.0;
        y = 0.0;
    }

    Point(double a, double b)
    {
        x = a;
        y = b;
    }

    public String toString(){
        return "("+x+";"+y+")";
    }

    public void quaterCheck(double a, double b){
        if((a > 0) & (b > 0))
            System.out.println("I quater");
        if((a < 0) & (b > 0))
            System.out.println("II quater");
        if((a < 0) & (b < 0))
            System.out.println("III quater");
        if((a > 0) & (b < 0))
            System.out.println("IV quater");
        }
    public void colinearityCheck(Point p1, Point p2, Point p3){
        if((1/2)*((p1.x*p2.y + p2.x*p3.y + p3.x*p1.y)- (p2.x*p1.y + p3.x*p2.y + p1.x*p3.y)) == 0)
            System.out.println("Colinear points");
    }

    public void symetryCheck(Point p1, Point p2) {
        if(p1.x + p2.x == 0 && p1.y + p2.y == 0)
            System.out.println("Points symmetrical");
    }

    public boolean equals(Point p) {
        if(this.x == p.x && this.y == p.y)
            return true;
          else
            return false;
    }

    public double hashCode(Point p) {
        final int prime = 31;
        double result = 1;
        result = prime * result + this.x;
        result = prime * result + this.y;
        result = prime * result + p.x;
        result = prime * result + p.y;
        return result;
    }
}
