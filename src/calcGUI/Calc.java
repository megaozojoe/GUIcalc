package calcGUI;

import javax.swing.*;
import java.awt.event.*;

public class Calc extends JFrame{
	
	static JButton addBn = new JButton("+");
	static final JTextField calcBx = new JTextField("");
	static JButton oneBn = new JButton("1");
	static JFrame fme = new JFrame("Calculator");
	static int firstVar = 0;//the first variable 
	static int secVar = 0;
	static boolean varOcu = false; //This is a boolean to see if the first variable is occupied 
	static int total = 0;
	
	public static void GUI(){
		
		calcBx.setBounds(200, 50, 100, 30);
		
		addBn.setBounds(100, 50, 50, 50);
		
		oneBn.setBounds(50, 50, 50, 50);
		
		oneBn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(varOcu){
					secVar = 1;
				}
				else if(varOcu == false){
					firstVar = 1;
				}
			}
		});
		
		
		addBn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(varOcu){
					total = firstVar + secVar;
					calcBx.setText(Integer.toString(total));
					
				}
				
				
			}
		});
		
		
		
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
