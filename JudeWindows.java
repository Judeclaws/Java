
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JudeWindows extends JFrame
{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   public JudeWindows()
   {
   	super("Main Window");
    setSize(400,400);
    setLayout(new BorderLayout());
    JLabel lbl =new JLabel("I LIke to be sure if your sincere");
    add(lbl,BorderLayout.CENTER);
    getContentPane().setBackground(Color.GRAY);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      
      addWindowListener(new Closing());
    setVisible(true);
    
   }
private class ConfirmWindow extends JFrame implements ActionListener
{
	public ConfirmWindow()
	{   super("Confirm Window");
		setSize(200,200);
		getContentPane().setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("Are you sure you Want to Exit");
		add(label1,BorderLayout.CENTER);
		
		JPanel pane=new JPanel();
		pane.setBackground(Color.ORANGE);
		pane.setLayout(new FlowLayout());
		
		JButton button1=new JButton("YES");
		button1.addActionListener(this);
		
			JButton button2=new JButton("NO");
			button2.addActionListener(this);
			
			
			pane.add(button1);
			pane.add(button2);
			
			add(pane,BorderLayout.SOUTH);	
		
			setVisible(true);
		
	}
	

public void actionPerfomed(ActionEvent e)
{
	String btnString=e.getActionCommand();
	if(btnString.equals("YES"))
		System.exit(0);
	else if(btnString.equals("NO"))
	{
		dispose();}
	else
		System.out.println("An Error Occurred");
  }
}
//End of inner class confirm window
private class Closing implements WindowListener
{
       public void windowOpened(WindowEvent e)
        {}
        public void windowClosed(WindowEvent e)
        {}
        public void windowClosing(WindowEvent e)
        {
            ConfirmWindow checker= new ConfirmWindow();
            checker.setVisible(true);
        }
        public void windowDeiconified(WindowEvent e)
        {}
        public void windowIconified(WindowEvent e)
        {}
        public void windowActivated(WindowEvent e)
        {}
        public void windowDeactivated(WindowEvent e)
        {}
  }
//End of check on exit
  public static void main (String[] args) 
  {
  	new JudeWindows();
  }
}
