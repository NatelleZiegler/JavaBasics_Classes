public class Payroll {
	private String name; //holds an employee's name
	private int idNum; //holds an employee's ID number
	private double payRate; //holds an employee's hourly pay rate
	private int hoursWorked; //holds the number of hours an employee has worked
	
	//constructor
	public Payroll(String employeeName, int id) throws Exception {
		name = employeeName;
		idNum = id;
		payRate = 0;
		hoursWorked = 0;
	}
	
	//accessor methods
	public String getName() {
		return name;
	}
	
	public int getIdNum() {
		return idNum;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	//mutator methods
	public void setName(String userName) {
		name = userName;
	}
	
	public void setIdNum(int id) {
		idNum = id;
	}
	
	public void setPayRate(double rate) {
		payRate = rate;
	}
	
	public void setHoursWorked(int hours) {
		hoursWorked = hours;
	}
	
	/**
		The getGrossPay method calculates the user's gross pay for the hours worked.
		
		@return grossPay The total amount of money a user has earned.
	*/
	
	public double getGrossPay() {
		double grossPay;
		grossPay = hoursWorked * payRate;
		return grossPay;
	}
}