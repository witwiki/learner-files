/*
 * File: CS106ATiles.java
 * @witwiki
 * @30.08.2013 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 * 
 * Alternative: Create a class called tile with a basic label 
 * "CS106A" positioned in the centre and call an instance of the
 * class every time to position it the way you want it.
 *  
 */

import acm.graphics.*;
import acm.program.*;


public class CS106ATiles extends GraphicsProgram {
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;
	
	private static final int TILE_WIDTH = 250;
	private static final int TILE_HEIGHT = 150;

	private static final String CS_LABEL = "CS106A";

	public void run() {
		
		//	placing tiles
		PlaceTiles();
	}
	
	private void PlaceTiles(){
		

		PlaceFirst();
		PlaceSecond();
		PlaceThird();
		PlaceFourth();
	}
	
	private void PlaceFirst(){

		//	Graphic Window centre
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;

		//	tile coordinates
		double x = GrapWinMidPtX - (TILE_WIDTH + TILE_SPACE / 2);
		double y = GrapWinMidPtY - (TILE_HEIGHT + TILE_SPACE / 2);
		
		// create tile
		GRect tile = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);
		
		// create Label
		GLabel label = new GLabel(CS_LABEL, x, y);
		label.setFont("Arial-29");
		add(label);
		
		// tile centre coordinates
		double tilecx = TILE_WIDTH / 2;
		double tilecy = TILE_HEIGHT / 2;
		
		// label centre coordinates
		double labelCx = label.getWidth() / 2;
		double labelCy = label.getAscent() * 3;
		
		//	move the label in the middle of the tile
		label.move((tilecx - labelCx), (labelCy));
	}

	private void PlaceSecond(){

		//	Graphic Window centre
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;

		//	tile coordinates
		double x = GrapWinMidPtX + (TILE_SPACE / 2);
		double y = GrapWinMidPtY - (TILE_HEIGHT + TILE_SPACE / 2);
		
		// create tile
		GRect tile = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);
		
		// create Label
		GLabel label = new GLabel(CS_LABEL, x, y);
		label.setFont("Arial-29");		
		add(label);
		
		// tile centre coordinates
		double tilecx = TILE_WIDTH / 2;
		double tilecy = TILE_HEIGHT / 2;
		
		// label centre coordinates
		double labelCx = label.getWidth() / 2;
		double labelCy = label.getAscent() * 3;
		
		//	move the label in the middle of the tile
		label.move((tilecx - labelCx), (labelCy));
	}
	
	private void PlaceThird(){

		//	Graphic Window centre
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;

		//	tile coordinates
		double x = GrapWinMidPtX - (TILE_WIDTH + TILE_SPACE / 2);
		double y = GrapWinMidPtY + (TILE_SPACE / 2);
		
		// create tile
		GRect tile = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);
		
		// create Label
		GLabel label = new GLabel(CS_LABEL, x, y);
		label.setFont("Arial-29");
		add(label);
		
		// tile centre coordinates
		double tilecx = TILE_WIDTH / 2;
		double tilecy = TILE_HEIGHT / 2;
		
		// label centre coordinates
		double labelCx = label.getWidth() / 2;
		double labelCy = label.getAscent() * 3;
		
		//	move the label in the middle of the tile
		label.move((tilecx - labelCx), (labelCy));
	}
	
	private void PlaceFourth(){

		//	Graphic Window centre
		double GrapWinMidPtX = getWidth() / 2;
		double GrapWinMidPtY = getHeight() / 2;

		//	tile coordinates
		double x = GrapWinMidPtX + (TILE_SPACE / 2);
		double y = GrapWinMidPtY + (TILE_SPACE / 2);
		
		// create tile
		GRect tile = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);
		
		// create Label
		GLabel label = new GLabel(CS_LABEL, x, y);
		label.setFont("Arial-29");
		add(label);
		
		// tile centre coordinates
		double tilecx = TILE_WIDTH / 2;
		double tilecy = TILE_HEIGHT / 2;
		
		// label centre coordinates
		double labelCx = label.getWidth() / 2;
		double labelCy = label.getAscent() * 3;
		
		//	move the label in the middle of the tile
		label.move((tilecx - labelCx), (labelCy));
	}
		
}
