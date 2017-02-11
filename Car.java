public class Car {
	private int yearModel; //the car's year model
	private String make; //the make of the car
	private int speed; //the car's current speed
	
	public Car(int year, String maker) {
		yearModel = year;
		make = maker;
		speed = 0;
	}
	
	//accessor methods
	public int getYearModel() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	} 
	
	/**
		The accelerate method adds 5 to the speed field each time it is called.
	*/
	
	public void accelerate() {
		speed += 5;
	}
	
	/**
		The brake method subtracts 5 from the speed field each time it is called.
	*/
	
	public void brake() {
		speed -= 5;
	}
}