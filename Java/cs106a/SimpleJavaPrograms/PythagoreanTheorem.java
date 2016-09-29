/*
 * File: FindRange.java
 * @witwiki
 * #06.09.2013 
 * -----------------------------
 * This file solves the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		
		// print statement
		println("Enter values to compute the Pythagorean theorem.");
		
		// ask user to enter values
		double a = readDouble("a: ");
		double b = readDouble("b: ");		
		
		// calculate the using py theorem from values entered by user
		double c = RunPythagorean(a, b);
		
		//print result
		println("c: " + c);
		
	}
	
	public double RunPythagorean(double a, double b){
				 
		double y = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return y;
	}
}
