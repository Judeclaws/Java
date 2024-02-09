import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowListenerDemo extends JFrame {
    public WindowListenerDemo()
    {
        setTitle("Window Listener Demonstraton.");
        setSize(300, 200);
        JLabel lblmain = new JLabel("I like to be sure you are sincere.");
        add(lblmain);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        setVisible(true);

    }
    public static void main(String[] args) {
        new WindowListenerDemo();
    }
    private class ConfirmWindow extends JFrame implements ActionListener
    {
        private ConfirmWindow()
        {
            setLayout(new BorderLayout());
            setSize(200, 200);
            setBackground(Color.yellow);
            JLabel lblConfirm = new JLabel("Are you sure you want to exit?");
            add(lblConfirm, BorderLayout.CENTER);

            JPanel pnlConfirm = new JPanel();
            pnlConfirm.setBackground(Color.orange);

            JButton yesbutton = new JButton("yes");
            yesbutton.addActionListener(this);
            pnlConfirm.add(yesbutton);

            JButton nobutton = new JButton("no");
            nobutton.addActionListener(this);
            pnlConfirm.add(nobutton);

            add(pnlConfirm, BorderLayout.SOUTH);
        }
        public void actionPerformed(ActionEvent e)
        {
            String buttonstring = e.getActionCommand();
            if(buttonstring.equals("yes"))
            {
                System.exit(0);
            }
            else if(buttonstring.equals("no"))
            {
                dispose();
            }
            else
            {
                System.out.println("unexpected error occurred!");
            }
        }
    }
    private class CheckOnExit implements WindowListener
    {
        public void WindowOpened(WindowEvent e)
        {
        }
        public void windowClosing(WindowEvent e)
        {
            ConfirmWindow check = new ConfirmWindow();
            check.setVisible(true);
        }
        public void windowClosed(WindowEvent e)
        {
        }
        public void windowIconified(WindowEvent e)
        {}
        public void windoDeiconified(WindowEvent e)
        {}
        public void windowActivated(WindowEvent e)
        {}
        public void windowDeactivated(WindowEvent e)
        {

        }
        @Override
        public void windowOpened(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
        }
        @Override
        public void windowDeiconified(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
        }

    }
}
