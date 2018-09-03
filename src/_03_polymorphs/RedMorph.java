package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {
	int Xs;
	int Ys;

	RedMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		Xs = x;
		Ys = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(Xs, Ys, getWidth(), getHeight());
	}
	public void update() {
		Xs+=1;
		Ys+=1;
	}

}
