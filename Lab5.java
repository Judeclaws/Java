import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab5 extends JFrame{

    public Lab5() {
    	super("Front View Of A Microwave Oven");
    	setSize(850,450);
    	setLayout(new GridLayout(1,2));
    	JPanel panel1=new JPanel();
    	JPanel panel2=new JPanel(new GridLayout(3,1));
    	
    	//setting up panel1 components of jlabels
    	JLabel empty1=new JLabel();
    	JLabel label=new JLabel("Food To Be Placed Here");
    	JLabel empty2=new JLabel();	
    	panel1.add(empty1);
    	panel1.add(label);
    	panel1.add(empty2);
    	
    	//setting up panel2 components 
    	panel2.setBackground(Color.WHITE);
    	JPanel pn1=new JPanel(new GridLayout(2,1));
    	JTextField txt1=new JTextField("Time to Display Here");
    	pn1.add(txt1);
    	JLabel lbl2=new JLabel("KEY PAD");
    	pn1.add(lbl2);
    	panel2.add(pn1);
    	JPanel pnl=new JPanel(new GridLayout(4,3));
    	JButton one=new JButton("1");
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
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main (String[] args) {
    	new Lab5();
    }
}