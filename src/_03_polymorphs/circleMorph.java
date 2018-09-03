package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class circleMorph extends Polymorph{
	int ctr = 0;
	int cirX;
	int cirY;
	
	protected circleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		cirX = x;
		cirY = y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(cirX, cirY, getWidth(), getHeight());
	}
	
	public void update() {
		cirX += Math.sin(ctr)*50;
		cirY += Math.cos(ctr)*50;
		ctr++;
	}

}
