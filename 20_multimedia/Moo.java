/* Name: Richard Eisenberg
 * File: Moo.java
 * Description: An applet that moos when you click on it!
 */

import acm.program.*;
import java.awt.event.*;
import java.applet.*; // <-- need this import to use AudioClip
import acm.util.*; // <-- need this import to use MediaTools

public class Moo extends GraphicsProgram
{
	// save the audio clip in a field of type AudioClip:
	private AudioClip clip;

	// set up the audio clip in run
	@Override
	public void run()
	{
		/*
		 * Use the MediaTools.loadAudioClip command to load the audio
		 * clip. NOTE: Java DOES NOT SUPPORT MP3S IN THIS WAY!!!
		 */
		clip = MediaTools.loadAudioClip("moo.wav");

		// we're going to click to make it moo, so we need mouse
		// listeners
		addMouseListeners();
	}

	// play it when the mouse clicks
	@Override
	public void mousePressed(MouseEvent e)
	{
		// to play an AudioClip, call the play method!
		clip.play();
		// there is also a loop() method, but that would be too annoying
	}
}