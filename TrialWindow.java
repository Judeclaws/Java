import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrialWindow extends JFrame{

    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public static final int SMALL_HEIGHT = 200;
    public static final int SMALL_WIDTH = 200;
    public JLabel label;
    

    public TrialWindow()
    {
        super("Main Window");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        label = new JLabel("I Like to be sure if you are Sincere.");
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        getContentPane().setBackground(Color.MAGENTA);

        addWindowListener(new Closing());
        setVisible(true);

    }
    private class ConfirmWindow extends JFrame implements ActionListener
    {
        public ConfirmWindow()
        {
            super("Confirm Window");
            setSize(SMALL_WIDTH, SMALL_HEIGHT);
            getContentPane().setBackground(Color.ORANGE);
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            setLayout(new GridLayout(2,1));

            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            label.setText("Are you sure you wanna do it?");
            panel.add(label);

            JPanel pannel = new JPanel();
            pannel.setLayout(new FlowLayout());
            JButton yes = new JButton("yes");
            yes.addActionListener(this);
            pannel.add(yes);

            JButton noo = new JButton("No");
            noo.addActionListener(this);
            pannel.add(noo);

            add(panel);
            add(pannel);

            setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
            String buttonString = e.getActionCommand();
            if(buttonString.equals("yes"))
            {
                System.exit(0);
            }
            else if(buttonString.equals("No"))
            {
                dispose();
            }
            else
            System.out.println("unexpected error occurred!!");
        }
    }
    private class Closing implements WindowListener
    {
        public void windowOpened(WindowEvent e)
        {}
        public void windowClosed(WindowEvent e)
        {}
        public void windowClosing(WindowEvent e)
        {
            ConfirmWindow hey = new ConfirmWindow();
            hey.setVisible(true);
        }
        public void windowDeiconified(WindowEvent e)
        {}
        public void windowIconified(WindowEvent e)
        {}
        public void windowActivated(WindowEvent e)
        {}
        public void windowDeactivated(WindowEvent e)
        {}
   
    }
    public static void main(String[] args) 
    	
    {
        new TrialWindow();
    }
    
}
