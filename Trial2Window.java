import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.ImageIcon;

public class Trial2Window extends JFrame
{
	public static final int HEIGHT=400;
	public static final int WIDTH=400;
	public static final int SMALL_HEIGHT=200;
	public static final int SMALL_WIDTH=150;
	
	public Trial2Window()
	{
		super("Main Window");
		setSize(HEIGHT,WIDTH);
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.GRAY);
		JLabel label=new JLabel("It was nice creating this GUI");
		
	add(label,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new Closing());
		
		setVisible(true);
		
		
	}
	
	private class ConfirmWindow extends JFrame implements ActionListener
	{
		public ConfirmWindow()
		{
			JFrame frame=new JFrame();
			frame.getContentPane().setBackground(Color.BLUE);
			setSize(SMALL_HEIGHT,SMALL_WIDTH);
			
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setLayout(new BorderLayout());
			setTitle("Confirm Window");
			
			JLabel label1=new JLabel("Are you sure you want to EXIT");
			
			
			JPanel panel3=new JPanel();
			panel3.add(label1,BorderLayout.CENTER);
			panel3.setBackground(Color.YELLOW);
			JPanel panel2=new JPanel();
			panel2.setBackground(Color.ORANGE);
			
			 JButton button1=new JButton("YES");
			 button1.addActionListener(this);
			 
		//	 ImageIcon icon=new ImageIcon("C:\Users\Documents\Java files\New folder\10521395.png");
		//	 button1.setIcon(icon);
			 
			 JButton button2=new JButton("NO");
			 button2.addActionListener(this);

			 panel2.add(button1);
			 panel2.add(button2);
			 
			 add(panel3,BorderLayout.CENTER);
			 add(panel2,BorderLayout.SOUTH);
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
			{
				System.out.println("Unknown Error");
			}
		}
	}
		private class Closing extends WindowAdapter
    {
 //   public void windowOpened(WindowEvent e)
 //       {}
 //   public void windowClosed(WindowEvent e)
 //       {}
        public void windowClosing(WindowEvent e)
      {
            ConfirmWindow confirm = new ConfirmWindow();
            confirm.setVisible(true);
        }
//   public void windowDeiconified(WindowEvent e)
//        {}
//       public void windowIconified(WindowEvent e)
//        {}
//   public void windowActivated(WindowEvent e)
//        {}
//      public void windowDeactivated(WindowEvent e)
//        {}
   
    }
	
	public static void main (String[] args)
    {
    	new Trial2Window();
    }
}
