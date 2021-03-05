import java.awt.Color;
import java.awt.Graphics;

public class Trunk {
	private Point topLeft;
	private int width;
	private int height;
	private Color color;
	public Trunk(Point topLeft, int width, int height, Color color) {
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void Draw(Graphics g) {
		g.setColor(color);
		g.fillRect(topLeft.getX(), topLeft.getY(), width, height);
	}
}
