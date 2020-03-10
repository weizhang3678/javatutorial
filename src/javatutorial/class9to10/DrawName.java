package javatutorial.class9to10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Mar 4, 2020 11:15:35 AM
 * 
 * a demo to illustrate how to draw with Java Swing
 * 
 */
public class DrawName extends JFrame {
	private int counter = 1;

	public DrawName() {
		this.setTitle("My Name");
		this.setSize(600, 400);
		this.setLocation(400, 200);
		this.setVisible(true);
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.repaint();
		}
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("楷体", Font.PLAIN, 50));
		g.drawString("My name is: ", 100, 100);

		if (counter % 2 == 0) {
			g.setColor(Color.GREEN);
			g.setFont(new Font("楷体", Font.BOLD, 80));
			g.drawString("Zhang Wei", 100, 200);
		} else {
			g.setColor(Color.YELLOW);
			g.setFont(new Font("楷体", Font.BOLD, 80));
			g.drawString("Zhang Wei", 100, 200);
		}
		counter ++;
	}

	public static void main(String[] args) {
		new DrawName();

	}

}
