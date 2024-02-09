import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LearningJava extends JFrame{

    public LearningJava() {
    	super("Learning Java");
    	setSize(600,450);
    	//JPanel panel= new JPanel();
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setVisible(true);
    	addWindowListener(new CheckOnExit());
    	
    }
    
			    private  class  WindowExit extends JFrame implements ActionListener
			    {
			    	public WindowExit()
			    		{
			    			super("Exit Window");
			    			setSize(300,300);
			    			setLayout(new BorderLayout());
			    			JLabel label=new JLabel("YOU ARE ABOUT TO EXIT");
			    			JPanel pnl=new JPanel();
			    			JButton yes=new JButton("YES");
			    			yes.addActionListener(this);
			    			JButton no=new JButton("NO");
			    			no.addActionListener(this);
			    			pnl.add(yes);
			    			pnl.add(no);
			    			add(label);
			    			add(pnl, BorderLayout.SOUTH);	
			    			setLocationRelativeTo(null);
			    			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			    			setVisible(true);
			    			
			    		}
			    		public void actionPerformed(ActionEvent e)
			    	   {
			    		String button=e.getActionCommand();
			    		if(button.equals("YES"))
			    		{
			    			dispose();
			    			System.exit(0);
			    		}else if(button.equals("NO"))
			    		{
			    			dispose();
			    		}
			    	}
			    		
			    }
			    	
    
    
    public static void main (String[] args) {
    	new LearningJava();
    }
    
    private class CheckOnExit extends WindowAdapter{
    	public void windowOpened(WindowEvent e){
    		WindowExit exit=new WindowExit();
    		exit.setVisible(true);
    	}
    }
    
}