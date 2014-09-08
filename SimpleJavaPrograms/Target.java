/*
 * File: Target.java
 * Name: witwiki 
 * #08.09.2013 
 * -----------------
 * This file solves the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	private static final double OUTER_RAD = 72.0;	//	72 pixels is 1 inch here
	private static final double MIDLE_RAD = 46.8;	//	46.8 pixels is 0.65 inch here
	private static final double INNER_RAD = 21.6;	//	21.6 pixels is 0.3 inches
	
	public void run() {
		
		OuterCircle();
		MiddleCircle();
		InnerCircle();
	}
	
	private void OuterCircle(){
		//	getWidth()/2 and getHeight()/2 give the centre of the graphics window
		//	OUTER_RADIUS/2 

		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;
		
		double centreX = GrapWinMidPtX - OUTER_RAD / 2;	//	Want the circle to be at the centre of the window so, coordinate of centre minus the radius of the circle 
		double centreY = GrapWinMidPtY - OUTER_RAD / 2;
		
		GOval outerCircle = new GOval(centreX, centreY, OUTER_RAD, OUTER_RAD);
		outerCircle.setFilled(true);
		outerCircle.setFillColor(Color.RED);
		add(outerCircle);
		
	}
	
	private void MiddleCircle(){
		
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;
		
		double centreX = GrapWinMidPtX - MIDLE_RAD / 2;
		double centreY = GrapWinMidPtY - MIDLE_RAD / 2;	//	Want the circle to be at the centre of the window so, coordinate of centre minus the radius of the circle 
		
		GOval midCircle = new GOval(centreX, centreY, MIDLE_RAD , MIDLE_RAD);	//	0.65 inches OR 46.8 pixels
		midCircle.setFilled(true);
		midCircle.setFillColor(Color.WHITE);
		add(midCircle);
		
	}

	private void InnerCircle(){
		
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;
		
		double centreX = GrapWinMidPtX - INNER_RAD / 2;	//	Want the circle to be at the centre of the window so, coordinate of centre minus the radius of the circle
		double centreY = GrapWinMidPtY - INNER_RAD / 2;
		
		GOval innerCircle = new GOval(centreX, centreY, INNER_RAD, INNER_RAD);	//	0.3 inches OR 21.6 pixels	 
		innerCircle.setFilled(true);	
		innerCircle.setFillColor(Color.RED);
		add(innerCircle);
		
	}

}
