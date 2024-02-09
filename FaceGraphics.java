import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class FaceGraphics extends JFrame
{
	//FRAME
	public static final int LENGTH=400;
	public static final int WIDTH=400;
	
	//FACE
	public static final int DIAMETER=200;
	public static final int XFACE=100;
	public static final int YFACE=100;
	
	//EYE
	public static final int EYE_WIDTH=20;
	
	public static final int X_RIGHT_EYE=XFACE+55;
	public static final int Y_RIGHT_EYE=YFACE+60;
	public static final int Y_LEFT_EYE=YFACE+60;
	public static final int X_LEFT_EYE=XFACE+130;
	
	//MOUTH
	public static final int MOUTH_WIDTH=100;
	public static final int X_MOUTH=XFACE+50;
	public static final int Y_MOUTH=YFACE+150;
	
	public static void main (String[] args) 
	{
		FaceGraphics drawing=new FaceGraphics();
		drawing.setVisible(true);
    }
	
	
	public FaceGraphics()
	{
		super("Graphics Demo");
		setSize(LENGTH,WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);	
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawOval(XFACE,YFACE,DIAMETER,DIAMETER);
		
		//Draw Eyes:
		g.drawLine(X_RIGHT_EYE,Y_RIGHT_EYE,X_RIGHT_EYE+EYE_WIDTH,Y_RIGHT_EYE);
		
		g.drawLine(X_LEFT_EYE,Y_LEFT_EYE,X_LEFT_EYE+EYE_WIDTH,Y_LEFT_EYE);
		
		//Draw Mouth:
		g.drawLine(X_MOUTH,Y_MOUTH,X_MOUTH+MOUTH_WIDTH,Y_MOUTH);
	}
}