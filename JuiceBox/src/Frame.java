import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	static Screen s;
	
	
	public static void main(String[] args)
	{
		new Frame();		
	}
	
	
	public Frame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(true);
		setTitle("JuiceBox");
		
		init();
	}
	
	
	public void init()
	{
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(1, 1, 0, 0));
		
		s = new Screen();
		add(s);
		
		setVisible(true);
	}
}
