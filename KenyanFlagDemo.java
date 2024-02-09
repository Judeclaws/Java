import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KenyanFlagDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame("I Love Kenya");
        JPanel panel = new JPanel();

        // Create buttons
        JButton button1 = new JButton("BLACK");
        JButton button2 = new JButton("WHITE");
        JButton button3 = new JButton("RED");
        JButton button4 = new JButton("WHITE");
        JButton button5 = new JButton("GREEN");

        // Set the layout manager of the panel to BorderLayout
      panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 
        // Add buttons to the SOUTH (bottom) of the panel
        panel.add(button1, BorderLayout.SOUTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.SOUTH);
        panel.add(button4, BorderLayout.SOUTH);
        panel.add(button5, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
