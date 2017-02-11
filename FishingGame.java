import java.util.*;
public class FishingGame {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Die myDie = new Die(6);
		int fishPoints = 0;
		String input;
		char confirm;
		
		do {
			myDie.roll();
			int roundRoll; //to hold value of the die after it was rolled this round
			roundRoll = myDie.getValue();
			switch(roundRoll) {
				case 1:
					System.out.println("You caught a huge fish!");
					fishPoints += 5;
				break;
				case 2:
					System.out.println("Uh-oh...you caught an old shoe.");
					//no points rewarded
				break;
				case 3:
					System.out.println("You caught a little fish.");
					fishPoints += 3;
				break;
				case 4:
					System.out.println("You caught a mid-size fish.");
					fishPoints += 4;
				break;
				case 5:
					System.out.println("You caught a little goldfish!");
					fishPoints += 2;
				break;
				case 6:
					System.out.println("You caught a tiny little minnow!");
					fishPoints += 1;
				break;
			}
			System.out.println("Do you want to keep fishing?");
			System.out.print("Y or N? ");
			input = scan.nextLine();
			input = input.toUpperCase();
			confirm = input.charAt(0);
			while(confirm != 'Y' && confirm != 'N') {
				System.out.println("Please eneter Y for yes and N for no.");
				System.out.println("Do you want to keep fishing?");
				System.out.print("Y or N? ");
				input = scan.nextLine();
				input = input.toUpperCase();
				confirm = input.charAt(0);
			}
		}while(confirm != 'N');
		
		System.out.println("During your fishing session you accumulated a total of " + fishPoints + ".");
		if(fishPoints == 0) {
			System.out.println("Better luck next time.");
		}
		else if(fishPoints <= 5 && fishPoints > 0) {
			System.out.println("There's definitely room for improvement!");
		}
		else if(fishPoints <= 10 && fishPoints > 5) {
			System.out.println("You did okay!");
		}
		else if(fishPoints <= 15 && fishPoints > 10) {
			System.out.println("You did pretty good!");
		}
		else if(fishPoints <= 25 && fishPoints > 15) {
			System.out.println("You are Queen/King of the seas!");
		}
		else {
			System.out.println("You are a GOD.");
		}
	}
}