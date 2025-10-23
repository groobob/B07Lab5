package lab4;

public pentagon {
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    Point p5;

    public pentagon(Point p1, Point p2, Point p3, Point p4, Point p5) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;

    public perimeter() {
        double perimeter = 0;
        perimeter += p1.distance(p2);
        perimeter += p2.distance(p3);
        perimeter += p3.distance(p4);
        perimeter += p4.distance(p5);
        return perimeter += p5.distance(p1);
    }

    public Flip_Along_Line(boolean x, boolean y) {

        if (x && y) {
            this.p1 = new Point(p1.y,p1.x);
            this.p2 = new Point(p2.y,p2.x);
            this.p3 = new Point(p3.y,p3.x);
            this.p4 = new Point(p4.y,p4.x);
            this.p5 = new Point(p5.y,p5.x);
        }

        else if (x) {
            this.p1.x *= -1;
            this.p2.x *= -1;
            this.p3.x *= -1;
            this.p4.x *= -1;
            this.p5.x *= -1;
        }

        else if (y) {
            this.p1.y *= -1;
            this.p2.y *= -1;
            this.p3.y *= -1;
            this.p4.y *= -1;
            this.p5.y *= -1;
        }
    }
}