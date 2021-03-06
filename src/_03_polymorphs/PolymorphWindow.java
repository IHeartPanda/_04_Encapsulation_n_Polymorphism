package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;


	private JFrame window;
	private Timer timer;

	// Polymorph bluePoly;
	// Polymorph redPoly;
	Polymorph[] pol = new Polymorph[6];
	ArrayList<Polymorph> pols = new ArrayList<Polymorph>();
	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.pack();
		//window.addActionListener(this);
		window.setVisible(true);
		pols.add(new BluePolymorph(0, 0, 50, 50));
		pols.add(new RedMorph(100, 100, 50, 50));
		
		pols.add(new circleMorph(50, 50, 50, 50));
		mouseMorph m = new mouseMorph(0,0,50,50);
		pols.add(m);
		pols.add(new imageMorph(250,250,240,210));
		textMorph t = new textMorph(200,200, 50,50);
		pols.add(t);
		window.addMouseListener(t);
		window.addMouseMotionListener(m);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (int i = 0; i < pols.size(); i++) {
			if(pols.get(i) != null) {
			pols.get(i).draw(g);
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
		for (int i = 0; i < pols.size(); i++) {
		pols.get(i).update();	
		}
		
	}
}

	