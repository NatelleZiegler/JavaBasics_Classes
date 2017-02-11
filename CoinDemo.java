import java.util.*;
public class CoinDemo {
	public static void main(String[] args) {
		Coin myCoin = new Coin(); //creating a new coin
		String side = myCoin.getSideUp();
		System.out.println("The coin is initially " + side + "."); //initial side facing up
		System.out.println("Results of twenty coin tosses: ");
		
		int totalHeads = 0;
		int totalTails = 0;
		
		//We will use a loop to demo tossing a coin 20 times
		for(int count = 1; count <= 20; count++) {
			myCoin.toss();
			side = myCoin.getSideUp();
			System.out.println(count + ". " + side);
			if (side.equals("heads")) {
				totalHeads += 1;
			}
			else {
				totalTails += 1;
			}
		}
		
		System.out.println(); //blank line for readability
		System.out.println("The coin was heads " + totalHeads + " times.");
		System.out.println("The coin was tails " + totalTails + " times.");
	}
}
		