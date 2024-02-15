import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrialWindows extends JFrame 
{
    public static final int LENGTH=400;
    public static final int WIDTH=400;

    public static final int S_LENGTH=200;
    public static final int S_WIDTH=200;

    public TrialWindows() 
    {
        super("Main Window");
        setSize(LENGTH,WIDTH);
        getContentPane().setBackground(Color.GRAY);
        setLayout(new BorderLayout());
        JLabel label=new JLabel("Thanks you may Exit if you like" );
        add(label,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new Closing());

        setVisible(true);
    }
    public static void main(String[] args)
    {
        new TrialWindows();
    }

    private class Closing extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            ConfirmsWindow confirm = new ConfirmsWindow();
            confirm.setVisible(true);
        }
        
    }
    private class ConfirmsWindow extends JFrame implements ActionListener
    {
        public ConfirmsWindow()
        {
            
            setSize(S_WIDTH, S_LENGTH);
            getContentPane().setBackground(Color.ORANGE);
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            setLayout(new BorderLayout());

            JLabel label7=new JLabel("Are you sure you want to Exit?");
            add(label7,BorderLayout.CENTER);

            JPanel panel2 = new JPanel();
            panel2.setBackground(Color.YELLOW);

            JButton button1 = new JButton("OK");
            button1.addActionListener(this);  
            button1.setForeground(Color.BLACK); 

            JButton button2 = new JButton("Cancel");
            button2.addActionListener(this);
            button2.setForeground(Color.BLACK);

            panel2.add(button1);
            panel2.add(button2);

            
            add(panel2,BorderLayout.SOUTH);

            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) 
        {
            String buttonString=e.getActionCommand();
            if(buttonString.equals("OK"))
            {
                System.exit(0);
            }
            else if(buttonString.equals("Cancel"))
            {
                dispose();
            }
            else
            {
                System.out.println("Error ");
            }
        }
    }
        
}
