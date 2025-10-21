package lab4;



public class Rectangle {
    Point A, B, C, D;
    double length, width;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;

        
        double distanceAB = A.distance(B);
        double distanceAD = A.distance(D);

        this.length = distanceAB;
        this.width = distanceAD;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle with length = " + length + ", width = " + width;
    }

}
