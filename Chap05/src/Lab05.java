import java.applet.Applet;
import java.awt.Graphics;

public class Lab05 extends Applet {
	public void paint(Graphics g) {
		
		int width = 980;
		int height = 630;
		g.drawRect(5, 5, width, height);
		int x1=985;
		int y1=5;
		int x2=985;
		int y2=635;
		for(int i=0;i<40;i++) {
			g.drawLine(x1,y1,x2,y2);
			y1+=16;
			x2-=25;
			
	}
		x1=5;
		y1=5;
		x2=5;
		y2=635;
		for(int i=0;i<40;i++) {
			g.drawLine(x1,y1,x2,y2);
			y1+=16;
			x2+=25;
	}
		x1=5;
		y1=5;
		x2=985;
		y2=5;
		for(int i=0;i<40;i++) {
			g.drawLine(x1,y1,x2,y2);
			y1+=16;
			x2-=25;

	}
		x1=985;
		y1=635;
		x2=985;
		y2=5;
		for(int i=0;i<40;i++) {
			g.drawLine(x1,y1,x2,y2);
			y1-=16;
			x2-=25;
		}
	}
}
