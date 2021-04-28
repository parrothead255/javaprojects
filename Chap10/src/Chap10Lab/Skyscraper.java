package Chap10Lab;

import java.awt.Color;
import java.awt.Graphics;

public class Skyscraper extends Building {
	protected int x;
	protected int y;

	public Skyscraper(int x,int y) {
		super(x, y);
		this.x=x;
		this.y=y;
	}
	
	public void draw(Graphics g) {
		drawWalls(g);
		drawDoors(g);
	}
	protected void drawCeiling(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x,y,600,200);
	}	
	protected void drawDoors(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(x+150, y+50, 100, 150);
	}
	protected void drawWalls(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.gray);
		g.fillRect(x, y, 400, 200);
	}	
	
}

