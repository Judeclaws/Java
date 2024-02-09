import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FirstApplet extends JApplet {

    public void init() {
    	setLayout(new BorderLayout());
    	getContentPane().setBackground(Color.YELLOW);
    	JLabel label=new JLabel("An Applet A Day Keeps The Doctor Away.");
    	add(label, "CENTER");
    	
    }
}