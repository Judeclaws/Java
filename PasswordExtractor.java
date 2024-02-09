import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PasswordExtractor extends JFrame implements ActionListener{

	JTextField textField;
	JTextField pwdTextField;
	public static void main(String[] args) {
		
		PasswordExtractor pw = new PasswordExtractor();
		pw.setVisible(true);

	}
	
	// constructor
	public PasswordExtractor() {
		super("Pasword Extracor");
		setSize(600,420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("C");
		button1.addActionListener(this);
		JButton button2 = new JButton("Show");
		button2.addActionListener(this);
		
	
		JPanel bigPanel = new JPanel();
		bigPanel.setLayout(new GridLayout(1,2));
		
		JPanel smallPanel1 = new JPanel();
		smallPanel1.setBackground(Color.BLUE);
		smallPanel1.setLayout(new GridLayout(2,1));
		bigPanel.add(smallPanel1);
		
		JLabel pwdLabel = new JLabel("Password Extructor : ");
		pwdTextField = new JTextField();	
		pwdTextField.setEditable(false);
		
		JPanel smallPanel2 = new JPanel();
		smallPanel2.setLayout(new GridLayout(2,1));
		smallPanel2.setBackground(Color.CYAN);
		JPanel smallPanel21 = new JPanel();
		smallPanel21.add(pwdLabel);
		smallPanel2.add(smallPanel21);
		JPanel smallPanel22 = new JPanel();
		smallPanel22.add(pwdTextField);
		smallPanel22.setLayout(new BorderLayout());
		smallPanel2.add(smallPanel22);		
		bigPanel.add(smallPanel2);
		
		JPanel smallPanel11 = new JPanel();
		smallPanel11.setBackground(Color.GREEN);
		smallPanel11.setLayout(new FlowLayout());
		
		JPanel smallPanel12 = new JPanel();
		smallPanel12.setLayout(new GridLayout(4,1));
		smallPanel12.setBackground(Color.CYAN);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300,50));
		textField.setEditable(true);
		
		for (int i =9; i>=0; i--) {
			JButton button = new JButton(Integer.toString(i));
			smallPanel12.add(button);
			button.addActionListener(new NumberButtonListener());
		}
		
		smallPanel1.add(smallPanel11);
		smallPanel12.add(button1);
		smallPanel12.add(button2);
		smallPanel1.add(smallPanel12);
		smallPanel11.add(textField);
		smallPanel22.add(pwdLabel);
		smallPanel22.add(pwdTextField, BorderLayout.SOUTH);
		smallPanel21.setBackground(Color.CYAN);
		smallPanel22.setBackground(Color.CYAN);
		
		smallPanel2.setBackground(Color.RED);
		
		add(bigPanel, BorderLayout.CENTER);
		
	}
	
	public class NumberButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}
			

		
	

	
	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		
		String msg = textField.getText();

		if(buttonString.equals("Show")) {
			pwdTextField.setText(msg);
		}
		else if(buttonString.equals("C")) {
			pwdTextField.setText("");
			textField.setText("");
		}
	}

}