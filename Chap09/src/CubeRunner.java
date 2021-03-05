import java.applet.Applet;
import java.awt.Graphics;

public class CubeRunner extends Applet{

	public void paint(Graphics g) {
		Cube c=new Cube();
		c.draw(g);
	}

}
