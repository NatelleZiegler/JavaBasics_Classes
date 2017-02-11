import java.util.*;
public class Coin {
	private String sideUp; //will hold either heads or tails, indicating side of coin facing up
	
	//no-args constructor
	public Coin() {
		Random ran = new Random();
		int side = ran.nextInt(2);
		if(side == 0) {
			sideUp = "heads";
		}
		else {
			sideUp = "tails";
		}
	}
	
	/**
		The toss method simulates the tossing of a coin.
	*/
	
	public void toss() {
		Random rand = new Random();
		int side = rand.nextInt(2);
		if(side == 0) {
			sideUp = "heads";
		}
		else {
			sideUp = "tails";
		}
	}
	
	/**
		The getSideUp method returns the value in the sideUp field.
	*/
	
	public String getSideUp() {
		return sideUp;
	}
}