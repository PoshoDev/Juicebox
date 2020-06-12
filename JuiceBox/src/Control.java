import java.awt.Color;
import java.awt.Graphics;

public class Control
{
	// Constants
	private static int block_add = 8;
	private static int block_min = 8;
	private static int block_max = 128;
	
	private static int panel_left_width_max = 256;
	
	
	// Variables
	public static int block_size = 32;
	
	enum md { standard, addnew };
	private md mode = md.standard;
	
	enum vw { gantt };
	private vw view = vw.gantt;
	
	Task task_temp = new Task();
	
	
	// Events
	public void Draw(Graphics g)
	{
		DrawGanttBackground(g);
		
		if (task_temp != null)
			task_temp.Draw(g);
	}
	
	
	// Functions	
	public void DrawGanttBackground(Graphics g)
	{
		// Background
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 500);
		
		// Gantt's Columns
		g.setColor(Color.DARK_GRAY);
		for (int i=block_size; i<500; i+=block_size*2)
			g.fillRect(i, 0, block_size, 500/*window_height*/);
		
		// Gantt's Rows
		g.setColor(Color.GRAY);
		for (int i=block_size; i<500/*window_height*/; i+=block_size)
			g.drawLine(0,  i, 500/*room_width*/, i);
		
	}
}
