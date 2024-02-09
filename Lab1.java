import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab1 extends JFrame implements ActionListener
{

    public Lab1() 
    {
    	super("The FrontView of a Microwave Oven-CSC 364");
    	setSize(500,200);
    	setLayout(new GridLayout(1,2));
    	getContentPane().setBackground(Color.GRAY);
    
    	
    	JPanel panel1=new JPanel();
    	panel1.setLayout(new BorderLayout());
    	JLabel label1=new JLabel("Food To Be Placed Here");
    	
    	panel1.add(label1,BorderLayout.CENTER);
    	
    	JPanel panel2=new JPanel();
    	
    	
    	add(panel1);
    	add(panel2);
    	
    	setDefaultCloseOperation(Frame.ClOSE_ON_EXIT);
  	     setVisible(true); 
  		 }
    public void actionPerformed (ActionEvent e)
    {
    	String buttonString=e.getActionCommand();
    }
    public static void main (String[] args)
     {
     	new Lab1();
     }
    
    
}