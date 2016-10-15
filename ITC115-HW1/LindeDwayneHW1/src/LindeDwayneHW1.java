// Homework Assignment 2 - by Dwayne Linde. 

import java.util.Random;
import java.util.Scanner; 


public class LindeDwayneHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Introduce the program. 
		 * 2. Ask the user for an upper limit boundary number. The
		 * lower limit boundary number is always 0. 
		 * 3. Generate a random number, and store it as an int variable.
		 * 4. Ask the user for a number between 0 - upperNumber. 
		 * 5. Go into the while loop. 
		 * 6. If number < rand, print "Less than random number", and make 
		 * the user guess again. 
		 * 7. If number > rand, print "More than random number, and make 
		 * the user guess again. 
		 * 8. If number == rand, print "Congratulations!" and 
		 * exit the program. 
		 * 9. Don't have to make a separate class for this - put it all in Main.
		 * 
		 * 
		 */
		
		System.out.println("Welcome to the Random Number Generator!"); 
		System.out.println("Please type in the upper limit number for our game: "); 
					
		// Allows input to be accepted. 
		Scanner sc = new Scanner(System.in);
		
		int upperLimit = Integer.parseInt(sc.nextLine()); 
		 
		Random random = new Random();
		int randomNumber = random.nextInt(upperLimit - 1) + 1;
		
		// Set the counter for the guessing. 
		// Total counter.
		int i = 0; 
		
		// Too high counter. 
		int j = 0; 
		
		// Too low counter. 
		int k = 0; 
		
		// This is the choice variable; if it gets 'y', it goes into the while loop. 
		// Otherwise, it terminates. 
		String choice = "y"; 
				
		
		// The While Loop!
		while (choice.equalsIgnoreCase("y")) { 
						
		// get input from user.
					
			System.out.println("Please type in your guessed random number!");
			int guessNumber = Integer.parseInt(sc.nextLine());
					
			// See if the user wants to continue.
			// Just checking the random number. 
			// System.out.println(randomNumber); 
					
			if(guessNumber > randomNumber) {
				System.out.println("This number is too high!");
					
				System.out.print("Continue? (y/n)");
				choice = sc.nextLine(); 
				System.out.println(); 
				i++; 
				j++; 
				}
					  
			else if(guessNumber < randomNumber) {
				System.out.println("This number is too low!");
				      
				System.out.print("Continue? (y/n)");
				choice = sc.nextLine(); 
				System.out.println(); 
				i++;
				k++; 
				}
					
			else if (guessNumber == randomNumber) { 
			     System.out.println("YES! You guessed the number correctly! YES!");
			     System.out.print("Continue? (y/n)");
			     choice = sc.nextLine(); 
			     System.out.println(); 
			     i++;
				} 
		
			}
		
	sc.close(); 
		
		System.out.println("You made * " + i + " * total guesses!");
		System.out.println(j + " guesses were too high.");
		System.out.println(k + " guesses were too low.");
		System.out.println("Bye! Thank you for playing our little game!");
		
	} 

}
