import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Chap406 extends Applet {
	public void paint(Graphics g) {
		g.drawLine(0,0,800,600);
		g.drawLine(0,600,800,0);
		g.drawLine(400,0,400,600);
		g.drawLine(100,300,700,300);
		g.setColor(Color.red);
		g.drawLine(100,101,100,100);
		g.drawLine(200,100,200,100);
		g.drawLine(100,200,100,200);
		g.drawLine(200,200,200,200);
	}
	

}
