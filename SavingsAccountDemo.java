import java.util.*;
public class SavingsAccountDemo {
	public static void main(String[] args) {
	
		//this next segment of code prompts the user for their annual interest rate and store the info
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your annual interest rate? ");
		double annualInterest = scan.nextDouble();
		scan.nextLine();
		while(annualInterest <= 0) {
			System.out.println("Your annual interest rate must be greater than zero.");
			System.out.print("What is your annual interest rate? ");
			annualInterest = scan.nextDouble();
			scan.nextLine();
		}
		
		//this next segment asks for the starting balance of the user's account
		System.out.println("What is the starting balance of your account?");
		System.out.print("$ ");
		double startBalance = scan.nextDouble();
		scan.nextLine();
		while(startBalance < 0) {
			System.out.println("Your starting balance must be a positive number.");
			System.out.println("What is the starting balance of your account?");
			System.out.print("$ ");
			startBalance = scan.nextDouble();
			scan.nextLine();
		}
		
		//the next segment asks the user for how many months they have had the account
		System.out.print("How many months have passed since the account was established? ");
		int numMonths = scan.nextInt();
		scan.nextLine();
		while(numMonths < 0) {
			System.out.println("The number of months that you have had the account must be a positive number.");
			System.out.print("How many months have passed since the account was established? ");
			numMonths = scan.nextInt();
			scan.nextLine();
		}
		
		//create a new SavingsAccount object from the information the user has given us
		SavingsAccount save = new SavingsAccount(startBalance);
		save.setInterestRate(annualInterest);
		
		//declaring variables that will help us to calculate totals
		double totalDepo = 0, totalWithdraw = 0, totalInterest = 0;
		
		for(int count = 1; count <= numMonths; count++) {
			//calculating the deposits for the month
			System.out.println("How much money did you deposit in month " + count + "?");
			System.out.print("$ ");
			double monthlyDeposit = scan.nextDouble();
			scan.nextLine();
			while(monthlyDeposit < 0) {
				System.out.println("Your monthly deposit cannot be a negative number.");
				System.out.println("How much money did you deposit in month " + count + "?");
				System.out.print("$ ");
				monthlyDeposit = scan.nextDouble();
				scan.nextLine();
			}
			totalDepo += monthlyDeposit;
			save.deposit(monthlyDeposit);
			
			//calculating the withdrawals for the month
			System.out.println("How much money did you take out of your account in month " + count + "?");
			System.out.print("$ ");
			double monthlyWithdraw = scan.nextDouble();
			scan.nextLine();
			double accountBalance;
			accountBalance = save.getBalance();
			while(monthlyWithdraw < 0 || monthlyWithdraw > accountBalance) {
				if(monthlyWithdraw < 0) {
					System.out.println("The amount of money you withdrew in a month cannot be less than zero.");
				}
				else {
					System.out.println("The amount of money you withdrew in a month cannot exceed your balance.");
				}
				System.out.println("How much money did you take out of your account in month " + count + "?");
				System.out.print("$ ");
				monthlyWithdraw = scan.nextDouble();
				scan.nextLine();
			}
			totalWithdraw += monthlyWithdraw;
			save.withdrawal(monthlyWithdraw);
			
			//calculating the monthly interest
			double monthlyInterest = save.collectInterest();
			totalInterest += monthlyInterest;
		}
		
		//displaying results to the user
		double endingBalance = save.getBalance();
		System.out.println();
		System.out.println("Within the " + numMonths + " months in which you held the account: ");
		System.out.printf("\t*You deposited a total of $%,.2f into your account.\n", totalDepo);
		System.out.printf("\t*You withdrew a total of $%,.2f from your account.\n", totalWithdraw);
		System.out.printf("\t*Your account accumulated $%,.2f in interest.\n", totalInterest);
		System.out.println();
		System.out.printf("Your ending balance is $%,.2f.\n", endingBalance);
	}
}