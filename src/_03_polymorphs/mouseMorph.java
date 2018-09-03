package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class mouseMorph extends Polymorph {
	int mouseX;
	int mouseY;

	protected mouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(mouseX, mouseY - 50, getWidth(), getHeight());
	}
	public void update() {
		mouseY = MouseInfo.getPointerInfo().getLocation().y;
		mouseX = MouseInfo.getPointerInfo().getLocation().x;   
	}
}
