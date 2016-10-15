// Author: Dwayne Linde

package simple;
import java.util.Random;
import java.util.Scanner;

public class SimpleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		// Intro and setting the scanner. 
		System.out.println("Hello - this is a Numbers Guessing Game!");
		Scanner sc = new Scanner(System.in); 
		String choice = "y"; 
		
		// Sets up the upper limit number for the game. 
		System.out.println("Please type in a your upper limit number: ");
		int upperLimit = Integer.parseInt(sc.nextLine());
		Simple Simple2 = new Simple(); 
		Simple2.setUpperLimit(upperLimit);

		// Initializes the random number. 
		Random random = new Random();
		int randomNumber = random.nextInt(upperLimit - 1) + 1;
		
		
		while (choice.equalsIgnoreCase("y")){
			
			System.out.println("Please type in a random number: ");
			int simpleNumber = Integer.parseInt(sc.nextLine());
		
			// Populating the constructor.
			Simple Simple1 = new Simple(); 
			Simple1.setSimpleNumber(simpleNumber);
			Simple1.setRandomNumber(randomNumber);
			
			
			
			// The while loop that does the comparison logic. Pray for me. Works! 
			
			if (simpleNumber < randomNumber) {
				// logic! 
				System.out.println("This is too low!");
				// Call counter
				int i = incrementGuessCount(); 
				
				
			} else if (simpleNumber > randomNumber) {
				// More Logic! 
				System.out.println("This is too high!");
				// Call counter
				int i = incrementGuessCount(); 
				
				
			} else if (simpleNumber == randomNumber) {
				// Still more logic! 
				System.out.println("WHOA, COWBOY! This is just right! YOU WON, LIL' DUDE!");
				// Call counter
				int i = incrementGuessCount(); 		
			}
			
			
			// Message to the user. 
			/* System.out.println("Simple Number: " + Simple1.getSimpleNumber() + "\n"
					+ "Random Number: " + Simple1.getRandomNumber() + "\n"); */  		
			System.out.println("Continue? y/n: ");
			choice = sc.nextLine(); 
	 	
			
		}
		
		sc.close();
		
		System.out.println("Bye! Thank you for playing our little game!");
		System.out.println("You guessed: " + incrementGuessCount() + " times!");
		
	}

	// This is the method for the Increment Counter. 
	// It's not in the best place, but it works. 
	// Made the i = -1, as it was adding an extra guess at the end. 
	// I think it was interpreting the 'upperLimit' number as also a guess. 
	
	static int i = -1; 
	private static int incrementGuessCount() {
		// TODO Auto-generated method stub
		i++; 
		return i;
	}

}
