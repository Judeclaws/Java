import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Change Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        final JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        JButton changeColorButton = new JButton("Change Color");

        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.PINK);
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.add(changeColorButton, BorderLayout.SOUTH);

        frame.setVisible(true);
????
}