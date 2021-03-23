package Chap1007;

import java.awt.Color;
import java.awt.Graphics;

public class RailChassis {
	private int x;
	private int y;

	public RailChassis(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public void draw(Graphics g) {
		drawChassis(g);
		drawWheels(g);
		drawLink(g);
		
	}
	private void drawLink(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.gray);
		g.fillRect(x-25,y+10,25,5);
	}
	private void drawWheels(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillOval(x+5, y+10, 50, 50);
		g.fillOval(x+95, y+10, 50, 50);
	}
	private void drawChassis(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.gray);
		g.fillRect(x, y, 150, 20);
	}
}
