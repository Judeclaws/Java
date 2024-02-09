import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.FlowLayout;




public class TrialThread1 extends JFrame implements ActionListener
{   
  //public static final int CIRCLESIZE=10;
 // public static final int FILLWIDTH=300;
 // public static final int FILLHEIGHT=100;
 // public static final int PAUSE=100;
  
   private   JPanel panel;
	
	public static void main (String[] args) 
	{
		TrialThread1 gui=new TrialThread1();
		gui.setVisible(true);
    }
    
    public TrialThread1()
    {
    	setSize(300,200);
    	setTitle("Thread Demo");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	setLayout(new BorderLayout());
    	
    	 panel=new JPanel();
    	add(panel,BorderLayout.CENTER);
    	
    	JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
    	JButton button1=new JButton("Start");
    	button1.addActionListener(this);
    	panel1.add(button1);
    	add(panel1,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e)
    {
    	fill();
    }
    public void fill()
    {
    	Graphics g=panel.getGraphics();
    	
    	for(int y=0; y<100; y=y+10)
    	{
    	  for (int x = 0; x<300; x=x+10)
    	  {
    	  	g.fillOval(x,y,10,10);
    	  	doNothing(10);
    	  }
    	} 
    }
    
    public void doNothing(int milliseconds)
    {
    	try
    	{
    		Thread.sleep(milliseconds);
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("Unexpected Interrupt");
    		System.exit(0);
    	}
    }
}