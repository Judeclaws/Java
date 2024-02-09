import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleBackgroundColor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Toggle Example");
            JButton toggleButton = new JButton("Toggle Color");
            
            // Set the initial color
            toggleButton.setBackground(Color.RED);
            
            // Add ActionListener to handle button clicks
            toggleButton.addActionListener(new ActionListener() {
                private boolean isRed = true;  // Initial state

                @Override
                public void actionPerformed(ActionEvent e) {
                    // Toggle the color alternatively
                    if (isRed) {
                        toggleButton.setBackground(Color.BLUE);
                    } else {
                        toggleButton.setBackground(Color.RED);
                    }

                    // Update the state for the next toggle
                    isRed = !isRed;
                }
            });

            frame.setLayout(new FlowLayout());
            frame.add(toggleButton);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}