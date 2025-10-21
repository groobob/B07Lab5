package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CircleTests {

    @Test
    void testCircumference()
    {
        Point O = new Point(0, 0);
        Circle c = new Circle(O, 2);
        assertEquals(4 * Math.PI, c.circumference());
    }

    @Test
    void testArea()
    {
        Point O = new Point(0, 0);
        Circle c = new Circle(O, 2);
        assertEquals(2 * 2 * Math.PI, c.area());
    }

    @Test
    void testIntersecting()
    {
        Point O1 = new Point(0, 0);
        Circle c1 = new Circle(O1, 1);
        Point O2 = new Point(3, 0);
        Circle c2 = new Circle(O2, 2);
        assertTrue(c1.intersect(c2));
    }
}
