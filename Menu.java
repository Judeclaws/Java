import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener
{
	JFrame frame=new JFrame();
	public Menu()
	{
		
		super("Password Of Extractor");
		JFrame frame=new JFrame();
		setSize(500,200);
		//getContentPane().setBackground(Color.CYAN);
		setLayout(new GridLayout(1,2));
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(2,1));
			
	    JPanel pnl1=new JPanel();
	    pnl1.setLayout(new FlowLayout());
		Dimension dime=new Dimension(180,50);
		JPasswordField pasword=new JPasswordField();
		pasword.setPreferredSize(dime);
		pnl1.add(pasword);
		
		JPanel pnl2=new JPanel();
		pnl2.setLayout(new GridLayout(4,3));
		
		JButton btn1=new JButton("7");
		btn1.addActionListener(this);
		JButton btn2=new JButton("8");
		btn2.addActionListener(this);
		JButton btn3=new JButton("9");
		btn3.addActionListener(this);
		JButton btn4=new JButton("4");
		btn4.addActionListener(this);
		JButton btn5=new JButton("5");
		btn5.addActionListener(this);
		JButton btn6=new JButton("6");
		btn6.addActionListener(this);
		JButton btn7=new JButton("1");
		btn7.addActionListener(this);
		JButton btn8=new JButton("2");
		btn8.addActionListener(this);
		JButton btn9=new JButton("3");
		btn9.addActionListener(this);
		JButton btn10=new JButton("C");
		btn10.addActionListener(this);
		JButton btn11=new JButton("0");
		btn11.addActionListener(this);
		JButton btn12=new JButton("Show");
		btn12.addActionListener(this);
		
		pnl2.add(btn1);
		pnl2.add(btn2);
		pnl2.add(btn3);
		pnl2.add(btn4);
		pnl2.add(btn5);
		pnl2.add(btn6);
		pnl2.add(btn7);
		pnl2.add(btn8);
		pnl2.add(btn9);
		pnl2.add(btn10);
		pnl2.add(btn11);
		pnl2.add(btn12);
		
		panel1.add(pnl1);
		panel1.add(pnl2);
			
		JPanel panel2=new JPanel();
		panel2.setLayout(new GridLayout(5,1));
		
	//	JPanel panel1=new JPanel();
		JLabel label1=new JLabel("");
		//	JPanel panel2=new JPanel();
			JLabel label2=new JLabel("");
			//	JPanel panel3=new JPanel();
				JLabel label3=new JLabel("");
				//	JPanel panel4=new JPanel();
					JLabel label4=new JLabel("Password Extractor :");
						JPanel panel5=new JPanel();
						Dimension dim=new Dimension(180,20);
		                JPasswordField password=new JPasswordField();
		                password.setPreferredSize(dim);
		                
		                
		                panel5.add(password);
		                
		                panel2.add(label1);
		                 panel2.add(label2);
		                  panel2.add(label3);
		                   panel2.add(label4);
		                    panel2.add(panel5);
		                    
		                    add(panel1);
		                    	add(panel2);
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String btnstring=e.getActionCommand();
		
	/**	if(btnstring.equals("Show"))
		{
			System.out.println()
		}
		else if(btnstring.equals("1"))
		{
		}
		else if(btnstring.equals("2"))
		{
		}
			else if(btnstring.equals("3"))
		{
		}
			else if(btnstring.equals("4"))
		{
		}
			else if(btnstring.equals("5"))
		{
		}
			else if(btnstring.equals("6"))
		{
		}
			else if(btnstring.equals("7"))
		{
		}
			else if(btnstring.equals("8"))
		{
		}
			else if(btnstring.equals("9"))
		{
		}
			else if(btnstring.equals("0"))
		{
		}
			else (btnstring.equals("C"))
		{
		}**/
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public static void main (String[] args) 
		{
			new Menu();
		}
}