import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppletPractice extends JApplet implements ActionListener
{
	int count;
	JLabel title;
	JButton button;
	public void init()
	{
		setLayout(new FlowLayout());
		title = new JLabel("This is Applet Practice");
		button = new JButton("Press");
		add(button);
		add(title);
		
		button.addActionListener(this);
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("" + count, 50, 50);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		count++;
		repaint();
	}

	

}
