package javatutorial.class9to10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 4, 2020 11:15:35 AM
* 
* a calculator
* 
*/
public class Calculator extends JFrame implements ActionListener {

	 
		int f = 0, fd = 0;
		double a = 0, b = 0;
		double t = 10.0;
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel(new GridLayout(5, 5, 8, 8));
		JTextField tf = new JTextField();
	
		JButton bu0 = new JButton("0");          
		JButton bu1 = new JButton("1");
		JButton bu2 = new JButton("2");
		JButton bu3 = new JButton("3");
		JButton bu4 = new JButton("4");
		JButton bu5 = new JButton("5");
		JButton bu6 = new JButton("6");
		JButton bu7 = new JButton("7");
		JButton bu8 = new JButton("8");
		JButton bu9 = new JButton("9");
	 
		JButton bu_jia = new JButton("+");
		JButton bu_jian = new JButton("-");
		JButton bu_cheng = new JButton("x");
		JButton bu_chu = new JButton("/");
		JButton bu_cifang = new JButton("次方");
		JButton bu_dengyu = new JButton("=");
		JButton bu_MOD = new JButton("MOD");
		JButton bu_root = new JButton("√");
		JButton bu_dian = new JButton(".");
		JButton bu_clean = new JButton("clean");
		JButton bu_sin = new JButton("sin");
		JButton bu_cos = new JButton("cos");
		JButton bu_tan = new JButton("tan");
		JButton bu_lg = new JButton("lg");
		JButton bu_pi = new JButton("π");
	 
		public Calculator() {
			tf.setEditable(false);
			bu0.setActionCommand("0");
			bu1.setActionCommand("1");
			bu2.setActionCommand("2");
			bu3.setActionCommand("3");
			bu4.setActionCommand("4");
			bu5.setActionCommand("5");
			bu6.setActionCommand("6");
			bu7.setActionCommand("7");
			bu8.setActionCommand("8");
			bu9.setActionCommand("9");
			bu_jia.setActionCommand("+");
			bu_jian.setActionCommand("-");
			bu_cheng.setActionCommand("x");
			bu_chu.setActionCommand("/");
			bu_cifang.setActionCommand("次方");  
			bu_dengyu.setActionCommand("=");
			bu_MOD.setActionCommand("MOD");
			bu_root.setActionCommand("root");
			bu_dian.setActionCommand(".");
			bu_clean.setActionCommand("clean");
			bu_sin.setActionCommand("sin");
			bu_cos.setActionCommand("cos");
			bu_tan.setActionCommand("tan");
			bu_lg.setActionCommand("lg");
			bu_pi.setActionCommand("π");
	 
			bu0.addActionListener(this);
			bu1.addActionListener(this);
			bu2.addActionListener(this);
			bu3.addActionListener(this);   //加监听
			bu4.addActionListener(this);
			bu5.addActionListener(this);
			bu6.addActionListener(this);
			bu7.addActionListener(this);
			bu8.addActionListener(this);
			bu9.addActionListener(this);
			bu_jia.addActionListener(this);
			bu_jian.addActionListener(this);
			bu_cheng.addActionListener(this);
			bu_chu.addActionListener(this);
			bu_cifang.addActionListener(this);
			bu_dengyu.addActionListener(this);
			bu_MOD.addActionListener(this);
			bu_root.addActionListener(this);
			bu_dian.addActionListener(this);
			bu_clean.addActionListener(this);
			bu_sin.addActionListener(this);
			bu_cos.addActionListener(this);
			bu_tan.addActionListener(this);
			bu_lg.addActionListener(this);
			bu_pi.addActionListener(this);
	 
			tf.setPreferredSize(new Dimension(465, 40));
			tf.setFont(new Font("宋体", Font.PLAIN, 28));
			Font f = new Font("仿宋", Font.BOLD, 25);// 根据指定字体名称、样式和磅值大小，创建一个新 Font。
			Font F = new Font("仿宋", Font.BOLD, 31);
			Font ff = new Font("仿宋", Font.BOLD, 21);
			bu0.setFont(f);
			bu1.setFont(f);
			bu2.setFont(f);
			bu3.setFont(f);
			bu4.setFont(f);
			bu5.setFont(f);
			bu6.setFont(f);
			bu7.setFont(f);
			bu8.setFont(f);                 //做样式，就是为了好看。
			bu9.setFont(f);
			bu0.setFont(f);
			bu_jia.setFont(f);
			bu_jian.setFont(f);
			bu_cheng.setFont(f);
			bu_chu.setFont(f);
			bu_root.setFont(f);
			bu_MOD.setFont(f);
			bu_clean.setFont(ff);
			bu_dengyu.setFont(f);
			bu_dian.setFont(f);
			bu_cifang.setFont(ff);
			bu_sin.setFont(f);
			bu_cos.setFont(f);
			bu_tan.setFont(f);
			bu_lg.setFont(f);
			bu_pi.setFont(F);     //
	 
			pan1.add(tf);
			this.add(pan1, BorderLayout.NORTH);
			pan2.add(bu_sin);
			pan2.add(bu_root);
			pan2.add(bu_MOD);
			pan2.add(bu_clean);
			pan2.add(bu_jia);
			pan2.add(bu_cos);                
			pan2.add(bu1);
			pan2.add(bu2);
			pan2.add(bu3);
			pan2.add(bu_jian);
			pan2.add(bu_tan);
			pan2.add(bu4);
			pan2.add(bu5);
			pan2.add(bu6);
			pan2.add(bu_cheng);
			pan2.add(bu_lg);
			pan2.add(bu7);
			pan2.add(bu8);
			pan2.add(bu9);
			pan2.add(bu_chu);
			pan2.add(bu_pi);
			pan2.add(bu_cifang);
			pan2.add(bu0);
			pan2.add(bu_dian);
			pan2.add(bu_dengyu);
	 
			this.setTitle("Calculator");          
			this.add(pan2, BorderLayout.CENTER);
			this.setSize(500, 350);
			this.setLocationRelativeTo(null); 
			this.setVisible(true);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		}
	 
