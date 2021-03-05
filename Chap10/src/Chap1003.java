import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Chap1003 extends Applet {
	public void paint (Graphics g) {
		Tree t=new Tree(new Point(50,50),100,100,Color.orange,Color.green);
		t.draw(g);
		SubTree sT= new SubTree(new Point(200,50),100,100);
		sT.draw(g);
		PineTree pT=new PineTree(new Point(350,50),100,100);
		pT.draw(g);
		
		
	}
}
