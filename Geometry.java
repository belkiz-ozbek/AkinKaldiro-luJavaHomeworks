package statik;

import java.awt.Point;

/**
 *
 * @author belkizozbek
 */
public class Geometry {

    static final double PI = Math.PI;
    static final Point origin = new Point(0, 0);

    public static void main(String[] args) {

        System.out.println(calculateAreaOfCircle(2));
        System.out.println(calculatePerimeterOfCircle(3));
        
    }

    public static double calculateAreaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static double calculatePerimeterOfCircle(double radius) {
        return 2 * PI * radius;
    }
}
