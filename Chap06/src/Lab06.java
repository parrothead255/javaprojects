import java.awt.*; 
import java.applet.*; 
import java.util.*;
public class Lab06 extends Applet{
			public void paint(Graphics g) {
				// Draw Grid
				g.drawRect(10,10,780,580);
				g.drawLine(400,10,400,590);
				g.drawLine(10,300,790,300);
				// Draw Random Lines
				for(int i=0;i<100;i++) {
					int x1=(int)(Math.random()*391+10);
					int x2=(int)(Math.random()*391+10);
					int y1=(int)(Math.random()*291+10);
					int y2=(int)(Math.random()*291+10);
					g.setColor(randColor());
					g.drawLine(x1, y1, x2, y2);
				}
				// Draw Random Squares
				for(int i=0;i<100;i++) {
					int x=(int)(Math.random()*341+400);
					int y=(int)(Math.random()*241+10);
					g.setColor(randColor());
					g.fillRect(x, y, 50, 50);
				}
				// Draw Random Circles
				for (int i=0;i<100;i++) {
					int size=(int)(Math.random()*201);
					int xRange=391-size;
					int x=(int)(Math.random()*xRange+10);
					int yRange=291-size;
					int y=(int)(Math.random()*yRange+300);
					g.setColor(randColor());
					g.drawOval(x,y,size,size);
				}
				// Draw 3-D Box
				g.setColor(Color.red);
				g.fillRect(590,390,100,100);
				Polygon green=new Polygon();
				g.setColor(Color.green);
				green.addPoint(590,390); // 1
				green.addPoint(540,340); // 2
				green.addPoint(540,440); // 3
				green.addPoint(590,490); // 4
				g.fillPolygon(green);
				Polygon yellow=new Polygon();
				g.setColor(Color.yellow);
				yellow.addPoint(590,390); // 1
				yellow.addPoint(540,340); // 2
				yellow.addPoint(640,340); // 3
				yellow.addPoint(640,390); // 4
				g.fillPolygon(yellow);
				Polygon blue=new Polygon();
				g.setColor(Color.blue);
				blue.addPoint(640,390); // 1
				blue.addPoint(640,340); // 2
				blue.addPoint(690,390); // 3
				g.fillPolygon(blue);
			}
			public int rand256() {
				return (int)(Math.random()*256);
			}
			public Color randColor() {
				return new Color(rand256(),rand256(),rand256());
			}
		}


