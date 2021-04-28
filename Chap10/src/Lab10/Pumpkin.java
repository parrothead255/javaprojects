package Lab10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Pumpkin extends Applet {
	private int x;
	private int y;
	private Color color;
	
	/**
	 * @param x
	 * @param y
	 * @param color
	 */
	public Pumpkin(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 500, 400);
		g.setColor(Color.BLACK);
		g.fillRect(x+175, y-85, 115, 120);
		
		
		
		
	}
}


