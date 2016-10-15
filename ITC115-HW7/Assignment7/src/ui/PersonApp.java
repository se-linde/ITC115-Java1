// Author: Dwayne Linde

package ui;

// Import all the needed libraries. 
import java.util.Scanner;
import business.Customer;
import business.Employee;
import business.Person;

// Make this an Abstract class. Sits outside the Main. 
public abstract class PersonApp extends Person {
	
	public String getDisplayText() {
		return ""; 
	}
	
	// The Main. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the Person Tester App!");
	System.out.println();

	Scanner sc = new Scanner(System.in); 
	String choice = "y"; 
	
	
	while (choice.equalsIgnoreCase("y")) {
		
		// While the choice is y, ask for user data. 
		// The choice is going to be stored in personCode; either a c or an e. 
		// 'c' for Customer, and 'e' for Employee. 
		
		System.out.print("Create customer or employee? (c/e): ");
		String personCode = sc.nextLine(); // read the product code. 
			
		// Display the output. 
		System.out.println();
		
		if (personCode.equalsIgnoreCase("c")) {
			
			// Customer choice; calls the Employee subclass. 
			
			System.out.print("Please enter your email: ");
			String email = sc.nextLine(); // read the email. 

			System.out.print("Please enter your first name: ");
			String firstName = sc.nextLine(); // read the first name. 

			System.out.print("Please enter your last name: ");
			String lastName = sc.nextLine(); // read the last name. 
			
			System.out.print("Please enter your customer number: ");
			String custNumber = sc.nextLine(); // read the customer number. 
			

			// Instantiates the Customer class, and passes in the set variables. 
			Customer c = new Customer(); 
			c.setEmail(email);
			c.setFirstName(firstName);
			c.setLastName(lastName);
			c.setCustNumber(custNumber); 
			
			// Output. Includes toString() override. 
			System.out.println(); 
			System.out.println("Name:                     " + c.getFirstName() + " " + c.getLastName() + "\n" +
					"Email:                    " + c.getEmail() + "\n" + 
					"Customer Number:          " + c.toString());
			
			
			System.out.println();

		
			
		} else if (personCode.equalsIgnoreCase("e")) {

			// Employee choice; calls the Employee subclass. 
			
			System.out.print("Please enter your email: ");
			String email = sc.nextLine(); // read the email. 

			System.out.print("Please enter your first name: ");
			String firstName = sc.nextLine(); // read the first name. 

			System.out.print("Please enter your last name: ");
			String lastName = sc.nextLine(); // read the last name. 
			
			System.out.print("Please enter your Social Security Number, including dashes: ");
			String ssn = sc.nextLine(); // read the SSN. 
			
			// Instantiates the Employee class, and passes in the set variables. 
			Employee e = new Employee(); 
			e.setEmail(email);
			e.setFirstName(firstName);
			e.setLastName(lastName);
			e.setSsn(ssn); 
			
			// Output. Includes toString() override. 
			System.out.println();
			System.out.println("Name:                   " + e.getFirstName() + " " + e.getLastName() + "\n" +
					"Email:                  " + e.getEmail() + "\n" + 
					"SSN:                    " + e.toString());
			System.out.println();
			
		

		} else { System.out.println("Invalid letter; please type 'c' or 'e'."); }
		
		System.out.println("Continue? y/n");
		choice = sc.nextLine(); 
	
		}
	
		// Close the scanner. 
		sc.close(); 
	
		// Closing message. 
		System.out.println();
		System.out.println("Goodbye!");
	
	}

}
	

	
	