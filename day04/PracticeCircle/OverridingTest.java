package PracticeCircle;

class Circle{
	public static final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class Ball extends Circle{
	public Ball(double radius){
		super(radius);// 클래스 내 선언된 radius가 없어서 this. 사용 불가
	}
	public double getArae() {
		return 4 * PI * getRadius() * getRadius();
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return ((2 * PI * getRadius() * getRadius()) + (2 * PI * getRadius() * height));
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println(">>> 원 : ");
		System.out.println("반지름 : " + circle.getRadius());
		System.out.println("면적 : " + circle.getArea());
		
		Ball ball = new Ball(5.0);
		System.out.println("\n>>> 공 :");
		System.out.println("반지름 : " + ball.getRadius());
		System.out.println("면적 : " + ball.getArea());
		
		Cylinder cyl = new Cylinder(5.0, 7.0);
		System.out.println("\n>>> 원기둥 : ");
		System.out.println("높이 : " + cyl.getHeight());
		System.out.println("면적 : " + cyl.getArea());
	}

}
