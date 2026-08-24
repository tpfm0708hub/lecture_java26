package classtest;

public class Circle {
	final double PI = 3.141592;
	double radius;
	public Circle (double radius) {
		this.radius =  radius;
	}
	double getArea() {
		return PI * radius * radius;
	}
}
