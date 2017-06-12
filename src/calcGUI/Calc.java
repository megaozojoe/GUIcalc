package calcGUI;

import javax.swing.*;
import java.awt.event.*;

public class Calc extends JFrame{
	
	static JButton addBn = new JButton("+");
	static final JTextField calcBx = new JTextField("");
	static JButton oneBn = new JButton("1");
	static JFrame fme = new JFrame("Calculator");
	
	
	public static void GUI(){
		
		calcBx.setBounds(200, 50, 100, 30);
		
		addBn.setBounds(100, 50, 50, 50);
		
		oneBn.setBounds(50, 50, 50, 50);
		
		
		frame();
	}
	
	public static void frame(){
		fme.add(calcBx);
		fme.add(addBn);
		fme.add(oneBn);
		
		fme.setSize(500, 250);
		fme.setLayout(null);
		fme.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args){
		GUI();
		
	}
	
	

}
