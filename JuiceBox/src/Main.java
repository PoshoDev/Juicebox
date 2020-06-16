import javax.swing.JFrame;

public class Main
{
	public static void main(String args[])
	{
		//JFrame frame = makeFrame();	
		JFrame temp = new JFrame();
		temp.pack();
		temp.setSize(1280, 720);
		temp.setResizable(true);
		temp.setLocationRelativeTo(null);
		temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temp.add(new Global());
		temp.setVisible(true);
	}
	
	public static JFrame makeFrame()
	{
		JFrame temp = new JFrame();
		
		temp.pack();
		temp.setSize(1280, 720);
		temp.setResizable(true);
		temp.setLocationRelativeTo(null);
		temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temp.add(new Global());
		temp.setVisible(true);
		
		return temp;
	}
}
