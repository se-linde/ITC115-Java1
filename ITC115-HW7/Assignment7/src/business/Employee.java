// Author: Dwayne Linde

package business;

//Making this a nonabstract class, because one cannot 
//instantiate an Abstract class. 


public class Employee extends Person {

	private String ssn; 
	
	public Employee() {
	
	// Calling the constructor from the Superclass. 
	
	super(); 
	ssn = ""; 
	count++; 
	}

	// Getters and setters. 
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	@Override
	public String toString() {
		
		return super.toString() + ssn; 
		
	}
	

	public String getDisplayText(){
		return toString(); 
	}
	
}


