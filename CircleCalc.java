import java.util.*;
public class CircleCalc {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		double circleRadius;
		System.out.print("Please enter the radius of the circle: ");
		circleRadius = scan.nextDouble();
		scan.nextLine();
		while(circleRadius <= 0) {
			System.out.println("The circle's radius must be greater than zero.");
			System.out.print("Please enter the radius of the circle: ");
			circleRadius = scan.nextDouble();
			scan.nextLine();
		}
		Circle circ = new Circle(circleRadius);
		double area, diameter, circumference;
		area = circ.getArea();
		diameter = circ.getDiameter();
		circumference = circ.getCircumference();
		
		System.out.println("The circle has an area of " + area + ".");
		System.out.println("The circle has a diameter of " + diameter + ".");
		System.out.println("The circle has a circumference of " + circumference + ".");
	}
}