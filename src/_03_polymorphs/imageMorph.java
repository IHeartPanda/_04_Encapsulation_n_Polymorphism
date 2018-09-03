package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageMorph extends Polymorph{
	static BufferedImage doodle;
	protected imageMorph(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		try {
			doodle = ImageIO.read(this.getClass().getResourceAsStream("images.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {

		g.drawImage(doodle, getX(), getY(), getWidth(), getHeight(), null);
		// TODO Auto-generated method stub
		
	}
	public void update() {


	}

}
