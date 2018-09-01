package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;
	int speed = 2;
	
	protected Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void setX(int i) {
		x = i;
	}

	public int getX() {
		return x;
	}

	public void setY(int i) {
		y = i;
	}

	public int getY() {
		return y;
	}

	public void setWidth(int i) {
		width = i;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int i) {
		height = i;
	}

	public int getHeight() {
		return height;
	}

	public void update() {
		x = x + speed;
		y = y +speed;
	}

	public abstract void draw(Graphics g);
}
