package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph {
	int Xs;
	int Ys;
	BluePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		Xs = x;
		Ys = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(Xs, Ys, getWidth(), getHeight());
	}
	public void update() {
		Xs+=1;
		Ys+=1;
	}

}
