package ch10_ex4_Circle.src.murach.circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Circle Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter radius:  ");
            
            // The input from the user is saved as a String. 
            String radius = sc.nextLine();

            // The string is split, delimited by spaces, and saved into 
            // the array called 'entries[]'. 
            
            String entries[] = radius.split(" "); 
            
            
            Circle circles[] = new Circle[entries.length]; 
           
        
            // create the Circle object
            
            // Count the number of array elements, and 
            // for each one, change the string to a double. 
            for (int i = 0; i < entries.length; i++) { 
            	
            	
    			double raddouble = (double) Double.parseDouble(entries[i]); 
    			
    			// Call the Circle constructor to do the math. 
    			Circle circle = new Circle(raddouble);
    			
    			// StringBuilder to put together the string elements for printing. 
    			// I don't think I'm using this correctly in this app. 
    			StringBuilder radString = new StringBuilder(); 
    			 for (int j = 0; j < entries.length; j++) {
    				
    			 }	 
    			 
    			
    			  String message = 
    		                "Area:          " + circle.getArea() + "\n" +
    		                "Circumference: " + circle.getCircumference() + "\n" +
    		                "Diameter:      " + circle.getDiameter() + "\n";
    			
    			  // Print out the entered radius. This works. 
    			  System.out.println("Radius:        " + raddouble);
  				
    			  // Print out the circle calculations. 
    			  System.out.println(message);
    				
            
            }
            
            

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
        sc.close();
    }   
}