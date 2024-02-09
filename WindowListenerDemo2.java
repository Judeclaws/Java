import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerDemo2 extends JFrame{
	
	//initializing components in our constructor
    public WindowListenerDemo2() {
    	super("Window Listener Using JOption");
    	setSize(400,200);
    	JLabel label=new JLabel(" This is A New Window For Practice. Just Try Till You Get It Right!!! ");
    	add(label);
    	getContentPane().setBackground(Color.YELLOW);
    	addWindowListener(new WindowAdapter()
    	{
    		public void windowClosing(WindowEvent e)
    		{
    			int choice=JOptionPane.showConfirmDialog(WindowListenerDemo2.this,"Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
    			if(choice==JOptionPane.YES_OPTION)
    			{
    				System.exit(0);
    			}
    			else
    			{
    				dispose();
    			}
    		}
    	}
    		);
    	setVisible(true);
    }
    
   public static void main (String[] args) {
   	new WindowListenerDemo2();
   }
}