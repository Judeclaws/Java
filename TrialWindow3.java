import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrialWindow3 extends JFrame
{
    private static int LENGTH=400;
    private static int WIDTH=400;
    private static int S_LENGTH=200;
    private static int S_WIDTH=150;
    
		    public TrialWindow3() 
		    {   
		    	super("Main Window");
		    	setSize(LENGTH,WIDTH);
		    	setLayout(new BorderLayout());
		    	getContentPane().setBackground(Color.GRAY);
		    	
		    	JLabel label=new JLabel("Thanks for Staying with Us" );
		    	add(label,BorderLayout.CENTER);
		    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		    	
		    	addWindowListener(new Closing());
		    	setVisible(true);
		    }
		    private class ConfirmWindow extends JFrame implements ActionListener
		    {
		    	public ConfirmWindow()
	
		    	{
		    		super();
		    		setTitle("ConfirmWindow");
		    		setSize(S_LENGTH,S_WIDTH);
		    		setLayout(new GridLayout(2,1));
		    		
		    		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		    		
		    		JPanel panel=new JPanel();
		    		panel.setLayout(new BorderLayout());
		    		
		    		JLabel label1=new JLabel("Are You Sure You Want to EXIT");
		    		panel.add(label1,BorderLayout.CENTER);
		    		panel.setBackground(Color.YELLOW);
		    		
		    		
		    		JPanel panel1=new JPanel();
		    		panel1.setLayout(new FlowLayout());
		    		panel1.setBackground(Color.ORANGE);
		    		
		    		JButton btn1=new JButton("YES");
		    		btn1.addActionListener(this);
		    		
		    		JButton btn2=new JButton("NO");
		    		btn2.addActionListener(this);
		    		
		    		panel1.add(btn1);
		    		panel1.add(btn2);
		    		
		    		add(panel);
		    		add(panel1);
		    		
		    		setVisible(true);
		    		setVisible(true);
		    	}
		    	
    	public void actionPerformed(ActionEvent e)
	    	{
	    		String btnstr=e.getActionCommand();
	    		
	    		if(btnstr.equals("YES"))
	    		{
	    			System.exit(0);
	    		}
	    		else if(btnstr.equals("NO"))
	    		{
	    			dispose();
	    			
	    		}
	    		else
	    		
	    			System.out.println("UNKNOWN ERROR");
	    		
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
       	new TrialWindow3();
	   }

}