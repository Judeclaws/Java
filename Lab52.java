import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab52 extends JFrame implements ActionListener
{
	private JPasswordField password;
	private JPanel panel1;
	private JPanel panel2;
	JTextField txt2=new JTextField();
    public Lab52() 
    {
    	super("Password Extractor");
    	setSize(600,200);
    	setLayout(new GridLayout(1,2));
    	
    	
    	 panel1=new JPanel();
    	panel1.setLayout(new GridLayout(2,1));
    	
    	 password=new JPasswordField(20);
    	
    	JPanel pnl=new JPanel(new GridLayout(4,3));
    	JButton seven=new JButton("7");
    	seven.addActionListener(this);
    	JButton eight=new JButton("8");
    	eight.addActionListener(this);
    	JButton nine=new JButton("9");
    	nine.addActionListener(this);
    	JButton four=new JButton("4");
    	four.addActionListener(this);
    	JButton five=new JButton("5");
    	five.addActionListener(this);
    	JButton six=new JButton("6");
    	six.addActionListener(this);
    	JButton one=new JButton("1");
    	one.addActionListener(this);
    	JButton two=new JButton("2");
    	two.addActionListener(this);
    	JButton three=new JButton("3");
    	three.addActionListener(this);
    	JButton cancel=new JButton("C");
    	cancel.addActionListener(this);
    	JButton zero=new JButton("0");
    	zero.addActionListener(this);
    	JButton show=new JButton("Show");
    	show.addActionListener(this);
    	pnl.add(seven);
    	pnl.add(eight);
    	pnl.add(nine);
    	pnl.add(four);
    	pnl.add(five);
    	pnl.add(six);
    	pnl.add(one);
    	pnl.add(two);
    	pnl.add(three);
    	pnl.add(cancel);
    	pnl.add(zero);
    	pnl.add(show);
    	pnl.setPreferredSize(new Dimension(300,160));
    	panel1.add(password);
    	panel1.add(pnl);
    
    	
    	
    	
    	JPanel panel2=new JPanel();
    	panel2.setLayout(new GridLayout(5,1));
    	JLabel label=new JLabel("");
    	JLabel label1=new JLabel("");
    	JLabel label2=new JLabel("");
    	JLabel label3=new JLabel("Password Extractor :");
    	
    	txt2.setEditable(false);
    	
    	panel2.add(label);
    	panel2.add(label1);
    	panel2.add(label2);
    	panel2.add(label3);
    	panel2.add(txt2);
    	
    
    	
    		
    	add(panel1);
    	add(panel2);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
    	String buttonstring=e.getActionCommand();
    	if(buttonstring.equals("Show"))
    	{
    		 char[] passwordChars = password.getPassword();
    		 txt2.setText(new String(passwordChars));
    	}else if(buttonstring.equals("C"))
    	{
    		password.setText("");
    		txt2.setText("");
    	}
    	else if(buttonstring.equals("1"))
    	{
    		password.setText("1");
    	}
    	else if(buttonstring.equals("2"))
    	{
    		password.setText("2");
    	}
    	else if(buttonstring.equals("3"))
    	{
    		password.setText("3");
    	}
    	else if(buttonstring.equals("4"))
    	{
    		password.setText("4");
    	}
    	else if(buttonstring.equals("5"))
    	{
    		password.setText("5");
    	}
    	else if(buttonstring.equals("6"))
    	{
    	password.setText("6");
    	}
    	else if(buttonstring.equals("7"))
    	{
    		password.setText("7");
    	}
    	else if(buttonstring.equals("8"))
    	{
    		password.setText("8");
    	}
    	else if(buttonstring.equals("9"))
    	{
    		password.setText("9");
    	}
    	else if(buttonstring.equals("0"))
    	{
    		password.setText("0");
    	}
    	
    		
    	
    }
    
    public static void main (String[] args) 
    {
    	new Lab52();
    }
}
