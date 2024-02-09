import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordExample extends JFrame {

    private JPasswordField passwordField;
    private JTextField textField;
    private JToggleButton showButton;

    public PasswordExample() {
        setTitle("Password Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
		JLabel label=new JLabel("Password: ");
        passwordField = new JPasswordField(15);
        JLabel lbl=new JLabel("New Password: ");
        textField = new JTextField(15);
        textField.setEditable(false);//the text field cannot be edited

        showButton = new JToggleButton("Show");//toogles from showing to not showing the password when pressed.
        //adding an action listener directly to the button
        showButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                if (showButton.isSelected()) {
                    char[] passwordChars = passwordField.getPassword();
                    textField.setText(new String(passwordChars));
                } else {
                    textField.setText("");
                }
            }
        });

		add(label);
        add(passwordField);
        add(lbl);
        add(textField);
        add(showButton);

        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PasswordExample().setVisible(true);
            }
        });
    }
}
