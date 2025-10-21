package lab4;

public class Circle {
	
	Point centre;
	int radius;
	
	public Circle(Point Centre, int Radius) {
		this.centre = Centre;
		this.radius = Radius;
	}
	
	public double circumfrence() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public boolean intersect(Circle other) {
		return this.centre.distance(other.centre) <= this.radius + other.radius;
	}
	

}
