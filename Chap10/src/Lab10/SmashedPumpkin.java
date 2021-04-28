package Lab10;

import java.awt.Color;
import java.awt.Graphics;

public class SmashedPumpkin extends JackOLantern{
	Face f;
	public SmashedPumpkin(int x, int y, Color color) {
		super(x, y, color);
	}
		public void draw(Graphics g) {
			f=new Face();
			super.draw(g);
			f.draw(g);
			f.Hair(g);
		}
		
	}


