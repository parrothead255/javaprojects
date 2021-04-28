package Lab10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends Applet {
	public void paint (Graphics g) {
		Pumpkin P = new Pumpkin(100, 100, Color.yellow);
		P.draw(g);
		JackOLantern J = new JackOLantern(700, 100, Color.yellow);
		J.draw(g);
		SmashedPumpkin S = new SmashedPumpkin(450, 550, Color.yellow);
		S.draw(g);
	}
}
