
/*
 * File: MyCounter.java
 * @witwiki
 * @05.09.2013 
 * ----------------------
 * This file is a class for a counter
 * 
 * A class variable is NOT an instance variable. 
 * Class variables are also called static variables
 * the static that you put before the type of a 
 * constant variable.
 * E.g: private static final int TILE_WIDTH = 0;
 * 
 * 
 */

public class MyCounter {
	
	// Constructor
	public MyCounter(int startValue){
		
		counter = startValue;
		
	}

	// Can have more than one constructor
	public MyCounter(){
		
		// in case the user forgets to put in an argument
		counter = 1;
	}
	
	// give me the next value based on the current value of the counter
	public int nextValue() {
		
		// store the current value as a temp (local variable) 
		int temp = counter;
		
		// move to the next value
		counter++;
		
		// return the stored value next value
		return (temp);
		
	}
	
	
	
	// need an instance variable to keep track of the first ever value
	private int counter;

}