		@Override
		public void actionPerformed(ActionEvent e) {         
			if (e.getActionCommand().equals("1")) {
				opt(1);
			} else if (e.getActionCommand().equals("2")) {
				opt(2);
			} else if (e.getActionCommand().equals("3")) {
				opt(3);
			} else if (e.getActionCommand().equals("4")) {
				opt(4);
			} else if (e.getActionCommand().equals("5")) {
				opt(5);
			} else if (e.getActionCommand().equals("6")) {
				opt(6);
			} else if (e.getActionCommand().equals("7")) {
				opt(7);
			} else if (e.getActionCommand().equals("8")) {
				opt(8);
			} else if (e.getActionCommand().equals("9")) {
				opt(9);
			} else if (e.getActionCommand().equals("0")) {
				opt(0);
			} else if (e.getActionCommand().equals("+")) {
				this.f = 1;
				tf.setText("");
				fd = 0;
				this.t = 10.0;
			} else if (e.getActionCommand().equals("-")) {
				this.f = 2;
				tf.setText("");
				fd = 0;
				this.t = 10.0;
	 
			} else if (e.getActionCommand().equals("x")) {
				this.f = 3;
				tf.setText("");
				fd = 0;
				this.t = 10.0;
	 
			} else if (e.getActionCommand().equals("/")) {
				this.f = 4;
				tf.setText("");
				fd = 0;
				this.t = 10.0;
	 
			} else if (e.getActionCommand().equals("MOD")) {
				this.f = 5;
				tf.setText("");
				// fd=0;
			} else if (e.getActionCommand().equals("次方")) {
				this.f = 6;
				tf.setText("");
				fd = 0;
				this.t = 10.0;
			} else if (e.getActionCommand().equals("=")) {
				calcu(this.a, this.b, this.f);
				// this.a = 0;
				this.b = 0;
				this.f = 0;
				this.t = 10;
				fd = 0;
			} else if (e.getActionCommand().equals("clean")) {
				tf.setText("");
				this.a = 0;
				this.b = 0;
				this.f = 0;
				t = 10;
				fd = 0;
			} else if (e.getActionCommand().equals("root")) {
				this.a = Math.sqrt(this.a);
				tf.setText(String.valueOf(a));
			} else if (e.getActionCommand().equals("sin")) {
				this.a = Math.sin(this.a);
				tf.setText(String.valueOf(a));
			} else if (e.getActionCommand().equals("cos")) {
				this.a = Math.cos(this.a);
				tf.setText(String.valueOf(a));
			} else if (e.getActionCommand().equals("tan")) {
				this.a = Math.tan(this.a);
				tf.setText(String.valueOf(a));
			} else if (e.getActionCommand().equals("lg")) {
				this.a = Math.log10(this.a);
				tf.setText(String.valueOf(a));
			} else if (e.getActionCommand().equals("π")) {
				this.a = Math.PI;
				tf.setText(String.valueOf(a));
			} 
			else if (e.getActionCommand().equals(".")) {
				fd = 1;
			}
		}
	 
		public void opt(int number) {          //具体操作
			if (this.f == 0) // the first number
			{
	 
				if (fd == 0) // 梅小数点
				{
					this.a = this.a * 10 + number;
					tf.setText(String.valueOf((int) this.a));
				} else {// 有小数点
					double dnumber;
					dnumber = (double) number / t;
					t = t * 10.0;
					this.a += dnumber;
					BigDecimal BB = new BigDecimal(this.a); // 四舍五入取值
					double dd = BB.setScale(8, BigDecimal.ROUND_HALF_DOWN).doubleValue();
					tf.setText(String.valueOf(dd));
				}
	 
			} // this second number
			else {
				// t=10;
				if (fd == 0) // 梅小数点
				{
					this.b = this.b * 10 + number;
					tf.setText(String.valueOf((int) this.b));
				} else {
					double dnumber;
					dnumber = (double) number / t;
					t = t * 10.0;
					this.b += dnumber;
					BigDecimal BB = new BigDecimal(this.b);
					double dd = BB.setScale(8, BigDecimal.ROUND_HALF_DOWN).doubleValue();
					tf.setText(String.valueOf(dd));
				}
			}
		}
	 
		public void calcu(double a, double b, int f) {
			double sum = 789;
			switch (f) {
			case 0:   
			case 1:   
				sum = a + b;
				break;
			case 2: 
				sum = a - b;
				break;
			case 3: 
				sum = a * b;
				break;
			case 4: 
				sum = a / b;
				break;
			case 5: 
				sum = (int) a % (int) b;
				break;
			case 6: 
				sum = Math.pow(a, b);
				break;
			}
	 
			double Q = sum;
			int QQ = (int) Q;
			double QQQ = (double) QQ;
			if (QQQ == sum)
				tf.setText(String.valueOf(QQ));
			else
				tf.setText(String.valueOf(sum));
			this.a = sum;
		}
	 
		public static void main(String[] args) {
			new Calculator();
		}
	}
