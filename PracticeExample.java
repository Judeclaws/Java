import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeExample {
    public static void main(String[] args) {
        // Create a JFrame (the main window)
        JFrame frame = new JFrame("Browser Search Engine");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Set the background color of the panel to gray
        panel.setBackground(Color.GRAY);

        // Set the preferred size of the panel (e.g., 400x100)
        panel.setPreferredSize(new Dimension(400, 100));

        // Create a JTextField for search input
        JTextField searchField = new JTextField(20);

        // Create a JButton for the search button
        JButton searchButton = new JButton("Search");

        // Add components to the panel
        panel.add(searchField);
        panel.add(searchButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set up an ActionListener for the search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This is where you can handle the search action
                // For now, we'll just print the search text to the console
                String searchText = searchField.getText();
                System.out.println("Searching for: " + searchText);
            }
        });

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Pack the frame to preferred size
        frame.setVisible(true);
    }
}
