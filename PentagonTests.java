package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PentagonTests {
	@Test
	void testPerimeter(){
		Pentagon p = new Pentagon(
            new Point(0,0),
            new Point(1,0),
            new Point(2,0),
            new Point(2,1),
            new Point(0,1));
		assertEquals(6.0, p.perimeter());
	}
	
	@Test
	void testisRegularT(){
		Pentagon p = new Pentagon(
	            new Point(0,0),
	            new Point(0,0),
	            new Point(0,0),
	            new Point(0,0),
	            new Point(0,0));
		assertTrue(p.isRegular());
	}

	@Test
	void testIsRegularF(){
		Pentagon p = new Pentagon(
	            new Point(0,0),
	            new Point(1,0),
	            new Point(2,0),
	            new Point(3,0),
	            new Point(4,0));
		assertFalse(p.isRegular());
	}
	
	@Test
	void testScale(){
		Pentagon p = new Pentagon(
	            new Point(1,2),
	            new Point(-2,3),
	            new Point(0.5,-1),
	            new Point(-1.5,-2),
	            new Point(2,-0.5));
		Pentagon q = p.scale(2.0, 3.0);
		assertEquals(p.p1.x * 2.0, q.p1.x);
	}
}
