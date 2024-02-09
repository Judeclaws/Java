import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

		public class ComradeMenu extends JFrame implements ActionListener{
			JLabel lblShow=new JLabel("No Food Yet!!!");
			JPanel panel=new JPanel();
			
			
		    public ComradeMenu() {
			    super("Comrade Menu Application");
			    setSize(500,600);
			    
			    JMenuItem tea=new JMenuItem("Tea");
			    tea.addActionListener(this);
			    
			    JMenuItem coffee=new JMenuItem("Coffee");
			    coffee.addActionListener(this);
			    
			    JMenuItem kangumu=new JMenuItem("Kangumu");
			    kangumu.addActionListener(this);
			    
			    JMenuItem chapati=new JMenuItem("Chapati");
			   chapati.addActionListener(this);
			   
			   JMenuItem egg=new JMenuItem("Egg");
			    egg.addActionListener(this);
			    
			    JMenuItem uji=new JMenuItem("Uji");
			    uji.addActionListener(this);
			    //breakfast menu being created
			   JMenu breakFast=new JMenu("BreakFast");
			   breakFast.add(tea);
			   breakFast.add(coffee);
			   breakFast.add(kangumu);
			   breakFast.add(chapati);
			   breakFast.add(egg);
			   breakFast.add(uji);
			   
			   //creating items for lunch menu
			   JMenuItem githeri=new JMenuItem("Githeri");
			   githeri.addActionListener(this);
			   
			   JMenuItem ugali=new JMenuItem("Ugali");
			   ugali.addActionListener(this);
			   
			   JMenuItem sukuma=new JMenuItem("Sukuma");
			   sukuma.addActionListener(this);
			   
			   JMenuItem kataKata=new JMenuItem("Katakata");
			   kataKata.addActionListener(this);
			   
			   JMenuItem mixYote=new JMenuItem("Mix Yote");
			   mixYote.addActionListener(this);
			   //creating lunch menu
			   JMenu lunch= new JMenu("Lunch");
			   	lunch.add(githeri);
			   	lunch.add(ugali);
			   	lunch.add(sukuma);
			   	lunch.add(kataKata);
			   	lunch.add(mixYote);
			   	//creating items for supper menu
			   	JMenuItem rice=new JMenuItem("Rice");
			   rice.addActionListener(this);
			   
			   JMenuItem beans=new JMenuItem("Beans");
			   beans.addActionListener(this);
			   
			   JMenuItem fish=new JMenuItem("Fish");
			   fish.addActionListener(this);
			   	//creating supper menu
			   	JMenu supper= new JMenu("Supper");
			   	supper.add(rice);
			   	supper.add(beans);
			   	supper.add(fish);
			   	
			   	
			   JMenuBar mainMenu=new JMenuBar();
			   mainMenu.add(breakFast);
			   mainMenu.add(lunch);
			   mainMenu.add(supper);
			   
			  panel.add(lblShow);
			  add(panel);
			  
			  setJMenuBar(mainMenu);
			   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   setVisible(true);
		    }
		    public void actionPerformed(ActionEvent e)
		    {
		    	String menuString=e.getActionCommand();
		    	
		    	if(menuString.equals("Tea"))
		    	{
		    		lblShow.setText("BreakFast: Tea");
		    		panel.setBackground(Color.YELLOW);
		    	}else if(menuString.equals("Coffee"))
		    	{
		    		lblShow.setText("BreakFast: Coffee");
		    		panel.setBackground(Color.BLUE);
		    	}else if(menuString.equals("Kangumu"))
		    	{
		    		lblShow.setText("BreakFast: Kangumu");
		    		panel.setBackground(Color.GRAY);
		    	}else if(menuString.equals("Chapati"))
		    	{
		    		lblShow.setText("BreakFast: Chapati");
		    		panel.setBackground(Color.GRAY);
		    	}else if(menuString.equals("Egg"))
		    	{
		    		lblShow.setText("BreakFast: Egg");
		    		panel.setBackground(Color.WHITE);
		    	}else if(menuString.equals("Uji"))
		    	{
		    		lblShow.setText("BreakFast: Uji");
		    		panel.setBackground(Color.WHITE);
		    	}
		    	else if(menuString.equals("Kangumu"))
		    	{
		    		lblShow.setText("BreakFast: Kangumu");
		    		panel.setBackground(Color.GRAY);
		    	}
		    		else if(menuString.equals("Kangumu"))
		    	{
		    		lblShow.setText("BreakFast: Kangumu");
		    		panel.setBackground(Color.GRAY);
		    	}
		    	else if(menuString.equals("Uji"))
		    	{
		    		lblShow.setText("BreakFast: Uji");
		    		panel.setBackground(Color.WHITE);
		    	}
		    		
		    		
		    		
		    }
    
    public static void main (String[] args) {
    	new ComradeMenu();
    }
    
}