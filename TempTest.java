public class TempTest {
	private int temperature; //stores a given temperature
	
	//constructor
	public TempTest(int temp) {
		temperature = temp;
	}
	
	//no-arg constructor
	public TempTest() {
		temperature = 0;
	}
	
	//accessor method
	public int getTemperature() {
		return temperature;
	}
	
	//mutator method
	public void setTemperature(int temp) {
		temperature = temp;
	}
	
	/**
		The isEthylFreezing determines whether or not the temperature is 
		at or below the freezing point of ethyl alcohol. 
		
		@return ethylFreeze A boolean value that is true if the temperature is at or below freezing point.
	*/
	
	public boolean isEthylFreezing() {
		boolean ethylFreeze;
		if(temperature <= -173) {
			ethylFreeze = true;
		}
		else {
			ethylFreeze = false;
		}
		return ethylFreeze;
	}
	
	/**
		The isEthylBoiling method determines whether or or not the temperature is
		at or above the boiling point of ethyl alcohol.
		
		@return ethylBoil A boolean value that is true if the temperature is at or above the boiling point.
	*/
	
	public boolean isEthylBoiling() {
		boolean ethylBoil;
		if(temperature > 172) {
			ethylBoil = true;
		}
		else {
			ethylBoil = false;
		}
		return ethylBoil;
	}
	
	/**
		The isOxygenFreezing method determines whether or not the temperature is
		at or below the freezing point of oxygen.
		
		@return oxygenFreeze A boolean value that is true if the temperature is at or below the freezing point.
	*/
	
	public boolean isOxygenFreezing() {
		boolean oxygenFreeze;
		if(temperature < -362) {
			oxygenFreeze = true;
		}
		else {
			oxygenFreeze = false;
		}
		return oxygenFreeze;
	}
	
	/**
		The isOxygenBoiling method determines whether or not the temperature is 
		at or above the boiling point of oxygen.
		
		@return oxygenBoil A boolean value that is true if the temperature is at or above the boiling point.
	*/
	
	public boolean isOxygenBoiling() {
		boolean oxygenBoil;
		if(temperature > -306) {
			oxygenBoil = true;
		}
		else {
			oxygenBoil = false;
		}
		return oxygenBoil;
	}
	
	/**
		The isWaterFreezing method determines whether or not the temperature is
		at or below the freezing point of water.
		
		@return waterFreeze A boolean value that is true if the temperature is at or below the freezing point
	*/
	
	public boolean isWaterFreezing() {
		boolean waterFreeze;
		if(temperature < 32) {
			waterFreeze = true;
		}
		else {
			waterFreeze = false;
		}
		return waterFreeze;
	}
	
	/**
		The isWaterBoiling method determines whether or not the temperature is
		at or above the freezing point of water.
		
		@return waterBoil A boolean value that is true if the temperature is at or above the boiling point
	*/
	
	public boolean isWaterBoiling() {
		boolean waterBoil;
		if(temperature > 212) {
			waterBoil = true;
		}
		else {
			waterBoil = false;
		}
		return waterBoil;
	}
}