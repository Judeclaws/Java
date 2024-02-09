import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackGroundColorToggleApp {
    private JFrame frame;
    private JPanel panel;
    private JButton toggleButton;
    private boolean isPink = true;

    public BackGroundColorToggleApp() {
        frame = new JFrame("Toggle Background Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new BorderLayout());
        frame.add(panel);

        JLabel label = new JLabel("Toggle Background Color");
        label.setPreferredSize(new Dimension(200, 100));
        panel.add(label, BorderLayout.CENTER);

        JPanel emptyPanel = new JPanel();  // An empty panel to push the button to the bottom
        panel.add(emptyPanel, BorderLayout.SOUTH);

        toggleButton = new JButton("Toggle Color");
        panel.add(toggleButton, BorderLayout.SOUTH);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isPink) {
                    panel.setBackground(Color.BLACK);
                    label.setForeground(Color.WHITE);
                } else {
                    panel.setBackground(Color.PINK);
                    label.setForeground(Color.BLACK);
                }
                isPink = !isPink;
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BackgroundColorToggleApp();
            }
        });
    }
}
