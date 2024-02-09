import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class HappyFace extends JFrame
{
	public static final int HEIGHT=600;
	public static final int WIDTH=400;
	
	public static final int FACE_DIAMETER=200;
	public static final int X_FACE=100;
	public static final int Y_FACE=100;
	
	//EYE
	public static final int EYEWIDTH=20;
	public static final int EYEHEIGHT=10;
	public static final int X_RIGHTEYE=X_FACE+60;
	public static final int Y_RIGHTEYE=Y_FACE+60;
	public static final int X_LEFTEYE=X_FACE+130;
	public static final int Y_LEFTEYE=Y_FACE+60;
	
	//MOUTH
	public static final int MOUTHWIDTH=100;
	public static final int MOUTHHEIGHT=50;
	public static final int X_MOUTH=X_FACE+50;
	public static final int Y_MOUTH=Y_FACE+100;
	public static final int MOUTH_START_ANGLE=180;
	public static final int MOUTH_ARC_SWEEP=180;
	
	public static void main (String[] args) 
	{
		HappyFace drawing=new HappyFace();
		drawing.setVisible(true);
    }
    
    public HappyFace()
    {
    	super("HappyFace");
    	setSize(WIDTH,HEIGHT);
    	getContentPane().setBackground(Color.GRAY);
    	setForeground(Color.WHITE);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
    public void paint(Graphics g)
    {
    	super.paint(g);
    	
    	int x[]={100,180,350,250,100};
    	int y[]={200,150,300,380,400};

    	g.drawOval(X_FACE,Y_FACE,FACE_DIAMETER,FACE_DIAMETER);
    	
    	//Eyes
    	g.fillOval(X_RIGHTEYE,Y_RIGHTEYE,EYEWIDTH,EYEHEIGHT);
    	
    	g.fillOval(X_LEFTEYE,Y_LEFTEYE,EYEWIDTH,EYEHEIGHT);
    	
    	//Mouth
    	g.drawArc(X_MOUTH,Y_MOUTH,MOUTHWIDTH,MOUTHHEIGHT,MOUTH_START_ANGLE,MOUTH_ARC_SWEEP);
    	g.drawLine(180,210,220,210);
    	
    	g.drawPolygon(x,y,5);
    }
		
}