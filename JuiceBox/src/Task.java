import java.awt.Color;
import java.awt.Graphics;

public class Task
{
	// Positional Variables
	public int x;
	public int y;
	public int length;
	
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
	
	
	Task() {}
	
	public void Draw(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillRoundRect(x, y, length, Control.block_size, 8, 8);
	}
}
