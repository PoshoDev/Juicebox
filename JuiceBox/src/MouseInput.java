import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener
{
	Task hold;
	int x1, y1, x2, y2;
	
	
	// Constructor
	public MouseInput(Task hold)
	{
		this.x1 = hold.x;
		this.y1 = hold.y;
		this.x2 = hold.length * Control.block_size;
		this.y2 = Control.block_size;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e)
	{
		int mx = e.getX();
		int my = e.getY();
		
		/*if (mx>x1 && mx<x2 && my>y1 && my<y2)
			hold.mousePressed(e);*/
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
