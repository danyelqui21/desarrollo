package unidad1;

import javax.swing.*;
import java.awt.*;

public class LayoutExample 
{

	private JFrame f;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	
	public LayoutExample()
	{
		f = new JFrame("GUI example");
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		
	}
	
	public void launchFrame()
	{
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main (String args[])
	{
		LayoutExample guiWindow = new LayoutExample();
		guiWindow.launchFrame();
	}
	
	
} // end of Layout example class :v
