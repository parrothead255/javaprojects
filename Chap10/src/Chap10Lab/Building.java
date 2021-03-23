package Chap10Lab;

import java.awt.Color;
import java.awt.Graphics;

public class Building {
	private int x;
	private int y;
	
	public Building(int x,int y) {
		this.x=x;
		this.y=y;
	
	}
	public void draw(Graphics g) {
		drawWalls(g);
		drawDoors(g);
		drawCeiling(g);
	}
	private void drawCeiling(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	private void drawDoors(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(x+150, y+50, 100, 150);
	}
	private void drawWalls(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.gray);
		g.fillRect(x, y, 400, 200);
		
	}
}
