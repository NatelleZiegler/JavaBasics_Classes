public class Circle {
	private double radius;
	private static final double PI = 3.14159;
	
	//constructor that accepts the radius of a circle as an argument
	public Circle(double rad) {
		radius = rad;
	}
	
	//no-arg constructor that sets radius to 0.0
	public Circle() {
		radius = 0.0;
	}
	
	//a mutator method for the radius field
	public void setRadius(double rad) {
		radius = rad;
	}
	
	//an accessor method for the radius field
	public double getRadius() {
		return radius;
	}
	
	//a method that returns the area of a circle
	public double getArea() {
		double area;
		area = PI * radius * radius;
		return area;
	}
	
	//a method that returns the diameter of a circle
	public double getDiameter() {
		double diameter;
		diameter = radius * 2;
		return diameter;
	}
	
	//a method that returns the circumference of a circle
	public double getCircumference() {
		double circumference;
		circumference = 2 * PI * radius;
		return circumference;
	}
	
}