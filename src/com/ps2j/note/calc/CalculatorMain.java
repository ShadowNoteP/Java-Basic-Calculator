package com.ps2j.note.calc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorMain extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String equation = "";
	JTextField textField;
	JButton clear, lbrack, rbrack, d1, n7, n8, n9, div, n4, n5, n6, mul, n1, n2, n3, sub, n0, dot, plus, equal;
	static GridLayout grid = new GridLayout(0,4);
	
	public CalculatorMain(String string) {
		super(string);
		setResizable(false);	
	}
	public static void frameMake() { 
		CalculatorMain frame = new CalculatorMain("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addComponentsToPane(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	private void addComponentsToPane(Container pane) {
		
		final JPanel gridPanel = new JPanel();
		gridPanel.setLayout(grid);
		final JPanel outputeq = new JPanel();
		textField = new JTextField(20);
		textField.setEditable(false);
		outputeq.add(textField);
		
		
		clear = new JButton("C");
		clear.setVerticalTextPosition(AbstractButton.CENTER);
		clear.setHorizontalTextPosition(AbstractButton.LEADING);
		clear.setActionCommand("clear");
		clear.addActionListener(this);
		gridPanel.add(clear);
		lbrack = new JButton("(");
		lbrack.setVerticalTextPosition(AbstractButton.CENTER);
		lbrack.setHorizontalTextPosition(AbstractButton.LEADING);
		lbrack.setActionCommand("(");
		lbrack.addActionListener(this);
		gridPanel.add(lbrack);
		rbrack = new JButton(")");
		rbrack.setVerticalTextPosition(AbstractButton.CENTER);
		rbrack.setHorizontalTextPosition(AbstractButton.LEADING);
		rbrack.setActionCommand(")");
		rbrack.addActionListener(this);
		gridPanel.add(rbrack);
		d1 = new JButton("<-");
		d1.setVerticalTextPosition(AbstractButton.CENTER);
		d1.setHorizontalTextPosition(AbstractButton.LEADING);
		d1.setActionCommand("back");
		d1.addActionListener(this);
		gridPanel.add(d1);
		
		//Nums :D
		n7 = new JButton("7");
		n7.setVerticalTextPosition(AbstractButton.CENTER);
		n7.setHorizontalTextPosition(AbstractButton.LEADING);
		n7.setActionCommand("7");
		n7.addActionListener(this);
		gridPanel.add(n7);
		
		n8 = new JButton("8");
		n8.setVerticalTextPosition(AbstractButton.CENTER);
		n8.setHorizontalTextPosition(AbstractButton.LEADING);
		n8.setActionCommand("8");
		n8.addActionListener(this);
		gridPanel.add(n8);
		
		n9 = new JButton("9");
		n9.setVerticalTextPosition(AbstractButton.CENTER);
		n9.setHorizontalTextPosition(AbstractButton.LEADING);
		n9.setActionCommand("9");
		n9.addActionListener(this);
		gridPanel.add(n9);
		
		div = new JButton("/");
		div.setVerticalTextPosition(AbstractButton.CENTER);
		div.setHorizontalTextPosition(AbstractButton.LEADING);
		div.setActionCommand("/");
		div.addActionListener(this);
		gridPanel.add(div);
		
		n4 = new JButton("4");
		n4.setVerticalTextPosition(AbstractButton.CENTER);
		n4.setHorizontalTextPosition(AbstractButton.LEADING);
		n4.setActionCommand("4");
		n4.addActionListener(this);
		gridPanel.add(n4);
		
		n5 = new JButton("5");
		n5.setVerticalTextPosition(AbstractButton.CENTER);
		n5.setHorizontalTextPosition(AbstractButton.LEADING);
		n5.setActionCommand("5");
		n5.addActionListener(this);
		gridPanel.add(n5);
		
		n6 = new JButton("6");
		n6.setVerticalTextPosition(AbstractButton.CENTER);
		n6.setHorizontalTextPosition(AbstractButton.LEADING);
		n6.setActionCommand("6");
		n6.addActionListener(this);
		gridPanel.add(n6);
		
		mul = new JButton("*");
		mul.setVerticalTextPosition(AbstractButton.CENTER);
		mul.setHorizontalTextPosition(AbstractButton.LEADING);
		mul.setActionCommand("*");
		mul.addActionListener(this);
		gridPanel.add(mul);
		
		n1 = new JButton("1");
		n1.setVerticalTextPosition(AbstractButton.CENTER);
		n1.setHorizontalTextPosition(AbstractButton.LEADING);
		n1.setActionCommand("1");
		n1.addActionListener(this);
		gridPanel.add(n1);
		
		n2 = new JButton("2");
		n2.setVerticalTextPosition(AbstractButton.CENTER);
		n2.setHorizontalTextPosition(AbstractButton.LEADING);
		n2.setActionCommand("2");
		n2.addActionListener(this);
		gridPanel.add(n2);
		
		n3 = new JButton("3");
		n3.setVerticalTextPosition(AbstractButton.CENTER);
		n3.setHorizontalTextPosition(AbstractButton.LEADING);
		n3.setActionCommand("3");
		n3.addActionListener(this);
		gridPanel.add(n3);
		
		sub = new JButton("-");
		sub.setVerticalTextPosition(AbstractButton.CENTER);
		sub.setHorizontalTextPosition(AbstractButton.LEADING);
		sub.setActionCommand("-");
		sub.addActionListener(this);
		gridPanel.add(sub);
		
		n0 = new JButton("0");
		n0.setVerticalTextPosition(AbstractButton.CENTER);
		n0.setHorizontalTextPosition(AbstractButton.LEADING);
		n0.setActionCommand("0");
		n0.addActionListener(this);
		gridPanel.add(n0);
		
		dot = new JButton(".");
		dot.setVerticalTextPosition(AbstractButton.CENTER);
		dot.setHorizontalTextPosition(AbstractButton.LEADING);
		dot.setActionCommand(".");
		dot.addActionListener(this);
		gridPanel.add(dot);
		
		plus = new JButton("+");
		plus.setVerticalTextPosition(AbstractButton.CENTER);
		plus.setHorizontalTextPosition(AbstractButton.LEADING);
		plus.setActionCommand("+");
		plus.addActionListener(this);
		gridPanel.add(plus);
		
		equal = new JButton("=");
		equal.setVerticalTextPosition(AbstractButton.CENTER);
		equal.setHorizontalTextPosition(AbstractButton.LEADING);
		equal.setActionCommand("=");
		equal.addActionListener(this);
		gridPanel.add(equal);
		
		pane.add(gridPanel, BorderLayout.CENTER);
		pane.add(outputeq, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("clear")) {
			equation = "";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("1")) {
			equation = equation + "1";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("2")) {
			equation = equation + "2";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("3")) {
			equation = equation + "3";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("4")) {
			equation = equation + "4";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("5")) {
			equation = equation + "5";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("6")) {
			equation = equation + "6";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("7")) {
			equation = equation + "7";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("8")) {
			equation = equation + "8";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("9")) {
			equation = equation + "9";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("0")) {
			equation = equation + "0";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("(")) {
			equation = equation + "(";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals(")")) {
			equation = equation + ")";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals(".")) {
			equation = equation + ".";
			textField.setText(equation);
		}
		if(e.getActionCommand().equals("+")) {
			if(equation.length() != 0) {
				if(equation.charAt(equation.length() - 1) == '+' || equation.charAt(equation.length() - 1) == '-' || equation.charAt(equation.length() - 1) == '/' ||  equation.charAt(equation.length() - 1) == '*') {
					//do nothing
				} else {
					equation = equation + "+";
					textField.setText(equation);
				}
			} 
		}
		if(e.getActionCommand().equals("-")) {
			if(equation.length() != 0) {
				if(equation.charAt(equation.length() - 1) == '+' || equation.charAt(equation.length() - 1) == '-' || equation.charAt(equation.length() - 1) == '/' ||  equation.charAt(equation.length() - 1) == '*') {
					//do nothing
				} else {
					equation = equation + "-";
					textField.setText(equation);
				}
			} 
		}
		if(e.getActionCommand().equals("*")) {
			if(equation.length() != 0) {
				if(equation.charAt(equation.length() - 1) == '+' || equation.charAt(equation.length() - 1) == '-' || equation.charAt(equation.length() - 1) == '/' ||  equation.charAt(equation.length() - 1) == '*') {
					//do nothing
				} else {
					equation = equation + "*";
					textField.setText(equation);
				}
			} 
		}
		if(e.getActionCommand().equals("/")) {
			if(equation.length() != 0) {
				if(equation.charAt(equation.length() - 1) == '+' || equation.charAt(equation.length() - 1) == '-' || equation.charAt(equation.length() - 1) == '/' ||  equation.charAt(equation.length() - 1) == '*') {
					//do nothing
				} else {
					equation = equation + "/";
					textField.setText(equation);
				}
			} 
		}
		if(e.getActionCommand().equals("back")) {
			if(equation.length() != 0) {
				equation = equation.substring(0, equation.length()-1);
				textField.setText(equation);
			} 
		}
		if(e.getActionCommand().equals("=")) {
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			try {
				String answer = String.valueOf(engine.eval(equation));
				System.out.println(answer);
				equation = answer;
				textField.setText(equation);
			} catch (ScriptException e1) {
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        		frameMake();
            }
        });
	}
}
