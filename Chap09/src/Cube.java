import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * @author cdodson
 * This class is not what it should be becuase I stretched yesterday
 *
 */
public class Cube {
	private int x;
	private int y;
	private int size;
/**
 * 
 */
	public Cube() {
		x=10;
		y=10;
		size=200;
	}
	/**
	 * this will draw the cude in black
	 * @param g An instance of the graphics class
	 */
	public void draw(Graphics g) {
		int x2=x+size/3;
		int y2=y+size/3;
		g.setColor(Color.black);
		g.drawRect(x, y, size, size);
		g.drawRect(x2, y2, size, size);
	}
}
