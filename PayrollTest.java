import java.util.*;
public class PayrollTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the employee's name? ");
		String name = scan.nextLine();
		System.out.print("What is " + name + "'s ID Number? ");
		int id = scan.nextInt();
		scan.nextLine();
		
		Payroll employee = new Payroll(name, id);
		
		System.out.println("What is " + employee.getName() + "'s hourly pay rate?");
		System.out.print("$ ");
		double hourlyRate = scan.nextDouble();
		scan.nextLine();
		while(hourlyRate <= 0) {
			System.out.println(employee.getName() + "'s hourly rate of pay must be greater than zero.");
			System.out.println("What is " + employee.getName() + "'s hourly pay rate?");
			System.out.print("$ ");
			hourlyRate = scan.nextDouble();
			scan.nextLine();
		}
		employee.setPayRate(hourlyRate);
		
		System.out.print("How many hours did " + employee.getName() + " work this week? ");
		int hoursWorked = scan.nextInt();
		scan.nextLine();
		while(hoursWorked < 0) {
			System.out.println("The amount of hours worked must be a positive number.");
			System.out.print("How many hours did " + employee.getName() + " work this week? ");
			hoursWorked = scan.nextInt();
			scan.nextLine();
		}
		employee.setHoursWorked(hoursWorked);
		
		double payment;
		payment = employee.getGrossPay();
		
		System.out.print(employee.getName() + " earned ");
		System.out.printf("$%,.2f this week.", payment);
		System.out.println();
	}
}