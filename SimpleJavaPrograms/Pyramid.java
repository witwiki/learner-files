/*
 * File: Pyramid.java
 * Name: witwiki
 * Date: 10.09.2013 
 * ------------------
 * This file solves the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		//	A temp variable that will decrement with every new row
		int BricksPerRow = BRICKS_IN_BASE;
		
		//	The x coordinate midpoint of the graphics window
		double WinMidx = getWidth() / 2;
		
		//	Base row width
		double RowWidth = BRICKS_IN_BASE * BRICK_WIDTH;
		//	Row height for all rows being generated
		double RowHeight = BRICK_HEIGHT;
		
		//	x coordinate of the upper left corner of the brick	
		double rowX = WinMidx - RowWidth / 2;
		//	y coordinate of the upper left corner of the brick
		double rowY = getHeight() - BRICK_HEIGHT;
		
		//	for loop for placing each row in the pyramid
		for(int r = 0; r < BRICKS_IN_BASE; r++){
			
			//	for loop for placing each brick in a row
			for(int bNum = 0; bNum < BricksPerRow; bNum++){
				
				PlaceBrick(rowX,rowY);
				//	The x coordinate for each brick shifts by one brick width
				rowX = rowX + BRICK_WIDTH;
			}
			BricksPerRow--;
			
			/*
			 * Calculate the NEW x coordinate for the upper
			 * left corner of the first brick of the NEW/NEXT
			 * row
			 */
			rowX = WinMidx - (BricksPerRow * BRICK_WIDTH) / 2;
			/*
			 * Calculate the NEW y coordinate for the upper
			 * left corner of the brick of the NEW/NEXT row
			 */
			rowY = rowY - BRICK_HEIGHT;
		}
	}
	
	/*
	 * This method creates a brick of specified
	 * dimensions to be placed in a method above.
	 */
	private void PlaceBrick(double x, double y){
		
		GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
		
	}

}	






