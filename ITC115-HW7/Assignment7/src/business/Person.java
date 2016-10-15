// Author: Dwayne Linde

package business;


//This is the SUPER CLASS. And the SUPER CONSTRUCTOR. 
//This can be called anything; when calling it, you'd use 
//'super();' 

// Making this an abstract class. 
public abstract class Person {

	private String lastName; 
	private String firstName; 
	private String email; 
	protected static int count = 0;
	

//Constructor - the main one. This is what 'super()' will refer to. 

public Person() {
	
	}

// The getters and setters for the constructor elements. 

public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public static int getCount() {
	return count;
}


public static void setCount(int count) {
	Person.count = count;
}

public abstract String getDisplayText();

//Override - returns this, instead of the Object class one. 
	@Override // This is annotation. 
	public String toString() {

		// System.out.println(super.toString()); // toString of Object Class. Don't want this. 
		// return firstName + lastName + email; 
		return ""; 
	}

}


