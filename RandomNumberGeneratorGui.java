import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomNumberGeneratorGUI extends JFrame {
    private JLabel randomNumberLabel;
    private JButton generateButton;

    public RandomNumberGeneratorGUI() {
        // Set up the JFrame
        setTitle("RED 1 TAKE 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        randomNumberLabel = new JLabel("Click the button to generate a random number.");
        generateButton = new JButton("Generate");

        // Add action listener to the button
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Generate a random number between 1 and 10
                int randomNumber = generateRandomNumber(1, 10);
                randomNumberLabel.setText("Random Number: " + randomNumber);
            }
        });

        // Add components to the JFrame
        add(randomNumberLabel);
        add(generateButton);

        // Set window dimensions and visibility
        setSize(300, 150);
        setVisible(true);
    }

    // Method to generate a random number between min and max (inclusive)
    private int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RandomNumberGeneratorGUI();
            }
        });
    }
}