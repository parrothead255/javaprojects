package Chap10Lab;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Runner extends Applet {
	public void paint(Graphics g) {
		Building b=new Building(100,100);
		b.draw(g);
		House h=new House(350,350);
		h.draw(g);
	}
}
