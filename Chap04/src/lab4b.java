import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class lab4b extends Applet {

	public void paint(Graphics g) {
		g.drawRect(25, 25, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawLine(25, 25, 100, 100);
		g.drawLine(25, 225, 100, 300);
		g.drawLine(225, 25, 300, 100);
		g.drawLine(225, 225, 300, 300);
		g.fillArc(412, 300, 50, 50, 45, 270);
		g.fillArc(375, 275, 50, 50, 135, 270);
		g.fillArc(350, 300, 50, 50, 225, 270);
		g.fillArc(375, 325, 50, 50, 315, 270);
		System.out.println(Math.sqrt(Math.abs(Math.min(-30, -20))));
		g.drawOval(100, 100, 100, 50);
		g.setColor(Color.red);
		g.fillOval(100, 100, 100, 50);
		g.setColor(Color.red);
		
	}
	

}
