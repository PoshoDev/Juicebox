import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class Task
{
	// Positional Variables
	public int x;
	public int y;
	public int length;
	public Color color;
	
	// Task Variables
	public int category;
	public int type;
	public String title = "New Task";
	public String notes = "";
	public String url = "";
	public int from_day;
	public int from_month;
	public int from_year;
	public int due_day;
	public int due_month;
	public int due_year;
	public int time_est = 30;
	public boolean repeats = false;
	public boolean cleared = false;
	
	
	// Create
	public Task()
	{
		x = 0;
		y = 0;
		length = Control.block_size * 5;
		color = Color.orange;
		//this.addMouseListener(new MouseInput(this));
	}
	
	
	// Step
	public void update()
	{
		
	}
	
	
	
	// Draw
	public void draw(Graphics2D g2d)
	{
		g2d.setColor(color);
		g2d.fillRect(x, y, length, Control.block_size);
	}
}
