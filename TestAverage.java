import java.util.*;
public class TestAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestScores test = new TestScores();
		int test1, test2, test3;
		
		//getting the first test score
		System.out.print("Please enter the score of the first test: ");
		test1 = scan.nextInt();
		scan.nextLine();
		while(test1 < 0 || test1 > 100) {
			if(test1 < 0) {
				System.out.println("Your score for the first test must be a positive number.");
			}
			else {
				System.out.println("Your score for the first test cannot be greater than 100.");
			}
			System.out.print("Please enter the score of the first test: ");
			test1 = scan.nextInt();
			scan.nextLine();
		}
		test.setTestScoreA(test1);
		
		//getting the second test score
		System.out.print("Please enter the score of the second test: ");
		test2 = scan.nextInt();
		scan.nextLine();
		while(test2 < 0 || test2 > 100) {
			if(test2 < 0) {
				System.out.println("Your score for the second test must be a positive number.");
			}
			else {
				System.out.println("Your score for the second test cannot be greater than 100.");
			}
			System.out.print("Please enter the score of the second test: ");
			test2 = scan.nextInt();
			scan.nextLine();
		}
		test.setTestScoreB(test2);
		
		//getting the third test score
		System.out.print("Please enter the score of the third test: ");
		test3 = scan.nextInt();
		scan.nextLine();
		while(test3 < 0 || test3 > 100) {
			if(test3 < 0) {
				System.out.println("Your score for the third test must be a positive number.");
			}
			else {
				System.out.println("Your score for the third test cannot be greater than 100.");
			}
			System.out.print("Please enter the score of the third test: ");
			test3 = scan.nextInt();
			scan.nextLine();
		}
		test.setTestScoreC(test3);
		
		//getting the average
		int avg = test.testAverage();
		
		System.out.println("The average of the three test scores is " + avg + ".");
	}
}