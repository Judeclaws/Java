import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrialWindow4 extends JFrame 
{

public  static final int LENGTH=400;
public  static final int WIDTH=400;
public  static final int S_WIDTH=200;
public  static final int S_LENGTH=200;

public TrialWindow4()
{   

	setTitle("Main Window");
	setSize(LENGTH,WIDTH);
	getContentPane().setBackground(Color.GRAY);
	setLayout(new BorderLayout());
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	JLabel label=new JLabel("Thanks for choosing this GUI");
	add(label,BorderLayout.CENTER);
	addWindowListener(new Closing());
	setVisible(true);
}	
private class ConfirmWindow extends JFrame implements ActionListener
{
	public ConfirmWindow()
	{
		super();
	setTitle("Confirm Window");
	setSize(S_LENGTH,S_WIDTH);
	setLayout(new BorderLayout());
	getContentPane().setBackground(Color.YELLOW);
	
	JLabel label1=new JLabel("Are you sure you want to exit");
	add(label1,BorderLayout.CENTER);
	
	JPanel panel=new JPanel();
	panel.setBackground(Color.ORANGE);
	
	
	JButton button1=new JButton("YES");
	button1.addActionListener(this);
	panel.add(button1);
	
	JButton button2=new JButton("NO");
	button2.addActionListener(this);
	panel.add(button2);
	
	add(panel,BorderLayout.SOUTH);
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
	setVisible(true);
	
	}
	
	

public void actionPerformed(ActionEvent e)
{
	String buttonString=e.getActionCommand();
	
	if(buttonString.equals("YES"))
	{
		System.exit(0);
	}
	else if(buttonString.equals("NO"))
	{
		dispose();
	}
	else
		System.out.println("UnknownError");
		
		
} 
}
private class Closing extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
	
	ConfirmWindow checker=new ConfirmWindow();
	checker.setVisible(true);
	}
}

public static void main (String[] args) 
{
	new TrialWindow4();
}
}