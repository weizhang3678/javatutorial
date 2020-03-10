package javatutorial.class9to10;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 4, 2020 11:15:35 AM
* 
* a simple painting panel
* 
*/
public class DrawPanel extends JPanel{
	
	private Color color;
	private String shape;
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int newx1;
	private int newx2;
	private int newy1;
	private int newy2;
	private boolean flag;
	
	private String [] shapes={"Line","Arc","Circle","Spray","Eraser","Rectangle","Oval","RoundRect","Curve","3D-Circle","Triangle"};
	
	public DrawPanel() {
		init_ui();
	}
	public void init_ui(){
    	
    	JFrame jf=new JFrame();
    	jf.setSize(1100,700);
    	jf.setTitle("Painting Panel");
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    	jf.setLocationRelativeTo(null);

    	jf.setLayout(new BorderLayout());
   
    	
    	this.setBackground(Color.WHITE);
    	jf.add(this,BorderLayout.CENTER);
    	
    	JPanel ShapePanel=new JPanel();
    	ShapePanel.setBackground(Color.black);
    	ShapePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    	ShapePanel.setBackground(Color.gray);
    	
    	for(int i=0;i<shapes.length;i++){
    		JButton button=new JButton(shapes[i]);
    		button.setBackground(Color.WHITE);
    		button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand().equals("")){
				    	JButton button = (JButton) e.getSource();  
						color = button.getBackground();   
				    }else{
				    	JButton button = (JButton) e.getSource();  
				    	DrawPanel.this.shape = button.getActionCommand();   
				    }					
				}
    			
    		});    
    		ShapePanel.add(button);
    	}
    	jf.add(ShapePanel,BorderLayout.NORTH);
    	
    	
    	JPanel ColorPanel=new JPanel();
    	ColorPanel.setBackground(Color.black);
    	ColorPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    	ColorPanel.setBackground(Color.gray);
    	
    	Color [] color={Color.BLACK,Color.blue,Color.yellow,Color.red,Color.CYAN,Color.green,Color.darkGray,Color.pink};
    	for(int i=0;i<color.length;i++){
    		JButton button=new JButton();
    		button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand().equals("")){
				    	JButton button = (JButton) e.getSource();  
				    	DrawPanel.this.color = button.getBackground();   
				    }else{
				    	JButton button = (JButton) e.getSource();  
				    	DrawPanel.this.shape = button.getActionCommand();   
				    }	
					
				}
    			
    		});   
    		button.setPreferredSize(new Dimension(30,30));
    		button.setBackground(color[i]);
    		ColorPanel.add(button);
    	}
    	jf.add(ColorPanel,BorderLayout.SOUTH);
    	
    	jf.setVisible(true);
    	this.addMouseListener(new MouseListener() {
    		Graphics g=(Graphics2D) jf.getGraphics();
			@Override
			public void mouseClicked(MouseEvent e) {
				if(shape.equals("3D-Circle")){
					   double a=1.40,b=1.56,c=1.40,d=-6.56;
					   double x = 0,xo=0;
					   double y = 0,yo=0;
					   Color [] Col={Color.BLUE,Color.cyan,Color.green,Color.magenta,Color.red,Color.yellow};
					   for(int i=0;i<=90000;i++){
						  Random r=new Random();      
						  int R=r.nextInt(Col.length);
						  g.setColor(Col[R]);				
						  
						  x=d*Math.sin(a*xo)-Math.sin(b*yo);
						  y=c*Math.cos(a*xo)+Math.cos(b*yo);
						  int temp_x=(int)(x*50);
						  int temp_y=(int)(y*50);
						  
						  g.drawLine(temp_x+500, temp_y+300, temp_x+500, temp_y+300);
						  xo=x;
						  yo=y;
					}  
				}else if(shape.equals("Triangle")){
					double a=-2,b=-2,c=-1.2,d=2;
					double x = 0,xo=0;
					double y = 0,yo=0;
					Color [] Col={Color.BLUE,Color.cyan,Color.green,Color.magenta,Color.red,Color.yellow};
					for(int i=0;i<=90000;i++){
						Random r=new Random();      
						int R=r.nextInt(Col.length);
						g.setColor(Col[R]);  
		    			x=Math.sin(a*yo)-Math.cos(b*xo);
						y=Math.sin(c*xo)-Math.cos(d*yo);
						int temp_x=(int)(x*50);
						int temp_y=(int)(y*50);			  
						g.drawLine(temp_x+500, temp_y+300, temp_x+500, temp_y+300);
						xo=x;
						yo=y;
					}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				 g.setColor(DrawPanel.this.color);
				 x1=e.getX();
				 y1=e.getY();
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
				if (shape.equals("Line")) {
					g.drawLine(x1, y1, x2, y2);
				}else if(shape.equals("Arc")){
					 g.drawArc(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1), 0, 180);
				}else if(shape.equals("Polygon")&&!flag){
					g.drawLine(x1, y1, x2, y2);
					newx1=x1;
					newy1=y1;
					newx2=x2;
					newy2=y2;
					flag=true;
				}else  if(shape.equals("Circle")){
					 g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
				 }else if(shape.equals("Rectangle")){
					 g.drawRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
				 }else if(shape.equals("RoundRect")){
					 g.drawRoundRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1),2,10);
				 }else if(shape.equals("Oval")){
					 g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
				 }
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
    		
    	});
		this.addMouseMotionListener(new MouseMotionListener() {
			Graphics2D g=(Graphics2D) jf.getGraphics();
			@Override
			public void mouseDragged(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
				if (shape.equals("Curve")) {
					g.drawLine(x1, y1, x2, y2);
					x1 = x2;
					y1 = y2;
				}else if(shape.equals("Eraser")){
					g.setStroke(new BasicStroke(80));							
					g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					g.setColor(Color.WHITE);
					g.drawLine(x1, y1, x2, y2);
					x1 = x2;
					y1 = y2;
				}else if(shape.equals("Spray")){
					for(int k=0;k<20;k++){
						Random i=new Random();       
						int a=i.nextInt(8);
						int b=i.nextInt(10);
						g.drawLine(x2+a, y2+b, x2+a, y2+b);
					}
				}
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
		});
    }
	
	
	public static void main(String[] args) {
		new DrawPanel();

	}

}
