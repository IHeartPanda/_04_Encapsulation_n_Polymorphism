package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;


	private JFrame window;
	private Timer timer;

	// Polymorph bluePoly;
	// Polymorph redPoly;
	Polymorph[] pol = new Polymorph[5];

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		pol[0] = new BluePolymorph(0, 0, 50, 50);
		pol[1] = new RedMorph(100, 100, 50, 50);
		pol[2] = new circleMorph(50, 50, 50, 50);
		pol[3] = new mouseMorph(0,0,50,50);
		pol[4] = new imageMorph(250,250,240,210);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (int i = 0; i < pol.length; i++) {
			if(pol[i] != null) {
			pol[i].draw(g);
			}
		}
		// draw polymorph
		// bluePoly.draw(g);
		// redPoly.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		// bluePoly.update();
		// redPoly.update();
		for (int i = 0; i < pol.length; i++) {
			pol[i].update();
		}
	}
}
