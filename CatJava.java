import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatJava extends JFrame implements ActionListener
{
	public CatJava()
	{
		//JFrame frame=new JFrame();
		super("KIBU 2019-Stop Watch GUI");
		setSize(350,250);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JButton btn1=new JButton("Start");
		btn1.addActionListener(this);
		
			JButton btn2=new JButton("Reset");
			btn2.addActionListener(this);
			
				JButton btn3=new JButton("Stop");
				btn3.addActionListener(this);
				
				JLabel label=new JLabel("                  Stop was Pressed");
				label.setForeground(Color.RED);
				panel.add(label,BorderLayout.CENTER);
				
				panel.add(btn1,BorderLayout.NORTH);
				panel.add(btn2,BorderLayout.WEST);
				panel.add(btn3,BorderLayout.EAST);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public static void main (String[] args)
		 {
		 	new CatJava();
          }
          
    public void actionPerformed(ActionEvent e)
    {
    	String btnStr=e.getActionCommand();
    	
    	if(btnStr.equals("Start"))
    	{
    		System.out.println("Start was Pressed");
    		//label.setForeground(Color.RED);
    	}
    	
    		else if(btnStr.equals("Stop"))
    	{
    		//label.setForeground(Color.CYAN);
    		System.out.println("Stop was Pressed");
    		
    	}
    	
    		else
    	{
    		System.out.println("Reset was Pressed");
    		//label.setForeground(Color.BLUE);
    	}
    	
    }
	
}