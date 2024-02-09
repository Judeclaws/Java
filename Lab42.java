import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackGroundColor 
	{
		boolean white=true;
	}

public class Lab42  extends JFrame implements ActionListener{
	
	final BackGroundColor color= new BackGroundColor();//
	JPanel panel=new JPanel(new BorderLayout());
	JPanel panel1= new JPanel();
	
		   public Lab42(){
		   	super("CSC 364E(Lab 1a): Menus, Icons, TextArea");
		   setSize(600,200);
		   
		   JMenu csCourse=new JMenu("CS Core Courses");
		   
		   JMenuItem network=new JMenuItem("Network and Security");
		   JMenuItem software=new JMenuItem("Software Development");
		   JMenuItem computer=new JMenuItem("Computer Engineering");
		   
		   	JMenu csOption=new JMenu("CS Options");
		   	csOption.add(network);
		   	csOption.add(software);
		   	csOption.add(computer);
		   	JMenuBar mainMenu=new JMenuBar(); 
		   mainMenu.add(csCourse);
		   mainMenu.add(csOption);
		   
		  ImageIcon exitIcon = new ImageIcon("C:/Users/brevi/Downloads/Project pictures/icons8-exit-48.png");  
		  JButton btn =new JButton("EXIT", exitIcon);
		   Dimension exit=new Dimension(200,50);
		   btn.setPreferredSize(exit);
		   btn.setIcon(exitIcon);
		  btn.addActionListener(this);
		  
		  
		   JButton button=new JButton("TOGGLE BACKGROUND COLOR");
		    Dimension toggle=new Dimension(200,50);
		   button.setPreferredSize(toggle);
		   button.addActionListener(this);
		   
          
		   panel1.add(btn);
		   panel1.add(button);
		   
		  
		   panel.add(panel1, BorderLayout.SOUTH);
		   add(panel);
		    setJMenuBar(mainMenu);
		   setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//nothing should happen when the close button on the window is clicked
		   setVisible(true);
		   
		   }
		   
		   public void actionPerformed(ActionEvent e)
		   {
		   		color.white=!color.white;//condition
		   	String buttonString= e.getActionCommand();
		   	
		   	if(buttonString.equals("EXIT"))
		   	    	{
		   	        	System.exit(0);
		        	}else 
		  	if(buttonString.equals("TOGGLE BACKGROUND COLOR"))
		   			{
		   	        
		   	        	if(color.white)
		   	        	{
		   	        		panel.setBackground(Color.WHITE);
		   	        		panel1.setBackground(Color.WHITE);
		   	        	}else
		   	        	{
		   	        		panel.setBackground(Color.CYAN);
		   	        		panel1.setBackground(Color.CYAN);
		   	        	}
		   	        	
		        	}
		        	
		   }
		   
		  public static void main (String[] args) {
		  	new Lab42();
		  }
    
}