import java.util.*;
public class TempDemo {
	public static void main(String[] args) {
		//getting a temperature from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a temperature: ");
		int userTemp;
		userTemp = scan.nextInt();
		scan.nextLine();
		
		//creating a new temp and testing for boiling and freezing points
		TempTest userTempTest = new TempTest(userTemp);
		boolean eFreeze, eBoil, oFreeze, oBoil, wFreeze, wBoil; //testing boil and freeze points
		eFreeze = userTempTest.isEthylFreezing();
		eBoil = userTempTest.isEthylBoiling();
		oFreeze = userTempTest.isOxygenFreezing();
		oBoil = userTempTest.isOxygenBoiling();
		wFreeze = userTempTest.isWaterFreezing();
		wBoil = userTempTest.isWaterBoiling();
		
		System.out.println(); //blank line for readability
		
		//displaying the of freeze tests to the user
		if(eFreeze == true || oFreeze == true || wFreeze == true) {
			System.out.println("The following substances will freeze at your inputted temperature:");
		}
		if(eFreeze == true) {
			System.out.println("\t*Ethyl Alcohol");
		}
		if(oFreeze == true) {
			System.out.println("\t*Oxygen");
		}
		if(wFreeze == true) {
			System.out.println("\t*Water");
		}
		
		System.out.println(); //blank line for readability
		
		//displaying the results of boiling tests to the user
		if(eBoil == true || oBoil == true || wBoil == true) {
			System.out.println("The following substances will boil at your inputted temperature:");
		}
		if(eBoil == true) {
			System.out.println("\t*Ethyl Alcohol");
		}
		if(oBoil == true) {
			System.out.println("\t*Oxygen");
		}
		if(wBoil == true) {
			System.out.println("\t*Water");
		}
	}
}