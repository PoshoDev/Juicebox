import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Screen extends JPanel
{
	
	Control global = new Control();
	
	public Screen()
	{
		repaint();
	}
	
	
	// Draw
	public void paint (Graphics g)
	{
		global.Draw(g);
	}
}