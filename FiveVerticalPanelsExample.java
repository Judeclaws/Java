import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiveVerticalPanelsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Five Vertical Panels with Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel1 = createPanel(Color.BLACK, "Panel 1");
        JPanel panel2 = createPanel(Color.WHITE, "Panel 2");
        JPanel panel3 = createPanel(Color.RED, "Panel 3");
        JPanel panel4 = createPanel(Color.WHITE, "Panel 4");
        JPanel panel5 = createPanel(Color.GREEN, "Panel 5");

        addColorChangeButton(panel1, Color.BLACK);
        addColorChangeButton(panel2, Color.WHITE);
        addColorChangeButton(panel3, Color.RED);
        addColorChangeButton(panel4, Color.WHITE);
        addColorChangeButton(panel5, Color.GREEN);

        frame.setLayout(new GridLayout(1, 5));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

        frame.setVisible(true);
    }

    private static JPanel createPanel(Color background, String label) {
        JPanel panel = new JPanel();
        panel.setBackground(background);
        panel.add(new JLabel(label));
        return panel;
    }

    private static void addColorChangeButton(JPanel panel, Color originalColor) {
        JButton button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "Choose a Color", originalColor);
                if (newColor != null) {
                    panel.setBackground(newColor);
                }
            }
        });
        panel.add(button);
    }
}
