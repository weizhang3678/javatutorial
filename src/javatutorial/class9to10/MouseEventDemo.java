package javatutorial.class9to10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 5, 2020 11:15:35 AM
* 
* Simple demo to show how to define a mouse event
* 
*/
public class MouseEventDemo extends JFrame {
	ArrayList<Point> al = new ArrayList<Point>();
	
	public MouseEventDemo() {
		this.setTitle("Please click");
		this.setBackground(Color.GRAY);
		this.setLocation(200, 100);
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				MouseEventDemo f = (MouseEventDemo)e.getSource();
				f.al.add(new Point(e.getX(),e.getY()));
				repaint();
			}
		});
	}
	
	public void paint(Graphics g) {
		for(Point p:al) {
			Color c = g.getColor();
			g.setColor(Color.pink);
			g.fillOval(p.x-6, p.y - 6, 12, 12);
			g.setColor(c);
		}
	}
	

	public static void main(String[] args) {
		new MouseEventDemo();

	}

}
