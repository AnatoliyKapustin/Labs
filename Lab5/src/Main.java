/**
 * Created by AnatoliyKapustin on 26.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2.0,2.0);
        Point p2 = new Point(2.0,2.0);
        Point p3 = new Point(-2.0,4.0);
        p2.quaterCheck(2.2,-3.1);
        p1.colinearityCheck(p1, p2, p3);
        p1.symetryCheck(p2, p3);
        p1.equals(p2);
        p1.hashCode(p2);
    }
}
