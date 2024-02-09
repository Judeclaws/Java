import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunThread extends JFrame implements ActionListener,Runnable
{
	private JPanel panel;
	
	public static void main (String[] args) 
	{
		new RunThread();
    }
    public RunThread()
    {
    	setSize(300,200);
    	setTitle("Runnable Thread");
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	panel=new JPanel();
    	add(panel,"Center");
    	
    	JPanel panel1=new JPanel();
    	JButton button=new JButton("Start");
    	button.addActionListener(this);
    	panel1.add(button);
    	
    	add(panel1,"South");
    	
    	setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    	startThread();
    }
    public void run()
    {
    	Graphics g=panel.getGraphics();
    	
    	for (int i = 0; i<100;i=i+10)
    		for (int j = 0; j<300; j=j+10)
    			g.fillOval(j,i,10,10);
    			doNothing(100);
    }
    public void startThread()
    {
    	Thread thread=new Thread(this);
    	thread.start();
    }
    public void doNothing(int milliseconds)	
    {
    	try
    	{
    		Thread.sleep(milliseconds);
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("Unknown Error");
    		System.exit(0);
    	}
    }
}