package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class textMorph extends Polymorph implements MouseListener {
	int Xs;
	int Ys;
	int widths;
	int heights;
	JLabel lab = new JLabel();

	protected textMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		Xs = x;
		Ys = y;
		widths = width;
		heights = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(Xs, Ys, getWidth(), getHeight());
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() > Xs && e.getX() < Xs + widths && e.getY() > Ys && e.getY() < Ys + heights) {
			JOptionPane.showMessageDialog(null, "Hi");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
