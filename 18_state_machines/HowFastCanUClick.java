/* Name: Richard Eisenberg
 * File: HowFastCanUClick.java
 * Description: a really easy game that shows the use of states
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import java.awt.*;

public class HowFastCanUClick extends GraphicsProgram
{
	// fields for introduction state:
	private GLabel title; // the word "Clickr!"
	private GRect instructions; // the instructions button; goes to state 2
	private GLabel instructionsLbl; // the word "Instructions"
	private GRect easyBtn; // starts game on easy; goes to state 3
	private GLabel easyLbl; // the word "Easy"
	private GRect hardBtn; // starts game on hard; goes to state 3
	private GLabel hardLbl; // the word "Hard"
	
	// fields for instructions state:
	private GLabel instWords; // the instructions to the user
	private GRect back; // returns user to introduction; goes to state 1
	private GLabel backLbl; // the word "Back"
	
	// fields for gameplay state:
	private int timer; // counts down every second
	private GLabel timerLbl; // shows the current time
	private int clickCount; // counts how many clicks you have made
	private GLabel clickLbl; // shows the number of clicks
	private boolean hard; // true if user selects hard; false otherwise
	private GRect target; // the rect the player is trying to click
	private SwingTimer t; // the timer (so we can start and stop it throughout file)
	
	// fields for conclusion state:
	private boolean won; // true if the user won, false otherwise
	private GRect playAgain; // button to play again, goes to state 1
	private GLabel playAgainLbl; // says "Play again"
	private GLabel youWon; // says "You won!"
	private GLabel youLost; // says "You lost. :("
	
	// the current state
	// 1 = introduction
	// 2 = instructions
	// 3 = playing
	// 4 = conclusion
	private int state;
	
	@Override
	public void run()
	{
		// first, create all shapes / labels we will have:
		
		// state 1:
		title = new GLabel("Clickr!", 70, 40);
		title.setFont(new Font("SansSerif", Font.BOLD, 20));
		instructions = new GRect(30, 60, 140, 30);
		instructionsLbl = new GLabel("Instructions", 50, 80);
		easyBtn = new GRect(70, 100, 60, 30);
		easyLbl = new GLabel("Easy", 80, 120);
		hardBtn = new GRect(70, 140, 60, 30);
		hardLbl = new GLabel("Hard", 80, 160);
		
		// state 2:
		instWords = new GLabel("Click in the box 10 times before the timer runs out!", 10, 50);
		back = new GRect(70, 60, 60, 30);
		backLbl = new GLabel("Back", 80, 80);
				
		// state 3:
		target = new GRect(50, 50, 100, 100);
		timerLbl = new GLabel("Time: ", 80, 40);
		clickLbl = new GLabel("Clicks: ", 75, 170);
		t = new SwingTimer(1000, this);
				
		// state 4:
		youWon = new GLabel("You won!", 70, 100);
		youLost = new GLabel("You lost. :(", 65, 100);
		playAgain = new GRect(60, 110, 80, 30);
		playAgainLbl = new GLabel("Play again", 70, 130);
		
		// start in state 1:
		goToState(1);
		
		// enable the mouse:
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if(state == 1)
		{ // introduction state
			if(instructions.contains(e.getX(), e.getY()))
			{
				goToState(2); // loads instructions screen
			}
			else if(easyBtn.contains(e.getX(), e.getY()))
			{
				hard = false;
				goToState(3); // starts gameplay
			}
			else if(hardBtn.contains(e.getX(), e.getY()))
			{
				hard = true;
				goToState(3); // starts gameplay
			}
			
			// note the use of 'else if' throughout -- we only want one option
		}
		else if(state == 2)
		{
			if(back.contains(e.getX(), e.getY()))
			{
				goToState(1); // returns to state 1
			}
		}
		else if(state == 3)
		{
			// count the clicks in the target:
			if(target.contains(e.getX(), e.getY()))
			{
				clickCount = clickCount + 1;
				
				clickLbl.setLabel("Clicks: " + clickCount);
				
				// if we've clicked 10 times, conclude the game!
				if(clickCount >= 10)
				{
					won = true;
					goToState(4);
				}
			}
		}
		else if(state == 4)
		{
			if(playAgain.contains(e.getX(), e.getY()))
			{
				goToState(1);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// the only time the timer matters is in state 3
		if(state == 3)
		{
			timer = timer - 1;
			
			timerLbl.setLabel("Time: " + timer);
			
			if(timer <= 0)
			{
				// we lost :(
				won = false;
				goToState(4);
			}
		}
	}
	
	public void goToState(int newState)
	{
		// this method handles all state transitions.
		
		// the first step in a state transition is to clean up anything
		// that was happening in the old state.  The only state with special
		// instructions is state 3 -- we need to stop the timer:
		if(state == 3)
		{
			t.stop();
		}
		
		// all states need to clear the screen:
		removeAll(); // <-- this command clears everything off the screen
		
		// change the official state:
		state = newState;
		
		// now, add elements as appropriate:
		if(state == 1)
		{
			add(title);
			add(instructions);
			add(instructionsLbl);
			add(easyBtn);
			add(easyLbl);
			add(hardBtn);
			add(hardLbl);
		}
		else if(state == 2)
		{
			add(instWords);
			add(back);
			add(backLbl);
		}
		else if(state == 3)
		{
			add(target);
			add(timerLbl);
			add(clickLbl);
			
			if(hard == true)
			{
				// start timer at 5:
				timer = 5;
			}
			else
			{
				// otherwise, we have 10 seconds:
				timer = 10;
			}
			
			// reset clickCount:
			clickCount = 0;
			
			timerLbl.setLabel("Time: " + timer);
			clickLbl.setLabel("Clicks: " + clickCount);
			
			// start the timer and let the game begin!
			t.start();
		}
		else if(state == 4)
		{
			add(playAgain);
			add(playAgainLbl);
			
			if(won == true)
			{
				add(youWon);
			}
			else
			{
				add(youLost);
			}
		}
	}
}	
