import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class PineNeedles extends Leaves {

	public PineNeedles(Point topLeft, int width, int height, Color color) {
		super(topLeft, width, height, color);
		
	}
	public void draw(Graphics g) {
		g.setColor((getColor()));
		Polygon leaves=new Polygon();
		int x=getTopLeft().getX();
		int y=getTopLeft().getY();
		leaves.addPoint(x+getWidth()/2, y);
		leaves.addPoint(x+getWidth(), y+getHeight());
		leaves.addPoint(x, y+getHeight());
		g.fillPolygon(leaves);
	}

}
