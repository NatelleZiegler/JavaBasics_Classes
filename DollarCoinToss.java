import java.util.*;
public class DollarCoinToss {
	public static void main(String[] args) {
		//create three instances of coin class
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
		
		//the value of each coin
		final double QUART_VALUE = 0.25;
		final double DIME_VALUE = 0.10;
		final double NICK_VALUE = 0.05;
		
		double balance = 0; //starting balance is zero at beginning of the game
		String side; //the side of the coin facing up
		
		do {
			//tossing quarter
			quarter.toss();
			side = quarter.getSideUp();
			if(side.equals("heads")) {
				System.out.println("Your quarter landed on heads!");
				balance += QUART_VALUE;
			}
			
			//tossing dime
			dime.toss();
			side = dime.getSideUp();
			if(side.equals("heads")) {
				System.out.println("Your dime landed on heads!");
				balance += DIME_VALUE;
			}
			
			//tossing nickel
			nickel.toss();
			side = nickel.getSideUp();
			if(side.equals("heads")) {
				System.out.println("Your nickel landed on heads!");
				balance += NICK_VALUE;
			}
			
		} while(balance < 1.00);
		
		System.out.printf("Your total is $%.2f.", balance);
		System.out.println();
		if (balance == 1.00) {
			System.out.println("You win the game!");
		}
		else {
			System.out.println("You lose the game!");
		}
	}
}