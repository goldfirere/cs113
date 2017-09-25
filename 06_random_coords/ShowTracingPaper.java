/* Name: Richard Eisenberg
 * File: ShowTracingPaper.java
 * Description: applet containing the tracing paper example
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import java.awt.*;

public class ShowTracingPaper extends GraphicsProgram
{
	// the labels for the different coordinate systems
	private GLabel tracingPaperCoords;
	private GLabel appletCoords;

	private GLabel tracingPaperOrigin;
	private GLabel appletOrigin;

	// the piece of tracing paper:
	private TracingPaper tp;

	@Override
	public void run()
	{
		// create the labels (starting empty and offscreen):
		tracingPaperCoords = new GLabel("", 0, 0);
		tracingPaperCoords.setColor(Color.RED);
		add(tracingPaperCoords);

		appletCoords = new GLabel("", 0, 0);
		appletCoords.setColor(Color.BLUE);
		add(appletCoords);

		tracingPaperOrigin = new GLabel("(0, 0)", 0, 0);
		tracingPaperOrigin.setColor(Color.RED);
		add(tracingPaperOrigin);

		appletOrigin = new GLabel("", 0, 0);
		appletOrigin.setColor(Color.BLUE);
		add(appletOrigin);

		// now, make the tracing paper. change these coords if you dare
		tp = new TracingPaper();
		tp.setLocation(50, 50);
		add(tp);

		addMouseListeners(); // enable mouse

		// start the timer to keep the labels on top of things
		SwingTimer t = new SwingTimer(0, this);
		t.start();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// futz with this to experiment
		tp.setLocation(e.getX(), e.getY());

		// or, use this (commented out initially)
		//tp.move();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// coordinate the coordinate labels (pun intended)

		// first, place the red coords, using the coordinates of tp's
		// bounds
		double x = tp.getBounds().getX(), y = tp.getBounds().getY();
		tracingPaperCoords.setLocation(x, y - 2);
		GPoint tpPoint = tp.getLocalPoint(x, y);
		tracingPaperCoords.setLabel("(" + tpPoint.getX() + ", "
				+ tpPoint.getY() + ")");

		// now, place the applet coords right below that
		appletCoords.setLocation(x, y + 12);
		appletCoords.setLabel("(" + x + ", " + y + ")");

		// place the origin coords at tp's origin
		tracingPaperOrigin.setLocation(tp.getX(), tp.getY() - 2);
		appletOrigin.setLocation(tp.getX(), tp.getY() + 12);
		appletOrigin.setLabel("(" + tp.getX() + ", " + tp.getY() + ")");

		// only show origin coords if they don't muddle rectangle coords
		// compare total bounds of origin coords to total bounds of
		// rectangle coords
		GRectangle originBounds = tracingPaperOrigin.getBounds().union(
				appletOrigin.getBounds()), coordsBounds = tracingPaperCoords
				.getBounds().union(appletCoords.getBounds());

		// if they overlap, hide the origin coords
		if(originBounds.intersects(coordsBounds))
		{
			tracingPaperOrigin.setVisible(false);
			appletOrigin.setVisible(false);
		}
		else
		{
			// otherwise, show them:
			tracingPaperOrigin.setVisible(true);
			appletOrigin.setVisible(true);
		}
	}
}
