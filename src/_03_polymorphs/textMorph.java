package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class textMorph extends Polymorph implements ActionListener{
	int Xs;
	int Ys;
	JLabel lab = new JLabel();
	protected textMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		Xs = x;
		Ys = y;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(Xs, Ys, getWidth(), getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Hi");
		
	}

}
