public class SavingsAccount {
	private double interestRate; //annual interest rate
	private double balance; //account balance
	
	//constructor
	public SavingsAccount(double startBalance) {
		balance = startBalance;
	}
	
	//accessor methods
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//mutator methods
	public void setInterestRate(double intRate) {
		interestRate = intRate;
	}
	
	public void setBalance(double balan) {
		balance = balan;
	}
	
	/**
		The withdraw method subtracts from the account balance.
	*/
	public void withdrawal(double withdraw) {
		balance -= withdraw;
	}
	
	/**
		The deposit method adds to the account total.
	*/
	public void deposit(double depo) {
		balance += depo;
	}
	
	/**
		The collectInterest method adds the monthly interest to the balance.
		
		@return monthlyInterest The amount of interest earned in a month.
	*/
	public double collectInterest() {
		double monthlyInterestRate;
		double monthlyInterest;
		monthlyInterestRate = interestRate / 12;
		monthlyInterest = monthlyInterestRate * balance;
		balance += monthlyInterest; //adding monthly interest to the balance
		return monthlyInterest;
	}
}