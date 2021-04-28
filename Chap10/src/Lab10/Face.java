package Lab10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Face {

	public void draw(Graphics g) {

		Eyes.draw(g);
		Nose.draw(g);
		Mouth.draw(g);

	}

	public void Hair(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(550,600,300,300);
	}
}

class Eyes {
	static void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(770, 200, 150, 75);
		g.fillOval(980, 200, 150, 75);
	}
}
class Nose {
	static void draw(Graphics g) {
		g.setColor(Color.black);
		Polygon N = new Polygon();
		N.addPoint(925, 300);
		N.addPoint(885, 350);
		N.addPoint(975, 370);
		g.fillPolygon(N);
	}

}
class Mouth {
	static void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(845, 390, 170, 40);
	}
}

