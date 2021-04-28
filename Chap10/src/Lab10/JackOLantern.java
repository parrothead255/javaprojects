package Lab10;

import java.awt.Color;
import java.awt.Graphics;

public class JackOLantern extends Pumpkin{
	Face f;
	public JackOLantern(int x, int y, Color color) {
		super(x, y, color);

}
	public void draw (Graphics g) {
		f= new Face();
		super.draw(g);
		f.draw(g);
		}
}