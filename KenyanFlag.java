import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class BackgroundColorState {
    boolean blue = true;
}
public class KenyanFlag {
public static void main (String[] args) {
	
	final BackgroundColorState state = new BackgroundColorState();
	
	JFrame frame=new JFrame("I Love Kenya");
	
	JPanel panel1=new JPanel(new BorderLayout());
	panel1.setBackground(Color.BLUE);
	JPanel panel2=new JPanel(new BorderLayout());
	panel2.setBackground(Color.BLUE);
	JPanel panel3=new JPanel(new BorderLayout());
	panel3.setBackground(Color.BLUE);
	JPanel panel4=new JPanel(new BorderLayout());
	panel4.setBackground(Color.BLUE);
	JPanel panel5=new JPanel( new BorderLayout());
	panel5.setBackground(Color.BLUE);
	
	JButton button1=new JButton("BLACK");
	panel1.add(button1, BorderLayout.SOUTH);
	button1.setBackground(Color.BLACK);
	button1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			state.blue = !state.blue;
                if (state.blue) {
                    panel1.setBackground(Color.BLUE);
                } else {
                    panel1.setBackground(Color.BLACK);
                }
		}
	});
	
	JButton button2=new JButton("WHITE");
	panel2.add(button2, BorderLayout.SOUTH);
	button2.setBackground(Color.WHITE);
	button2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			state.blue = !state.blue;
                if (state.blue) {
                    panel2.setBackground(Color.WHITE);
                } else {
                    panel2.setBackground(Color.BLUE);
                }
		}
	});
	
	JButton button3=new JButton("RED");
	panel3.add(button3, BorderLayout.SOUTH);
	button3.setBackground(Color.RED);
	button3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
		state.blue = !state.blue;
                if (state.blue) {
                    panel3.setBackground(Color.BLUE);
                } else {
                    panel3.setBackground(Color.RED);
                }
		}
	});
	
	JButton button4=new JButton("WHITE");
	panel4.add(button4, BorderLayout.SOUTH);
	button4.setBackground(Color.WHITE);
	button4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			state.blue = !state.blue;
                if (state.blue) {
                    panel4.setBackground(Color.WHITE);
                } else {
                    panel4.setBackground(Color.BLUE);
                }
		}
	});
	
	JButton button5=new JButton("GREEN");
	panel5.add(button5, BorderLayout.SOUTH);
	button5.setBackground(Color.GREEN);
	button5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			state.blue = !state.blue;
                if (state.blue) {
                    panel5.setBackground(Color.BLUE);
                } else {
                    panel5.setBackground(Color.GREEN);
                }
		}
	});
	
	frame.setLayout(new GridLayout(1, 5));
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
	frame.add(panel4);
	frame.add(panel5);
					
	frame.setSize(500,300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}