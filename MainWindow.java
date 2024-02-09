import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {
	ImageIcon img=new ImageIcon("C:/Users/brevi/Downloads/Project pictures/Whole food Person.png");
	JLabel label=new JLabel(img);
	JPanel pnl1=new JPanel();
    JPanel pnl2=new JPanel();
    JPanel pnl3=new JPanel();

    public MainWindow() {
    	super("CHATGPT Question" );
    	setSize(650,250);
    	setLayout(new BorderLayout());
    	getContentPane().setBackground(Color.YELLOW);
    	
    	
    	JMenuItem cocoa=new JMenuItem("Cocoa");
    	cocoa.addActionListener(this);
    	
    	JMenuItem yoghurt=new JMenuItem("Yoghurt");
    	yoghurt.addActionListener(this);
    	
    	JMenuItem smoothy=new JMenuItem("Smoothy");
    	smoothy.addActionListener(this);
    	
    	JMenu breakfast=new JMenu("BreakFast");
    	breakfast.add(cocoa);
    	breakfast.add(yoghurt);
    	breakfast.add(smoothy);
    	JMenuItem chipsHamburger=new JMenuItem("Chips and Hamburger");
    	JMenuItem sodaChips=new JMenuItem("Chips and Soda");
    	JMenu lunch=new JMenu("Lunch");
    	lunch.add(chipsHamburger);
    	lunch.add(sodaChips);
    	JMenu supper=new JMenu("Supper");
    	JMenu fruits=new JMenu("Fruits");
    	JMenu drinks=new JMenu("Drinks");
    	
    	
    	JMenuBar mainMenu=new JMenuBar();
    	mainMenu.add(breakfast);
    	mainMenu.add(lunch);
    	mainMenu.add(supper);
    	mainMenu.add(fruits);
    	mainMenu.add(drinks);
    	
    	
    	
    	
    	
    	pnl2.add(label, BorderLayout.NORTH);
    	Dimension pnl2Size=new Dimension(650, 100);
    	pnl2.setPreferredSize(pnl2Size);
    	
    	JButton order=new JButton("Place Order");
    	JButton cancel=new JButton("Cancel Order");
    	JButton remark=new JButton("Remarks");
    	pnl3.add(order);
    	pnl3.add(cancel);
    	pnl3.add(remark);
    	
    	add(pnl1, BorderLayout.NORTH);
    	add(pnl2, BorderLayout.CENTER);
    	add(pnl3, BorderLayout.SOUTH);
    	setJMenuBar(mainMenu);
    	
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setVisible(true);
    	addWindowListener(new CheckOnExit());
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	String menuString= e.getActionCommand();
    	
    	if(menuString.equals("Cocoa"))
    	{
    		ImageIcon cc=new ImageIcon("C:/Users/brevi/Downloads/Project pictures/Cocoa.jpeg");
    		label.setIcon(cc);
    		label.setText("1  OUT  OF  1");
    	}else if(menuString.equals("Yoghurt"))
    	{
    		ImageIcon yg=new ImageIcon("C:/Users/brevi/Downloads/Project pictures/Yoghurt.webp");
    		label.setIcon(yg);
    		label.setText("Not Available now. Try on Fridays!!!!!!!");
    	}else if(menuString.equals("Smoothy"))
    	{
    		ImageIcon sm=new ImageIcon("C:/Users/brevi/Downloads/Project pictures/Smoothy.jpg");
    		label.setIcon(sm);
    		label.setText("Vanillla is Not Available");
    	}
    	
    }
    
    
    private class ConfirmWindow extends JFrame implements ActionListener
    {
    	public ConfirmWindow()
    	{
    		super("EXIT WINDOW");
    		setSize(200,200);
    		setLayout(new BorderLayout());
    		getContentPane().setBackground(Color.RED);
    		JLabel lbl2=new JLabel("Are You Sure You Want To  Exit");
    		JPanel pnl4=new JPanel();
    		add(lbl2);
    		JButton btnYes=new JButton("YES");
    		btnYes.addActionListener(this);
    		JButton btnNo=new JButton("NO");
    		btnNo.addActionListener(this);
    		pnl4.add(btnYes);
    		pnl4.add(btnNo);
    		add(pnl4, BorderLayout.SOUTH);
    		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	}
    	public void actionPerformed(ActionEvent e)
    	{
    		String btnString=e.getActionCommand();
    		if( btnString.equals("YES"))
    		{
    			dispose();
    			System.exit(0);
    		}else
    		{
    			dispose();
    		}
    	}
    	
    }
    
		public static void main (String[] args) {
			new MainWindow();
		}
		
		private class CheckOnExit extends WindowAdapter 
		{
			public void windowClosing(WindowEvent e) {
		            ConfirmWindow chk = new ConfirmWindow();
		            chk.setVisible(true);
		        }
				
			}
			/**
			public void windowClosed(WindowEvent e){
			}
			public void windowIconified(WindowEvent e){
			}
			public void windowDeiconified(WindowEvent e){
			}
			public void windowActivated(WindowEvent e){
			}
			public void windowDeactivated(WindowEvent e){
			}
			**/
		}
