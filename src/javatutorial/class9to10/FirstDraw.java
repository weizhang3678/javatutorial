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
public class FirstDraw extends JFrame {

	public FirstDraw() {
		setTitle("My first drawing in Java");
		setLocation(200, 200);
		this.setSize(800, 500);;
		setVisible(true);
	}
	
	@Override
    public void paint(Graphics g) {
		
            g.setColor(Color.BLUE);             
            g.drawLine(100, 400, 650, 400);  
            
            g.setColor(Color.RED);
            g.drawRect(50, 150, 200, 200);  
            
            g.setColor(Color.YELLOW);
            g.fillRect(550, 150, 200, 200); 
            
            g.setColor(Color.GREEN);
            g.fillOval(300, 150, 200, 200);  
            
            g.setColor(Color.DARK_GRAY);
            g.setFont(new Font("楷体", Font.BOLD, 90));   
            g.drawString("How are you？", 100, 100);     
           
    }

	public static void main(String[] args) {
		FirstDraw fd = new FirstDraw();

	}

}
