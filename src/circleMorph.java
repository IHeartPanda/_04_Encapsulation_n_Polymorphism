import java.awt.Graphics;

import _03_polymorphs.Polymorph;

public class circleMorph extends Polymorph{

	protected circleMorph(int x, int y, int width, int height) {
		super((int) (Math.cos(x)*5), (int) (Math.cos(y)*5), width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
