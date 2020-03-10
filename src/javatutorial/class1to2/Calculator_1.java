package javatutorial.class1to2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
 * a simple calculator demo
 * 
 */
public class Calculator_1 extends JFrame implements ActionListener {
	String operator = "";
	boolean withDot = false;
	double firstNumber = 0, secondNumber = 0;
	double t = 10.0;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel(new GridLayout(5, 4, 0, 0));
	JTextField resultField = new JTextField();
	String[] buttonNames = { "clean", ".", "0", "+", "1", "2", "3", "-", "4", "5", "6", "x", "7", "8", "9", "/", "=" };
	JButton[] buttons = new JButton[buttonNames.length];

	public Calculator_1() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].setActionCommand(buttonNames[i]);
			buttons[i].addActionListener(this);
			panel2.add(buttons[i]);
		}
		resultField.setEditable(false);
		resultField.setPreferredSize(new Dimension(280, 40));
		resultField.setFont(new Font("宋体", Font.PLAIN, 28));
		panel1.add(resultField);
		this.add(panel1, BorderLayout.NORTH);
		this.setTitle("Calculator");
		this.add(panel2, BorderLayout.CENTER);
		this.setSize(300, 450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		try {
			int value = Integer.parseInt(command);
			opt(value);
		} catch (Exception ex) {

		}
		if (command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/")) {
			this.operator = command;
			resultField.setText(resultField.getText() + command);
			withDot = false;
			this.t = 10.0;
		} else if (e.getActionCommand().equals("=")) {
			calculator(this.firstNumber, this.secondNumber, this.operator);
			// this.a = 0;
			this.secondNumber = 0;
			this.operator = "";
			this.t = 10;
			withDot = false;
		} else if (e.getActionCommand().equals("clean")) {
			resultField.setText("");
			this.firstNumber = 0;
			this.secondNumber = 0;
			this.operator = "";
			t = 10;
			withDot = false;
		} else if (e.getActionCommand().equals(".")) {
			withDot = true;
		}
	}

	public void opt(int number) {
		resultField.setText(resultField.getText()+number);
		if (this.operator.equals("")) {
			if (!withDot) {
				this.firstNumber = this.firstNumber * 10 + number;
			} else {
				this.firstNumber += (double) number / t;
				t = t * 10.0;
			}
		} else {
			if (!withDot) {
				this.secondNumber = this.secondNumber * 10 + number;
			} else {
				this.secondNumber += (double) number / t;
				t = t * 10.0;
			}
		}
	}

	public void calculator(double firstNumber, double secondNumber, String operator) {
		double sum = 789;
		switch (operator) {
		case "":
		case "+":
			sum = firstNumber + secondNumber;
			break;
		case "-":
			sum = 0;// TODO
			break;
		case "x":
			sum = 0;// TODO
			break;
		case "/":
			sum = 0;// TODO
			break;
		}
		resultField.setText(String.valueOf(sum));
		this.firstNumber = sum;
	}

	public static void main(String[] args) {
		new Calculator_1();
	}
}
