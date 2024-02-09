import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab51 extends JFrame{

    public Lab51() {
    	super("Front View Of A Microwave Oven");
    	setSize(680,350);
    	setLayout(new GridLayout(1,2));
    	JPanel panel1=new JPanel(new GridLayout(1,3));
    	panel1.setBackground(Color.WHITE);
    	JPanel panel2=new JPanel(new GridLayout(2,1));
    	
    	//setting up panel1 components of jlabels
    	JLabel empty1=new JLabel();
    	JLabel label=new JLabel("Food To Be Placed Here");
    	JLabel empty2=new JLabel();	
    	panel1.add(empty1);
    	panel1.add(label);
    	panel1.add(empty2);
    	
    	//setting up panel2 components 
    	panel2.setBackground(Color.WHITE);
    	JPanel pn11=new JPanel(new GridLayout(2,1));
    	JTextField txt1=new JTextField("Time to Display Here");
    	pn11.add(txt1);
    	JLabel lbl2=new JLabel("KEY PAD!!!!");
    	pn11.add(lbl2);
    	Dimension pnlSize=new Dimension(420,30);
    	pn11.setPreferredSize(pnlSize);
    	panel2.add(pn11);
    	JPanel pnl=new JPanel();
    	JButton one=new JButton("1");
    	pnl.setLayout(new GridLayout(4,3));
    	JButton two=new JButton("2");
    	JButton three=new JButton("3");
    	JButton four=new JButton("4");
    	JButton five=new JButton("5");
    	JButton six=new JButton("6");
    	JButton seven=new JButton("7");
    	JButton eight=new JButton("8");
    	JButton nine=new JButton("9");
    	JButton zero=new JButton("0");
    	JButton start=new JButton("Start");
    	JButton stop=new JButton("Stop");
    	pnl.add(one);
    	pnl.add(two);
    	pnl.add(three);
    	pnl.add(four);
    	pnl.add(five);
    	pnl.add(six);
    	pnl.add(seven);
    	pnl.add(eight);
    	pnl.add(nine);
    	pnl.add(zero);
    	pnl.add(start);
    	pnl.add(stop);
    	panel2.add(pnl);
    	
    	add(panel1);
    	add(panel2);
    	setLocationRelativeTo(null); 
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main (String[] args) {
    	new Lab51();
    }
}