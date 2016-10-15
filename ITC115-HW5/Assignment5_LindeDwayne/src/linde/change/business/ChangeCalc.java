// Assignment 5 - written by Dwayne Linde. 

package linde.change.business;

// The class ints - private - only can be accessed via the constructor.
public class ChangeCalc {

	private int quarters; 
	
	private int dimes;
	private int nickels;
	private int pennies; 
	
	private int quartersRemainder; 
	private int dimesRemainder; 
	private int nickelsRemainder;
	private int penniesRemainder; 
	
	private int changeCount; 
	private int total; 
	
	
// Default Constructor. 	
	public ChangeCalc() {
		
		quarters = 0; 
	
		dimes = 0; 
		nickels = 0;
		pennies = 0;
		
		changeCount = 0; 
		total = 0; 	
		
		quartersRemainder = 0; 
		dimesRemainder = 0; 
		nickelsRemainder = 0; 
		penniesRemainder = 0; 
	}

	
	// Getters and setters. 
	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public int getChangeCount() {
		return changeCount;
	}

	public void setChangeCount(int changeCount) {
		this.changeCount = changeCount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getQuartersRemainder() {
		return quartersRemainder;
	}

	public void setQuartersRemainder(int quartersRemainder) {
		this.quartersRemainder = quartersRemainder;
	}

	public int getDimesRemainder() {
		return dimesRemainder;
	}

	public void setDimesRemainder(int dimesRemainder) {
		this.dimesRemainder = dimesRemainder;
	}

	public int getNickelsRemainder() {
		return nickelsRemainder;
	}

	public void setNickelsRemainder(int nickelsRemainder) {
		this.nickelsRemainder = nickelsRemainder;
	}

	public int getPenniesRemainder() {
		return penniesRemainder;
	}

	public void setPenniesRemainder(int penniesRemainder) {
		this.penniesRemainder = penniesRemainder;
	}
}

