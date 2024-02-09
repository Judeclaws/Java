import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ColorChangingButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changing Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Create five panels and set their backgrounds
        List<JPanel> panels = new ArrayList<>();
        panels.add(createPanel(Color.LIGHT_GRAY, "Panel 1"));
        panels.add(createPanel(Color.CYAN, "Panel 2"));
        panels.add(createPanel(Color.PINK, "Panel 3"));
        panels.add(createPanel(Color.ORANGE, "Panel 4"));
        panels.add(createPanel(Color.GREEN, "Panel 5"));

        // Add buttons to each panel
        for (int i = 0; i < panels.size(); i++) {
            addColorChangeButton(panels.get(i), panels, i);
        }

        frame.setLayout(new GridLayout(5, 1));
        for (JPanel panel : panels) {
            frame.add(panel);
        }

        frame.setVisible(true);
    }

    private static JPanel createPanel(Color background, String label) {
        JPanel panel = new JPanel();
        panel.setBackground(background);
        panel.add(new JLabel(label));
        return panel;
    }

    private static void addColorChangeButton(JPanel panel, List<JPanel> panels, int index) {
        JButton button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "Choose a Color", panel.getBackground());
                if (newColor != null) {
                    for (JPanel otherPanel : panels) {
                        otherPanel.setBackground(newColor);
                    }
                }
            }
        });
        panel.add(button);
    }
}
