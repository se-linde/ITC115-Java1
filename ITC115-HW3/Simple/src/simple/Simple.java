// Author: Dwayne Linde

package simple;

public class Simple {

	private int simpleNumber; 
	// private int i; 
	private int randomNumber; 
	private int upperLimit; 
	
	public Simple() {
		simpleNumber = 0;
		upperLimit = 0; 
		// i = 0; 
	}


	// A counter. Doesn't work yet. 
	
	/* public int incrementGuessCount(int i) {
		i = i + 1; 
		return i; 
	
	} */ 
	
	 
	
	// Get and set methods. 
	
	public int getSimpleNumber() {
		return simpleNumber;
	}

	public void setSimpleNumber(int simpleNumber) {
		this.simpleNumber = simpleNumber;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	/* public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	} */ 

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
}
