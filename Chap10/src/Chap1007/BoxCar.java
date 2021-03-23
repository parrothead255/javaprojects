package Chap1007;

import java.awt.Color;
import java.awt.Graphics;

public class BoxCar {
	private int x;
	private int y;
	private Color color;
	private RailChassis chassis;
	public BoxCar(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		chassis=new RailChassis(x,y+85);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
	public void draw(Graphics g) {
		chassis.draw(g);
		drawBox(g);
	
	}
	private void drawBox(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(x, y, 150, 85);
	}
}