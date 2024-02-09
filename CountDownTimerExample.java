import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDownTimerExample extends JFrame {

    private JTextField inputField;
    private JButton startButton;
    private JLabel timerLabel;

    private Timer countdownTimer;
    private int remainingTime;

    public CountDownTimerExample() {
        setTitle("Countdown Timer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        startButton = new JButton("Start Timer");
        timerLabel = new JLabel("Time Remaining: ");

        countdownTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimerLabel();
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        add(inputField);
        add(startButton);
        add(timerLabel);

        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    private void startTimer() {
        try {
            int inputTime = Integer.parseInt(inputField.getText());
            remainingTime = inputTime;
            countdownTimer.start();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    private void updateTimerLabel() {
        if (remainingTime > 0) {
            timerLabel.setText("Time Remaining: " + formatTime(remainingTime));
            remainingTime--;
        } else {
            timerLabel.setText("Time's up!");
            countdownTimer.stop();
        }
    }

    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountDownTimerExample().setVisible(true);
            }
        });
    }
}
