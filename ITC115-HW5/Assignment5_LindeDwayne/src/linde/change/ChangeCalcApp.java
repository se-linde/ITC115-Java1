// Assignment 5 - written by Dwayne Linde. 

package linde.change;

// Importing the Scanner and the other package in the application. 
import java.util.Scanner;
import linde.change.business.ChangeCalc;

// Default class for the application. 
public class ChangeCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Gives the greeting
		System.out.println("Welcome to the change calculator! By Dwayne!"); 
		Scanner sc = new Scanner(System.in); 
		
		// Sets the default string choice. 
		String choice = "y"; 
		
		// The white loop - has the logic in the change calculator program. 
		while (choice.equalsIgnoreCase("y")){
			
			// User types in the number of cents. 
			System.out.println("Please type in the # of cents you want to find change for, between 0-99: ");
			int changeCount = Integer.parseInt(sc.nextLine()); 
			
			// Calls the constructor. 
			ChangeCalc change = new ChangeCalc(); 
			change.setChangeCount(changeCount);
		
			// Tries calling the other constructor, but that ended badly. But, may be 
			// what I have to do. 
			
			// int quarters = 0; 
			// ChangeCalc Changequarters = new ChangeCalc(); 
			// Changequarters.setQuarters(quarters);
	
			// So, I instead wrote a bunch of nested loops. 
			
			// If the user enters a # that has at least one quarter. 
			if (changeCount >= 25 && changeCount <= 99) {
			
				int quarters = change.getChangeCount() / 25;
				int quartersRemainder = change.getChangeCount() % 25; 
				
				System.out.println("Number of Quarters: " + quarters + "\t");
	
				// This is the breakdown of the dimes/nickels/pennies permutation trees. 
				if  (quartersRemainder < 5 && quartersRemainder >= 0 ){  
					 
					int penniesRemainder = quartersRemainder;  
					System.out.println("Number of Pennies: " + penniesRemainder + "\t");
				}
				
				if  (quartersRemainder < 10 && quartersRemainder >= 5) {
					int nickels = quartersRemainder / 5; 
					int nickelsRemainder = quartersRemainder % 5; 
					
					System.out.println("Number of Nickels: " + nickels + "\t");
					
					if  (nickelsRemainder < 5 && nickelsRemainder >= 0 ){  
						 
						int penniesRemainder = nickelsRemainder;  
						System.out.println("Number of Pennies: " + penniesRemainder + "\t");
					}
				}		
			
					
				if  (quartersRemainder < 25 && quartersRemainder >= 10) {
			
					int dimes = quartersRemainder / 10; 
					int dimesRemainder = quartersRemainder % 10; 
			
					System.out.println("Number of Dimes: " + dimes + "\t");
						
					if  (dimesRemainder < 5 && dimesRemainder >= 0 ){  
						int penniesRemainder = dimesRemainder; 
						System.out.println("Number of Pennies: " + penniesRemainder + "\t");
					}
				 
					if  (dimesRemainder < 10 && dimesRemainder >= 5) {
						int nickels = dimesRemainder / 5; 
						int nickelsRemainder = dimesRemainder % 5; 
						
						System.out.println("Number of Nickels: " + nickels + "\t");
						
						if  (nickelsRemainder < 5 && nickelsRemainder >= 0 ){  
							 
							int penniesRemainder = nickelsRemainder;  
							System.out.println("Number of Pennies: " + penniesRemainder + "\t");
						}
					
					}		
				
				}
	
				// This is if the user types in a # that is less than 25, but more than 10. 
				// Will generate dimes. 
				// Permutation breakdown below for the dimes/nickels/pennies trees. 
				
			} else if  (changeCount < 25 && changeCount >= 10){  
				
				int dimes = change.getChangeCount() / 10; 
				int dimesRemainder = change.getChangeCount() % 10; 
							
				System.out.println("Number of Dimes: " + dimes + "\t");
				// System.out.println("Dimes Remainder: " + dimesRemainder  + "\t");
				
				if  (dimesRemainder < 5 && dimesRemainder >= 0 ){  
					int penniesRemainder = dimesRemainder; 
					System.out.println("Number of Pennies2: " + penniesRemainder  + "\t");
				}
				
				if  (dimesRemainder < 10 && dimesRemainder >= 5 ){  
					
					int nickels = dimesRemainder / 5; 
					int nickelsRemainder = dimesRemainder % 5; 
					
					System.out.println("Number of Nickels: " + nickels + "\t");
					// System.out.println("Nickels Remainder: " + nickelsRemainder  + "\n");
					
					if  (nickelsRemainder < 5 && nickelsRemainder >= 0 ){  
						int penniesRemainder = nickelsRemainder; 
						System.out.println("Number of Pennies: " + penniesRemainder  + "\t");
					}
					
					
				}
				
				
				// This is if the user types in a # that is less than 10, but more than 5. 
				// Will generate nickels. 
				// Permutation breakdown below for the nickels/pennies trees. 
				
			
			} else if  (changeCount < 10 && changeCount >= 5 ){  
				
				int nickels = change.getChangeCount() / 5; 
				int nickelsRemainder = change.getChangeCount() % 5; 
				
				System.out.println("Number of Nickels: " + nickels + "\t");
				
				if  (nickelsRemainder < 5 && nickelsRemainder >= 0 ){  
					 
					int penniesRemainder = nickelsRemainder; 
					System.out.println("Number of Pennies: " + penniesRemainder  + "\t");
				}
				
				// This is if the user types in a # that is less than 5.
				// Will generate pennies. 
				// Permutation breakdown below for the penny branch, the only one. 
				
			
			} else if  (changeCount < 5 && changeCount >= 0 ){  
				 
				int penniesRemainder = change.getChangeCount();  
				System.out.println("Number of Pennies: " + penniesRemainder  + "\t");
				
				
			// 	Basic error handling, in case the user types in a number above 99 or below 0. 
			// There's no error handling for a string, or a null - those generate exceptions. 	
			
			} else if (changeCount < 0 || changeCount > 99) {
				
				System.out.println("Number out of bounds!");
			}
			
			// After the calculation, it asks if you want to play again. 
			System.out.println("");
			System.out.println("Would you like to play again? y/n: ");
			choice = sc.nextLine(); 
		}
		
		// Closes the scanner, and gives a goodbye message before terminating.  
		sc.close(); 	
		System.out.println("");
		System.out.println("Bye! Thank you for playing our little game!");
		
	}
	
}
