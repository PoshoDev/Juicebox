import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Global extends JPanel implements ActionListener
{
	// ID-lization or something.
	private static final long serialVersionUID = 1L;
	
	//private String background = "/images/pepinisho.jpg";
	
	Timer loopTimer;
	
	Control c;
	
	
	// Global Constructor
	public Global()
	{
		setFocusable(true);
		
		loopTimer = new Timer(10, this);
		loopTimer.start();
		
		c = new Control();
		addMouseListener(new MouseInputC(c));
	}
	
	
	// Global Draw Event
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// Draw anything by doing g2d.FUNCTION
		
		// Background
		//g2d.drawImage(getBackgroundImage(), 0, 0, null);
		
		// Control
		c.draw(g2d);
	}

	
	// Game Loop AKA Step
	@Override
	public void actionPerformed(ActionEvent e)
	{
		c.update();
		repaint();
	}
	
	
	/*public Image getBackgroundImage()
	{
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}*/
}
