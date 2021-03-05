import java.awt.Color;
import java.awt.Graphics;

public class Leaves {
	private Point topLeft;
	private int width;
	private int height;
	private Color color;
	public Leaves(Point topLeft, int width, int height, Color color) {
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(topLeft.getX(), topLeft.getY(), width, height);
	}
	public Point getTopLeft() {
		return topLeft;
	}
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.black;
	}
}
