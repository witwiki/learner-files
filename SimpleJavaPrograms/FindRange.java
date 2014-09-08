/*
 * File: FindRange.java
 * @witwiki
 * @05.09.2013 
 * ----------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	//	the sentinel value that will end the loop
	private static final int SENTINEL = 0;
	
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		// method to get the range
		getRange();

	}
	
	
	private void getRange(){
		
		//	initialise and ask user for value
		int valOne = readInt("? ");
		
		//	check if and respond to If value is Sentinel
		IfSentinel(valOne);

		//	check if and respond to If value is not Sentinel
		IfNotSentinel(valOne);
	}		
			

	private void IfSentinel(int valOne){
		
		//	when value is Sentinel we print an error message
		if(valOne == SENTINEL){
			println("Invalid, program will restart...");
			getRange();
		}
	}

	private void IfNotSentinel(int valOne){

		// initialise the smallest and largest values
		int vSmall = valOne;
		int vLarge = valOne;
		
		//	loop to find the largest and smallest values
		while(valOne != SENTINEL){
			
			int valTwo = readInt("?: ");
			
			if(valTwo < vSmall){
				if(valTwo != SENTINEL){
					vSmall = valTwo;
				}
			}
			
			if(valTwo > vLarge){
				if(valTwo != SENTINEL){
					vLarge = valTwo;
				}
			}
			
			//	once the second value is equal to the SENTINEL we end the program to avoid an infinte loop
			if(valTwo == SENTINEL){
				println("The smallest value is " + vSmall);
				println("The largest value is " + vLarge);
				/* Once the SENTINEL is reached, the first valOne
				 * is reinitialised to SENTINEL to end the loop
				 */
				valOne = SENTINEL;
			}
		}
	}
	
}

