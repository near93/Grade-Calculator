/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.util.Scanner;

/**
 *
 * @author Gelen
 */

public class CalculatorMain extends JFrame implements ActionListener{
    JLabel L1, L2, L3, L4, L5,L6,L7,L8,L9,L10,L11;
    JTextField T1, T2, T3, T4, T5,T6,T7,T8,T9,T10,T11,T12,T13,T14;
    JButton B1, B2;
    
    public CalculatorMain() {
	super ("Marks Calculator");
	this.L1 = new  JLabel ("Subject");
	this.L2 = new  JLabel ("Marks obtained");
	this.L3 = new JLabel ("Max marks");
	this.L4 = new JLabel ("Computer Programming");
	this.L5 = new JLabel ("Computer Networks");
	this.L6 = new  JLabel ("Project planning");
	this.L7 = new  JLabel ("Databases");
	this.L8 = new JLabel ("English");
	this.L9 = new JLabel ("Total");
	this.L10 = new JLabel ("Percentage(%)");
	this.L11 = new JLabel ("Status");
		
	this.T1 = new JTextField ("");
	this.T2 = new JTextField ("");
	this.T3 = new JTextField ("");
	this.T4 = new JTextField ("");
	this.T5 = new JTextField ("");
	this.T6 = new JTextField ("");
	this.T7 = new JTextField ("");
	this.T8 = new JTextField ("");
	this.T9 = new JTextField ("");
	this.T10 = new JTextField ("");
	this.T11 = new JTextField ("");
	this.T12 = new JTextField ("");
	this.T13 = new JTextField ("");
	this.T14 = new JTextField ("");
		
	this.B1 = new JButton("Calculate");
	this.B2 = new JButton("Exit");
				
	this.setLayout(null);
	L1.setBounds(20, 5, 450, 50); 
	L2.setBounds(165, 5, 300, 50);
	L3.setBounds(260, 5, 450, 50); 
	L4.setBounds(20, 40, 300, 50);
	L5.setBounds(20, 80, 450, 50); 
	L6.setBounds(20, 120, 300, 50);
	L7.setBounds(20, 160, 450, 50); 
	L8.setBounds(20, 200, 300, 50);
	L9.setBounds(20, 260, 300, 50);
	L10.setBounds(20, 300, 450, 50); 
	L11.setBounds(20, 340, 300, 50);
		
	T1.setBounds(170, 50, 75, 35);
	T2.setBounds(250, 50, 75, 35);
	T3.setBounds(170, 90, 75, 35);
	T4.setBounds(250, 90, 75, 35);
	T5.setBounds(170, 130, 75, 35);
	T6.setBounds(250, 130, 75, 35);
	T7.setBounds(170, 170, 75, 35);
	T8.setBounds(250, 170, 75, 35);
	T9.setBounds(170, 210, 75, 35);
	T10.setBounds(250, 210, 75, 35);
	T11.setBounds(170, 270, 75, 35);
	T12.setBounds(250, 270, 75, 35);
	T13.setBounds(110, 315, 80, 30);
	T14.setBounds(110, 355, 80, 30);
		
	T11.setBorder(null);
	T12.setBorder(null);
	T13.setBorder(null);
	T14.setBorder(null);
		
	B1.setBounds(200, 315, 125, 30);
	B2.setBounds(200, 355, 125, 30);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	B1.addActionListener(this);
	B2.addActionListener(new exitFrame());
				
	add(T1);
	add(T2);
	add(T3);
	add(T4);
	add(T5);
	add(T6);
	add(T7);
	add(T8);
	add(T9);
	add(T10);
	add(T11);
	add(T12);
	add(T13);
	add(T14);
				
	add(L1);
	add(L2);
	add(L3);
	add(L4);
	add(L5);
	add(L6);
	add(L7);
	add(L8);
	add(L9);
	add(L10);
	add(L11);
		
	add(B1);
	add(B2);
		
	setSize(350, 445);
	setLocation(100,100);
	setVisible(true);
    }
		
    public void actionPerformed(ActionEvent e) {
	int n1 = Integer.parseInt(T1.getText());
	int n3 = Integer.parseInt(T3.getText());
	int n5 = Integer.parseInt(T5.getText());
	int n7 = Integer.parseInt(T7.getText());
	int n9 = Integer.parseInt(T9.getText());
			
	int n2 = Integer.parseInt(T2.getText());
	int n4 = Integer.parseInt(T4.getText());
	int n6 = Integer.parseInt(T6.getText());
	int n8 = Integer.parseInt(T8.getText());
	int n10 = Integer.parseInt(T10.getText());
		
	double sMo = (n1 + n3 + n5 + n7 + n9);
	double sMm = (n2 + n4 + n6 + n8 + n10);
		
	T11.setText("" + sMo);
	T12.setText("" + sMm);
	double P = Math.round((sMo/sMm)*100);
	T13.setText(" " + P);
					
	if (P <= 49.99){
            T14.setText("Fail");
            T14.setBackground(Color.RED);
	}
        else {
            T14.setText("Pass");
            T14.setBackground(Color.GREEN);
	}	
    }
	
    class exitFrame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
	} 
    } 
    
    public static void main (String[] args){
        new CalculatorMain();
    }
}



