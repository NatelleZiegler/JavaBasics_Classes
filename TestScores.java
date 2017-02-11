public class TestScores {
	private int testScoreA; //The first test score
	private int testScoreB; //The second test score
	private int testScoreC; //The third test score
	
	//constructor
	public TestScores() {
		testScoreA = 0;
		testScoreB = 0;
		testScoreC = 0;
	}
	
	//accessor methods
	public int getTestScoreA() {
		return testScoreA;
	}
	
	public int getTestScoreB() {
		return testScoreB;
	}
	
	public int getScoreC() {
		return testScoreC;
	}
	
	//mutator methods
	public void setTestScoreA(int testOne) {
		testScoreA = testOne;
	}
	
	public void setTestScoreB(int testTwo) {
		testScoreB = testTwo;
	}
	
	public void setTestScoreC(int testThree) {
		testScoreC = testThree;
	}
	
	/**
		The method testAverage calculates an average of the three test scores.
		
		@return average The average of the three test scores.
	*/
	
	public int testAverage() {
		int average;
		average = (testScoreA + testScoreB + testScoreC) / 3;
		return average;
	}
}