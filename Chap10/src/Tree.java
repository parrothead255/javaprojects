import java.awt.Color;
import java.awt.Graphics;

public class Tree {
	private Point p;
	private int width;
	private int height;
	private Leaves leafs;
	private Trunk trunx;
	public Tree(Point p, int width, int height, Color tColor, Color lColor) {
		this.p = p;
		this.width = width;
		this.height = height;
		int leafW=width;
		int leafH=height/2;
		int trunkW=width/3;
		int trunkH=(int)(height*.8);
		int tX=p.getX()+width/3;
		int tY=p.getY()+height/4;
		leafs=new  Leaves(p,leafW,leafH,lColor);
		trunx=new Trunk(new Point(tX,tY),trunkW,trunkH,tColor);
		
	}
	public void draw(Graphics g) {
		trunx.Draw(g);
		leafs.draw(g);
	}

	public int getLeafHeight() {
		return leafs.getHeight();
	}
	public int getLeafWidth() {
		return leafs.getWidth();
	}
	public Color getLeafColor() {
	return  leafs.getColor();
	}
	public Trunk getTrunk() {
		return trunx;
	}
	
}
