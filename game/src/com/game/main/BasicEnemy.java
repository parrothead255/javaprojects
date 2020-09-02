package com.game.main;

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject {

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);

		velY = 5;
		
	}

	
	public void tick() {
		
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
	}

	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
		
	}
}