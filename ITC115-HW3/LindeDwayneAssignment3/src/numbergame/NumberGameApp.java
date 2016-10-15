// Author: Dwayne Linde

package numbergame;

// Imported libraries. 
import java.util.Random;
import java.util.Scanner;


// The main class. Where the logic happens. 
public class NumberGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Intro and setting the scanner. 
		System.out.println("Hello - this is a Numbers Guessing Game!");
		Scanner sc = new Scanner(System.in); 
		String choice = "y"; 

		// Sets up the upper limit number for the game via a copy 
		// of the constructor. 
		System.out.println("Please type in a your upper limit number: ");
		int upperLimit = Integer.parseInt(sc.nextLine());
		NumberGame NumberGame2 = new NumberGame(); 
		NumberGame2.setUpperLimit(upperLimit);
		
		// Initializes the random number. 
		Random random = new Random();
		int randomNumber = random.nextInt(upperLimit - 1) + 1;

		// While loop, to enter and exit the game. 
		while (choice.equalsIgnoreCase("y")){
			
			// Intro to the actual random number entry. 
			System.out.println("Please type in a random number: ");
			int guessNumber = Integer.parseInt(sc.nextLine());
		
			// Populating another copy of the constructor. 
			NumberGame NumberGame1 = new NumberGame();
			NumberGame1.setGuessNumber(guessNumber);
			NumberGame1.setRandomNumber(randomNumber);
			
			// The game logic lives here: 
			
			if (guessNumber < randomNumber) {
				// Print out a message for the user, saying the result. 
				System.out.println("This is too low!");
				// Call the counter.
				int i = incrementGuessCount(); 
				
				
			} else if (guessNumber > randomNumber) {
				// Print out a message for the user, saying the result. 
				System.out.println("This is too high!");
				// Call the counter.
				int i = incrementGuessCount(); 
				
				
			} else if (guessNumber == randomNumber) {
				// Print out a message for the user, saying the result. 
				System.out.println("This is just right! YOU WON! You picked the number!");
				// Call the counter. 
				int i = incrementGuessCount(); 		
			}
			
			// Message to the user, asking if they want to continue playing.  		
			System.out.println("Continue? y/n: ");
			choice = sc.nextLine(); 
		}
		
		// Close the Scanner. 
		sc.close();
		
		// Exit message for the user, and the # of guesses. 
		System.out.println("Bye! Thank you for playing our little game!");
		System.out.println("You guessed: " + incrementGuessCount() + " times!");
	
		// This is the method for the Increment Counter. 
		// It's not in the best place, but it works. 
		// Made the i = -1, as it was adding an extra guess at the end. 
		// I think it was interpreting the 'upperLimit' number as also a guess. 
		
		}
	
		static int i = -1; 
		private static int incrementGuessCount() {
			// TODO Auto-generated method stub
			i++; 
			return i;	
	}
}

