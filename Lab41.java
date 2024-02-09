// importing necessary classes and packages for creating a Swing GUI (Java's graphical user interface toolkit), handling events, and working with files.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
//The class Lab41 extends JFrame, indicating that it is a Swing frame.
public class Lab41 extends JFrame {
    private JTextField txt1;
    private JTextField txt2;//These variables represent text fields where the user can enter a username (txt1) and a password (txt2).

    public Lab41() {
        super("CSC 364E Account Login");
        JPanel panel = new JPanel(new GridLayout(3, 2));//Creates a JPanel with a grid layout of 3 rows and 2 columns to organize the components.
        
//Creates labels (lbl1 and lbl2) and text fields (txt1 and txt2) for the username and password.
        JLabel lbl1 = new JLabel("User Name ");
        txt1 = new JTextField(5);
        JLabel lbl2 = new JLabel("Password ");
        txt2 = new JTextField(5);

        Font labelFont = new Font("SansSerif", Font.PLAIN, 20);//Sets the font for the labels to make them larger.
        lbl1.setFont(labelFont);
        lbl2.setFont(labelFont);

        Dimension textFieldSize = new Dimension(150, 30);//Sets the preferred size for the text fields.
        txt1.setPreferredSize(textFieldSize);
        txt2.setPreferredSize(textFieldSize);

//Creating a button (button) with the label "LOGIN" and setting its preferred size.
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton button = new JButton("LOGIN");
        Dimension buttonSize = new Dimension(230, 25);
        button.setPreferredSize(buttonSize);
        buttonPanel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = e.getActionCommand();
                if (login.equals("LOGIN")) {
                    writeToTextFile(txt1.getText(), txt2.getText());
                    System.out.println("User Name: " + txt1.getText());
                    System.out.println("Password: " + txt2.getText());
                    System.out.println("Values successfully written to file");
                    System.exit(0);
                }
            }
        });
//configuring the Panel objects as per the Layout 3,2
        panel.add(lbl1);//row1, col1
        panel.add(txt1);//row1, col2
        panel.add(lbl2);//row2, col1
        panel.add(txt2);//row2, col2
        panel.add(buttonPanel);//row3,col1

        add(panel);//main panel added to the JFrame
        setSize(500, 160);//setting the size of the Jframe
        setVisible(true);//setting the frame visible to display the 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void writeToTextFile(String userName, String password) {
        try (FileWriter writer = new FileWriter("login_info.txt")) {
            writer.write("User Name: " + userName + "\n");
            writer.write("Password: " + password + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Lab41();
    }
}
