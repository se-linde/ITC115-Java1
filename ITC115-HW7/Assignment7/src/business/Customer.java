// Author: Dwayne Linde

package business;

// Making this a nonabstract class, because one cannot 
// instantiate an Abstract class. 

public class Customer extends Person {
	
	private String custNumber; 
	
	public Customer() {
	
	// Calling the constructor from the Superclass. 
	
	super(); 
	custNumber = "";  
	}

	public String getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + custNumber; 
	}
	

		public String getDisplayText(){
		
			return toString(); 
	}
	
}
	



