//add three lines that is necessary for running the program
//
//


//File name AppletPractice.java sub class of JApplet 

//Draw the graph after the program ran properly and what would happen if line 23 is deleted?

public class __________ extends ________ implements __________
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
