import java.io.*;
import java.util.*;
public class DWFiles {
	public static void main(String[] args) throws IOException {
		//creating a new SavingsAccount with an initial value of $500.00
		SavingsAccount fileSave = new SavingsAccount(500.00);
		fileSave.setInterestRate(.20);
		
		//Scanning the Deposits.txt file for deposits
		File myFile = new File("Deposits.txt");
		Scanner inputFile = new Scanner(myFile);
		for(int count = 1; count <= 4; count++) {
			double readDeposit = inputFile.nextDouble();
			fileSave.deposit(readDeposit);
		}
		inputFile.close();
		
		//Scanning the Withdrawls.txt file for withdrawals
		File myFileB = new File("Withdrawls.txt");
		Scanner inputFileB = new Scanner(myFileB);
		for(int count = 1; count <= 5; count++) {
			double readWithdraw = inputFileB.nextDouble();
			fileSave.withdrawal(readWithdraw);
		}
		inputFile.close();
		
		//calculate the interest for the month
		double monthInterest = fileSave.collectInterest();
		
		//displaying total interest for the month and the net balance
		System.out.printf("You earned a total of $%,.2f in interest this month.\n", monthInterest);
		double userBalance = fileSave.getBalance();
		System.out.printf("Your balance is now $%,.2f\n.", userBalance);
	}
}