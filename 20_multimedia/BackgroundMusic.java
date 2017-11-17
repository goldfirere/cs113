/* Name: Richard Eisenberg
 * File: BackgroundMusic.java
 * Description: Plays background music from an MP3
 */
import acm.program.*;
import java.awt.event.*;
import edu.brynmawr.*;

public class BackgroundMusic extends GraphicsProgram
{
	private MP3 background; // the MP3 we will play

	@Override
	public void run()
	{
		background = new MP3("music.mp3"); // load from file music.mp3
		background.loop(); // loop the song

		addMouseListeners(); // turn on the mouse
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// stop the music:
		background.stop();
	}
}
