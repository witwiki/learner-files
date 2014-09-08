/*
 * File: Hailstone.java
 * Name: witwiki 
 * #08.09.2013 
 * --------------------
 * This file solves the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		//	taking in user input and initialising counter
		int num = readInt("Enter a number: ");
		int counter = 0;

		//	the while loop continues the process until num is one
		while(num != 1){
			
			// if num is even, divide by two
			if(num % 2 == 0){
				
				println(num + " is even, so I take half: " + (num / 2));
				num = num / 2;				//	need to change value of num
				counter++;
				
			} else if(num % 2 != 0){
				
				// if num is odd, multiply it by three and add one
				println(num + " is odd, so I make 3n + 1: " + (3 * num + 1));
				num = 3 * num + 1;			//	need to change value of num
				counter++;
				
			} 
		}
		
		//	this is the end of the program once the loop ends
		if(num == 1){
			
			println("The process took " + counter + " iterations to reach 1.");
			
		}
			
	}
		
}

