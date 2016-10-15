// Author: Dwayne Linde

// Name of the package; I made my own for the practice. 
package numbergame;

// The class for the application, that stores the constructor. 
public class NumberGame {

	// Set to Private, so that the only access is through the constructor. 
	private int guessNumber; 
	private int randomNumber; 
	private int upperLimit; 
	
	// The Constructor. All access to the variables will be through here. 
	public NumberGame(){ 
		guessNumber = 0;
		randomNumber = 0; 
		upperLimit = 0;  		
	}

	// Get and Set methods, for all the variables in the constructor. 
	public int getGuessNumber() {
		return guessNumber;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
}
