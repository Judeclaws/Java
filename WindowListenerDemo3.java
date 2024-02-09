import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerDemo3 extends JFrame {

    public WindowListenerDemo3() {
        super("Final Window Listener Demo");
        setSize(650, 250);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.setBackground(Color.GREEN);
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel("This is the Final Practice of The Window Listener, Be Careful, all The Best!!!");
        JLabel label3 = new JLabel();
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        add(panel);
        setVisible(true);
        addWindowListener(new CheckOnExit());
    }

    public static void main(String[] args) {
        new WindowListenerDemo3();
    }

    private class ConfirmWindow extends JFrame implements ActionListener {

        public ConfirmWindow() {
            super("EXIT DIALOG BOX");
            setLayout(new BorderLayout());
            setSize(200, 200);
            JLabel lbl = new JLabel("You Are About To Exit!!!");
            getContentPane().setBackground(Color.RED);

            JPanel pnl = new JPanel();
            JButton buttonYes = new JButton("YES");
            buttonYes.addActionListener(this);
            JButton buttonNo = new JButton("NO");
            buttonNo.addActionListener(this);
            pnl.add(buttonYes);
            pnl.add(buttonNo);
            add(lbl);
            add(pnl, BorderLayout.SOUTH);

            // Set default close operation to prevent closing the main window
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            setVisible(true);
        }

        // setting up action listener for the ConfirmWindow
        public void actionPerformed(ActionEvent e) {
            String buttonString = e.getActionCommand();
            if (buttonString.equals("YES")) {
                // Close both windows if "YES" is clicked
                dispose();
                System.exit(0);
            } else if (buttonString.equals("NO")) {
                // Close only the ConfirmWindow if "NO" is clicked
                dispose();
            }
        }
    }

    private class CheckOnExit implements WindowListener {

        public void windowOpened(WindowEvent e) {
            ConfirmWindow cnf = new ConfirmWindow();
            cnf.setVisible(true);
        }

        public void windowClosing(WindowEvent e) {
            // Handle closing event here if needed
        }

        public void windowClosed(WindowEvent e) {
            // Handle closed event here if needed
        }

        public void windowIconified(WindowEvent e) {
            // Handle iconified event here if needed
        }

        public void windowDeiconified(WindowEvent e) {
            // Handle deiconified event here if needed
        }

        public void windowActivated(WindowEvent e) {
            // Handle activated event here if needed
        }

        public void windowDeactivated(WindowEvent e) {
            // Handle deactivated event here if needed
        }
    }
}

