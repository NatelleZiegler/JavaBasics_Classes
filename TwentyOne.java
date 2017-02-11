import java.util.*;
public class TwentyOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input; //for user input
		char confirm = 'Q'; //Y or N character representing user's desire to continue game
		Die dieA = new Die(6);
		Die dieB = new Die(6);
		int compTotal = 0, userTotal = 0; //for the accumulated totals of the user and the computer
		int pointsRoundComp = 0, pointsRoundUser = 0;
		
		do {
			System.out.println();
			//rolling dice for the computer
			dieA.roll();
			dieB.roll();
			
			int valueDieA, valueDieB;
			valueDieA = dieA.getValue();
			valueDieB = dieB.getValue();
			pointsRoundComp = valueDieA + valueDieB;
			compTotal += pointsRoundComp;
			
			//rolling dice for user
			dieA.roll();
			dieB.roll();
			
			valueDieA = dieA.getValue();
			System.out.println("Your first roll this round was a " + valueDieA);
			valueDieB = dieB.getValue();
			System.out.println("Your second roll this round was a " + valueDieB);
			pointsRoundUser = valueDieA + valueDieB;
			System.out.println("Your total roll this round was " + pointsRoundUser);
			userTotal += pointsRoundUser;
			System.out.println("You are currently at " + userTotal + " points.");
			
			if (userTotal < 21) {
				System.out.println("Would you like roll the dice again?");
				System.out.print("Y or N? ");
				input = scan.nextLine();
				input = input.toUpperCase();
				confirm = input.charAt(0);
			
				while(confirm != 'Y' && confirm != 'N') {
					System.out.println("Please enter Y for yes and N for no.");
					System.out.println("Would you like to roll the dice again?");
					System.out.print("Y or N? ");
					input = scan.nextLine();
					input = input.toUpperCase();
					confirm = input.charAt(0);
				}
			}
			
		} while (userTotal < 21 && confirm != 'N');
		
		System.out.println();
		System.out.println("The computer's total was " + compTotal + ".");
		System.out.println("The user's total was " + userTotal + ".");
		
		if(compTotal > 21 && userTotal <= 21) {
			System.out.println("The computer's total exceded 21.");
			System.out.println("The user wins!");
		}
		else if(userTotal > 21 && compTotal <= 21) {
			System.out.println("Your total exceded 21.");
			System.out.println("The computer wins!");
		}
		else if((compTotal <= 21 && userTotal <= 21) && (userTotal > compTotal)) {
			System.out.println("The user wins!");
		}
		else if((compTotal <= 21 && userTotal <= 21) && (userTotal < compTotal)) {
			System.out.println("The computer wins!");
		}
		else {
			System.out.println("Winner unable to be determined.");
		}
	}
}