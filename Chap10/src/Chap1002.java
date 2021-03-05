import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Chap1002 extends Applet {
	public void paint(Graphics g) {
		Point p=new Point(200,100);
		System.out.println("("+p.getX()+","+p.getY()+")");
		Trunk t=new Trunk(p,100,400,Color.red);
		//t.Draw(g);
		Leaves l=new Leaves(p,100,100,Color.yellow);
		//l.Draw(g);
		Tree t2=new Tree(new Point(50,50),100,100,Color.orange,Color.green);
		t2.draw(g);
		
	}
}

