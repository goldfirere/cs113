/* Name: Richard Eisenberg
 * File: Grid.java
 * Desc: A grid of squares that toggle black and white
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends GraphicsProgram
{
	// the rectangles that toggle. First index is the x-coord;
	// second index is the y-coord.
	private GRect[][] grid;
	
	// this defines a *constant*. A constant is like a variable, but
	// it can never change. It is used to enable easy alterations to a
	// program and to improve legibility of code. Constants are typically
	// written in ALL_CAPS.
	public static final int GRID_SIZE = 10; // size of grid
	
	@Override
	public void run()
	{
		// build the array:
		grid = new GRect[GRID_SIZE][GRID_SIZE];
		
		int width = getWidth() / GRID_SIZE;
		int height = getHeight() / GRID_SIZE;
		for(int x = 0; x < GRID_SIZE; x++)
		{
			for(int y = 0; y < GRID_SIZE; y++)
			{
				int xCoord = x * width;
				int yCoord = y * height;
				grid[x][y] = new GRect(xCoord, yCoord, width, height);
				grid[x][y].setFilled(true);
				grid[x][y].setFillColor(Color.WHITE);
				add(grid[x][y]);
			}
		}
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// figure out which square we've clicked in:
		int x = e.getX() / (getWidth() / GRID_SIZE);
		int y = e.getY() / (getHeight() / GRID_SIZE);
		
		// toggle the color of that square
		if(grid[x][y].getFillColor().equals(Color.WHITE))
		{
			grid[x][y].setFillColor(Color.BLACK);
		}
		else
		{
			grid[x][y].setFillColor(Color.WHITE);
		}
	}
}
