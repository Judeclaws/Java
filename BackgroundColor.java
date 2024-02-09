import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackgroundColorState {
    boolean pink = true;
}
public class BackGroundColor {
    public static void main(String[] args) {
        final BackgroundColorState state = new BackgroundColorState();
        
        JFrame frame = new JFrame("Background Color");

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.PINK);//initial color of the background
        frame.add(panel);

        JLabel label = new JLabel("Click Button to Change Background Color");
        label.setForeground(Color.BLACK);//initial clor of the label
        label.setPreferredSize(new Dimension(200, 100));
        panel.add(label, BorderLayout.BEFORE_FIRST_LINE);//border layout to allow word in the first line

        JButton button = new JButton("Change Color");
        panel.add(button, BorderLayout.SOUTH);//button set to move south

        // ActionListener for the button to toggle the background color
        button.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                state.pink = !state.pink;//encapsulation brought into the action listener through encapsulation to get it final
                if (state.pink) {
                    panel.setBackground(Color.PINK);
                    label.setForeground(Color.BLACK);
                } else {
                    panel.setBackground(Color.BLACK);
                    label.setForeground(Color.WHITE);
                }
            }
        });
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
