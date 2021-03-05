import java.awt.Color;
import java.awt.Graphics;

public class PineTree extends Tree {
	private PineNeedles pN;
	public PineTree(Point p, int width, int height) {
		super(p, width, height, new Color(145,96,63),new Color(56,110,40));
		// TODO Auto-generated constructor stub
		pN=new PineNeedles(p,getLeafWidth(),getLeafHeight(),getLeafColor());
	}
	public void draw(Graphics g) {
		getTrunk().Draw(g);
		pN.draw(g);
	}

}
