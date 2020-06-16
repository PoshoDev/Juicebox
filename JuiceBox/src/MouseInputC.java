import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInputC implements MouseListener
{
	Control c;
	//int x1, y1, x2, y2;
	
	
	// Constructor
	public MouseInputC(Control c)
	{
		this.c = c;
		/*this.x1 = hold.x;
		this.y1 = hold.y;
		this.x2 = hold.length * Control.block_size;
		this.y2 = Control.block_size;*/
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e)
	{
		int mx = e.getX();
		int my = e.getY();
		
		int x1 = c.task_temp.x;
		int y1 = c.task_temp.y;
		int x2 = x1 + c.task_temp.length * c.block_size;
		int y2 = y1 + c.block_size;
		
		
		if (mx>x1 && mx<x2 && my>y1 && my<y2)
			c.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
