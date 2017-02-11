public class CarTest {
	public static void main(String[] args) {
		String carMake = "Ford";
		int year = 1992;
		
		Car myCar = new Car(year, carMake);
		int currentSpeed;
		
		for (int count = 1; count <= 5; count++) {
			myCar.accelerate();
			currentSpeed = myCar.getSpeed();
			System.out.println("You are now going " + currentSpeed + " MPH.");
		}
		
		for (int count = 1; count <= 5; count++) {
			myCar.brake();
			currentSpeed = myCar.getSpeed();
			System.out.println("You are now going " + currentSpeed + " MPH.");
		}
	}
}