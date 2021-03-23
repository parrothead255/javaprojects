package Chap1007;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Chap1007 extends Applet{
	public void paint(Graphics g) {
		RailChassis rC=new RailChassis(50,50);
		rC.draw(g);
		BoxCar bC=new BoxCar(50,50,Color.red);
		bC.draw(g);
		FreightCar fC=new FreightCar(50,50,Color.pink);
		
	}
	
}
