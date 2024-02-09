import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrialThread2 extends JFrame implements ActionListener
{
	private JPanel panel;
	
	public static void main (String[] args)
    {
		new TrialThread2();
    }
    
    public TrialThread2()
    {
    	setSize(300,200);
    	setTitle("Threaded Fill");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	setLayout(new BorderLayout());
    	panel=new JPanel();
    	add(panel,BorderLayout.CENTER);
    	
    	JPanel panel1=new JPanel();
    	
    	JButton button=new JButton("Start");
    	button.addActionListener(this);
    	panel1.add(button);
    	
    	add(panel1,BorderLayout.SOUTH);
    	setVisible(true);
    	
    }
    public void actionPerformed(ActionEvent e)
    {
    	Packer pack=new Packer();
    	pack.start();
    }
    
    private class Packer extends Thread
    {
    	public void run()
    	{
    		Graphics g=panel.getGraphics();
    		
    		for(int i=0;i<100;i=i+10)
    		{
    			for(int j=0;j<300;j=j+10)
    			{
    				g.fillOval(j,i,10,10);
    				doNothing(100);
    			}
    		}
    	
    	
    }
    public void doNothing(int milliseconds)
    {
    	try{
    		Thread.sleep(milliseconds);
    		
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("Unexpected Error");
    		System.exit(0);
    	}
    }
    
}

}














